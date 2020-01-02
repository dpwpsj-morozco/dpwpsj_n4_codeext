package com.navis.extension.dpwpsj

import com.navis.argo.business.api.ArgoUtils
import com.navis.argo.business.model.Facility
import com.navis.argo.business.reference.Equipment
import com.navis.argo.ContextHelper
import com.navis.argo.util.XmlUtil
import com.navis.external.argo.AbstractArgoCustomWSHandler
import com.navis.framework.business.Roastery
import com.navis.framework.metafields.MetafieldIdFactory
import com.navis.framework.portal.UserContext
import com.navis.framework.util.BizViolation
import com.navis.framework.util.message.MessageCollector
import com.navis.inventory.business.api.UnitFinder
import com.navis.inventory.business.atoms.GrossWeightSourceEnum
import com.navis.inventory.business.atoms.UfvTransitStateEnum
import com.navis.inventory.business.units.Unit
import com.navis.inventory.business.units.UnitFacilityVisit
import com.navis.road.business.atoms.TruckStatusEnum
import com.navis.road.business.model.Truck
import org.apache.log4j.Logger
import org.jdom.Element
import com.navis.framework.persistence.HibernateApi
/**
 * Input XML:
 * <custom class="DpwpsjWeighBridgeInterfaceWSHandler" type="extension">
 *  <dpwpsj-yard-update-truck-tare>
 *   <truckLicenseNbr>T03</truckLicenseNbr>
 *   <truckTare unit="kg">13333</truckTare>
 *  </dpwpsj-yard-update-truck-tare>
 * </custom>
 *
 * <custom class="DpwpsjWeighBridgeInterfaceWSHandler" type="extension">
 *  <dpwpsj-yard-update-ctr-gross-wt>
 *   <container eqid="FCIU2483530"/>
 *   <truckLicenseNbr>T03</truckLicenseNbr>
 *   <scaleWeight unit="kg">25000</scaleWeight>
 *  </dpwpsj-yard-update-ctr-gross-wt>
 * </custom>
 */
