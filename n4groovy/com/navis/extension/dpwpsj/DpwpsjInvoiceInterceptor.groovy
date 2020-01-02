package com.navis.extension.dpwpsj

import com.navis.argo.business.model.GeneralReference
import com.navis.argo.extension.ArgoExtensionTypes
import com.navis.argo.util.XmlUtil
import com.navis.billing.BillingEntity
import com.navis.billing.BillingField
import com.navis.billing.business.atoms.InvoiceStatusEnum
import com.navis.billing.business.model.Currency
import com.navis.billing.business.model.Customer
import com.navis.billing.business.model.Invoice
import com.navis.billing.business.model.InvoiceItem
import com.navis.billing.business.model.InvoiceType
import com.navis.billing.business.model.TaxGroup
import com.navis.billing.business.model.Tariff
import com.navis.external.argo.AbstractGroovyWSCodeExtension
import com.navis.external.framework.entity.AbstractEntityLifecycleInterceptor
import com.navis.external.framework.entity.EEntityView
import com.navis.external.framework.util.EFieldChanges
import com.navis.external.framework.util.EFieldChangesView
import com.navis.external.util.ArgoExtensionUtils
import com.navis.framework.business.Roastery
import com.navis.framework.metafields.MetafieldIdFactory
import com.navis.framework.persistence.HibernateApi
import com.navis.framework.portal.Ordering
import com.navis.framework.portal.QueryUtils
import com.navis.framework.portal.query.DomainQuery
import com.navis.framework.portal.query.PredicateFactory
import com.navis.framework.util.BizViolation
import jxl.write.Boolean
import org.apache.commons.lang.StringEscapeUtils
import org.apache.log4j.Logger
import org.hibernate.SQLQuery
import org.jdom.Element
import org.jdom.Text
import java.text.DecimalFormat
import java.text.SimpleDateFormat

/**
 * @author: Erick Poveda
 * @date: 2019-JUN-17
 * @purpose: Export the information to Active MQ
 */
/*
 * --------------------------------------------------------------------------------------------------------------------------------------------------
 * S.no   Modified Date   Modified By   Jira Id     SFDC     Change Description
 * --------------------------------------------------------------------------------------------------------------------------------------------------
 * 1      19-Jun-2019     Poveda E      -------     ------   Exportar campos y facturas
 * 2      09-Jul-2019     Orozco M      -------     ------   Carga suelta
 */
