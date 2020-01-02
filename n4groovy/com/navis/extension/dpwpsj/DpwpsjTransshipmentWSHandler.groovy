package com.navis.extension.dpwpsj

import com.navis.argo.ContextHelper
import com.navis.argo.business.api.ArgoUtils
import com.navis.argo.business.api.IFlagType
import com.navis.argo.business.api.IImpediment
import com.navis.argo.business.api.ServicesManager
import com.navis.argo.business.atoms.BizRoleEnum
import com.navis.argo.business.atoms.DataSourceEnum
import com.navis.argo.business.atoms.EventEnum
import com.navis.argo.business.atoms.FlagStatusEnum
import com.navis.argo.business.atoms.FreightKindEnum
import com.navis.argo.business.atoms.UnitCategoryEnum
import com.navis.argo.business.model.CarrierVisit
import com.navis.argo.business.model.Complex
import com.navis.argo.business.model.Facility
import com.navis.argo.business.model.LocPosition
import com.navis.argo.business.model.Yard
import com.navis.argo.business.reference.Equipment
import com.navis.argo.business.reference.ScopedBizUnit
import com.navis.external.argo.AbstractGroovyWSCodeExtension
import com.navis.framework.business.Roastery
import com.navis.framework.util.BizFailure
import com.navis.framework.util.BizViolation
import com.navis.inventory.business.api.RectifyParms
import com.navis.inventory.business.api.UnitField
import com.navis.inventory.business.api.UnitFinder
import com.navis.inventory.business.api.UnitManager
import com.navis.inventory.business.atoms.UfvTransitStateEnum
import com.navis.inventory.business.atoms.UnitVisitStateEnum
import com.navis.inventory.business.units.Unit
import com.navis.inventory.business.units.UnitEquipDamageItem
import com.navis.inventory.business.units.UnitEquipDamages
import com.navis.inventory.business.units.UnitFacilityVisit
import com.navis.orders.business.api.OrdersFinder
import com.navis.orders.business.eqorders.Booking
import com.navis.orders.business.eqorders.EquipmentOrderItem
import org.apache.log4j.Logger
/**
 * Web Service Hanlder to process all the transshipment.
 * Basically the import units will be set to "Departed" and create a new one with the same equipment
 * but with the category Export and associated to a specified Booking.
 * @author: <a href="mailto:mauricio.orozco@dpworld.com">Mauricio Orozco</a>
 * Date: 2016-11-21
 * <groovy class-name="DpwpsjTransshipmentWSHandler" class-location="code-extension">
 * <parameters>
 *   <parameter id="unitId" value="HOU239841"/>
 *   <parameter id="bookingNbr" value="50120085"/>
 *   <parameter id="lineOpId" value="HLC"/>
 *   <parameter id="VesselVisitId" value="CMA2019004"/>
 * </parameters>
 * </groovy>
 */
