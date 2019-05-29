package com.navis.extension.dpwpsj
import com.navis.argo.util.XmlUtil
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
        String xmlExport = constructCustomerXML(inEntity);
        LOGGER.warn(xmlExport);
        LOGGER.warn("enviando a JMS");
        Object codeExtLibrary = getLibrary("DpwpsjGroovyUtil");
        try{
            if (codeExtLibrary != null) {
                int result = codeExtLibrary.sendXML2JMS(QUEUE_NAME, xmlExport);
                LOGGER.warn(result);
            }
        } catch (Exception e){
            LOGGER.error(e.printStackTrace());
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
        LOGGER.warn("Nombre entidad: " + inEntity.getEntityName());
        LOGGER.warn("EFieldChangesView: " + inOriginalFieldChanges.getFieldChangeCount());
        LOGGER.warn("EFieldChanges: " + inMoreFieldChanges.getFieldChangeCount());
        String xmlExport = constructCustomerXML(inEntity);
        LOGGER.warn(xmlExport);
        Object codeExtLibrary = getLibrary("DpwpsjGroovyUtil");
        try{
            if (codeExtLibrary != null) {
                int result = codeExtLibrary.sendXML2JMS(QUEUE_NAME, xmlExport);
                LOGGER.warn(result);
            }
        } catch (Exception e){
            LOGGER.error(e.printStackTrace());
        }
        LOGGER.warn(String.format("At end of %s.onUpdate", getClass().getName()));
    }
    /**
     * Ensamblar un texto XML basado en los valores de la entidad
     * @param inEntity
     * @return
     */
    private String constructCustomerXML(EEntityView inEntity){
        Customer thisCustomer = (Customer) inEntity._entity;
        Element rootElem = new Element("export");
        Element elem = new Element("customer");
        rootElem.addContent(elem);
        addChildTextElement(CUSTOMER_ID , thisCustomer.getCustId(), elem);
        addChildTextElement(CUSTOMER_NAME, thisCustomer.getCustName(), elem);
        addChildTextElement(CUSTOMER_ROLE, thisCustomer.getCustRole().description, elem);
        addChildTextElement(CUSTOMER_TAX, thisCustomer.getCustTaxGroup().getTaxgrpDescription(), elem);
        if (thisCustomer.getCustDueDateValue() != null){
            addChildTextElement(CUSTOMER_DUE_DATE, StringEscapeUtils.escapeXml(thisCustomer.getCustDueDateValue()), elem);
        }else{
            addChildTextElement(CUSTOMER_DUE_DATE, "", elem);
        }
        if (thisCustomer.getCustPreferredCurrency() != null){
            addChildTextElement(CUSTOMER_CURRENCY, StringEscapeUtils.escapeXml(thisCustomer.getCustPreferredCurrency().getCurrencyId()), elem);
        }else{
            addChildTextElement(CUSTOMER_CURRENCY, "", elem);
        }
        if (thisCustomer.getField(MetafieldIdFactory.valueOf(CUSTOM_CUSTOMER_TYPE)) != null){
            addChildTextElement(CUSTOMER_TYPE, thisCustomer.getField(MetafieldIdFactory.valueOf(CUSTOM_CUSTOMER_TYPE)).toString(), elem);
        }else{
            addChildTextElement(CUSTOMER_TYPE, "", elem);
        }
        if (thisCustomer.getCustLifeCycleState() != null){
            addChildTextElement(CUSTOMER_STATUS, thisCustomer.getCustLifeCycleState().getName(), elem);
        }else{
            addChildTextElement(CUSTOMER_STATUS, "", elem);
        }
        if (thisCustomer.getCustContacttName() != null){
            addChildTextElement(CUSTOMER_CONTACT_NAME, StringEscapeUtils.escapeXml(thisCustomer.getCustContacttName()), elem);
        }else{
            addChildTextElement(CUSTOMER_CONTACT_NAME, "", elem);
        }
        if (thisCustomer.getCustAddressLine1() != null) {
            addChildTextElement(CUSTOMER_CONTACT_ADDRESS, StringEscapeUtils.escapeXml(thisCustomer.getCustAddressLine1()), elem);
        }else{
            addChildTextElement(CUSTOMER_CONTACT_ADDRESS, "", elem);
        }
        if (thisCustomer.getCustCity() != null) {
            addChildTextElement(CUSTOMER_CONTACT_CITY, thisCustomer.getCustCity(), elem);
        }else{
            addChildTextElement(CUSTOMER_CONTACT_CITY, "", elem);
        }
        if (thisCustomer.getCustState() != null) {
            addChildTextElement(CUSTOMER_CONTACT_STATE, thisCustomer.getCustState().getStateName(), elem);
        }else{
            addChildTextElement(CUSTOMER_CONTACT_STATE, "", elem);
        }
        if (thisCustomer.getCustCountry() != null) {
            addChildTextElement(CUSTOMER_CONTACT_COUNTRY, thisCustomer.getCustCountry().getCntryName(), elem);
        }else{
            addChildTextElement(CUSTOMER_CONTACT_COUNTRY, "", elem);
        }
        if (thisCustomer.getCustTel() != null){
            addChildTextElement(CUSTOMER_CONTACT_TELEPHONE, StringEscapeUtils.escapeXml(thisCustomer.getCustTel()), elem);
        }else{
            addChildTextElement(CUSTOMER_CONTACT_TELEPHONE, "", elem);
        }
        if (thisCustomer.getCustEmailAddress() != null){
            addChildTextElement(CUSTOMER_CONTACT_EMAIL, StringEscapeUtils.escapeXml(thisCustomer.getCustEmailAddress()), elem);
        }else{
            addChildTextElement(CUSTOMER_CONTACT_EMAIL, "", elem);
        }
        return XmlUtil.toString(rootElem, false);
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
    private final String CUSTOMER_ID = "id";
    private final String CUSTOMER_NAME = "name";
    private final String CUSTOMER_ROLE = "role";
    private final String CUSTOMER_TAX = "tax";
    private final String CUSTOMER_DUE_DATE = "due_date";
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