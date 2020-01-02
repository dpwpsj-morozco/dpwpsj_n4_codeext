package com.navis.extension.dpwpsj
import com.navis.argo.ContextHelper
import com.navis.argo.business.api.ArgoUtils
import com.navis.argo.business.api.GroovyApi
import com.navis.argo.business.api.IEvent
import com.navis.argo.business.api.ServicesManager
import com.navis.argo.business.integration.IntegrationServiceMessage
import com.navis.argo.business.model.Facility
import com.navis.argo.business.model.ArgoSequenceProvider
import com.navis.carina.integrationservice.business.IntegrationService
import com.navis.framework.IntegrationServiceEntity
import com.navis.framework.IntegrationServiceField
import com.navis.framework.business.Roastery
import com.navis.framework.business.atoms.IntegrationServiceDirectionEnum
import com.navis.framework.metafields.MetafieldId
import com.navis.framework.persistence.HibernateApi
import com.navis.framework.portal.FieldChanges
import com.navis.framework.util.BizFailure
import com.navis.framework.util.BizViolation
import com.navis.framework.portal.QueryUtils
import com.navis.framework.portal.query.DomainQuery
import com.navis.framework.portal.query.PredicateFactory
import com.navis.framework.util.scope.ScopeCoordinates
import com.navis.inventory.business.units.Unit
import com.navis.services.business.event.Event
import com.navis.services.business.rules.EventType
import org.apache.log4j.Logger
/**
 * @author: Mauricio Orozco
 * @date: 2019-MAY-29
 * @purpose: utilities used by other code extensions
 */
public class DpwpsjGroovyUtil extends GroovyApi {
    public IEvent recordEvent(Unit inUnit, String inEventTypeId, FieldChanges inFieldChanges, String inEventNotes) throws BizViolation {
        LOGGER.warn(String.format("At start of %s.recordEvent 1 at %s", getClass().getName(), ArgoUtils.timeNow()));
        return recordEvent(inUnit, inEventTypeId, inFieldChanges, inEventNotes, null);
    }