class DpwpsjTransshipmentWSHandler extends AbstractGroovyWSCodeExtension {
    String execute(Map<String, String> inParameters) {
        LOGGER.warn(String.format("At start of %s.execute at %s", getClass().getName(), ArgoUtils.timeNow()));
        String inUnitId;
        String inBookingNbr;
        String inLineOpId;
        String inVesselVisitId;
    /*    for (Map.Entry<String, Object> entry : inParams.entrySet()) {
            if (entry.getValue() instanceof String) {
                if (WS_UNIT_ID.equals(entry.getKey())) {
                    inUnitId = entry.getValue();
                }
                if (WS_BOOKING_NBR.equals(entry.getKey())) {
                    inBookingNbr = entry.getValue();
                }
                if (WS_LINE_OPERATOR_ID.equals(entry.getKey())) {
                    inLineOpId = entry.getValue();
                }
                if (WS_VESSEL_VISIT_ID.equals(entry.getKey())) {
                    inVesselVisitId = entry.getValue();
                }
            }
        }*/
        try{
            inUnitId = inParameters.get(WS_UNIT_ID);
            inBookingNbr = inParameters.get(WS_BOOKING_NBR);
            inLineOpId = inParameters.get(WS_LINE_OPERATOR_ID);
            inVesselVisitId = inParameters.get(WS_VESSEL_VISIT_ID);
            if (inUnitId == null || inUnitId.isEmpty()) {
                LOGGER.error("Invalid input for WS_UNIT_ID. Hence returning!");
                throw BizViolation.create(BizFailure.create(String.format("Invalid input for %s. Hence returning!", WS_UNIT_ID)));
            }
            if (inBookingNbr == null || inBookingNbr.isEmpty()) {
                LOGGER.error("Invalid input for WS_BOOKING_NBR. Hence returning!");
                throw BizViolation.create(BizFailure.create(String.format("Invalid input for %s. Hence returning!", WS_BOOKING_NBR)));
            }
            if (inLineOpId == null || inLineOpId.isEmpty()) {
                LOGGER.error("Invalid input for WS_LINE_OPERATOR_ID. Hence returning!");
                throw BizViolation.create(BizFailure.create(String.format("Invalid input for %s. Hence returning!", WS_LINE_OPERATOR_ID)));
            }
            if (inVesselVisitId == null || inVesselVisitId.isEmpty()) {
                LOGGER.error("Invalid input for WS_VESSEL_VISIT_ID. Hence returning!");
                throw BizViolation.create(BizFailure.create(String.format("Invalid input for %s. Hence returning!", WS_VESSEL_VISIT_ID)));
            }
            processTransshipment(inUnitId.trim(), inBookingNbr.trim(), inLineOpId.trim(), inVesselVisitId.trim());
        } catch (BizViolation inBizViolation) {
            getMessageCollector().registerExceptions(inBizViolation);
        }
        LOGGER.warn(String.format("At end of %s.execute at %s", getClass().getName(), ArgoUtils.timeNow()));
        return getMessageCollector().getMessages().toString();
    }
    private void processTransshipment (String inStrOldUnit, String inStrNewBooking, String inStrNewLineOperator, String inStrNewVesselVisitId) throws BizViolation {
        LOGGER.warn(String.format("At start of %s.processTransshipment", getClass().getName()));
        Yard yard = ContextHelper.getThreadYard();
        Facility facility = yard.getYrdFacility();
        Complex complex = facility.getFcyComplex();
        Equipment currentEquipment = Equipment.findEquipment(inStrOldUnit);
        if (currentEquipment == null) {
            String errorMsg = String.format("Groovy:Missing Equipment");
            LOGGER.error(errorMsg);
            throw BizViolation.create(BizFailure.create(errorMsg));
            return;
        }
        UnitFinder unitFinder = (UnitFinder) Roastery.getBean(UnitFinder.BEAN_ID);
        Unit inOldUnit = unitFinder.findActiveUnit(complex, currentEquipment, UnitCategoryEnum.IMPORT);
        if (inOldUnit == null) {
            String errorMsg = String.format("Groovy:Missing Unit");
            LOGGER.error(errorMsg);
            throw BizViolation.create(BizFailure.create(errorMsg));
        }
        if ((UnitCategoryEnum.IMPORT == inOldUnit.getUnitCategory()) && (FreightKindEnum.MTY == inOldUnit.getUnitFreightKind())){
            UnitFacilityVisit oldUfv = inOldUnit.getUnitActiveUfvNowActive();
            if (oldUfv == null) {
                String errorMsg = String.format("Groovy:Missing Unit Facility Viist");
                LOGGER.error(errorMsg);
                throw BizViolation.create(BizFailure.create(errorMsg));
                return;
            }
            if (oldUfv.isTransitState(UfvTransitStateEnum.S40_YARD)){
                ScopedBizUnit inNewLineOperator = ScopedBizUnit.findScopedBizUnit(inStrNewLineOperator, BizRoleEnum.LINEOP);
                if (inNewLineOperator == null) {
                    String errorMsg = String.format("Groovy:Missing Line Operator");
                    LOGGER.error(errorMsg);
                    throw BizViolation.create(BizFailure.create(errorMsg));
                    return;
                }
                CarrierVisit newArriveCv = CarrierVisit.getGenericTruckVisit(complex);
                CarrierVisit newDepartCv = CarrierVisit.getGenericVesselVisit(complex);
                CarrierVisit departCvOld = CarrierVisit.findVesselVisit(facility, inStrNewVesselVisitId);
                if (departCvOld == null) {
                    String errorMsg = String.format("Groovy:Vessel Visit");
                    LOGGER.error(errorMsg);
                    throw BizViolation.create(BizFailure.create(errorMsg));
                    return;
                }
                Booking inNewBooking = Booking.findBookingByUniquenessCriteria(inStrNewBooking, inNewLineOperator, departCvOld);
                if (inNewBooking == null) {
                    String errorMsg = String.format("Groovy:Missing Booking");
                    LOGGER.error(errorMsg);
                    throw BizViolation.create(BizFailure.create(errorMsg));
                    return;
                }
                LocPosition oldUfvLocPosition = oldUfv.getLastYardPosition();
                UnitManager oldUm =(UnitManager) Roastery.getBean(UnitManager.BEAN_ID);
                RectifyParms oldParms = new RectifyParms();
                oldParms.setUfvTransitState(UfvTransitStateEnum.S70_DEPARTED);
                oldParms.setUnitVisitState(UnitVisitStateEnum.DEPARTED);
                oldParms.setVisibleInSparcs(false);
                oldUm.rectifyUfv(oldUfv, oldParms);

                UnitEquipDamages oldUnitEquipDamages = inOldUnit.getUnitDamages();
                ServicesManager oldServicesManager = (ServicesManager) Roastery.getBean(ServicesManager.BEAN_ID);
                Collection oldImpedimentsList = oldServicesManager.getImpedimentsForEntity(inOldUnit);

                UnitManager newUm =(UnitManager) Roastery.getBean(UnitManager.BEAN_ID);
                UnitFacilityVisit newUfv = newUm.findOrCreatePreadvisedUnit(facility, currentEquipment.getEqIdFull(),
                        currentEquipment.getEqEquipType(), UnitCategoryEnum.EXPORT, FreightKindEnum.FCL, inNewLineOperator, newArriveCv, newDepartCv,
                        DataSourceEnum.DATA_IMPORT, "Reembarque automatico. source:DpwpsjTransshipment.processTransshipment()");
                Unit newUnit = newUfv.getUfvUnit();
                //RectifyParms newParms = new RectifyParms();
                //newParms.setUnitVisitState(UnitVisitStateEnum.ACTIVE);
                //newParms.setUfvTransitState(UfvTransitStateEnum.S40_YARD);
                //newParms.setIbCv(arriveCv);
                //newParms.setObCv(departCv);
                //newParms.setSlot(unitSlot);
                //newParms.setEraseHistory(true);
                //newParms.setEventToRecord(EventEnum.UNIT_ACTIVATE);
                //newParms.setEventNote("prueba desde groovy codigo");
                //newParms.setVisibleInSparcs(true);
                newUnit.updateSeals(inOldUnit.getUnitSealNbr1(), inOldUnit.getUnitSealNbr2(), inOldUnit.getUnitSealNbr3(), inOldUnit.getUnitSealNbr4(), inOldUnit.getUnitIsCtrSealed());
                newUnit.updateLineOperator(inNewLineOperator);
                newUnit.updateFreightKind(inOldUnit.getUnitFreightKind());

                newUfv.updateLastKnownPosition(oldUfvLocPosition, ArgoUtils.timeNow());
                newUnit.updateGrossWeightSource(inOldUnit.getUnitGrossWeightSource());
                newUnit.updateUnitGoodsAndCtrWtKgYardMeasured(inOldUnit.getUnitGoodsAndCtrWtKgYardMeasured());
                newUnit.updateVerifiedGrossMassWtKg(inOldUnit.getUnitGoodsAndCtrWtKgVerfiedGross());
                newUnit.updateVerifiedEntity(inOldUnit.getUnitVgmEntity());
                newUnit.updateVgmVerifiedDate(inOldUnit.getUnitVgmVerifiedDate());
                //newUnit.updateGoodsAndCtrWtKg(unit.getUnitGoodsAndCtrWtKg());
                OrdersFinder newOrdersFinder = (OrdersFinder) Roastery.getBean(OrdersFinder.BEAN_ID);
                EquipmentOrderItem newEquipmentItem = newOrdersFinder.findEqoItemByEqType(inNewBooking, currentEquipment.getEqEquipType());
                newUnit.assignToOrder(newEquipmentItem, currentEquipment);
                // Numero de carga
                newUnit.setFieldValue(UnitField.UNIT_FLEX_STRING04, inOldUnit.getUnitFlexString04());
                // secuencia BL
                newUnit.setFieldValue(UnitField.UNIT_FLEX_STRING05, inOldUnit.getUnitFlexString05());
                // Sello DPWP
                newUnit.setFieldValue(UnitField.UNIT_FLEX_STRING09, inOldUnit.getUnitFlexString09());
                // Autorización SENAE
                newUnit.setFieldValue(UnitField.UNIT_FLEX_STRING15, inOldUnit.getUnitFlexString15());
                if (oldUnitEquipDamages != null) {
                    UnitEquipDamageItem oldUnitEquipDamageItem;
                    Iterator<UnitEquipDamageItem> damageItemsIterator = oldUnitEquipDamages.getDamageItemsIterator();
                    while (damageItemsIterator.hasNext()) {
                        oldUnitEquipDamageItem = (UnitEquipDamageItem) damageItemsIterator.next();
                        LOGGER.warn(oldUnitEquipDamageItem.getDmgitemType().getEqdmgtypDescription());
                        UnitEquipDamageItem unitEquipDamageItem2 = newUnit.addDamageItem(newUnit.getPrimaryEq(), oldUnitEquipDamageItem.getDmgitemType(), oldUnitEquipDamageItem.getDmgitemComponent(), oldUnitEquipDamageItem.getDmgitemSeverity(), oldUnitEquipDamageItem.getDmgitemReported(), null);
                        if (unitEquipDamageItem2 != null) {
                            LOGGER.warn("daño ha sido registrado");
                        } else {
                            LOGGER.warn("daño NO ha sido registrado");
                        }
                    }
                }
                if (!oldImpedimentsList.isEmpty()) {
                    for (IImpediment oldImpediment : oldImpedimentsList) {
                        LOGGER.warn(oldImpediment.getFlagType().getId() + " | " + oldImpediment.getNote() + " | "  + oldImpediment.getFlagType().getPurpose().getName() + " | " + oldImpediment.getStatus().getName());
                        FlagStatusEnum oldFlagStatusEnum = oldImpediment.getStatus();
                        if (oldFlagStatusEnum == FlagStatusEnum.ACTIVE) {
                            IFlagType newFlacType = oldImpediment.getFlagType();
                            ServicesManager newServiceManager = (ServicesManager) Roastery.getBean(ServicesManager.BEAN_ID);
                            newServiceManager.applyHold(newFlacType.getId(), newUnit, null, oldImpediment.getReferenceId(), oldImpediment.getNote());
                        }
                    }
                }
                newUnit.setUnitRouting(inNewBooking.getRoutingInfo());
                newUnit.updateRequiresPower(inOldUnit.getUnitRequiresPower());
                newUfv.updateUfvVisibleInSparcs(true);
            } else {
                String errorMsg = String.format("Groovy:UFV must be YARD");
                LOGGER.error(errorMsg);
                throw BizViolation.create(BizFailure.create(errorMsg));
                return;
            }
        }
        LOGGER.warn(String.format("At end of %s.processTransshipment", getClass().getName()));
    }
    private final String WS_UNIT_ID = "unitId";
    private final String WS_BOOKING_NBR = "bookingNbr";
    private final String WS_LINE_OPERATOR_ID = "lineOpId";
    private final String WS_VESSEL_VISIT_ID = "VesselVisitId";
    private final Logger LOGGER = Logger.getLogger(DpwpsjTransshipmentWSHandler.class);
}