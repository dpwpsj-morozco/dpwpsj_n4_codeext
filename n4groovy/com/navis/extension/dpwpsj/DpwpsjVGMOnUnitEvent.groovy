package com.navis.extension.dpwpsj

import com.navis.argo.business.api.ArgoUtils
import com.navis.argo.business.model.GeneralReference
import com.navis.external.argo.AbstractGroovyWSCodeExtension
import com.navis.external.services.AbstractGeneralNoticeCodeExtension
import com.navis.road.business.model.TruckTransaction
import com.navis.services.business.event.GroovyEvent
import org.apache.log4j.Logger
import com.navis.argo.ContextHelper
import com.navis.argo.business.api.ServicesManager
import com.navis.argo.business.atoms.FreightKindEnum
import com.navis.argo.business.atoms.UnitCategoryEnum
import com.navis.argo.business.model.CarrierVisit
import com.navis.argo.business.reference.ContactInfo
import com.navis.argo.business.reference.Equipment
import com.navis.argo.business.reference.Shipper
import com.navis.inventory.business.units.Unit
import com.navis.inventory.business.units.UnitFacilityVisit
import com.navis.road.business.model.TruckVisitDetails
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.validator.EmailValidator;

import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException
import java.sql.Statement
import java.text.DateFormat
import java.text.SimpleDateFormat

/**
 * --------------------------------------------------------------------------------------------------------------------------------------------------
 * S.no   Modified Date   Modified By   Jira Id     SFDC     Change Description
 * --------------------------------------------------------------------------------------------------------------------------------------------------
 *  1     19-Oct-2016     Vergara F     Orden CambioOC2718   Creación del Groovy
 *  2     09-Feb-2017     Orozco M      Incidente   81391    Cuando un exportador no tiene nombre de contacto o este nombre tiene caracteres de
 *                                                           escape XML el programa de N4Bascula se cae. Aquí se van a poner las excepciones
 **/