    public IEvent recordEvent(Unit inUnit, String inEventTypeId, FieldChanges inFieldChanges, String inEventNotes,
                              Map<MetafieldId, Object> inEventFlexFieldMap) throws BizViolation {
        LOGGER.warn(String.format("At start of %s.recordEvent 2 at %s", getClass().getName(), ArgoUtils.timeNow()));
        Event event = null;
        EventType eventType = EventType.findEventType(inEventTypeId);
        if (eventType == null) {
            String errorMsg = String.format("No EventType found matching id: %s", inEventTypeId);
            LOGGER.error(errorMsg);
            throw BizViolation.create(BizFailure.create(errorMsg));
        }
        ServicesManager sm = (ServicesManager) Roastery.getBean(ServicesManager.BEAN_ID);
        if (sm != null) {
            event = (Event) sm.recordEvent(eventType, inEventNotes, null, null, inUnit, inFieldChanges);
            if(event != null) {
                if(inEventFlexFieldMap != null && !inEventFlexFieldMap.isEmpty()) {
                    for(MetafieldId metafieldId : inEventFlexFieldMap.keySet()) {
                        event.setFieldValue(metafieldId, inEventFlexFieldMap.get(metafieldId));
                    }
                    HibernateApi.getInstance().save(event);
                }
            }
        }
        return event;
    }
    /**
     * Send text or XML text to a JMS
     * @param queueName
     * @param inXML
     * @return
     */
    public void sendXML2JMS(String queueName, String inXML, String inEntityName, String inEntityRecordId){
        LOGGER.warn(String.format("At start of %s.sendXML2JMS at %s", getClass().getName(), ArgoUtils.timeNow()));
        IntegrationService integrationService = findIntegrationService(ContextHelper.getThreadFacility(), queueName);
        IntegrationServiceMessage integrationServiceMessage = createIntegrationServiceMessage(integrationService, inXML, inEntityName, inEntityRecordId);
        LOGGER.warn(String.format(queueName + " " + inEntityName + " " + inEntityRecordId));
        try{
            new GroovyApi().sendXml(integrationService.getIntservName(), inXML, null);
        } catch (Exception e){
            LOGGER.error("JMS Connection Problem: "+e);
            integrationServiceMessage.setIsmFirstSendTime(null);
            integrationServiceMessage.setIsmLastSendTime(null);
            HibernateApi.getInstance().save(integrationServiceMessage);
        }
        LOGGER.warn(String.format("At end of %s.sendXML2JMS at %s", getClass().getName(), ArgoUtils.timeNow()));
    }
    /**
     * Look for values for the specified queue name
     * @param inFacility
     * @param queueName
     * @return
     */
    private IntegrationService findIntegrationService(Facility inFacility, String queueName) {
        DomainQuery dq = QueryUtils.createDomainQuery(IntegrationServiceEntity.INTEGRATION_SERVICE);
        dq.addDqPredicate(PredicateFactory.eq(IntegrationServiceField.INTSERV_DIRECTION, IntegrationServiceDirectionEnum.OUTBOUND));
        dq.addDqPredicate(PredicateFactory.eq(IntegrationServiceField.INTSERV_ACTIVE, Boolean.TRUE));
        dq.addDqPredicate(PredicateFactory.eq(IntegrationServiceField.INTSERV_NAME, queueName));
        dq.addDqPredicate(PredicateFactory.eq(IntegrationServiceField.INTSERV_SCOPE_GKEY, inFacility.getFcyGkey()));
        List integrationServiceList = HibernateApi.getInstance().findEntitiesByDomainQuery(dq)
        if (integrationServiceList == null || integrationServiceList.isEmpty()) {
            String message = inFacility.getFcyPathName() + " has no outbound jms defined.";
            LOGGER.error(message);
            return null;
        }
        IntegrationService integrationService = (IntegrationService) integrationServiceList.get(0);
        return integrationService;
    }
    /**
     *
     * @param inIntegrationService
     * @param inMessagePayload
     * @return
     */
    public IntegrationServiceMessage createIntegrationServiceMessage(IntegrationService inIntegrationService, String inMessagePayload,
                                                                     String inEntityName, String inEnityRecordId) {
        IntegrationServiceMessage ism = new IntegrationServiceMessage();
        // ism.setIsmEventPrimaryKey((Long) inEvent.getEvntEventType().getPrimaryKey());
        // ism.setIsmEntityClass(inEvent.getEventAppliedToClass());
        ism.setIsmEntityNaturalKey(inEntityName);
        //ism.setIsmEventTypeId("export 2 JMS");
        if (inIntegrationService != null) {
            ism.setIsmIntegrationService(inIntegrationService);
            ism.setIsmFirstSendTime(ArgoUtils.timeNow());
            ism.setIsmLastSendTime(ArgoUtils.timeNow());
        } else {
            LOGGER.warn("Integration Service is not found");
        }
        if (inMessagePayload.length() < 4000) {
            ism.setIsmUserString2("0");
            ism.setIsmMessagePayload(inMessagePayload);
        } else {
            ism.setIsmUserString2("Incomplete Message");
            ism.setIsmMessagePayload(inMessagePayload.substring(0, 3999));
        }
        IntegrationServiceMessageIdProvider ismIdProvider = new IntegrationServiceMessageIdProvider();
        ism.setIsmSeqNbr(ismIdProvider.getNextIntegrationServiceMessageId());

        ScopeCoordinates scopeCoordinates = ContextHelper.getThreadUserContext().getScopeCoordinate();

        Long scopeLevel = ScopeCoordinates.GLOBAL_LEVEL;
        String scopeGkey = null;
        if (!scopeCoordinates.isScopeGlobal()) {
            scopeLevel = new Long(ScopeCoordinates.getScopeId(4));
            scopeGkey = (String) scopeCoordinates.getScopeLevelCoord(scopeLevel.intValue());
        }

        ism.setIsmScopeGkey(scopeGkey);
        ism.setIsmScopeLevel(scopeLevel);
        ism.setIsmUserString1(inEnityRecordId);

        ism.setIsmCreator(ContextHelper.getThreadUserContext().getUserId());
        ism.setIsmCreated(new Date());
        ism.setIsmChanger(ContextHelper.getThreadUserContext().getUserId());
        ism.setIsmChanged(new Date());
        HibernateApi.getInstance().save(ism);
        return ism;
    }
    /**
     *
     */
    public static class IntegrationServiceMessageIdProvider extends ArgoSequenceProvider {
        /**
         * returns next SegNo that is unqiue for the current thread Facility.
         */
        public Long getNextIntegrationServiceMessageId() {
            return super.getNextSeqValue(_ismIdSeq, (Long) ContextHelper.getThreadFacilityKey());
        }

        private String _ismIdSeq = "ISM_SEQUENCE";
    }
    private final Logger LOGGER = Logger.getLogger(DpwpsjGroovyUtil.class);
}