class DpwpsjWeighBridgeInterfaceWSHandler extends AbstractArgoCustomWSHandler{
    @Override
    void execute(UserContext inUserContext, MessageCollector inOutMessageCollector,
                 Element inECustom, Element inOutEResponse, Long inWslogGkey) {
        LOGGER.warn(String.format("At start of %s.execute at %s", getClass().getName(), ArgoUtils.timeNow()));
        String truckLicenseNbr = null
        Double scaleWeight = null
        Double truckTare = null
        Double grossWt = null
        String eqId = null
        String requestFor = null
        try {
            Element requestRoot = inECustom.getChild("dpwpsj-yard-update-scale-weight");
            if (requestRoot == null) {
                requestRoot = inECustom.getChild("dpwpsj-yard-update-truck-tare");
                if (requestRoot == null) {
                    requestRoot = inECustom.getChild("dpwpsj-yard-update-ctr-gross-wt");
                    if (requestRoot == null) {
                        requestRoot = inECustom.getChild("dpwpsj-update-cargolot-total-wt");
                        if (requestRoot == null) {
                            registerError("Invalid root element.")
                            return;
                        } else {
                            requestFor = REQ_UPDATE_CARGOLOT_TOTAL_WT;
                        }
                    } else {
                        requestFor = REQ_UPDATE_CTR_GROSS_WT;
                    }
                } else {
                    requestFor = REQ_UPDATE_TRUCK_TARE;
                }
            } else {
                requestFor = REQ_UPDATE_SCALE_WT;
            }
            if (REQ_UPDATE_TRUCK_TARE.equals(requestFor)) {
                truckLicenseNbr = getElementStringValue(requestRoot, WS_TRUCK_LICENSE_NBR);
                String truckTareStr = getElementStringValue(requestRoot, WS_TRUCK_TARE);
                truckTare = truckTareStr != null ? Double.valueOf(truckTareStr) : null;
                if (truckLicenseNbr == null || truckLicenseNbr.isEmpty()) {
                    registerError("Truck license number should not be null");
                    return;
                }
                if(truckTare == null) {
                    registerError("Truck tare weight should not be null");
                    return;
                }
                updateTruckTare(truckLicenseNbr, truckTare);
            }
            // Update gross wt for containers after discharge from vessel
            else if (REQ_UPDATE_CTR_GROSS_WT.equals(requestFor)) {
                Element element = requestRoot.getChild(WS_CONTAINER, requestRoot.getNamespace());
                eqId = XmlUtil.getRequiredAttributeStringValue(element, "eqid", requestRoot.getNamespace());
                truckLicenseNbr = getElementStringValue(requestRoot, WS_TRUCK_LICENSE_NBR);
                String scaleWtStr = getElementStringValue(requestRoot, WS_SCALE_WEIGHT);
                scaleWeight = scaleWtStr != null ? Double.valueOf(scaleWtStr) : null;

                if (eqId == null || eqId.isEmpty()) {
                    registerError("EquipmentId 'eqid' should not be null.");
                    return;
                }
                if (truckLicenseNbr == null || truckLicenseNbr.isEmpty()) {
                    registerError("Truck license number should not be null");
                    return;
                }
                if(scaleWeight == null) {
                    registerError("Gross weight should not be null.");
                    return;
                }
                Equipment eq = Equipment.findEquipment(eqId);
                if (eq == null) {
                    registerError(String.format("No equipment found matching id: %s", eqId));
                    return;
                }
                Facility fcy = ContextHelper.getThreadFacility();
                UnitFinder unitFinder = (UnitFinder) Roastery.getBean(UnitFinder.BEAN_ID);
                Unit unit = unitFinder.findActiveUnit(fcy.getFcyComplex(), eq);

                if (unit == null) {
                    registerError(String.format("No active Import Unit found with id: %s", eqId));
                    return;
                }
                if(!allowUpdateWeight(unit)) {
                    return;
                }
                Truck truck = Truck.findTruckByLicNbr(truckLicenseNbr);
                if (truck == null){
                    registerError(String.format("No truck has been found for license: %s", truckLicenseNbr));
                    return;
                }
                if (!(truck.getTruckIsInternal()) && !(truck.getTruckStatus()== TruckStatusEnum.OK)){
                    registerError(String.format("Truck is neither interal nor active: %s", truckLicenseNbr));
                    return;
                }
                if (truck.getTruckTareWeight() == null){
                    registerError(String.format("Truck %s has no tare", truckLicenseNbr));
                    return;
                }
                truckTare = truck.getTruckTareWeight();
                grossWt = scaleWeight - truckTare;
                if (grossWt < 0){
                    registerError(String.format("Truck tare %0f is greater than the scale weight %0f", truckTare, scaleWeight, ));
                    return;
                }
                unit.updateUnitGoodsAndCtrWtKgYardMeasured(grossWt);
                unit.updateVerifiedGrossMassWtKg(grossWt);
                unit.updateVerifiedEntity(VGM_VERIFIER_YARD_WEIGHBRIDGE);
                unit.updateGoodsAndCtrWtKg(grossWt);
                unit.updateGrossWeightSource(GrossWeightSourceEnum.SCALE);
                unit.setFieldValue(MetafieldIdFactory.valueOf(CUSTOM_UNIT_YARD_WEIGHBRIDGE_WT), grossWt);
                HibernateApi.getInstance().save(unit);
                // record a custom event FER_UNIT_SCALED
                final Object DpwpsjGroovyUtil = getLibrary("DpwpsjGroovyUtil");
                DpwpsjGroovyUtil.recordEvent(unit, CUSTOM_EVENT_YARD_WEIGHBRIDGE, null, String.format("source:DpwpsjWeighBridgeInterfaceWSHandler.execute. Camión: Licencia %s / Tara: %.0f | Peso Bascula: %.0f | Peso Bruto Unidad: %.0f", truckLicenseNbr, truckTare, scaleWeight, grossWt));
            }
        } catch (BizViolation inBizViolation) {
            LOGGER.warn("hubo una falla de regla de negcio")
            inOutMessageCollector.registerExceptions(inBizViolation);
        }
        LOGGER.warn(String.format("At end of %s.execute at %s", getClass().getName(), ArgoUtils.timeNow()));
    }
    /**
     *
     * @param inRootElement
     * @param inApiStringConstant
     * @return
     */
    private static String getElementStringValue(Element inRootElement, String inApiStringConstant) {
        String retString = null;
        Element element = inRootElement.getChild(inApiStringConstant, inRootElement.getNamespace());
        if (element != null) {
            retString = element.getText();
        }
        return retString;
    }
    /**
     *
     * @param inTruckLicense
     * @param inTruckTareWt
     */
    private void updateTruckTare(String inTruckLicense, Double inTruckTareWt){
        Truck truck = Truck.findTruckByLicNbr(inTruckLicense);
        if (truck != null){
            if ((truck.getTruckIsInternal()) && (truck.getTruckStatus()== TruckStatusEnum.OK)){
                truck.setTruckTareWeight(inTruckTareWt);
            }
        }
    }
    /**
     *
     * @param inUnit
     * @return
     */
    private boolean allowUpdateWeight(Unit inUnit) {
        // Update the unit only when any one of the following is met,
        // (1) unit's timeECIn is within 12 hours of current time and if Unit is not in Yard.
        // (2) unit is in Yard and has been reserved against a service order for Dpwpsj's custom event 'REPESAJE'.
        boolean allowUpdateWeight = true;
        UnitFacilityVisit ufv = inUnit.getUnitActiveUfvNowActive();
        if (!ufv.isTransitState(UfvTransitStateEnum.S40_YARD)) {
            registerError(String.format("Unit[%s] is not in yard. Cannot update gross weight of unit.", inUnit));
            allowUpdateWeight = false;
        }
        return allowUpdateWeight;
    }
    private final String REQ_UPDATE_SCALE_WT = "REQ_UPDATE_SCALE_WT";
    private final String REQ_UPDATE_TRUCK_TARE = "REQ_UPDATE_TRUCK_TARE";
    private final String REQ_UPDATE_CTR_GROSS_WT = "REQ_UPDATE_CTR_GROSS_WT";
    private final String REQ_UPDATE_CARGOLOT_TOTAL_WT = "REQ_UPDATE_CARGOLOT_TOTAL_WT";
    private final String WS_TRUCK_LICENSE_NBR = "truckLicenseNbr";
    private final String WS_SCALE_WEIGHT = "scaleWeight";
    private final String WS_TRUCK_TARE = "truckTare";
    private final String WS_CONTAINER = "container";
    private final String WS_GROSS_WT = "grossWeight";
    private final String WS_TOTAL_WT = "totalWeight";
    private static final String VGM_VERIFIER_YARD_WEIGHBRIDGE = "BASCULA_PATIO";
    private static final String CUSTOM_EVENT_YARD_WEIGHBRIDGE = "UNIT_WT_SCALED_YARD_WEIGHBRIDGE";
    private static final String CUSTOM_UNIT_YARD_WEIGHBRIDGE_WT = "customFlexFields.unitCustomDFFYardWeighbridgeWt";
    private final Logger LOGGER = Logger.getLogger(DpwpsjWeighBridgeInterfaceWSHandler.class)
}