public class DpwpsjInvoiceInterceptor extends AbstractEntityLifecycleInterceptor {
    /**
     * Captura los eventos cuando se cambia a final el registro de la factura
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
        Invoice invoice = (Invoice) inEntity._entity;
        if (invoice == null) {
            LOGGER.error("Invoice is Null, hence returning!");
            return;
        }

        Customer invoiceCustomer = invoice.getInvoicePayeeCustomer() != null ? invoice.getInvoicePayeeCustomer(): invoice.getInvoiceContractCustomer();
        if(invoiceCustomer == null) {
            LOGGER.error("InvoiceCustomer is Null, hence returning!");
            return;
        }

        //if (invoice.getInvoiceStatus().getName() == "Final" || invoice.getInvoiceStatus().getName() == "Cancelled"){
        try {
            if (inOriginalFieldChanges.hasFieldChange(BillingField.INVOICE_FINALIZED_DATE)
                    && !inOriginalFieldChanges.hasFieldChange(BillingField.INVOICE_FINAL_NBR)) {

                //Metodo comentado
                //deprecatedCall(inOriginalFieldChanges, invoice, invoiceCustomer);

                ////////////// AW Inicio: Invocar logica de Pagos  ///////////////////
                AbstractGroovyWSCodeExtension groovy = (AbstractGroovyWSCodeExtension) ArgoExtensionUtils.getExtension(getUserContext(), "DpwpPaymentCallbackHandler", ArgoExtensionTypes.GROOVY_WS_CODE_EXTENSION);
                groovy.executeOnInvoiceFinalized(invoice);
                ////////////// AW Fin: Invocar logica de Pagos  ///////////////////

            }
        } catch (BizViolation inBv) {
            registerError(inBv.getLocalizedMessage());
            LOGGER.error("GROOVY ERROR:: " + inBv.getLocalizedMessage() + " Stack trace:: " + inBv.getStackTrace().toString());
        }

        try{
            String xmlExport = constructInvoiceXML(invoice);
            LOGGER.warn(xmlExport);
            Object codeExtLibrary = getLibrary("DpwpsjGroovyUtil");
            if (codeExtLibrary != null) {
                //int result = 0;
                //result = codeExtLibrary.sendXML2JMS(QUEUE_NAME, xmlExport);
                //result = codeExtLibrary.sendXML2JMS(QUEUE_NAME_NC, xmlExport);
                LOGGER.warn(inEntity.getEntityName());
                LOGGER.warn(String.valueOf(invoice.getInvoiceDraftNbr()));
                // Factura Final
                if (invoice.isFinalized()) {
                    codeExtLibrary.sendXML2JMS(QUEUE_NAME, xmlExport, inEntity.getEntityName(), String.valueOf(invoice.getInvoiceDraftNbr()));
                }

                // Factura cancelada
                if (invoice.isRegenerated()) {
                    codeExtLibrary.sendXML2JMS(QUEUE_NAME_NC, xmlExport, inEntity.getEntityName(), String.valueOf(invoice.getInvoiceDraftNbr()));
                }
            }
        } catch (Exception e){
            LOGGER.error(e.printStackTrace());
        }
        LOGGER.warn(String.format("At end of %s.onUpdate", getClass().getName()));
    }
    private String executeSendInvoiceDetailsToERP(Invoice inInvoice, Customer inInvoiceCustomer) throws BizViolation {
        Object codeExtLibrary = getLibrary("FertisaSendMessageToJDE");
        String responseMsg = null;
        if (codeExtLibrary != null) {
            responseMsg = codeExtLibrary.sendInvoiceMessageToERP(inInvoice, inInvoiceCustomer);
        } else {
            LOGGER.error("DpwpsjInvoiceInterceptor:: Could not load code extension: DpwpsjSendMessageToERP");
        }
        return responseMsg;
    }
    /**
     * Ensamblar un texto XML basado en los valores de la entidad
     * @param inEntity
     * @return
     */
    private String constructInvoiceXML(Invoice inInvoice){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String company;
        GeneralReference gfCompany = GeneralReference.findUniqueEntryById(GENERAL_REFERENCE_TYPE, GENERAL_REFERENCE_ID1, GENERAL_REFERENCE_ID2);
        if (gfCompany != null) {
            if (gfCompany.getRefValue1() != null) {
                if (gfCompany.getRefValue1() != "") {
                    company = gfCompany.getRefValue1();
                }
            }
        }
        //Element rootElem = new Element(EXPORT_TAG);
        Element rootElem = new Element(INVOICE);
        Element elemInvoice = rootElem;
        //rootElem.addContent(elemInvoice);
        /**
         * Add invoice elements
         */
        addChildTextElement(INVOICE_DRAFT_ID , String.valueOf(inInvoice.getInvoiceDraftNbr()), elemInvoice);
        //addChildTextElement(INVOICE_FINAL_ID, inInvoice.getInvoiceFinalNbr(), elemInvoice);
        /*InvoiceStatusEnum invoiceStatusEnum = inInvoice.getInvoiceStatus();
        addChildTextElement(INVOICE_STATUS, invoiceStatusEnum.getName(), elemInvoice);*/
        InvoiceType invoiceType =  inInvoice.getInvoiceInvoiceType();
        if (invoiceType != null) {
            addChildTextElement(INVOICE_TYPE, invoiceType.getInvtypeId(), elemInvoice);
        } else {
            addChildTextElement(INVOICE_TYPE, "", elemInvoice);
        }



        addChildTextElement(CREATED, dateFormat.format(inInvoice.getInvoiceCreated()), elemInvoice);
        addChildTextElement(FACILITY, inInvoice.getInvoiceFacility().getId(), elemInvoice);
        addChildTextElement(CUSTOMER_ID, inInvoice.getInvoicePayeeCustomer().getCustId(), elemInvoice);

        /**
         * Add additional elements
         */
        Element elemAdditional = new Element(ADDITIONAL);
        elemInvoice.addContent(elemAdditional);

        addChildTextElement(ADDRESS, StringEscapeUtils.escapeXml(inInvoice.getInvoiceAddressLine1()), elemAdditional);
        addChildTextElement(EMAIL, StringEscapeUtils.escapeXml(inInvoice.getInvoiceEmailAddress()), elemAdditional);
        if (inInvoice.getField(MetafieldIdFactory.valueOf(CUSTOM_INVOICE_VESSEL_NAME))!=null){
            String valueCustomField = inInvoice.getField(MetafieldIdFactory.valueOf(CUSTOM_INVOICE_VESSEL_NAME)).toString();
            addChildTextElement(VESSEL_NAME, valueCustomField, elemAdditional);
        } else {
            addChildTextElement(VESSEL_NAME, "", elemAdditional);
        }

        if (inInvoice.getField(MetafieldIdFactory.valueOf(CUSTOM_INVOICE_VESSEL_VISIT_ID))!=null){
            String valueCustomField = inInvoice.getField(MetafieldIdFactory.valueOf(CUSTOM_INVOICE_VESSEL_VISIT_ID)).toString();
            addChildTextElement(VESSEL_VISIT_ID, valueCustomField, elemAdditional);
        } else {
            addChildTextElement(VESSEL_VISIT_ID, "", elemAdditional);
        }

        if (inInvoice.getField(MetafieldIdFactory.valueOf(CUSTOM_INVOICE_VESSEL_ARRIVAL))!=null){
            String valueCustomField = inInvoice.getField(MetafieldIdFactory.valueOf(CUSTOM_INVOICE_VESSEL_ARRIVAL)).toString();
            addChildTextElement(VESSEL_ARRIVAL, valueCustomField, elemAdditional);
        } else {
            addChildTextElement(VESSEL_ARRIVAL, "", elemAdditional);
        }

        if (inInvoice.getField(MetafieldIdFactory.valueOf(CUSTOM_INVOICE_DAEDAI))!=null){
            String valueCustomField = inInvoice.getField(MetafieldIdFactory.valueOf(CUSTOM_INVOICE_DAEDAI)).toString();
            addChildTextElement(DAE_DAI, valueCustomField, elemAdditional);
        } else {
            addChildTextElement(DAE_DAI, "", elemAdditional);
        }

        // String strArrivalDate = inInvoice.getField("invoiceCustomDFFNaveViaje").format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        addChildTextElement(NOTES, inInvoice.getInvoiceNotes(), elemAdditional);

        if (inInvoice.getField(MetafieldIdFactory.valueOf(CUSTOM_INVOICE_CARGA_BOOKING))!=null){
            String valueCustomField = inInvoice.getField(MetafieldIdFactory.valueOf(CUSTOM_INVOICE_CARGA_BOOKING)).toString();
            addChildTextElement(CARGA_BOOKING, valueCustomField, elemAdditional);
        } else {
            addChildTextElement(CARGA_BOOKING, "", elemAdditional);
        }

        if (inInvoice.getField(MetafieldIdFactory.valueOf(CUSTOM_INVOICE_NAVE_REFERENCIA))!=null){
            String valueCustomField = inInvoice.getField(MetafieldIdFactory.valueOf(CUSTOM_INVOICE_NAVE_REFERENCIA)).toString();
            addChildTextElement(NAVE_REFERENCIA, valueCustomField, elemAdditional);
        } else {
            addChildTextElement(NAVE_REFERENCIA, "", elemAdditional);
        }

        addChildTextElement(TOTAL_CHARGES, decimalFormat.format(inInvoice.getInvoiceTotalCharges()), elemInvoice);
        //addChildTextElement(DISCOUNTS, inInvoice.getInvoiceDiscounts(), elemInvoice);
        addChildTextElement(DISCOUNTS, "0.00", elemInvoice);
        addChildTextElement(TOTAL, decimalFormat.format(inInvoice.getInvoiceTotalTotal()), elemInvoice);
        Currency currency = inInvoice.getInvoiceCurrency();
        if (currency != null) {
            addChildTextElement(CURRENCY, currency.getCurrencyId(), elemInvoice);
        } else {
            addChildTextElement(CURRENCY, "", elemInvoice);
        }

        //addChildTextElement(TAX_CODE, "IVA_12%_CDT", additionalElem);
        // Se cambia al cliente debido a que debe tomarse en cuenta el payee
        //Customer customer = inInvoice.getInvoiceContractCustomer();
        Customer customer = inInvoice.getInvoicePayeeCustomer();

        if (customer != null) {
            TaxGroup taxGroup = customer.getCustTaxGroup();
            if (taxGroup != null) {
                String tax_code = taxGroup.getTaxgrpDescription();
                if (tax_code.contains("IVA 0%")){
                    tax_code = tax_code.replaceAll(" ", "_");
                }else{
                    tax_code = tax_code.replaceAll(" ", "_") + "_CDT";
                }

                addChildTextElement(TAX_CODE, tax_code, elemAdditional);
            } else {
                addChildTextElement(TAX_CODE, "", elemAdditional);
            }
            addChildTextElement(CUSTOMS_ID, customer.getCustId(), elemAdditional);
        } else {
            addChildTextElement(TAX_CODE, "", elemAdditional);
            addChildTextElement(CUSTOMS_ID, "", elemAdditional);
        }

        //addChildTextElement(DAE_DAI, inInvoice.getField("invoiceCustomDFFSenaeDocumento"), elemAdditional);


        /**
         * Add detail elements
         */
        Element detailsElem = new Element("details");

    /*    List <InvoiceItem> invoiceItems = getInvoiceItemSummary(inInvoice);
        LOGGER.warn("hizo la consulta por domain query");
        boolean flagBreakTariff = false;
        boolean flagBreakTariffRateTier = false;
        String prevTariff = "";
        String prevTariffRateTier = "";
        double breakQuantity = 0.00;
        double breakRateBilled = 0.00;
        double breakTotalLine = 0.00;
        List <InvoiceItem> invoiceItems2 = getSQLRInvoiceItemSummary(inInvoice.getInvoiceDraftNbr());
        LOGGER.warn("hizo la consulta por SQL query");
        for (InvoiceItem invItem : invoiceItems) {

              LOGGER.warn(invItem.getItemTariff());
              LOGGER.warn(invItem.getItemDescription());
              LOGGER.warn(invItem.getItemQuantity());
              LOGGER.warn(invItem.getField(MetafieldIdFactory.valueOf(CUSTOM_ITEM_INVOICE_ITEM_TARIFF_RATE_TIER)).toString());
              LOGGER.warn(invItem.getField(MetafieldIdFactory.valueOf(CUSTOM_ITEM_INVOICE_ITEM_QUANTITY_TON)).toString());

              Element invoiceItemElm = new Element("invoiceItem");
              /*if (prevTariff.equals(invItem.getItemTariff())) {
                  breakQuantity +=
              }*/
        /*      prevTariff = invItem.getItemTariff();
              addChildTextElement(DESCRIPTION, invoiceItem.getItemDescription(), invoiceItemElm);
              addChildTextElement(TARIFF, invoiceItem.getItemTariff(), invoiceItemElm);
              addChildTextElement(QUANTITY, invoiceItem.getItemQuantityBilled().toString(), invoiceItemElm);
              addChildTextElement(AMOUINT, invoiceItem.getItemRateBilled().toString(), invoiceItemElm);
              addChildTextElement(TOTAL_AMOUNT, invoiceItem.getItemAmount().toString(), invoiceItemElm);
          }*/
        /* LOGGER.warn("termino el ciclo");*/
        for (InvoiceItem invoiceItem in inInvoice.getInvoiceInvoiceItems()){
            Element invoiceItemElm = new Element("invoiceItem");
            addChildTextElement(DESCRIPTION, invoiceItem.getItemDescription(), invoiceItemElm);
            addChildTextElement(TARIFF, invoiceItem.getItemTariff(), invoiceItemElm);
            addChildTextElement(QUANTITY, invoiceItem.getItemQuantityBilled().toString(), invoiceItemElm);
            addChildTextElement(AMOUINT, invoiceItem.getItemRateBilled().toString(), invoiceItemElm);
            addChildTextElement(TOTAL_AMOUNT, invoiceItem.getItemAmount().toString(), invoiceItemElm);

            addChildTextElement(SEMGMENT1, company, invoiceItemElm);

            Tariff tariff = Tariff.findTariff(invoiceItem.getItemTariff());
            if (tariff != null){

                if (tariff.getField(MetafieldIdFactory.valueOf(CUSTOM_ITEM_INVOICE_COST_CODE))!=null){
                    String valueCustomField = tariff.getField(MetafieldIdFactory.valueOf(CUSTOM_ITEM_INVOICE_COST_CODE)).toString();
                    addChildTextElement(SEMGMENT2, valueCustomField, invoiceItemElm);
                } else {
                    addChildTextElement(SEMGMENT2, "0000", invoiceItemElm);
                }

                addChildTextElement(SEMGMENT3, tariff.getTariffGlCode(), invoiceItemElm);

                if (tariff.getField(MetafieldIdFactory.valueOf(CUSTOM_ITEM_INVOICE_ACTIVITY))!=null){
                    String valueCustomField = tariff.getField(MetafieldIdFactory.valueOf(CUSTOM_ITEM_INVOICE_ACTIVITY)).toString();
                    addChildTextElement(SEMGMENT4, valueCustomField, invoiceItemElm);
                } else {
                    addChildTextElement(SEMGMENT4, "00000", invoiceItemElm);
                }

                if (inInvoice.getInvoicePayeeCustomer().getField(MetafieldIdFactory.valueOf(CUSTOM_ITEM_INVOICE_INTERCOMPANY))!=null){
                    String valueCustomField = inInvoice.getInvoicePayeeCustomer().getField(MetafieldIdFactory.valueOf(CUSTOM_ITEM_INVOICE_INTERCOMPANY)).toString();
                    addChildTextElement(SEMGMENT5, valueCustomField, invoiceItemElm);
                } else {
                    addChildTextElement(SEMGMENT5, "0000", invoiceItemElm);
                }

                GeneralReference generalReference = GeneralReference.findUniqueEntryById("FSN_PLAN_CUENTA", "PROJECT");

                if (generalReference != null){
                    addChildTextElement(SEMGMENT6, generalReference.getRefValue1(), invoiceItemElm);
                }else{
                    addChildTextElement(SEMGMENT6, "000000", invoiceItemElm);
                }

                if (inInvoice.getInvoicePayeeCustomer().getField(MetafieldIdFactory.valueOf(CUSTOM_ITEM_INVOICE_SERVICE))!=null){
                    String valueCustomField = inInvoice.getInvoicePayeeCustomer().getField(MetafieldIdFactory.valueOf(CUSTOM_ITEM_INVOICE_SERVICE)).toString();
                    addChildTextElement(SEMGMENT7, valueCustomField, invoiceItemElm);
                } else {
                    addChildTextElement(SEMGMENT7, "000000", invoiceItemElm);
                }

                if (tariff.getField(MetafieldIdFactory.valueOf(CUSTOM_ITEM_INVOICE_LINE_BUSSINESS))!=null){
                    String valueCustomField = tariff.getField(MetafieldIdFactory.valueOf(CUSTOM_ITEM_INVOICE_LINE_BUSSINESS)).toString();
                    addChildTextElement(SEMGMENT8, valueCustomField, invoiceItemElm);
                } else {
                    addChildTextElement(SEMGMENT8, "0000", invoiceItemElm);
                }

                generalReference = GeneralReference.findUniqueEntryById("FSN_PLAN_CUENTA", "FUTURE1");

                if (generalReference != null){
                    addChildTextElement(SEMGMENT9, generalReference.getRefValue1(), invoiceItemElm);
                }else{
                    addChildTextElement(SEMGMENT9, "000", invoiceItemElm);
                }

                generalReference = GeneralReference.findUniqueEntryById("FSN_PLAN_CUENTA", "FUTURE2");
                if (generalReference != null){
                    addChildTextElement(SEMGMENT10, generalReference.getRefValue1(), invoiceItemElm);
                }else{
                    addChildTextElement(SEMGMENT10, "000", invoiceItemElm);
                }

            }else{
                addChildTextElement(SEMGMENT2, "0000", invoiceItemElm);
                addChildTextElement(SEMGMENT3, "0000", invoiceItemElm);
                addChildTextElement(SEMGMENT4, "00000", invoiceItemElm);
                addChildTextElement(SEMGMENT5, "0000", invoiceItemElm);
                addChildTextElement(SEMGMENT6, "000000", invoiceItemElm);
                addChildTextElement(SEMGMENT7, "000000", invoiceItemElm);
                addChildTextElement(SEMGMENT8, "0000", invoiceItemElm);
                addChildTextElement(SEMGMENT9, "000", invoiceItemElm);
                addChildTextElement(SEMGMENT10, "000", invoiceItemElm);

            }

            detailsElem.addContent(invoiceItemElm);
        }

        elemInvoice.addContent(detailsElem);

        return XmlUtil.toString(rootElem, false);
    }
    private List getInvoiceItemSummary(Invoice inInvoice){
        LOGGER.warn(String.format("At start of %s.getInvoiceItemSummary", getClass().getName()));
        DomainQuery dq = QueryUtils.createDomainQuery(BillingEntity.INVOICE_ITEM).
                addDqPredicate(PredicateFactory.eq(BillingField.ITEM_INVOICE, inInvoice.getInvoiceGkey())).
                addDqOrderings([Ordering.asc(BillingField.ITEM_TARIFF_RATE), Ordering.asc(MetafieldIdFactory.valueOf(CUSTOM_ITEM_INVOICE_ITEM_TARIFF_RATE_TIER))] as Ordering[])

        LOGGER.warn(String.format("At end of %s.getInvoiceItemSummary", getClass().getName()));
        return Roastery.getHibernateApi().findEntitiesByDomainQuery(dq);
    }
    private List getSQLRInvoiceItemSummary(String inDraftId) {
        LOGGER.warn(String.format("At start of %s.getSQLRInvoiceItemSummary", getClass().getName()));
        String sqlQuery = "select inv.draft_nbr, ite.description, ite.custdff_tariff_rate_tier, ite.quantity, ite.rate_billed precio_unitario, " +
                "count(*), (count(*) * ite.quantity) ContenedoresXDias, sum(ite.amount) cant, sum(ite.custdff_quantity_ton_m3) ton,  sum(ite.quantity) " +
                "from bil_invoice_items ite " +
                "inner join bil_invoices inv " +
                "on ite.INVOICE_GKEY = inv.gkey" +
                "where inv.draft_nbr = " + inDraftId + " " +
                "group by inv.draft_nbr, ite.description, ite.custdff_tariff_rate_tier, ite.quantity, ite.rate_billed\n" +
                "order by inv.draft_nbr, ite.description";
        LOGGER.warn(sqlQuery);
        SQLQuery resultSet = null;
        List resultList = null;
        resultSet = HibernateApi.getInstance().getCurrentSession().createSQLQuery(sqlQuery);
        if (resultSet != null) {
            resultList = resultSet.list()
        }
        LOGGER.warn(resultList.size());
//        resultList(0).
        LOGGER.warn(String.format("At end of %s.getSQLRInvoiceItemSummary", getClass().getName()));
        return resultList;
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

    private static final String GENERAL_REFERENCE_TYPE = "FSN_PLAN_CUENTA";
    private static final String GENERAL_REFERENCE_ID1 = "COMPANY";
    private static final String GENERAL_REFERENCE_ID2 = "1";

    private final String QUEUE_NAME = "N4INVOICES";
    private final String QUEUE_NAME_NC = "N4CREDITNOTES";
    private final String EXPORT_TAG = "export";
    private final String INVOICE = "invoice";
    private final String INVOICE_DRAFT_ID = "draftId";
    //private final String INVOICE_FINAL_ID = "draftId";
    private final String INVOICE_TYPE = "InvoiceType";
    private final String INVOICE_STATUS = "status";
    private final String CREATED = "create";
    private final String FACILITY = "facility";
    private final String CUSTOMER_ID = "customerId";
    private final String ADDITIONAL = "additional";
    private final String ADDRESS = "address";
    private final String EMAIL = "email";
    private final String VESSEL_NAME = "vesselName";
    private final String VESSEL_VISIT_ID = "vesselVisitId";
    private final String VESSEL_ARRIVAL = "vesselArrival";
    private final String DAE_DAI = "DaeDai";
    private final String NOTES = "Notes";
    private final String CARGA_BOOKING = "CargaBooking";
    private final String NAVE_REFERENCIA = "NaveReferencia";
    private final String TAX_CODE = "TaxCode";
    private final String CUSTOMS_ID = "CustomsId";
    private final String TOTAL_CHARGES = "totalCharges";
    private final String DISCOUNTS = "discounts";
    private final String TOTAL = "total";
    private final String CURRENCY = "currency";
    //private final String DETAILS = "details";
    //private final String INVOICE_ITEM = "invoiceItem";
    private final String DESCRIPTION = "description";
    private final String TARIFF = "tariff";
    private final String QUANTITY = "quantity";
    private final String AMOUINT = "amount";
    //private final String TAX_AMOUNT = "taxAmount";
    private final String TOTAL_AMOUNT = "TotalAmount";
    private final String SEMGMENT1 = "Segment1";
    private final String SEMGMENT2 = "Segment2";
    private final String SEMGMENT3 = "Segment3";
    private final String SEMGMENT4 = "Segment4";
    private final String SEMGMENT5 = "Segment5";
    private final String SEMGMENT6 = "Segment6";
    private final String SEMGMENT7 = "Segment7";
    private final String SEMGMENT8 = "Segment8";
    private final String SEMGMENT9 = "Segment9";
    private final String SEMGMENT10 = "Segment10";

    // campos de fussion
    private static final String CUSTOM_INVOICE_VESSEL_NAME = "customFlexFields.invoiceCustomDFFNaveNombre";
    private static final String CUSTOM_INVOICE_VESSEL_VISIT_ID = "customFlexFields.invoiceCustomDFFNaveReferencia";
    private static final String CUSTOM_INVOICE_VESSEL_ARRIVAL = "customFlexFields.invoiceCustomDFFNaveViaje";
    private static final String CUSTOM_INVOICE_DAEDAI = "customFlexFields.invoiceCustomDFFSenaeDocumento";
    private static final String CUSTOM_INVOICE_CARGA_BOOKING = "customFlexFields.invoiceCustomDFFCargaBooking";
    private static final String CUSTOM_INVOICE_NAVE_REFERENCIA = "customFlexFields.invoiceCustomDFFNaveReferencia";

    // Tariff Fields
    private static final String CUSTOM_ITEM_INVOICE_COST_CODE = "customFlexFields.tariffFlexString01";
    private static final String CUSTOM_ITEM_INVOICE_ACTIVITY = "customFlexFields.tariffFlexString02";
    private static final String CUSTOM_ITEM_INVOICE_LINE_BUSSINESS = "customFlexFields.tariffFlexString03";

    // Invoice Items Custom Fields
    private static final String CUSTOM_ITEM_INVOICE_ITEM_TARIFF_RATE_TIER = "customFlexFields.itemCustomDFFTariffRateTier";
    private static final String CUSTOM_ITEM_INVOICE_ITEM_QUANTITY_TON = "customFlexFields.itemCustomDFFQuantityTonM3";

    // Customer Fields
    private static final String CUSTOM_ITEM_INVOICE_INTERCOMPANY = "customFlexFields.custFlexString01";
    private static final String CUSTOM_ITEM_INVOICE_SERVICE = "customFlexFields.custFlexString02";

    private Logger LOGGER = Logger.getLogger(DpwpsjInvoiceInterceptor.class);
}