package com.navis.extension.dpwpsj

import com.navis.argo.business.atoms.FreightKindEnum
import com.navis.argo.business.atoms.WiMoveKindEnum
import com.navis.argo.business.model.GeneralReference
import com.navis.argo.business.reference.Equipment
import com.navis.argo.business.xps.model.Che
import com.navis.external.services.AbstractGeneralNoticeCodeExtension
import com.navis.inventory.business.atoms.GrossWeightSourceEnum

//import com.navis.inventory.business.atoms.GrossWeightSourceEnum
import com.navis.inventory.business.moves.MoveEvent
import com.navis.inventory.business.units.Unit
import com.navis.inventory.business.units.UnitFacilityVisit
import com.navis.framework.metafields.MetafieldIdFactory
//import com.navis.framework.util.BizFailure
import com.navis.framework.util.BizViolation
import com.navis.road.business.model.TruckTransaction
import com.navis.road.business.model.TruckVisitDetails
import com.navis.services.business.event.GroovyEvent
import org.apache.log4j.Logger
import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement
import java.sql.SQLException
/**
 * @author: Mauricio Orozco
 * @date: 2019-06-18
 * @purpose: retrieve the RTG weight that has been stored in a SQL Server database in another server
 */
public class DpwpsjWeightCraneCaptureOnUnitMoveEvent extends AbstractGeneralNoticeCodeExtension {
    /**
     * Main method
     * @param inGroovyEvent
     */
    public void execute(GroovyEvent inGroovyEvent) {
        LOGGER.warn(String.format("At start of %s.execute", getClass().getName()));
        String dbServer;
        String dbPort;
        String dbName;
        String dbUser;
        String dbPassword;
        String dbSQL;
        Double weightRTG;
        Double eqTare;
        String eventId
        String truckLicenseNbr;
        boolean craneEventWt = false;
        Date eventTime;
        Date moveTime;
        if (!inGroovyEvent.getEntity() instanceof Unit) {
            LOGGER.warn(String.format("Event Object is not a instance of Unit. Hence returning!"));
            return;
        }
        Unit unit = (Unit) inGroovyEvent.getEntity();
        LOGGER.warn("Unidad: " + unit.getUnitId());
        LOGGER.warn("Peso patio: " + unit.getUnitGoodsAndCtrWtKgYardMeasured());
        eventId = inGroovyEvent.getEvent().getEventTypeId();
        eventTime = inGroovyEvent.getEvent().getEventTime();
        //eventId = inGroovyEvent.getEvent().getEventTypeDescription();
        //eventId = inGroovyEvent.getEvent().getEventNote();
        LOGGER.warn("Evento id: " + eventId);
        LOGGER.warn("Evento fecha: " + eventTime);
        GeneralReference gf = GeneralReference.findUniqueEntryById(GENERAL_REFERENCE_TYPE, GENERAL_REFERENCE_ID1);
        if (gf != null) {
            if (gf.getRefValue1() != null){
                if (gf.getRefValue1() != ""){
                    dbServer = gf.getRefValue1();
                }
            }
            if (gf.getRefValue2() != null) {
                if (gf.getRefValue2() != "") {
                    dbPort = gf.getRefValue2();
                }
            }
            if (gf.getRefValue3() != null) {
                if (gf.getRefValue3() != "") {
                    dbName = gf.getRefValue3();
                }
            }
            if (gf.getRefValue4() != null) {
                if (gf.getRefValue4() != "") {
                    dbUser = gf.getRefValue4();
                }
            }
            if (gf.getRefValue5() != null) {
                if (gf.getRefValue5() != "") {
                    dbPassword = gf.getRefValue5();
                }
            }
            if (gf.getRefValue6() != null) {
                if (gf.getRefValue6() != "") {
                    dbSQL = gf.getRefValue6();
                }
            }
        }
        Equipment eq = unit.getUnitEquipment();
        if (eq != null){
            if (eq.getEqTareWeightKg() != null) {
                eqTare = eq.getEqTareWeightKg()
            }
        }
        UnitFacilityVisit ufv = unit.getUnitActiveUfvNowActive();
        List<MoveEvent> moveEventList = ufv.getMoveEventsForUfv();
        if (moveEventList.size() > 0) {
            for (MoveEvent moveEvent : moveEventList) {
                //moveEvent.getMveTimePut()
                LOGGER.warn(moveEvent.getEventTypeId());
                LOGGER.warn(moveEvent.getMveMoveKind().getKey());
                LOGGER.warn("getMveTimeCarryComplete: " + moveEvent.getMveTimeCarryComplete().toString());
                LOGGER.warn("getEventTime: " + moveEvent.getEventTime().toString());
                LOGGER.warn("getMveTimePut: " + moveEvent.getMveTimePut());
                LOGGER.warn("getMveTimeFetch: " + moveEvent.getMveTimeFetch());
                LOGGER.warn("getMveTimeCarryCheDispatch: " + moveEvent.getMveTimeCarryCheDispatch());
                Che che;
                if (moveEvent.getEventTypeId().equals(eventId)) {
                    WiMoveKindEnum moveKindEnum = moveEvent.getMveMoveKind();
                    moveTime =  moveEvent.getEventTime();
                    long diffTime = eventTime.getTime() - moveTime.getTime();
                    if (Math.abs(diffTime) <= 300000){
                        if ((WiMoveKindEnum.Delivery == moveKindEnum) || (WiMoveKindEnum.VeslLoad == moveKindEnum)){
                            che= moveEvent.getMveCheFetch();
                        } else {
                            che= moveEvent.getMveChePut();
                        }
                        if (che != null) {
                            if (che.getCheShortName() != null) {
                                LOGGER.warn("CHE ID: " + che.getCheShortName());
                                LOGGER.warn("nombre login CHE: " + moveEvent.getMveChePutLoginName());
                                if (che.getCheShortName().startsWith("RTG"))
                                {
                                    weightRTG = getCraneWeight(che.getCheShortName(), dbServer, dbPort, dbName, dbUser, dbPassword, dbSQL);
                                }
                                LOGGER.warn("Peso RTG: " + weightRTG);
                                if ((weightRTG > 0) || (FreightKindEnum.MTY == unit.getUnitFreightKind())) {
                                    craneEventWt = true;
                                }
                                if (craneEventWt) {
                                    if (unit.getUnitGoodsAndCtrWtKgYardMeasured() == null) {
                                        LOGGER.warn("UnitGoodsAndCtrWtKgYardMeasured vacio");
                                        unit.setFieldValue(MetafieldIdFactory.valueOf(CUSTOM_UNIT_CRANE_WT), weightRTG);
                                        unit.updateUnitGoodsAndCtrWtKgYardMeasured(weightRTG);
                                        unit.updateVerifiedGrossMassWtKg(weightRTG);
                                        unit.updateVerifiedEntity(RTG_UPDATE);
                                        unit.updateGoodsAndCtrWtKg(weightRTG);
                                        unit.updateGrossWeightSource(GrossWeightSourceEnum.COMPUTED);
                                        final Object DpwpsjGroovyUtilWT = getLibrary("DpwpsjGroovyUtil");
                                        DpwpsjGroovyUtilWT.recordEvent(unit, WT_WEIGHTED_EVENT, null, "source:DpwpsjWeightCraneCaptureOnUnitMoveEvent.execute");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        LOGGER.warn(String.format("At end of %s.execute", getClass().getName()));
    }
    /**
     * Retrieve the weight from an external database
     * @param p_cheId
     * @param p_dbServer
     * @param p_dbPort
     * @param p_dbName
     * @param p_dbUser
     * @param p_dbPassword
     * @param p_dbSQL
     * @return
     */
    private double getCraneWeight(String p_cheId, String p_dbServer, String p_dbPort, String p_dbName, String p_dbUser, String p_dbPassword, String p_dbSQL){
        String connectionUrl;
        String sqlStatement;
        String sqlUpdateFlagStatement;
        Connection dbConnection = null;
        Statement dbSelectQuery = null;
        Statement dbUpdateQuery = null;
        ResultSet dbRs;
        Double pesoGrua = 0;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connectionUrl = "jdbc:sqlserver://" + p_dbServer + ":" + p_dbPort +
                    ";databaseName=" + p_dbName +
                    ";user="+p_dbUser+";password="+p_dbPassword+";";
            LOGGER.warn(connectionUrl);
            dbConnection = DriverManager.getConnection(connectionUrl);
            sqlStatement = p_dbSQL.replaceAll(":p_CHEId", p_cheId);
            dbSelectQuery = dbConnection.createStatement();
            dbRs = dbSelectQuery.executeQuery(sqlStatement);
            LOGGER.warn(sqlStatement);
            while (dbRs.next()) {
                pesoGrua = dbRs.getDouble(1);
                sqlUpdateFlagStatement = "update Cranes set Submitted = 1 where CHEId = '" + p_cheId + "'";
                LOGGER.warn(sqlUpdateFlagStatement);
                dbUpdateQuery = dbConnection.createStatement();
                dbUpdateQuery.executeUpdate(sqlUpdateFlagStatement);
            }

        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        } finally {
            try {
                if (dbRs != null) {
                    dbRs.close();
                }
            } catch (SQLException se){
                LOGGER.error(se.getMessage());
            }
            try {
                if (dbSelectQuery != null) {
                    dbSelectQuery.close();
                }
            } catch (SQLException se){
                LOGGER.error(se.getMessage());
            }
            try {
                if (dbUpdateQuery != null) {
                    dbUpdateQuery.close();
                }
            } catch (SQLException se){
                LOGGER.error(se.getMessage());
            }
            try {
                if (dbConnection != null) {
                    dbConnection.close();
                }
            } catch (SQLException se) {
                LOGGER.error(se.getMessage());
            }
        }
        return pesoGrua;
    }
    /**
     * Get all the truck visit details for the a specific truck based on the Move History
     * @param truckLicenseNbr
     * @return
     * @throws BizViolation
     */
    private static TruckVisitDetails findActiveTruckVisit(final String truckLicenseNbr) throws BizViolation {
        List tvds = TruckVisitDetails.findTVActiveByTruckLicenseNbr(truckLicenseNbr);
        TruckVisitDetails tvd = null;
        if (tvds != null && tvds.size() > 0) {
            tvd = (TruckVisitDetails) tvds.get(0);
        }
        return tvd;
    }
    /**
     * Update the truck tare for a Gate Transacction
     * @param inTvd
     * @param inScaleWt
     * @param inTruckTareWt
     * @param inCtrWt
     */
    private void updateTruckTranWithWeights(TruckVisitDetails inTvd, Double inCtrWt) {
        Double scaleWt = null;
        Double truckTare = null;
        Double ctrGrossWt = null;
        Double currentTranTruckTare;
        /* Captura el peso que fue guardado en la visita del camión por las básculas camioneras*/
        if (inTvd.getTvdtlsScaleWeight() != null){
            scaleWt = inTvd.getTvdtlsScaleWeight();
        }
        /*Peso del contenedor capturado por la RTG */
        if (inCtrWt != null){
            ctrGrossWt = inCtrWt;
        }
        /* Si hay peso de garita y del contenedor podemos tener el peso de la tara del camión siempre y cuando haya un solo contenedor*/
        if ((scaleWt != null) & (ctrGrossWt != null)){
            truckTare = scaleWt - ctrGrossWt;
        }
        /* Poner la tara del camión por cada transaccion de garita de esa visita del camión */
        if (inTvd.getActiveTransactions().size() > 1){
            for (TruckTransaction tran : inTvd.getActiveTransactions()) {
                if (tran.getTranTruckTareWeight() != null) {
                    currentTranTruckTare = tran.getTranTruckTareWeight() - ctrGrossWt;
                } else {
                    currentTranTruckTare = truckTare;
                }
                LOGGER.warn("procede a actualizar el peso: " + truckTare.toString());
                tran.setTranTruckTareWeight(currentTranTruckTare);
            }
        }
    }
    private static final String GENERAL_REFERENCE_TYPE = "CAS";
    private static final String GENERAL_REFERENCE_ID1 = "RTG";
    private static final String RTG_UPDATE = "PESADO_RTG";
    private static final String WT_WEIGHTED_EVENT = "UNIT_WT_SCALED_YARD_CRANE";
    private static final String CUSTOM_UNIT_CRANE_WT = "customFlexFields.unitCustomDFFCraneWt";
    private final Logger LOGGER = Logger.getLogger(DpwpsjWeightCraneCaptureOnUnitMoveEvent.class);
}