public class DpwpsjVGMOnUnitEvent extends AbstractGeneralNoticeCodeExtension {
    public void execute(GroovyEvent inGroovyEvent) {
        LOGGER.warn(String.format("At start of %s.execute at %s", getClass().getName(), ArgoUtils.timeNow()));
        String dbServer;
        String dbPort;
        String dbName;
        String dbUser;
        String dbPassword;
        String dbSQL;

        String gateAppointmentNbr;
        String gateTransactionNbr;
        String vesselName;
        String vesselVisit;
        String scId;
        String scName;
        String bookingNbr;
        String unitNbr;
        Double unitTareWeight;
        Double unitCargoWeight;
        Double unitMaxGrossWeight;
        Double unitVgmWeight;
        String driverName;
        String driverLicense;
        String truckLicense;
        String scEmail;
        String lEmail;
        String category;
        String actualStage;
        String nextStage;
        if (!inGroovyEvent.getEntity() instanceof Unit) {
            LOGGER.warn(String.format("Event Object is not a instance of Unit. Hence returning!"));
            return;
        }
        Unit unit = (Unit) inGroovyEvent.getEntity();
        LOGGER.warn("Unidad: " + unit.getUnitId());
        //if(VGM_EVENT.equals(inGroovyEvent.getEvent().getEventTypeId())) {
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
            }
            LOGGER.warn("parametros de referencia han sido cargados");
            UnitFacilityVisit ufv = unit.getUnitActiveUfvNowActive();
            if (ufv != null) {
                LOGGER.warn("si hay una unidad activa");
                if (ufv.getUfvGapptNbr() != null) {
                    LOGGER.warn("hay cita");
                    Long apptNbr = ufv.getUfvGapptNbr();
                    gateAppointmentNbr = String.valueOf(apptNbr);
                    LOGGER.warn(gateAppointmentNbr);
                    TruckTransaction ttr = TruckTransaction.findTransactionByGateAppointmentNbr(gateAppointmentNbr);
                    if (ttr != null) {
                        LOGGER.warn("si hay truck transaction");
                        TruckVisitDetails tvd = ttr.getTranTruckVisit();
                        if (tvd != null) {
                            driverName = StringEscapeUtils.escapeXml(tvd.getTvdtlsDriverName());
                            driverLicense = tvd.getTvdtlsDriverLicenseNbr();
                            truckLicense = tvd.getTvdtlsTruckLicenseNbr();
                        }
                        unitCargoWeight = unit.getUnitGoodsAndCtrWtKg() - ttr.getTranCtrTareWeight();
                        if (unitCargoWeight < 0) {
                            unitCargoWeight = 0;
                        }
                        if  (unit.getUnitGoodsAndCtrWtKgVerfiedGross() != null) {
                            unitVgmWeight = unit.getUnitGoodsAndCtrWtKgVerfiedGross();
                        } else {
                            unitVgmWeight = unit.getUnitGoodsAndCtrWtKgYardMeasured();
                        }
                        CarrierVisit cv = ttr.getTranCarrierVisit();
                        if (cv != null) {
                            vesselName = cv.getCarrierVehicleName();
                            vesselVisit = cv.getCarrierObVoyNbrOrTrainId();  // cv.getCvId() cv.getCarrierVehicleId() + "-" + cv.getCarrierObVoyNbrOrTrainId();
                        }
                        Shipper s = Shipper.findShipper(ttr.getTranShipper());
                        if (s != null) {
                            if (s.getBzuName() != null){
                                scName = s.getBzuName().trim();
                            }
                            ContactInfo ci = s.getBzuCtct();
                            if (ci != null){
                                if ((ci.getCtctEmailAddress() != null) & (ci.getCtctEmailAddress() != "")){
                                    lEmail = StringEscapeUtils.escapeXml(ci.getCtctEmailAddress());
                                    lEmail = lEmail.trim();
                                    EmailValidator ev = EmailValidator.getInstance();
                                    if (ev.isValid(lEmail)){
                                        scEmail = lEmail;
                                    }
                                } else {
                                    scEmail = MISSING_EMAIL;
                                }
                            }
                        }
                        UnitCategoryEnum uce = ttr.getTranUnitCategory();
                        category = uce.getKey();
                        Equipment eq = ttr.getEquipment();
                        unitMaxGrossWeight = eq.getEqSafeWeightKg();
                        //EquipType et = ttr.getCtrType();
                        //unitMaxGrossWeight = et.getEqtypSafeWeightKg();
                        Long tranNbr = ttr.getTranNbr();
                        gateTransactionNbr = String.valueOf(tranNbr);
                        unitNbr = ttr.getCtrNbrOrRequested();
                        scId = ttr.getTranShipper();
                        bookingNbr = ttr.getTranEqoNbr();
                        unitTareWeight = ttr.getTranCtrTareWeight();
                        actualStage = ttr.getTranStageId();
                        nextStage = ttr.getTranNextStageId();
                        LOGGER.warn("antes de enviar a la BD");
                        LOGGER.warn("dbServer " + dbServer);
                        LOGGER.warn("dbPort " + dbPort);
                        LOGGER.warn("dbName " + dbName);
                        LOGGER.warn("dbUser " + dbUser);
                        LOGGER.warn("gateAppointmentNbr " + gateAppointmentNbr);
                        LOGGER.warn("gateTransactionNbr " + gateTransactionNbr);
                        LOGGER.warn("category " + category);
                        LOGGER.warn("vesselVisit " + vesselVisit);
                        LOGGER.warn("vesselName " + vesselName);
                        LOGGER.warn("scId " + scId);
                        LOGGER.warn("scName " + scName);
                        LOGGER.warn("scEmail " + scEmail);
                        LOGGER.warn("bookingNbr " + bookingNbr);
                        LOGGER.warn("unitNbr " + unitNbr);
                        LOGGER.warn("unitTareWeight " + unitTareWeight.toString());
                        LOGGER.warn("unitMaxGrossWeight " + unitMaxGrossWeight.toString());
                        LOGGER.warn("unitVgmWeight " + unitVgmWeight.toString());
                        LOGGER.warn("unitCargoWeight " + unitCargoWeight.toString());
                        LOGGER.warn("driverName " + driverName);
                        LOGGER.warn("driverLicense " + driverLicense);
                        LOGGER.warn("truckLicense " + truckLicense);
                        recordVGMWeight(dbServer, dbPort, dbName, dbUser, dbPassword,
                                gateAppointmentNbr, gateTransactionNbr, category, vesselVisit,
                                vesselName, scId, scName, scEmail, bookingNbr, unitNbr,
                                unitTareWeight.toString(), unitMaxGrossWeight.toString(), unitVgmWeight.toString(), unitCargoWeight.toString(),
                                driverName, driverLicense, truckLicense);
                    }
                } else {
                    LOGGER.warn("no hay cita");
                }
            } else {
                LOGGER.warn("no hay una unidad activa");
            }
        //}
        LOGGER.warn(String.format("At end of %s.execute at %s", getClass().getName(), ArgoUtils.timeNow()));
    }
    private void recordVGMWeight(String indbServer, String indbPort, String indbName, String indbUser, String indbPassword,
                                 String ingateAppointmentNbr, String ingateTransactionNbr, String incategory, String invesselVisit,
                                 String invesselName, String inscId, String inscName, String inscEmail, String inbookingNbr, String inunitNbr,
                                 String inunitTareWeight, String inunitMaxGrossWeight, String inunitVgmWeight, String inunitCargoWeight,
                                 String indriverName, String indriverLicense, String intruckLicense){
        String connectionUrl;
        String sqlStatement;
        String vgmId;
        Connection dbConnection = null;
        Statement dbInsertQuery = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connectionUrl = "jdbc:sqlserver://" + indbServer + ":" + indbPort +
                    ";databaseName=" + indbName +
                    ";user="+indbUser+";password="+indbPassword;
            LOGGER.warn(connectionUrl);
            dbConnection = DriverManager.getConnection(connectionUrl);
            LOGGER.warn("creo conexion");
            Date date = new Date();
            DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
            String systemDate = dateFormat.format(date);
            vgmId = "VGM" + systemDate + "CT" + ingateAppointmentNbr + "TR" + ingateTransactionNbr;
            sqlStatement = VGM_INSERT_RECORD_DB
            sqlStatement = sqlStatement.replaceAll(":p_certificate_nbr", vgmId);
            sqlStatement = sqlStatement.replaceAll(":p_appointment_nbr", ingateAppointmentNbr);
            sqlStatement = sqlStatement.replaceAll(":p_road_truck_transaction_nbr", ingateTransactionNbr);
            sqlStatement = sqlStatement.replaceAll(":p_category", incategory);
            sqlStatement = sqlStatement.replaceAll(":p_vessel_visit", invesselVisit);
            sqlStatement = sqlStatement.replaceAll(":p_vessel_name", invesselName);
            sqlStatement = sqlStatement.replaceAll(":p_shipper_id", inscId);
            sqlStatement = sqlStatement.replaceAll(":p_shipper_name", inscName);
            sqlStatement = sqlStatement.replaceAll(":p_shipper_email", inscEmail);
            sqlStatement = sqlStatement.replaceAll(":p_booking_nbr" , inbookingNbr);
            sqlStatement = sqlStatement.replaceAll(":p_unit_id", inunitNbr);
            sqlStatement = sqlStatement.replaceAll(":p_equipment_tare", inunitTareWeight);
            sqlStatement = sqlStatement.replaceAll(":p_equipment_maxpayload", inunitMaxGrossWeight);
            sqlStatement = sqlStatement.replaceAll(":p_vgm_weight", inunitVgmWeight);
            sqlStatement = sqlStatement.replaceAll(":p_cargo_weight", inunitCargoWeight);
            sqlStatement = sqlStatement.replaceAll(":p_driver_name", indriverName);
            sqlStatement = sqlStatement.replaceAll(":p_driver_nbr", indriverLicense);
            sqlStatement = sqlStatement.replaceAll(":p_truck_license_nbr", intruckLicense);
            LOGGER.warn(sqlStatement);
            dbInsertQuery = dbConnection.createStatement();
            LOGGER.warn("antes de ejecutar");
            dbInsertQuery.execute(sqlStatement);
            LOGGER.warn("despues de ejecutar");
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        } finally {
            try {
                if (dbInsertQuery != null) {
                    dbInsertQuery.close();
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
    }

    private static final String VGM_INSERT_RECORD_DB = "insert into vgm_certifications\n" +
            "(certificate_nbr, certification_filename, appointment_nbr, road_truck_transaction_nbr, category, vessel_visit, vessel_name,\n" +
            "booking_nbr, unit_id, shipper_id, shipper_name, shipper_email,\n" +
            "driver_license_nbr, driver_name, truck_license_nbr,\n" +
            "equipment_tare, equipment_maxpayload, vgm_weight, cargo_weight,\n" +
            "status, creator, changer)\n" +
            "values\n" +
            "(':p_certificate_nbr', '.', :p_appointment_nbr, :p_road_truck_transaction_nbr, ':p_category', ':p_vessel_visit', ':p_vessel_name',\n" +
            "':p_booking_nbr',':p_unit_id',':p_shipper_id', ':p_shipper_name', ':p_shipper_email', \n" +
            "':p_driver_nbr', ':p_driver_name', ':p_truck_license_nbr',\n" +
            ":p_equipment_tare, :p_equipment_maxpayload, :p_vgm_weight, :p_cargo_weight,\n" +
            "'NUEVO', 'vgmuser', 'vgmuser')";
    //private static final String VGM_EVENT = "UNIT_RECEIVE";
    private static final String GENERAL_REFERENCE_TYPE = "CAS";
    private static final String GENERAL_REFERENCE_ID1 = "RTG";
    private static final String MISSING_EMAIL = "ServicioAlCliente.Posorja@dpworld.com";
    private final Logger LOGGER = Logger.getLogger(DpwpsjVGMOnUnitEvent.class);
}