package com.navis.extension.dpwpsj
import com.navis.argo.util.XmlUtil
import com.navis.billing.BillingEntity
import com.navis.billing.BillingField
import com.navis.billing.business.model.Customer
import com.navis.external.framework.entity.AbstractEntityLifecycleInterceptor
import com.navis.external.framework.entity.EEntityView
import com.navis.external.framework.util.EFieldChanges
import com.navis.external.framework.util.EFieldChangesView
import com.navis.framework.metafields.MetafieldIdFactory
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.log4j.Logger
import org.jdom.Element
import org.jdom.Text
/**
 * @author: Mauricio Orozco
 * @date: 2019-MAY-29
 * @purpose: export the data to a JMS when a user change a record in Customers entity
 */
/*
 * --------------------------------------------------------------------------------------------------------------------------------------------------
 * S.no   Modified Date   Modified By   Jira Id     SFDC     Change Description
 * --------------------------------------------------------------------------------------------------------------------------------------------------
 * 1      29-May-2019     Orozco M      -------     ------   Publicar los cambios hechos en la entidad Cusotmers a un JMS
 */
public class DpwpsjCustomerInterceptor extends AbstractEntityLifecycleInterceptor {
    /**
     * Captura los eventos cuando se crea un registro
     * @param inEntity
     * @param inOriginalFieldChanges
     * @param inMoreFieldChanges
     */
    @Override
    public void onCreate(EEntityView inEntity, EFieldChangesView inOriginalFieldChanges, EFieldChanges inMoreFieldChanges) {
        LOGGER.warn(String.format("At start of %s.onCreate", getClass().getName()));
        LOGGER.warn("Nombre entidad: " + inEntity.getEntityName());
        LOGGER.warn("EFieldChangesView: " + inOriginalFieldChanges.getFieldChangeCount());
        LOGGER.warn("EFieldChanges: " + inMoreFieldChanges.getFieldChangeCount());
        try {
            send2JMS(inEntity, inOriginalFieldChanges);
        } catch (Exception e) {
            String errorMsg = "GROOVY ERROR: DpwpsjCustomerInterceptor.onCreate():: " + e.getLocalizedMessage();
            LOGGER.error(errorMsg + ":: Stack trace:: " + e.getStackTrace().toString());
        }
        LOGGER.warn(String.format("At end of %s.onCreate", getClass().getName()));
    }
    /**
     * Captura los eventos cuando se actualiza un registro
     * @param inEntity
     * @param inOriginalFieldChanges
     * @param inMoreFieldChanges
     */
    @Override
    public void onUpdate(EEntityView inEntity, EFieldChangesView inOriginalFieldChanges, EFieldChanges inMoreFieldChanges) {
        LOGGER.warn(String.format("At start of %s.onUpdate", getClass().getName()));
//        LOGGER.warn("Nombre entidad: " + inEntity.getEntityName());
//        LOGGER.warn("EFieldChangesView: " + inOriginalFieldChanges.getFieldChangeCount());
//        LOGGER.warn("EFieldChanges: " + inMoreFieldChanges.getFieldChangeCount());
        try {
            send2JMS(inEntity, inOriginalFieldChanges);
        } catch (Exception e) {
            String errorMsg = "GROOVY ERROR: DpwpsjCustomerInterceptor.onUpdate():: " + e.getLocalizedMessage();
            LOGGER.error(errorMsg + ":: Stack trace:: " + e.getStackTrace().toString());
        }
        LOGGER.warn(String.format("At end of %s.onUpdate", getClass().getName()));
    }
    /**
     * Build an XML document based on the new or updated record from the entity, and send it to JMS
     * @param inEntity
     * @param inOriginalFieldChanges
     */
    private void send2JMS(EEntityView inEntity, EFieldChangesView inOriginalFieldChanges){
        Customer thisCustomer = (Customer) inEntity._entity;
        if (thisCustomer == null) {
            LOGGER.error("Customer is Null, hence returning!");
            return;
        }
        /**
         * Make sure the specified fields have change, otherwise it makes non sense to send the message
         */
        boolean hasChangeCustomerId = inOriginalFieldChanges.hasFieldChange(BillingField.CUST_ID);
        boolean hasChangeCustomerName = inOriginalFieldChanges.hasFieldChange(BillingField.CUST_NAME);
        boolean hasChangeCustomerRole = inOriginalFieldChanges.hasFieldChange(BillingField.CUST_ROLE);
        boolean hasChangeCustomerTaxGroup = inOriginalFieldChanges.hasFieldChange(BillingField.CUST_TAX_GROUP);
        boolean hasChangeCustomerDueDateRule = inOriginalFieldChanges.hasFieldChange(BillingField.CUST_DUE_DATE_RULE);
        boolean hasChangeCustomerDueDateValue = inOriginalFieldChanges.hasFieldChange(BillingField.CUST_DUE_DATE_VALUE);
        boolean hasChangeCustomerCurrency = inOriginalFieldChanges.hasFieldChange(BillingField.CUST_PREFERRED_CURRENCY);
        boolean hasChangeCustomerType = inOriginalFieldChanges.hasFieldChange(MetafieldIdFactory.valueOf(CUSTOM_CUSTOMER_TYPE));
        boolean hasChangeCustomerStatus = inOriginalFieldChanges.hasFieldChange(BillingField.CUST_LIFE_CYCLE_STATE);
        boolean hasChangeCustomerContactName = inOriginalFieldChanges.hasFieldChange(BillingField.CUST_CONTACTT_NAME);
        boolean hasChangeCustomerAddressLine1 = inOriginalFieldChanges.hasFieldChange(BillingField.CUST_ADDRESS_LINE1);
        boolean hasChangeCustomerCity = inOriginalFieldChanges.hasFieldChange(BillingField.CUST_CITY);
        boolean hasChangeCustomerState = inOriginalFieldChanges.hasFieldChange(BillingField.CUST_STATE);
        boolean hasChangeCustomerCountry = inOriginalFieldChanges.hasFieldChange(BillingField.CUST_COUNTRY);
        boolean hasChangeCustomerTel = inOriginalFieldChanges.hasFieldChange(BillingField.CUST_TEL);
        boolean hasChangeCustomerEmail = inOriginalFieldChanges.hasFieldChange(BillingField.CUST_EMAIL_ADDRESS);
        if ((hasChangeCustomerId) | (hasChangeCustomerName) | (hasChangeCustomerRole) | (hasChangeCustomerTaxGroup)
                | (hasChangeCustomerDueDateRule) | (hasChangeCustomerDueDateValue) | (hasChangeCustomerCurrency)
                | (hasChangeCustomerType) | (hasChangeCustomerStatus) | (hasChangeCustomerContactName)
                | (hasChangeCustomerAddressLine1) | (hasChangeCustomerCity) | (hasChangeCustomerState)
                | (hasChangeCustomerCountry) | (hasChangeCustomerTel) | (hasChangeCustomerEmail))
        {
            String xmlExport = constructCustomerXML(thisCustomer);
        //    LOGGER.warn(xmlExport);
            Object codeExtLibrary = getLibrary("DpwpsjGroovyUtil");
            if (codeExtLibrary != null) {
                codeExtLibrary.sendXML2JMS(QUEUE_NAME, xmlExport, inEntity.getEntityName(), thisCustomer.getCustId());
            }
        }
    }
    /**
     * Build and XML Node based on the selected entity record
     * @param inEntity
     * @return
     */
    private String constructCustomerXML(Customer inCustomer){
        Element rootElem = new Element(XML_ROOT_TAG);
        Element elem = new Element(CUSTOMER);
        rootElem.addContent(elem);
        addChildTextElement(CUSTOMER_ID , inCustomer.getCustId(), elem);
        addChildTextElement(CUSTOMER_NAME, inCustomer.getCustName(), elem);
        addChildTextElement(CUSTOMER_ROLE, inCustomer.getCustRole().description, elem);
        addChildTextElement(CUSTOMER_TAX, inCustomer.getCustTaxGroup().getTaxgrpDescription(), elem);
        if (inCustomer.getCustDueDateRule() != null){
            addChildTextElement(CUSTOMER_DUE_DATE_RULE, inCustomer.getCustDueDateRule().getName(), elem);

        }else{
            addChildTextElement(CUSTOMER_DUE_DATE_RULE, "", elem);
        }
        if (inCustomer.getCustDueDateValue() != null){
            addChildTextElement(CUSTOMER_DUE_DATE, inCustomer.getCustDueDateValue().toString(), elem);
        }else{
            addChildTextElement(CUSTOMER_DUE_DATE, "", elem);
        }
        if (inCustomer.getCustPreferredCurrency() != null){
            addChildTextElement(CUSTOMER_CURRENCY, StringEscapeUtils.escapeXml(inCustomer.getCustPreferredCurrency().getCurrencyId()), elem);
        }else{
            addChildTextElement(CUSTOMER_CURRENCY, "", elem);
        }
        if (inCustomer.getField(MetafieldIdFactory.valueOf(CUSTOM_CUSTOMER_TYPE)) != null){
            addChildTextElement(CUSTOMER_TYPE, inCustomer.getField(MetafieldIdFactory.valueOf(CUSTOM_CUSTOMER_TYPE)).toString(), elem);
        }else{
            addChildTextElement(CUSTOMER_TYPE, "", elem);
        }
        if (inCustomer.getCustLifeCycleState() != null){
            addChildTextElement(CUSTOMER_STATUS, inCustomer.getCustLifeCycleState().getName(), elem);
        }else{
            addChildTextElement(CUSTOMER_STATUS, "", elem);
        }
        if (inCustomer.getCustContacttName() != null){
            addChildTextElement(CUSTOMER_CONTACT_NAME, StringEscapeUtils.escapeXml(inCustomer.getCustContacttName()), elem);
        }else{
            addChildTextElement(CUSTOMER_CONTACT_NAME, "", elem);
        }
        if (inCustomer.getCustAddressLine1() != null) {
            addChildTextElement(CUSTOMER_CONTACT_ADDRESS, StringEscapeUtils.escapeXml(inCustomer.getCustAddressLine1()), elem);
        }else{
            addChildTextElement(CUSTOMER_CONTACT_ADDRESS, "", elem);
        }
        if (inCustomer.getCustCity() != null) {
            addChildTextElement(CUSTOMER_CONTACT_CITY, inCustomer.getCustCity(), elem);
        }else{
            addChildTextElement(CUSTOMER_CONTACT_CITY, "", elem);
        }
        if (inCustomer.getCustState() != null) {
            addChildTextElement(CUSTOMER_CONTACT_STATE, inCustomer.getCustState().getStateName(), elem);
        }else{
            addChildTextElement(CUSTOMER_CONTACT_STATE, "", elem);
        }
        if (inCustomer.getCustCountry() != null) {
            addChildTextElement(CUSTOMER_CONTACT_COUNTRY, inCustomer.getCustCountry().getCntryCode(), elem);
        }else{
            addChildTextElement(CUSTOMER_CONTACT_COUNTRY, "", elem);
        }
        if (inCustomer.getCustTel() != null){
            addChildTextElement(CUSTOMER_CONTACT_TELEPHONE, StringEscapeUtils.escapeXml(inCustomer.getCustTel()), elem);
        }else{
            addChildTextElement(CUSTOMER_CONTACT_TELEPHONE, "", elem);
        }
        if (inCustomer.getCustEmailAddress() != null){
            addChildTextElement(CUSTOMER_CONTACT_EMAIL, StringEscapeUtils.escapeXml(inCustomer.getCustEmailAddress()), elem);
        }else{
            addChildTextElement(CUSTOMER_CONTACT_EMAIL, "", elem);
        }
        return XmlUtil.toString(rootElem, true);
    }
    /**
     * Ensamblar una etiqueta XML
     * @param inElementName
     * @param inElementText
     * @param inParentElement
     */
    private static void addChildTextElement(String inElementName, String inElementText, Element inParentElement) {
        Element childElement = new Element(inElementName);
        Text childText = new Text(inElementText);
        childElement.addContent(childText);
        inParentElement.addContent(childElement);
    }
    private final String QUEUE_NAME = "N4CUSTOMERS";
    private final String XML_ROOT_TAG= "export";
    private final String CUSTOMER = "customer";
    private final String CUSTOMER_ID = "id";
    private final String CUSTOMER_NAME = "name";
    private final String CUSTOMER_ROLE = "role";
    private final String CUSTOMER_TAX = "tax";
    private final String CUSTOMER_DUE_DATE = "due_date";
    private final String CUSTOMER_DUE_DATE_RULE = "due_date_rule";
    private final String CUSTOMER_CURRENCY = "currency";
    private final String CUSTOMER_TYPE = "type";
    private final String CUSTOMER_STATUS = "status";
    private final String CUSTOMER_CONTACT_NAME = "contact_name";
    private final String CUSTOMER_CONTACT_ADDRESS = "contact_address";
    private final String CUSTOMER_CONTACT_CITY = "contact_city";
    private final String CUSTOMER_CONTACT_STATE = "contact_state";
    private final String CUSTOMER_CONTACT_COUNTRY = "contact_country";
    private final String CUSTOMER_CONTACT_TELEPHONE = "contact_telephone";
    private final String CUSTOMER_CONTACT_EMAIL = "contact_email";
    private static final String CUSTOM_CUSTOMER_TYPE = "customFlexFields.custCustomDFFTipoPersona";
    private Logger LOGGER = Logger.getLogger(DpwpsjCustomerInterceptor.class);
}