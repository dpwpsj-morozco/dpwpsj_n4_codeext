package com.navis.extension.dpwpsj
import com.navis.argo.ContextHelper
import com.navis.argo.business.api.GroovyApi
import com.navis.argo.business.model.Facility
import com.navis.carina.integrationservice.business.IntegrationService
import com.navis.framework.IntegrationServiceEntity
import com.navis.framework.IntegrationServiceField
import com.navis.framework.business.atoms.IntegrationServiceDirectionEnum
import com.navis.framework.persistence.HibernateApi
import com.navis.framework.portal.QueryUtils
import com.navis.framework.portal.query.DomainQuery
import com.navis.framework.portal.query.PredicateFactory
import org.apache.activemq.ActiveMQConnectionFactory
import org.apache.log4j.Logger
import javax.jms.Connection
import javax.jms.ConnectionFactory
import javax.jms.Destination
import javax.jms.MessageProducer
import javax.jms.Session
import javax.jms.TextMessage
/**
 * @author: Mauricio Orozco
 * @date: 2019-MAY-29
 * @purpose: utilities used by other code extensions
 */
public class DpwpsjGroovyUtil extends GroovyApi {
    /**
     * Send text or XML text to a JMS
     * @param queueName
     * @param inXML
     * @return
     */
    public int sendXML2JMS(String queueName, String inXML){
        try{
            IntegrationService integrationService;
            integrationService = findIntegrationService(ContextHelper.getThreadFacility(), queueName);
            ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(integrationService.getIntservUrl());
            Connection connection = connectionFactory.createConnection();
            connection.start();
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            Destination destination = session.createQueue(queueName);
            MessageProducer producer = session.createProducer(destination);
            TextMessage message = session.createTextMessage(inXML);
            producer.send(message);
            connection.close();
            return 0;
        } catch (Exception e){
            LOGGER.error(e.printStackTrace());
            return 1;
        }
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
    private final Logger LOGGER = Logger.getLogger(DpwpsjGroovyUtil.class);
}