
package com.oracle.xmlns.apps.financials.payables.invoices.quickinvoices.invoiceinterfaceservice;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.oracle.xmlns.adf.svc.types.AmountType;
import com.oracle.xmlns.adf.svc.types.MeasureType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.financials.payables.invoices.quickinvoices.invoiceinterfaceservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InvoiceLineRejection_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "invoiceLineRejection");
    private final static QName _InvoiceInterfaceHeaderResult_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "invoiceInterfaceHeaderResult");
    private final static QName _InvoiceInterfaceLine_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "invoiceInterfaceLine");
    private final static QName _InterfaceResponseResult_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "interfaceResponseResult");
    private final static QName _InvoiceHeaderRejection_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "invoiceHeaderRejection");
    private final static QName _InvoiceInterfaceHeader_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "invoiceInterfaceHeader");
    private final static QName _AttachmentDetails_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "attachmentDetails");
    private final static QName _InterfaceResponse_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "interfaceResponse");
    private final static QName _ApSupplierRejections_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "apSupplierRejections");
    private final static QName _InvoiceHeaderRejectionRejectionDescription_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "RejectionDescription");
    private final static QName _AttachmentDetailsTitle_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "Title");
    private final static QName _AttachmentDetailsContent_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "Content");
    private final static QName _AttachmentDetailsAttachmentType_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "AttachmentType");
    private final static QName _AttachmentDetailsCategory_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "Category");
    private final static QName _ApSupplierRejectionsInvoiceId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "InvoiceId");
    private final static QName _ApSupplierRejectionsTokenName2_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TokenName2");
    private final static QName _ApSupplierRejectionsTokenName3_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TokenName3");
    private final static QName _ApSupplierRejectionsInvoiceAmount_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "InvoiceAmount");
    private final static QName _ApSupplierRejectionsTokenName1_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TokenName1");
    private final static QName _ApSupplierRejectionsTokenName10_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TokenName10");
    private final static QName _ApSupplierRejectionsVendorId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "VendorId");
    private final static QName _ApSupplierRejectionsDescription_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "Description");
    private final static QName _ApSupplierRejectionsVendorSiteCode_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "VendorSiteCode");
    private final static QName _ApSupplierRejectionsInvoicenum_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "Invoicenum");
    private final static QName _ApSupplierRejectionsTokenValue10_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TokenValue10");
    private final static QName _ApSupplierRejectionsInvoiceDate_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "InvoiceDate");
    private final static QName _ApSupplierRejectionsTokenName6_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TokenName6");
    private final static QName _ApSupplierRejectionsTokenValue7_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TokenValue7");
    private final static QName _ApSupplierRejectionsTokenValue6_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TokenValue6");
    private final static QName _ApSupplierRejectionsTokenName7_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TokenName7");
    private final static QName _ApSupplierRejectionsTokenName4_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TokenName4");
    private final static QName _ApSupplierRejectionsTokenValue5_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TokenValue5");
    private final static QName _ApSupplierRejectionsTokenValue4_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TokenValue4");
    private final static QName _ApSupplierRejectionsTokenName5_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TokenName5");
    private final static QName _ApSupplierRejectionsTokenValue3_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TokenValue3");
    private final static QName _ApSupplierRejectionsTokenValue2_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TokenValue2");
    private final static QName _ApSupplierRejectionsTokenValue1_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TokenValue1");
    private final static QName _ApSupplierRejectionsTokenName8_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TokenName8");
    private final static QName _ApSupplierRejectionsLinenumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "Linenumber");
    private final static QName _ApSupplierRejectionsTokenName9_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TokenName9");
    private final static QName _ApSupplierRejectionsTokenValue9_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TokenValue9");
    private final static QName _ApSupplierRejectionsTokenValue8_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TokenValue8");
    private final static QName _ApSupplierRejectionsParentId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ParentId");
    private final static QName _ApSupplierRejectionsVendorEmailAddress_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "VendorEmailAddress");
    private final static QName _ApSupplierRejectionsInvoiceCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "InvoiceCurrencyCode");
    private final static QName _ApSupplierRejectionsLoadRequestId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "LoadRequestId");
    private final static QName _ApSupplierRejectionsOrgId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "OrgId");
    private final static QName _ApSupplierRejectionsVendorSiteId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "VendorSiteId");
    private final static QName _InterfaceResponseReturnMessage_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ReturnMessage");
    private final static QName _InterfaceResponseReturnCode_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ReturnCode");
    private final static QName _InvoiceInterfaceHeaderPaidOnBehalfEmployeeId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PaidOnBehalfEmployeeId");
    private final static QName _InvoiceInterfaceHeaderB2BProgramName_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "B2BProgramName");
    private final static QName _InvoiceInterfaceHeaderDocumentCategoryCode_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "DocumentCategoryCode");
    private final static QName _InvoiceInterfaceHeaderReferenceKey5_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ReferenceKey5");
    private final static QName _InvoiceInterfaceHeaderReferenceKey4_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ReferenceKey4");
    private final static QName _InvoiceInterfaceHeaderCorrectionYear_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "CorrectionYear");
    private final static QName _InvoiceInterfaceHeaderAmountApplicableToDiscount_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "AmountApplicableToDiscount");
    private final static QName _InvoiceInterfaceHeaderUniqueRemittanceIdentifier_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "UniqueRemittanceIdentifier");
    private final static QName _InvoiceInterfaceHeaderInvoiceReceivedDate_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "InvoiceReceivedDate");
    private final static QName _InvoiceInterfaceHeaderProductTable_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProductTable");
    private final static QName _InvoiceInterfaceHeaderTaxRelatedInvoiceId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TaxRelatedInvoiceId");
    private final static QName _InvoiceInterfaceHeaderTaxationCountry_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TaxationCountry");
    private final static QName _InvoiceInterfaceHeaderFirstPartyRegistrationNumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "FirstPartyRegistrationNumber");
    private final static QName _InvoiceInterfaceHeaderVoucherNumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "VoucherNumber");
    private final static QName _InvoiceInterfaceHeaderUriCheckDigit_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "UriCheckDigit");
    private final static QName _InvoiceInterfaceHeaderCustomerRegistrationCode_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "CustomerRegistrationCode");
    private final static QName _InvoiceInterfaceHeaderGlobalAttributeNumber1_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GlobalAttributeNumber1");
    private final static QName _InvoiceInterfaceHeaderNoExchangeRateBaseAmount_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "NoExchangeRateBaseAmount");
    private final static QName _InvoiceInterfaceHeaderTermsId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TermsId");
    private final static QName _InvoiceInterfaceHeaderGlobalAttributeNumber5_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GlobalAttributeNumber5");
    private final static QName _InvoiceInterfaceHeaderGlobalAttributeNumber4_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GlobalAttributeNumber4");
    private final static QName _InvoiceInterfaceHeaderGlobalAttributeNumber3_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GlobalAttributeNumber3");
    private final static QName _InvoiceInterfaceHeaderTaxInvoiceInternalSequence_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TaxInvoiceInternalSequence");
    private final static QName _InvoiceInterfaceHeaderGlobalAttributeNumber2_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GlobalAttributeNumber2");
    private final static QName _InvoiceInterfaceHeaderRemitToSupplierName_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "RemitToSupplierName");
    private final static QName _InvoiceInterfaceHeaderPrepayApplyAmount_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PrepayApplyAmount");
    private final static QName _InvoiceInterfaceHeaderControlAmount_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ControlAmount");
    private final static QName _InvoiceInterfaceHeaderExchangeRateType_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ExchangeRateType");
    private final static QName _InvoiceInterfaceHeaderSource_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "Source");
    private final static QName _InvoiceInterfaceHeaderCustomerRegistrationNumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "CustomerRegistrationNumber");
    private final static QName _InvoiceInterfaceHeaderPaymentCrossRateDate_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PaymentCrossRateDate");
    private final static QName _InvoiceInterfaceHeaderRequesterFirstName_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "RequesterFirstName");
    private final static QName _InvoiceInterfaceHeaderAttribute3_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "Attribute3");
    private final static QName _InvoiceInterfaceHeaderVendorNumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "VendorNumber");
    private final static QName _InvoiceInterfaceHeaderAttribute2_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "Attribute2");
    private final static QName _InvoiceInterfaceHeaderExternalDocumentReference_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ExternalDocumentReference");
    private final static QName _InvoiceInterfaceHeaderPrepayNumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PrepayNumber");
    private final static QName _InvoiceInterfaceHeaderAttribute1_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "Attribute1");
    private final static QName _InvoiceInterfaceHeaderAttribute7_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "Attribute7");
    private final static QName _InvoiceInterfaceHeaderGlobalAttribute14_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GlobalAttribute14");
    private final static QName _InvoiceInterfaceHeaderAttribute6_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "Attribute6");
    private final static QName _InvoiceInterfaceHeaderGlobalAttribute15_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GlobalAttribute15");
    private final static QName _InvoiceInterfaceHeaderAttribute5_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "Attribute5");
    private final static QName _InvoiceInterfaceHeaderGlobalAttribute16_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GlobalAttribute16");
    private final static QName _InvoiceInterfaceHeaderAttribute4_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "Attribute4");
    private final static QName _InvoiceInterfaceHeaderGlobalAttribute17_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GlobalAttribute17");
    private final static QName _InvoiceInterfaceHeaderGlobalAttribute10_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GlobalAttribute10");
    private final static QName _InvoiceInterfaceHeaderGlobalAttribute11_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GlobalAttribute11");
    private final static QName _InvoiceInterfaceHeaderAttribute9_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "Attribute9");
    private final static QName _InvoiceInterfaceHeaderExchangeRate_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ExchangeRate");
    private final static QName _InvoiceInterfaceHeaderGlobalAttribute12_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GlobalAttribute12");
    private final static QName _InvoiceInterfaceHeaderAttribute8_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "Attribute8");
    private final static QName _InvoiceInterfaceHeaderGlobalAttribute13_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GlobalAttribute13");
    private final static QName _InvoiceInterfaceHeaderTermsName_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TermsName");
    private final static QName _InvoiceInterfaceHeaderPaymentReasonCode_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PaymentReasonCode");
    private final static QName _InvoiceInterfaceHeaderAwtGroupName_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "AwtGroupName");
    private final static QName _InvoiceInterfaceHeaderRemittanceMessage2_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "RemittanceMessage2");
    private final static QName _InvoiceInterfaceHeaderApplyAdvancesFlag_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ApplyAdvancesFlag");
    private final static QName _InvoiceInterfaceHeaderRemittanceMessage1_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "RemittanceMessage1");
    private final static QName _InvoiceInterfaceHeaderRemittanceMessage3_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "RemittanceMessage3");
    private final static QName _InvoiceInterfaceHeaderAttributeNumber5_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "AttributeNumber5");
    private final static QName _InvoiceInterfaceHeaderSettlementPriority_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "SettlementPriority");
    private final static QName _InvoiceInterfaceHeaderExclusivePaymentFlag_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ExclusivePaymentFlag");
    private final static QName _InvoiceInterfaceHeaderRemitToAddressId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "RemitToAddressId");
    private final static QName _InvoiceInterfaceHeaderAddTaxToInvoiceAmountFlag_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "AddTaxToInvoiceAmountFlag");
    private final static QName _InvoiceInterfaceHeaderImportDocumentNumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ImportDocumentNumber");
    private final static QName _InvoiceInterfaceHeaderAttributeDate1_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "AttributeDate1");
    private final static QName _InvoiceInterfaceHeaderBankChargeBearer_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "BankChargeBearer");
    private final static QName _InvoiceInterfaceHeaderPaymentFunction_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PaymentFunction");
    private final static QName _InvoiceInterfaceHeaderCorrectionPeriod_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "CorrectionPeriod");
    private final static QName _InvoiceInterfaceHeaderAttributeNumber4_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "AttributeNumber4");
    private final static QName _InvoiceInterfaceHeaderRelationshipId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "RelationshipId");
    private final static QName _InvoiceInterfaceHeaderAttributeNumber3_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "AttributeNumber3");
    private final static QName _InvoiceInterfaceHeaderTaxInvoiceRecordingDate_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TaxInvoiceRecordingDate");
    private final static QName _InvoiceInterfaceHeaderAttributeNumber2_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "AttributeNumber2");
    private final static QName _InvoiceInterfaceHeaderAttributeNumber1_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "AttributeNumber1");
    private final static QName _InvoiceInterfaceHeaderPaymentPriority_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PaymentPriority");
    private final static QName _InvoiceInterfaceHeaderAttributeDate3_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "AttributeDate3");
    private final static QName _InvoiceInterfaceHeaderAttributeDate2_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "AttributeDate2");
    private final static QName _InvoiceInterfaceHeaderUSSGLTransactionCode_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "USSGLTransactionCode");
    private final static QName _InvoiceInterfaceHeaderAttributeDate5_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "AttributeDate5");
    private final static QName _InvoiceInterfaceHeaderTermsDate_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TermsDate");
    private final static QName _InvoiceInterfaceHeaderAttributeDate4_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "AttributeDate4");
    private final static QName _InvoiceInterfaceHeaderAwtGroupId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "AwtGroupId");
    private final static QName _InvoiceInterfaceHeaderImageDocumentNumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ImageDocumentNumber");
    private final static QName _InvoiceInterfaceHeaderPONumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PONumber");
    private final static QName _InvoiceInterfaceHeaderPaymentReasonComments_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PaymentReasonComments");
    private final static QName _InvoiceInterfaceHeaderB2BSiteCode_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "B2BSiteCode");
    private final static QName _InvoiceInterfaceHeaderGlobalAttribute7_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GlobalAttribute7");
    private final static QName _InvoiceInterfaceHeaderGlobalAttribute8_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GlobalAttribute8");
    private final static QName _InvoiceInterfaceHeaderGlobalAttribute5_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GlobalAttribute5");
    private final static QName _InvoiceInterfaceHeaderCalculateTaxDuringImportFlag_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "CalculateTaxDuringImportFlag");
    private final static QName _InvoiceInterfaceHeaderGlobalAttribute6_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GlobalAttribute6");
    private final static QName _InvoiceInterfaceHeaderGlobalAttribute3_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GlobalAttribute3");
    private final static QName _InvoiceInterfaceHeaderGlobalAttribute4_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GlobalAttribute4");
    private final static QName _InvoiceInterfaceHeaderGlobalAttribute1_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GlobalAttribute1");
    private final static QName _InvoiceInterfaceHeaderBudgetDate_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "BudgetDate");
    private final static QName _InvoiceInterfaceHeaderGlobalAttribute2_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GlobalAttribute2");
    private final static QName _InvoiceInterfaceHeaderSupplierTaxInvoiceDate_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "SupplierTaxInvoiceDate");
    private final static QName _InvoiceInterfaceHeaderGlobalAttributeDate5_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GlobalAttributeDate5");
    private final static QName _InvoiceInterfaceHeaderGlobalAttributeDate4_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GlobalAttributeDate4");
    private final static QName _InvoiceInterfaceHeaderLegalEntityName_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "LegalEntityName");
    private final static QName _InvoiceInterfaceHeaderPartySiteId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PartySiteId");
    private final static QName _InvoiceInterfaceHeaderGlobalAttributeDate3_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GlobalAttributeDate3");
    private final static QName _InvoiceInterfaceHeaderPayProcTrxnTypeCode_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PayProcTrxnTypeCode");
    private final static QName _InvoiceInterfaceHeaderGlobalAttributeDate2_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GlobalAttributeDate2");
    private final static QName _InvoiceInterfaceHeaderGlobalAttributeDate1_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GlobalAttributeDate1");
    private final static QName _InvoiceInterfaceHeaderPaymentMethodCode_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PaymentMethodCode");
    private final static QName _InvoiceInterfaceHeaderDocumentSubType_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "DocumentSubType");
    private final static QName _InvoiceInterfaceHeaderGlobalAttribute20_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GlobalAttribute20");
    private final static QName _InvoiceInterfaceHeaderDeliveryChannelCode_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "DeliveryChannelCode");
    private final static QName _InvoiceInterfaceHeaderRequesterLastName_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "RequesterLastName");
    private final static QName _InvoiceInterfaceHeaderStatus_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "Status");
    private final static QName _InvoiceInterfaceHeaderVendorName_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "VendorName");
    private final static QName _InvoiceInterfaceHeaderWorkflowFlag_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "WorkflowFlag");
    private final static QName _InvoiceInterfaceHeaderApplicationId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ApplicationId");
    private final static QName _InvoiceInterfaceHeaderRemitToSupplierNumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "RemitToSupplierNumber");
    private final static QName _InvoiceInterfaceHeaderGlobalAttribute18_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GlobalAttribute18");
    private final static QName _InvoiceInterfaceHeaderNetOfRetainageFlag_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "NetOfRetainageFlag");
    private final static QName _InvoiceInterfaceHeaderReference1_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "Reference1");
    private final static QName _InvoiceInterfaceHeaderGlobalAttribute19_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GlobalAttribute19");
    private final static QName _InvoiceInterfaceHeaderReference2_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "Reference2");
    private final static QName _InvoiceInterfaceHeaderPrepayLineNumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PrepayLineNumber");
    private final static QName _InvoiceInterfaceHeaderImportDocumentDate_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ImportDocumentDate");
    private final static QName _InvoiceInterfaceHeaderThirdPartyRegistrationId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ThirdPartyRegistrationId");
    private final static QName _InvoiceInterfaceHeaderShipToLocation_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ShipToLocation");
    private final static QName _InvoiceInterfaceHeaderPaymentCrossRate_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PaymentCrossRate");
    private final static QName _InvoiceInterfaceHeaderAttributeCategory_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "AttributeCategory");
    private final static QName _InvoiceInterfaceHeaderInvoiceTypeLookupCode_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "InvoiceTypeLookupCode");
    private final static QName _InvoiceInterfaceHeaderOperatingUnit_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "OperatingUnit");
    private final static QName _InvoiceInterfaceHeaderPortOfEntryCode_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PortOfEntryCode");
    private final static QName _InvoiceInterfaceHeaderPaymentMethodLookupCode_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PaymentMethodLookupCode");
    private final static QName _InvoiceInterfaceHeaderFirstPartyRegistrationId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "FirstPartyRegistrationId");
    private final static QName _InvoiceInterfaceHeaderExternalBankAccountId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ExternalBankAccountId");
    private final static QName _InvoiceInterfaceHeaderInvoiceIncludesPrepayFlag_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "InvoiceIncludesPrepayFlag");
    private final static QName _InvoiceInterfaceHeaderPaymentCrossRateType_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PaymentCrossRateType");
    private final static QName _InvoiceInterfaceHeaderLegalEntityId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "LegalEntityId");
    private final static QName _InvoiceInterfaceHeaderAttribute15_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "Attribute15");
    private final static QName _InvoiceInterfaceHeaderRemitToAddressName_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "RemitToAddressName");
    private final static QName _InvoiceInterfaceHeaderAttribute12_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "Attribute12");
    private final static QName _InvoiceInterfaceHeaderAttribute11_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "Attribute11");
    private final static QName _InvoiceInterfaceHeaderAttribute14_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "Attribute14");
    private final static QName _InvoiceInterfaceHeaderImageDocumentUri_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ImageDocumentUri");
    private final static QName _InvoiceInterfaceHeaderAttribute13_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "Attribute13");
    private final static QName _InvoiceInterfaceHeaderGroupId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GroupId");
    private final static QName _InvoiceInterfaceHeaderSupplierTaxInvoiceNumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "SupplierTaxInvoiceNumber");
    private final static QName _InvoiceInterfaceHeaderGlobalAttributeCategory_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GlobalAttributeCategory");
    private final static QName _InvoiceInterfaceHeaderRequesterEmployeeNumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "RequesterEmployeeNumber");
    private final static QName _InvoiceInterfaceHeaderGlDate_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GlDate");
    private final static QName _InvoiceInterfaceHeaderRequesterId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "RequesterId");
    private final static QName _InvoiceInterfaceHeaderAttribute10_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "Attribute10");
    private final static QName _InvoiceInterfaceHeaderExchangeDate_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ExchangeDate");
    private final static QName _InvoiceInterfaceHeaderPayGroupLookupCode_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PayGroupLookupCode");
    private final static QName _InvoiceInterfaceHeaderRemitToSupplierId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "RemitToSupplierId");
    private final static QName _InvoiceInterfaceHeaderThirdPartyRegistrationNumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ThirdPartyRegistrationNumber");
    private final static QName _InvoiceInterfaceHeaderGlobalAttribute9_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GlobalAttribute9");
    private final static QName _InvoiceInterfaceHeaderGoodsReceivedDate_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "GoodsReceivedDate");
    private final static QName _InvoiceInterfaceHeaderReferenceKey3_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ReferenceKey3");
    private final static QName _InvoiceInterfaceHeaderReferenceKey2_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ReferenceKey2");
    private final static QName _InvoiceInterfaceHeaderReferenceKey1_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ReferenceKey1");
    private final static QName _InvoiceInterfaceHeaderPrepayGlDate_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PrepayGlDate");
    private final static QName _InvoiceInterfaceHeaderPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PartyId");
    private final static QName _InvoiceInterfaceHeaderAcctsPayCodeCombinationId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "AcctsPayCodeCombinationId");
    private final static QName _InvoiceInterfaceHeaderPaymentCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PaymentCurrencyCode");
    private final static QName _InvoiceInterfaceHeaderSupplierTaxExchangeRate_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "SupplierTaxExchangeRate");
    private final static QName _InvoiceInterfaceLinePjcTaskNumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PjcTaskNumber");
    private final static QName _InvoiceInterfaceLineReceiptNumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ReceiptNumber");
    private final static QName _InvoiceInterfaceLineTaxRegimeCode_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TaxRegimeCode");
    private final static QName _InvoiceInterfaceLineAssetCategoryId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "AssetCategoryId");
    private final static QName _InvoiceInterfaceLinePjcFundingSourceName_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PjcFundingSourceName");
    private final static QName _InvoiceInterfaceLinePOReleaseId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "POReleaseId");
    private final static QName _InvoiceInterfaceLineProjectContractId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProjectContractId");
    private final static QName _InvoiceInterfaceLinePurchasingCategoryId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PurchasingCategoryId");
    private final static QName _InvoiceInterfaceLineType1099_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "Type1099");
    private final static QName _InvoiceInterfaceLineProjectContractLineId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProjectContractLineId");
    private final static QName _InvoiceInterfaceLineProductCategory_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProductCategory");
    private final static QName _InvoiceInterfaceLineTaxClassificationCode_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TaxClassificationCode");
    private final static QName _InvoiceInterfaceLineDeferredAccountingFlag_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "DeferredAccountingFlag");
    private final static QName _InvoiceInterfaceLineAssessableValue_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "AssessableValue");
    private final static QName _InvoiceInterfaceLineProjectProjectId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProjectProjectId");
    private final static QName _InvoiceInterfaceLineSerialNumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "SerialNumber");
    private final static QName _InvoiceInterfaceLineIncludedInTaxableLineFlag_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "IncludedInTaxableLineFlag");
    private final static QName _InvoiceInterfaceLineStatisticalAmount_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "StatisticalAmount");
    private final static QName _InvoiceInterfaceLineCostFactorName_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "CostFactorName");
    private final static QName _InvoiceInterfaceLinePriceCorrectInvoiceNumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PriceCorrectInvoiceNumber");
    private final static QName _InvoiceInterfaceLinePaCcArInvoiceId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PaCcArInvoiceId");
    private final static QName _InvoiceInterfaceLineTaxRate_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TaxRate");
    private final static QName _InvoiceInterfaceLinePOHeaderId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "POHeaderId");
    private final static QName _InvoiceInterfaceLineAccountSegment_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "AccountSegment");
    private final static QName _InvoiceInterfaceLinePjcWorkType_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PjcWorkType");
    private final static QName _InvoiceInterfaceLinePurchasingCategory_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PurchasingCategory");
    private final static QName _InvoiceInterfaceLineProjectUserDefineAttribute10_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProjectUserDefineAttribute10");
    private final static QName _InvoiceInterfaceLineTaxStatusCode_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TaxStatusCode");
    private final static QName _InvoiceInterfaceLineIncomeTaxRegion_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "IncomeTaxRegion");
    private final static QName _InvoiceInterfaceLinePOLineNumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "POLineNumber");
    private final static QName _InvoiceInterfaceLinePjcExpenditureTypeName_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PjcExpenditureTypeName");
    private final static QName _InvoiceInterfaceLineSourceTrxLevelType_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "SourceTrxLevelType");
    private final static QName _InvoiceInterfaceLinePaAdditionFlag_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PaAdditionFlag");
    private final static QName _InvoiceInterfaceLineProjectUserDefineAttribute3_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProjectUserDefineAttribute3");
    private final static QName _InvoiceInterfaceLineProjectUserDefineAttribute4_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProjectUserDefineAttribute4");
    private final static QName _InvoiceInterfaceLineProjectUserDefineAttribute1_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProjectUserDefineAttribute1");
    private final static QName _InvoiceInterfaceLineProjectUserDefineAttribute2_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProjectUserDefineAttribute2");
    private final static QName _InvoiceInterfaceLineProjectUserDefineAttribute7_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProjectUserDefineAttribute7");
    private final static QName _InvoiceInterfaceLineProjectUserDefineAttribute8_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProjectUserDefineAttribute8");
    private final static QName _InvoiceInterfaceLineProjectUserDefineAttribute5_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProjectUserDefineAttribute5");
    private final static QName _InvoiceInterfaceLineInvoiceLineId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "InvoiceLineId");
    private final static QName _InvoiceInterfaceLineProjectUserDefineAttribute6_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProjectUserDefineAttribute6");
    private final static QName _InvoiceInterfaceLineTaxCodeId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TaxCodeId");
    private final static QName _InvoiceInterfaceLineProjectUserDefineAttribute9_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProjectUserDefineAttribute9");
    private final static QName _InvoiceInterfaceLinePOLineId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "POLineId");
    private final static QName _InvoiceInterfaceLineMatchOption_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "MatchOption");
    private final static QName _InvoiceInterfaceLinePOShipmentNumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "POShipmentNumber");
    private final static QName _InvoiceInterfaceLinePjcOrganizationName_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PjcOrganizationName");
    private final static QName _InvoiceInterfaceLineProductType_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProductType");
    private final static QName _InvoiceInterfaceLineSourceLineId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "SourceLineId");
    private final static QName _InvoiceInterfaceLineInventoryItemId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "InventoryItemId");
    private final static QName _InvoiceInterfaceLineExpenditureType_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ExpenditureType");
    private final static QName _InvoiceInterfaceLineProjectTaskId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProjectTaskId");
    private final static QName _InvoiceInterfaceLineShipFromLocationId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ShipFromLocationId");
    private final static QName _InvoiceInterfaceLineProjectCapitalizableFlag_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProjectCapitalizableFlag");
    private final static QName _InvoiceInterfaceLineAssetsTrackingFlag_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "AssetsTrackingFlag");
    private final static QName _InvoiceInterfaceLinePriceCorrectionFlag_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PriceCorrectionFlag");
    private final static QName _InvoiceInterfaceLineDefAcctgStartDate_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "DefAcctgStartDate");
    private final static QName _InvoiceInterfaceLineConsumptionAdviceLineId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ConsumptionAdviceLineId");
    private final static QName _InvoiceInterfaceLineExpenditureItemDate_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ExpenditureItemDate");
    private final static QName _InvoiceInterfaceLineTaxRateCode_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TaxRateCode");
    private final static QName _InvoiceInterfaceLineDistCodeCombinationId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "DistCodeCombinationId");
    private final static QName _InvoiceInterfaceLinePaCcArInvoiceLineNumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PaCcArInvoiceLineNumber");
    private final static QName _InvoiceInterfaceLineProjectWorkTypeId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProjectWorkTypeId");
    private final static QName _InvoiceInterfaceLineProrateAcrossFlag_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProrateAcrossFlag");
    private final static QName _InvoiceInterfaceLineSourceEntityCode_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "SourceEntityCode");
    private final static QName _InvoiceInterfaceLineFinalMatchFlag_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "FinalMatchFlag");
    private final static QName _InvoiceInterfaceLineProjectContextCategory_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProjectContextCategory");
    private final static QName _InvoiceInterfaceLineTrxBusinessCategory_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TrxBusinessCategory");
    private final static QName _InvoiceInterfaceLinePriceCorrectInvoiceLineNumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PriceCorrectInvoiceLineNumber");
    private final static QName _InvoiceInterfaceLineUnitPrice_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "UnitPrice");
    private final static QName _InvoiceInterfaceLineDefAcctgPeriodType_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "DefAcctgPeriodType");
    private final static QName _InvoiceInterfaceLineTax_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "Tax");
    private final static QName _InvoiceInterfaceLinePOLineLocationId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "POLineLocationId");
    private final static QName _InvoiceInterfaceLineUnitOfMeasLookupCode_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "UnitOfMeasLookupCode");
    private final static QName _InvoiceInterfaceLineExternalDocumentLineReference_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ExternalDocumentLineReference");
    private final static QName _InvoiceInterfaceLineDefAcctgNumberOfPeriods_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "DefAcctgNumberOfPeriods");
    private final static QName _InvoiceInterfaceLineManufacturer_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "Manufacturer");
    private final static QName _InvoiceInterfaceLinePaQuantity_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PaQuantity");
    private final static QName _InvoiceInterfaceLineProjectExpenditureTypeId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProjectExpenditureTypeId");
    private final static QName _InvoiceInterfaceLineInvoicedQuantity_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "InvoicedQuantity");
    private final static QName _InvoiceInterfaceLineUserDefinedFiscClass_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "UserDefinedFiscClass");
    private final static QName _InvoiceInterfaceLineConsumptionAdviceHeaderId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ConsumptionAdviceHeaderId");
    private final static QName _InvoiceInterfaceLineDefAcctgEndDate_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "DefAcctgEndDate");
    private final static QName _InvoiceInterfaceLineTaxRateId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TaxRateId");
    private final static QName _InvoiceInterfaceLineConsumptionAdviceLineNumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ConsumptionAdviceLineNumber");
    private final static QName _InvoiceInterfaceLineModelNumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ModelNumber");
    private final static QName _InvoiceInterfaceLinePjcContractName_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PjcContractName");
    private final static QName _InvoiceInterfaceLineExpenditureOrganizationId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ExpenditureOrganizationId");
    private final static QName _InvoiceInterfaceLineVendorItemNumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "VendorItemNumber");
    private final static QName _InvoiceInterfaceLineCreditCardTrxId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "CreditCardTrxId");
    private final static QName _InvoiceInterfaceLineItemDescription_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ItemDescription");
    private final static QName _InvoiceInterfaceLineAccountingDate_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "AccountingDate");
    private final static QName _InvoiceInterfaceLineBalancingSegment_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "BalancingSegment");
    private final static QName _InvoiceInterfaceLineShipToLocationCode_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ShipToLocationCode");
    private final static QName _InvoiceInterfaceLinePrimaryIntendedUse_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PrimaryIntendedUse");
    private final static QName _InvoiceInterfaceLineTaxCode_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TaxCode");
    private final static QName _InvoiceInterfaceLineSourceApplicationId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "SourceApplicationId");
    private final static QName _InvoiceInterfaceLineProjectId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProjectId");
    private final static QName _InvoiceInterfaceLineFinalDischargeLocationId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "FinalDischargeLocationId");
    private final static QName _InvoiceInterfaceLineCostCenterSegment_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "CostCenterSegment");
    private final static QName _InvoiceInterfaceLinePjcTaskName_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PjcTaskName");
    private final static QName _InvoiceInterfaceLineShipToLocationId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ShipToLocationId");
    private final static QName _InvoiceInterfaceLinePjcFundingSourceNumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PjcFundingSourceNumber");
    private final static QName _InvoiceInterfaceLineDistributionSetName_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "DistributionSetName");
    private final static QName _InvoiceInterfaceLineProjectReservedAttribute1_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProjectReservedAttribute1");
    private final static QName _InvoiceInterfaceLineProjectReservedAttribute2_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProjectReservedAttribute2");
    private final static QName _InvoiceInterfaceLineReceiptLineNumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ReceiptLineNumber");
    private final static QName _InvoiceInterfaceLinePjcContractNumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PjcContractNumber");
    private final static QName _InvoiceInterfaceLineProjectReservedAttribute7_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProjectReservedAttribute7");
    private final static QName _InvoiceInterfaceLineProjectReservedAttribute8_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProjectReservedAttribute8");
    private final static QName _InvoiceInterfaceLineProjectReservedAttribute9_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProjectReservedAttribute9");
    private final static QName _InvoiceInterfaceLineProjectReservedAttribute3_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProjectReservedAttribute3");
    private final static QName _InvoiceInterfaceLineProjectReservedAttribute4_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProjectReservedAttribute4");
    private final static QName _InvoiceInterfaceLineProjectReservedAttribute5_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProjectReservedAttribute5");
    private final static QName _InvoiceInterfaceLineProjectOrganizationId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProjectOrganizationId");
    private final static QName _InvoiceInterfaceLineProjectReservedAttribute6_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProjectReservedAttribute6");
    private final static QName _InvoiceInterfaceLinePODistributionId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PODistributionId");
    private final static QName _InvoiceInterfaceLineTaxableFlag_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TaxableFlag");
    private final static QName _InvoiceInterfaceLineDistCodeConcatenated_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "DistCodeConcatenated");
    private final static QName _InvoiceInterfaceLineAwardId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "AwardId");
    private final static QName _InvoiceInterfaceLineCostFactorId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "CostFactorId");
    private final static QName _InvoiceInterfaceLineDistributionSetId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "DistributionSetId");
    private final static QName _InvoiceInterfaceLineShipFromLocationCode_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ShipFromLocationCode");
    private final static QName _InvoiceInterfaceLineFinalDischargeLocationCode_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "FinalDischargeLocationCode");
    private final static QName _InvoiceInterfaceLinePackingSlip_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PackingSlip");
    private final static QName _InvoiceInterfaceLineConsumptionAdviceNumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ConsumptionAdviceNumber");
    private final static QName _InvoiceInterfaceLineSourceTrxId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "SourceTrxId");
    private final static QName _InvoiceInterfaceLineReleaseNumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ReleaseNumber");
    private final static QName _InvoiceInterfaceLineProjectExpenditureItemDate_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProjectExpenditureItemDate");
    private final static QName _InvoiceInterfaceLinePaCcProcessedCode_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PaCcProcessedCode");
    private final static QName _InvoiceInterfaceLineTaxJurisdictionCode_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TaxJurisdictionCode");
    private final static QName _InvoiceInterfaceLineDefaultDistCcid_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "DefaultDistCcid");
    private final static QName _InvoiceInterfaceLineLineNumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "LineNumber");
    private final static QName _InvoiceInterfaceLineWarrantyNumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "WarrantyNumber");
    private final static QName _InvoiceInterfaceLineDefAccrualCodeConcatenated_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "DefAccrualCodeConcatenated");
    private final static QName _InvoiceInterfaceLinePjcProjectNumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PjcProjectNumber");
    private final static QName _InvoiceInterfaceLineAssetBookTypeCode_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "AssetBookTypeCode");
    private final static QName _InvoiceInterfaceLineTaskId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "TaskId");
    private final static QName _InvoiceInterfaceLinePjcProjectName_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PjcProjectName");
    private final static QName _InvoiceInterfaceLineLineGroupNumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "LineGroupNumber");
    private final static QName _InvoiceInterfaceLineProjectBillableFlag_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProjectBillableFlag");
    private final static QName _InvoiceInterfaceLineSourceEventClassCode_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "SourceEventClassCode");
    private final static QName _InvoiceInterfaceLineProjectReservedAttribute10_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProjectReservedAttribute10");
    private final static QName _InvoiceInterfaceLineProjectFundingAllocationId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProjectFundingAllocationId");
    private final static QName _InvoiceInterfaceLineDefAcctgAccrualCcid_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "DefAcctgAccrualCcid");
    private final static QName _InvoiceInterfaceLinePODistributionNumber_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "PODistributionNumber");
    private final static QName _InvoiceInterfaceLineProductFiscClassification_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "ProductFiscClassification");
    private final static QName _InvoiceInterfaceLineRcvTransactionId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", "RcvTransactionId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.financials.payables.invoices.quickinvoices.invoiceinterfaceservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InvoiceInterfaceHeaderResult }
     * 
     */
    public InvoiceInterfaceHeaderResult createInvoiceInterfaceHeaderResult() {
        return new InvoiceInterfaceHeaderResult();
    }

    /**
     * Create an instance of {@link InvoiceInterfaceHeader }
     * 
     */
    public InvoiceInterfaceHeader createInvoiceInterfaceHeader() {
        return new InvoiceInterfaceHeader();
    }

    /**
     * Create an instance of {@link InterfaceResponseResult }
     * 
     */
    public InterfaceResponseResult createInterfaceResponseResult() {
        return new InterfaceResponseResult();
    }

    /**
     * Create an instance of {@link ApSupplierRejections }
     * 
     */
    public ApSupplierRejections createApSupplierRejections() {
        return new ApSupplierRejections();
    }

    /**
     * Create an instance of {@link AttachmentDetails }
     * 
     */
    public AttachmentDetails createAttachmentDetails() {
        return new AttachmentDetails();
    }

    /**
     * Create an instance of {@link InvoiceHeaderRejection }
     * 
     */
    public InvoiceHeaderRejection createInvoiceHeaderRejection() {
        return new InvoiceHeaderRejection();
    }

    /**
     * Create an instance of {@link InvoiceInterfaceLine }
     * 
     */
    public InvoiceInterfaceLine createInvoiceInterfaceLine() {
        return new InvoiceInterfaceLine();
    }

    /**
     * Create an instance of {@link InterfaceResponse }
     * 
     */
    public InterfaceResponse createInterfaceResponse() {
        return new InterfaceResponse();
    }

    /**
     * Create an instance of {@link InvoiceLineRejection }
     * 
     */
    public InvoiceLineRejection createInvoiceLineRejection() {
        return new InvoiceLineRejection();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceLineRejection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "invoiceLineRejection")
    public JAXBElement<InvoiceLineRejection> createInvoiceLineRejection(InvoiceLineRejection value) {
        return new JAXBElement<InvoiceLineRejection>(_InvoiceLineRejection_QNAME, InvoiceLineRejection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceInterfaceHeaderResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "invoiceInterfaceHeaderResult")
    public JAXBElement<InvoiceInterfaceHeaderResult> createInvoiceInterfaceHeaderResult(InvoiceInterfaceHeaderResult value) {
        return new JAXBElement<InvoiceInterfaceHeaderResult>(_InvoiceInterfaceHeaderResult_QNAME, InvoiceInterfaceHeaderResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceInterfaceLine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "invoiceInterfaceLine")
    public JAXBElement<InvoiceInterfaceLine> createInvoiceInterfaceLine(InvoiceInterfaceLine value) {
        return new JAXBElement<InvoiceInterfaceLine>(_InvoiceInterfaceLine_QNAME, InvoiceInterfaceLine.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceResponseResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "interfaceResponseResult")
    public JAXBElement<InterfaceResponseResult> createInterfaceResponseResult(InterfaceResponseResult value) {
        return new JAXBElement<InterfaceResponseResult>(_InterfaceResponseResult_QNAME, InterfaceResponseResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceHeaderRejection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "invoiceHeaderRejection")
    public JAXBElement<InvoiceHeaderRejection> createInvoiceHeaderRejection(InvoiceHeaderRejection value) {
        return new JAXBElement<InvoiceHeaderRejection>(_InvoiceHeaderRejection_QNAME, InvoiceHeaderRejection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceInterfaceHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "invoiceInterfaceHeader")
    public JAXBElement<InvoiceInterfaceHeader> createInvoiceInterfaceHeader(InvoiceInterfaceHeader value) {
        return new JAXBElement<InvoiceInterfaceHeader>(_InvoiceInterfaceHeader_QNAME, InvoiceInterfaceHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachmentDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "attachmentDetails")
    public JAXBElement<AttachmentDetails> createAttachmentDetails(AttachmentDetails value) {
        return new JAXBElement<AttachmentDetails>(_AttachmentDetails_QNAME, AttachmentDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "interfaceResponse")
    public JAXBElement<InterfaceResponse> createInterfaceResponse(InterfaceResponse value) {
        return new JAXBElement<InterfaceResponse>(_InterfaceResponse_QNAME, InterfaceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApSupplierRejections }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "apSupplierRejections")
    public JAXBElement<ApSupplierRejections> createApSupplierRejections(ApSupplierRejections value) {
        return new JAXBElement<ApSupplierRejections>(_ApSupplierRejections_QNAME, ApSupplierRejections.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "RejectionDescription", scope = InvoiceHeaderRejection.class)
    public JAXBElement<String> createInvoiceHeaderRejectionRejectionDescription(String value) {
        return new JAXBElement<String>(_InvoiceHeaderRejectionRejectionDescription_QNAME, String.class, InvoiceHeaderRejection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Title", scope = AttachmentDetails.class)
    public JAXBElement<String> createAttachmentDetailsTitle(String value) {
        return new JAXBElement<String>(_AttachmentDetailsTitle_QNAME, String.class, AttachmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Content", scope = AttachmentDetails.class)
    public JAXBElement<String> createAttachmentDetailsContent(String value) {
        return new JAXBElement<String>(_AttachmentDetailsContent_QNAME, String.class, AttachmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "AttachmentType", scope = AttachmentDetails.class)
    public JAXBElement<String> createAttachmentDetailsAttachmentType(String value) {
        return new JAXBElement<String>(_AttachmentDetailsAttachmentType_QNAME, String.class, AttachmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Category", scope = AttachmentDetails.class)
    public JAXBElement<String> createAttachmentDetailsCategory(String value) {
        return new JAXBElement<String>(_AttachmentDetailsCategory_QNAME, String.class, AttachmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "InvoiceId", scope = ApSupplierRejections.class)
    public JAXBElement<Long> createApSupplierRejectionsInvoiceId(Long value) {
        return new JAXBElement<Long>(_ApSupplierRejectionsInvoiceId_QNAME, Long.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TokenName2", scope = ApSupplierRejections.class)
    public JAXBElement<String> createApSupplierRejectionsTokenName2(String value) {
        return new JAXBElement<String>(_ApSupplierRejectionsTokenName2_QNAME, String.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TokenName3", scope = ApSupplierRejections.class)
    public JAXBElement<String> createApSupplierRejectionsTokenName3(String value) {
        return new JAXBElement<String>(_ApSupplierRejectionsTokenName3_QNAME, String.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "InvoiceAmount", scope = ApSupplierRejections.class)
    public JAXBElement<AmountType> createApSupplierRejectionsInvoiceAmount(AmountType value) {
        return new JAXBElement<AmountType>(_ApSupplierRejectionsInvoiceAmount_QNAME, AmountType.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TokenName1", scope = ApSupplierRejections.class)
    public JAXBElement<String> createApSupplierRejectionsTokenName1(String value) {
        return new JAXBElement<String>(_ApSupplierRejectionsTokenName1_QNAME, String.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TokenName10", scope = ApSupplierRejections.class)
    public JAXBElement<String> createApSupplierRejectionsTokenName10(String value) {
        return new JAXBElement<String>(_ApSupplierRejectionsTokenName10_QNAME, String.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "VendorId", scope = ApSupplierRejections.class)
    public JAXBElement<Long> createApSupplierRejectionsVendorId(Long value) {
        return new JAXBElement<Long>(_ApSupplierRejectionsVendorId_QNAME, Long.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Description", scope = ApSupplierRejections.class)
    public JAXBElement<String> createApSupplierRejectionsDescription(String value) {
        return new JAXBElement<String>(_ApSupplierRejectionsDescription_QNAME, String.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "VendorSiteCode", scope = ApSupplierRejections.class)
    public JAXBElement<String> createApSupplierRejectionsVendorSiteCode(String value) {
        return new JAXBElement<String>(_ApSupplierRejectionsVendorSiteCode_QNAME, String.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Invoicenum", scope = ApSupplierRejections.class)
    public JAXBElement<String> createApSupplierRejectionsInvoicenum(String value) {
        return new JAXBElement<String>(_ApSupplierRejectionsInvoicenum_QNAME, String.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TokenValue10", scope = ApSupplierRejections.class)
    public JAXBElement<String> createApSupplierRejectionsTokenValue10(String value) {
        return new JAXBElement<String>(_ApSupplierRejectionsTokenValue10_QNAME, String.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "InvoiceDate", scope = ApSupplierRejections.class)
    public JAXBElement<XMLGregorianCalendar> createApSupplierRejectionsInvoiceDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApSupplierRejectionsInvoiceDate_QNAME, XMLGregorianCalendar.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TokenName6", scope = ApSupplierRejections.class)
    public JAXBElement<String> createApSupplierRejectionsTokenName6(String value) {
        return new JAXBElement<String>(_ApSupplierRejectionsTokenName6_QNAME, String.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TokenValue7", scope = ApSupplierRejections.class)
    public JAXBElement<String> createApSupplierRejectionsTokenValue7(String value) {
        return new JAXBElement<String>(_ApSupplierRejectionsTokenValue7_QNAME, String.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TokenValue6", scope = ApSupplierRejections.class)
    public JAXBElement<String> createApSupplierRejectionsTokenValue6(String value) {
        return new JAXBElement<String>(_ApSupplierRejectionsTokenValue6_QNAME, String.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TokenName7", scope = ApSupplierRejections.class)
    public JAXBElement<String> createApSupplierRejectionsTokenName7(String value) {
        return new JAXBElement<String>(_ApSupplierRejectionsTokenName7_QNAME, String.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TokenName4", scope = ApSupplierRejections.class)
    public JAXBElement<String> createApSupplierRejectionsTokenName4(String value) {
        return new JAXBElement<String>(_ApSupplierRejectionsTokenName4_QNAME, String.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TokenValue5", scope = ApSupplierRejections.class)
    public JAXBElement<String> createApSupplierRejectionsTokenValue5(String value) {
        return new JAXBElement<String>(_ApSupplierRejectionsTokenValue5_QNAME, String.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TokenValue4", scope = ApSupplierRejections.class)
    public JAXBElement<String> createApSupplierRejectionsTokenValue4(String value) {
        return new JAXBElement<String>(_ApSupplierRejectionsTokenValue4_QNAME, String.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TokenName5", scope = ApSupplierRejections.class)
    public JAXBElement<String> createApSupplierRejectionsTokenName5(String value) {
        return new JAXBElement<String>(_ApSupplierRejectionsTokenName5_QNAME, String.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TokenValue3", scope = ApSupplierRejections.class)
    public JAXBElement<String> createApSupplierRejectionsTokenValue3(String value) {
        return new JAXBElement<String>(_ApSupplierRejectionsTokenValue3_QNAME, String.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TokenValue2", scope = ApSupplierRejections.class)
    public JAXBElement<String> createApSupplierRejectionsTokenValue2(String value) {
        return new JAXBElement<String>(_ApSupplierRejectionsTokenValue2_QNAME, String.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TokenValue1", scope = ApSupplierRejections.class)
    public JAXBElement<String> createApSupplierRejectionsTokenValue1(String value) {
        return new JAXBElement<String>(_ApSupplierRejectionsTokenValue1_QNAME, String.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TokenName8", scope = ApSupplierRejections.class)
    public JAXBElement<String> createApSupplierRejectionsTokenName8(String value) {
        return new JAXBElement<String>(_ApSupplierRejectionsTokenName8_QNAME, String.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Linenumber", scope = ApSupplierRejections.class)
    public JAXBElement<BigDecimal> createApSupplierRejectionsLinenumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ApSupplierRejectionsLinenumber_QNAME, BigDecimal.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TokenName9", scope = ApSupplierRejections.class)
    public JAXBElement<String> createApSupplierRejectionsTokenName9(String value) {
        return new JAXBElement<String>(_ApSupplierRejectionsTokenName9_QNAME, String.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TokenValue9", scope = ApSupplierRejections.class)
    public JAXBElement<String> createApSupplierRejectionsTokenValue9(String value) {
        return new JAXBElement<String>(_ApSupplierRejectionsTokenValue9_QNAME, String.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TokenValue8", scope = ApSupplierRejections.class)
    public JAXBElement<String> createApSupplierRejectionsTokenValue8(String value) {
        return new JAXBElement<String>(_ApSupplierRejectionsTokenValue8_QNAME, String.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ParentId", scope = ApSupplierRejections.class)
    public JAXBElement<Long> createApSupplierRejectionsParentId(Long value) {
        return new JAXBElement<Long>(_ApSupplierRejectionsParentId_QNAME, Long.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "VendorEmailAddress", scope = ApSupplierRejections.class)
    public JAXBElement<String> createApSupplierRejectionsVendorEmailAddress(String value) {
        return new JAXBElement<String>(_ApSupplierRejectionsVendorEmailAddress_QNAME, String.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "InvoiceCurrencyCode", scope = ApSupplierRejections.class)
    public JAXBElement<String> createApSupplierRejectionsInvoiceCurrencyCode(String value) {
        return new JAXBElement<String>(_ApSupplierRejectionsInvoiceCurrencyCode_QNAME, String.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "LoadRequestId", scope = ApSupplierRejections.class)
    public JAXBElement<Long> createApSupplierRejectionsLoadRequestId(Long value) {
        return new JAXBElement<Long>(_ApSupplierRejectionsLoadRequestId_QNAME, Long.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "OrgId", scope = ApSupplierRejections.class)
    public JAXBElement<Long> createApSupplierRejectionsOrgId(Long value) {
        return new JAXBElement<Long>(_ApSupplierRejectionsOrgId_QNAME, Long.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "VendorSiteId", scope = ApSupplierRejections.class)
    public JAXBElement<Long> createApSupplierRejectionsVendorSiteId(Long value) {
        return new JAXBElement<Long>(_ApSupplierRejectionsVendorSiteId_QNAME, Long.class, ApSupplierRejections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "RejectionDescription", scope = InvoiceLineRejection.class)
    public JAXBElement<String> createInvoiceLineRejectionRejectionDescription(String value) {
        return new JAXBElement<String>(_InvoiceHeaderRejectionRejectionDescription_QNAME, String.class, InvoiceLineRejection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ReturnMessage", scope = InterfaceResponse.class)
    public JAXBElement<String> createInterfaceResponseReturnMessage(String value) {
        return new JAXBElement<String>(_InterfaceResponseReturnMessage_QNAME, String.class, InterfaceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ReturnCode", scope = InterfaceResponse.class)
    public JAXBElement<String> createInterfaceResponseReturnCode(String value) {
        return new JAXBElement<String>(_InterfaceResponseReturnCode_QNAME, String.class, InterfaceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PaidOnBehalfEmployeeId", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<Long> createInvoiceInterfaceHeaderPaidOnBehalfEmployeeId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceHeaderPaidOnBehalfEmployeeId_QNAME, Long.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "B2BProgramName", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderB2BProgramName(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderB2BProgramName_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "DocumentCategoryCode", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderDocumentCategoryCode(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderDocumentCategoryCode_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ReferenceKey5", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderReferenceKey5(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderReferenceKey5_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ReferenceKey4", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderReferenceKey4(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderReferenceKey4_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "CorrectionYear", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<BigDecimal> createInvoiceInterfaceHeaderCorrectionYear(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceInterfaceHeaderCorrectionYear_QNAME, BigDecimal.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "AmountApplicableToDiscount", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<BigDecimal> createInvoiceInterfaceHeaderAmountApplicableToDiscount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceInterfaceHeaderAmountApplicableToDiscount_QNAME, BigDecimal.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "UniqueRemittanceIdentifier", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderUniqueRemittanceIdentifier(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderUniqueRemittanceIdentifier_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "InvoiceReceivedDate", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceInterfaceHeaderInvoiceReceivedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceInterfaceHeaderInvoiceReceivedDate_QNAME, XMLGregorianCalendar.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProductTable", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderProductTable(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderProductTable_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TaxRelatedInvoiceId", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<Long> createInvoiceInterfaceHeaderTaxRelatedInvoiceId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceHeaderTaxRelatedInvoiceId_QNAME, Long.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TaxationCountry", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderTaxationCountry(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderTaxationCountry_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "FirstPartyRegistrationNumber", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderFirstPartyRegistrationNumber(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderFirstPartyRegistrationNumber_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "VoucherNumber", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderVoucherNumber(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderVoucherNumber_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "UriCheckDigit", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderUriCheckDigit(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderUriCheckDigit_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "CustomerRegistrationCode", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderCustomerRegistrationCode(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderCustomerRegistrationCode_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttributeNumber1", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<BigDecimal> createInvoiceInterfaceHeaderGlobalAttributeNumber1(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceInterfaceHeaderGlobalAttributeNumber1_QNAME, BigDecimal.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "VendorEmailAddress", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderVendorEmailAddress(String value) {
        return new JAXBElement<String>(_ApSupplierRejectionsVendorEmailAddress_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "NoExchangeRateBaseAmount", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<AmountType> createInvoiceInterfaceHeaderNoExchangeRateBaseAmount(AmountType value) {
        return new JAXBElement<AmountType>(_InvoiceInterfaceHeaderNoExchangeRateBaseAmount_QNAME, AmountType.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TermsId", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<Long> createInvoiceInterfaceHeaderTermsId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceHeaderTermsId_QNAME, Long.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttributeNumber5", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<BigDecimal> createInvoiceInterfaceHeaderGlobalAttributeNumber5(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceInterfaceHeaderGlobalAttributeNumber5_QNAME, BigDecimal.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttributeNumber4", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<BigDecimal> createInvoiceInterfaceHeaderGlobalAttributeNumber4(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceInterfaceHeaderGlobalAttributeNumber4_QNAME, BigDecimal.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttributeNumber3", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<BigDecimal> createInvoiceInterfaceHeaderGlobalAttributeNumber3(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceInterfaceHeaderGlobalAttributeNumber3_QNAME, BigDecimal.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "InvoiceCurrencyCode", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderInvoiceCurrencyCode(String value) {
        return new JAXBElement<String>(_ApSupplierRejectionsInvoiceCurrencyCode_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TaxInvoiceInternalSequence", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderTaxInvoiceInternalSequence(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderTaxInvoiceInternalSequence_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttributeNumber2", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<BigDecimal> createInvoiceInterfaceHeaderGlobalAttributeNumber2(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceInterfaceHeaderGlobalAttributeNumber2_QNAME, BigDecimal.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "RemitToSupplierName", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderRemitToSupplierName(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderRemitToSupplierName_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "LoadRequestId", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<Long> createInvoiceInterfaceHeaderLoadRequestId(Long value) {
        return new JAXBElement<Long>(_ApSupplierRejectionsLoadRequestId_QNAME, Long.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PrepayApplyAmount", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<AmountType> createInvoiceInterfaceHeaderPrepayApplyAmount(AmountType value) {
        return new JAXBElement<AmountType>(_InvoiceInterfaceHeaderPrepayApplyAmount_QNAME, AmountType.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ControlAmount", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<AmountType> createInvoiceInterfaceHeaderControlAmount(AmountType value) {
        return new JAXBElement<AmountType>(_InvoiceInterfaceHeaderControlAmount_QNAME, AmountType.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ExchangeRateType", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderExchangeRateType(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderExchangeRateType_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "InvoiceId", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<Long> createInvoiceInterfaceHeaderInvoiceId(Long value) {
        return new JAXBElement<Long>(_ApSupplierRejectionsInvoiceId_QNAME, Long.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Source", scope = InvoiceInterfaceHeader.class, defaultValue = "ELECTRONIC INVOICE")
    public JAXBElement<String> createInvoiceInterfaceHeaderSource(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderSource_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "CustomerRegistrationNumber", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderCustomerRegistrationNumber(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderCustomerRegistrationNumber_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PaymentCrossRateDate", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceInterfaceHeaderPaymentCrossRateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceInterfaceHeaderPaymentCrossRateDate_QNAME, XMLGregorianCalendar.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "RequesterFirstName", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderRequesterFirstName(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderRequesterFirstName_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Attribute3", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderAttribute3(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAttribute3_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "VendorNumber", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderVendorNumber(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderVendorNumber_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Attribute2", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderAttribute2(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAttribute2_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ExternalDocumentReference", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderExternalDocumentReference(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderExternalDocumentReference_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PrepayNumber", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderPrepayNumber(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderPrepayNumber_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Attribute1", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderAttribute1(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAttribute1_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Attribute7", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderAttribute7(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAttribute7_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute14", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderGlobalAttribute14(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute14_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Attribute6", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderAttribute6(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAttribute6_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute15", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderGlobalAttribute15(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute15_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Attribute5", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderAttribute5(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAttribute5_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute16", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderGlobalAttribute16(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute16_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Attribute4", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderAttribute4(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAttribute4_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute17", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderGlobalAttribute17(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute17_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute10", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderGlobalAttribute10(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute10_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute11", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderGlobalAttribute11(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute11_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Attribute9", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderAttribute9(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAttribute9_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ExchangeRate", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<BigDecimal> createInvoiceInterfaceHeaderExchangeRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceInterfaceHeaderExchangeRate_QNAME, BigDecimal.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute12", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderGlobalAttribute12(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute12_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Attribute8", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderAttribute8(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAttribute8_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute13", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderGlobalAttribute13(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute13_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TermsName", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderTermsName(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderTermsName_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PaymentReasonCode", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderPaymentReasonCode(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderPaymentReasonCode_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "AwtGroupName", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderAwtGroupName(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAwtGroupName_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "RemittanceMessage2", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderRemittanceMessage2(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderRemittanceMessage2_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ApplyAdvancesFlag", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<Boolean> createInvoiceInterfaceHeaderApplyAdvancesFlag(Boolean value) {
        return new JAXBElement<Boolean>(_InvoiceInterfaceHeaderApplyAdvancesFlag_QNAME, Boolean.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "RemittanceMessage1", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderRemittanceMessage1(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderRemittanceMessage1_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "RemittanceMessage3", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderRemittanceMessage3(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderRemittanceMessage3_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "AttributeNumber5", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<BigDecimal> createInvoiceInterfaceHeaderAttributeNumber5(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceInterfaceHeaderAttributeNumber5_QNAME, BigDecimal.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "SettlementPriority", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderSettlementPriority(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderSettlementPriority_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ExclusivePaymentFlag", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<Boolean> createInvoiceInterfaceHeaderExclusivePaymentFlag(Boolean value) {
        return new JAXBElement<Boolean>(_InvoiceInterfaceHeaderExclusivePaymentFlag_QNAME, Boolean.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "RemitToAddressId", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<Long> createInvoiceInterfaceHeaderRemitToAddressId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceHeaderRemitToAddressId_QNAME, Long.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "AddTaxToInvoiceAmountFlag", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<Boolean> createInvoiceInterfaceHeaderAddTaxToInvoiceAmountFlag(Boolean value) {
        return new JAXBElement<Boolean>(_InvoiceInterfaceHeaderAddTaxToInvoiceAmountFlag_QNAME, Boolean.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ImportDocumentNumber", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderImportDocumentNumber(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderImportDocumentNumber_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "AttributeDate1", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceInterfaceHeaderAttributeDate1(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceInterfaceHeaderAttributeDate1_QNAME, XMLGregorianCalendar.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "BankChargeBearer", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderBankChargeBearer(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderBankChargeBearer_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PaymentFunction", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderPaymentFunction(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderPaymentFunction_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "CorrectionPeriod", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderCorrectionPeriod(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderCorrectionPeriod_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "AttributeNumber4", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<BigDecimal> createInvoiceInterfaceHeaderAttributeNumber4(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceInterfaceHeaderAttributeNumber4_QNAME, BigDecimal.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "RelationshipId", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<Long> createInvoiceInterfaceHeaderRelationshipId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceHeaderRelationshipId_QNAME, Long.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "AttributeNumber3", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<BigDecimal> createInvoiceInterfaceHeaderAttributeNumber3(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceInterfaceHeaderAttributeNumber3_QNAME, BigDecimal.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TaxInvoiceRecordingDate", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceInterfaceHeaderTaxInvoiceRecordingDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceInterfaceHeaderTaxInvoiceRecordingDate_QNAME, XMLGregorianCalendar.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "AttributeNumber2", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<BigDecimal> createInvoiceInterfaceHeaderAttributeNumber2(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceInterfaceHeaderAttributeNumber2_QNAME, BigDecimal.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "AttributeNumber1", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<BigDecimal> createInvoiceInterfaceHeaderAttributeNumber1(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceInterfaceHeaderAttributeNumber1_QNAME, BigDecimal.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PaymentPriority", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<Integer> createInvoiceInterfaceHeaderPaymentPriority(Integer value) {
        return new JAXBElement<Integer>(_InvoiceInterfaceHeaderPaymentPriority_QNAME, Integer.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "AttributeDate3", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceInterfaceHeaderAttributeDate3(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceInterfaceHeaderAttributeDate3_QNAME, XMLGregorianCalendar.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "AttributeDate2", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceInterfaceHeaderAttributeDate2(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceInterfaceHeaderAttributeDate2_QNAME, XMLGregorianCalendar.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "USSGLTransactionCode", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderUSSGLTransactionCode(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderUSSGLTransactionCode_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "AttributeDate5", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceInterfaceHeaderAttributeDate5(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceInterfaceHeaderAttributeDate5_QNAME, XMLGregorianCalendar.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TermsDate", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceInterfaceHeaderTermsDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceInterfaceHeaderTermsDate_QNAME, XMLGregorianCalendar.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "AttributeDate4", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceInterfaceHeaderAttributeDate4(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceInterfaceHeaderAttributeDate4_QNAME, XMLGregorianCalendar.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "AwtGroupId", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<Long> createInvoiceInterfaceHeaderAwtGroupId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceHeaderAwtGroupId_QNAME, Long.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ImageDocumentNumber", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderImageDocumentNumber(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderImageDocumentNumber_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PONumber", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderPONumber(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderPONumber_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PaymentReasonComments", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderPaymentReasonComments(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderPaymentReasonComments_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "B2BSiteCode", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderB2BSiteCode(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderB2BSiteCode_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute7", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderGlobalAttribute7(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute7_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "VendorSiteCode", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderVendorSiteCode(String value) {
        return new JAXBElement<String>(_ApSupplierRejectionsVendorSiteCode_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute8", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderGlobalAttribute8(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute8_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute5", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderGlobalAttribute5(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute5_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "CalculateTaxDuringImportFlag", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<Boolean> createInvoiceInterfaceHeaderCalculateTaxDuringImportFlag(Boolean value) {
        return new JAXBElement<Boolean>(_InvoiceInterfaceHeaderCalculateTaxDuringImportFlag_QNAME, Boolean.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute6", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderGlobalAttribute6(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute6_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute3", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderGlobalAttribute3(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute3_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute4", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderGlobalAttribute4(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute4_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute1", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderGlobalAttribute1(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute1_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "BudgetDate", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceInterfaceHeaderBudgetDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceInterfaceHeaderBudgetDate_QNAME, XMLGregorianCalendar.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute2", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderGlobalAttribute2(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute2_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "SupplierTaxInvoiceDate", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceInterfaceHeaderSupplierTaxInvoiceDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceInterfaceHeaderSupplierTaxInvoiceDate_QNAME, XMLGregorianCalendar.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttributeDate5", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceInterfaceHeaderGlobalAttributeDate5(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceInterfaceHeaderGlobalAttributeDate5_QNAME, XMLGregorianCalendar.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttributeDate4", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceInterfaceHeaderGlobalAttributeDate4(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceInterfaceHeaderGlobalAttributeDate4_QNAME, XMLGregorianCalendar.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "LegalEntityName", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderLegalEntityName(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderLegalEntityName_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PartySiteId", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<Long> createInvoiceInterfaceHeaderPartySiteId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceHeaderPartySiteId_QNAME, Long.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttributeDate3", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceInterfaceHeaderGlobalAttributeDate3(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceInterfaceHeaderGlobalAttributeDate3_QNAME, XMLGregorianCalendar.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PayProcTrxnTypeCode", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderPayProcTrxnTypeCode(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderPayProcTrxnTypeCode_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttributeDate2", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceInterfaceHeaderGlobalAttributeDate2(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceInterfaceHeaderGlobalAttributeDate2_QNAME, XMLGregorianCalendar.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttributeDate1", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceInterfaceHeaderGlobalAttributeDate1(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceInterfaceHeaderGlobalAttributeDate1_QNAME, XMLGregorianCalendar.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PaymentMethodCode", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderPaymentMethodCode(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderPaymentMethodCode_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "DocumentSubType", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderDocumentSubType(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderDocumentSubType_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute20", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderGlobalAttribute20(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute20_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "DeliveryChannelCode", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderDeliveryChannelCode(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderDeliveryChannelCode_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "RequesterLastName", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderRequesterLastName(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderRequesterLastName_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Status", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderStatus(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderStatus_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "VendorName", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderVendorName(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderVendorName_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "WorkflowFlag", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<Boolean> createInvoiceInterfaceHeaderWorkflowFlag(Boolean value) {
        return new JAXBElement<Boolean>(_InvoiceInterfaceHeaderWorkflowFlag_QNAME, Boolean.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ApplicationId", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<Long> createInvoiceInterfaceHeaderApplicationId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceHeaderApplicationId_QNAME, Long.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "RemitToSupplierNumber", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderRemitToSupplierNumber(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderRemitToSupplierNumber_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute18", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderGlobalAttribute18(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute18_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "NetOfRetainageFlag", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<Boolean> createInvoiceInterfaceHeaderNetOfRetainageFlag(Boolean value) {
        return new JAXBElement<Boolean>(_InvoiceInterfaceHeaderNetOfRetainageFlag_QNAME, Boolean.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Reference1", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderReference1(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderReference1_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute19", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderGlobalAttribute19(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute19_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Reference2", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderReference2(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderReference2_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PrepayLineNumber", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<Integer> createInvoiceInterfaceHeaderPrepayLineNumber(Integer value) {
        return new JAXBElement<Integer>(_InvoiceInterfaceHeaderPrepayLineNumber_QNAME, Integer.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ImportDocumentDate", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceInterfaceHeaderImportDocumentDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceInterfaceHeaderImportDocumentDate_QNAME, XMLGregorianCalendar.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ThirdPartyRegistrationId", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<Long> createInvoiceInterfaceHeaderThirdPartyRegistrationId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceHeaderThirdPartyRegistrationId_QNAME, Long.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ShipToLocation", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderShipToLocation(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderShipToLocation_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PaymentCrossRate", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<BigDecimal> createInvoiceInterfaceHeaderPaymentCrossRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceInterfaceHeaderPaymentCrossRate_QNAME, BigDecimal.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "AttributeCategory", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderAttributeCategory(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAttributeCategory_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "InvoiceTypeLookupCode", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderInvoiceTypeLookupCode(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderInvoiceTypeLookupCode_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "OperatingUnit", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderOperatingUnit(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderOperatingUnit_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PortOfEntryCode", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderPortOfEntryCode(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderPortOfEntryCode_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PaymentMethodLookupCode", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderPaymentMethodLookupCode(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderPaymentMethodLookupCode_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "FirstPartyRegistrationId", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<Long> createInvoiceInterfaceHeaderFirstPartyRegistrationId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceHeaderFirstPartyRegistrationId_QNAME, Long.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Description", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderDescription(String value) {
        return new JAXBElement<String>(_ApSupplierRejectionsDescription_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ExternalBankAccountId", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<Long> createInvoiceInterfaceHeaderExternalBankAccountId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceHeaderExternalBankAccountId_QNAME, Long.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "InvoiceIncludesPrepayFlag", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<Boolean> createInvoiceInterfaceHeaderInvoiceIncludesPrepayFlag(Boolean value) {
        return new JAXBElement<Boolean>(_InvoiceInterfaceHeaderInvoiceIncludesPrepayFlag_QNAME, Boolean.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PaymentCrossRateType", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderPaymentCrossRateType(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderPaymentCrossRateType_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "InvoiceDate", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceInterfaceHeaderInvoiceDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApSupplierRejectionsInvoiceDate_QNAME, XMLGregorianCalendar.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "LegalEntityId", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<Long> createInvoiceInterfaceHeaderLegalEntityId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceHeaderLegalEntityId_QNAME, Long.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Attribute15", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderAttribute15(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAttribute15_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "RemitToAddressName", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderRemitToAddressName(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderRemitToAddressName_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Attribute12", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderAttribute12(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAttribute12_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Attribute11", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderAttribute11(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAttribute11_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Attribute14", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderAttribute14(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAttribute14_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ImageDocumentUri", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderImageDocumentUri(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderImageDocumentUri_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Attribute13", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderAttribute13(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAttribute13_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GroupId", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderGroupId(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGroupId_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "SupplierTaxInvoiceNumber", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderSupplierTaxInvoiceNumber(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderSupplierTaxInvoiceNumber_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttributeCategory", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderGlobalAttributeCategory(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttributeCategory_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "RequesterEmployeeNumber", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderRequesterEmployeeNumber(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderRequesterEmployeeNumber_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlDate", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceInterfaceHeaderGlDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceInterfaceHeaderGlDate_QNAME, XMLGregorianCalendar.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "RequesterId", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<Long> createInvoiceInterfaceHeaderRequesterId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceHeaderRequesterId_QNAME, Long.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Attribute10", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderAttribute10(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAttribute10_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ExchangeDate", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceInterfaceHeaderExchangeDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceInterfaceHeaderExchangeDate_QNAME, XMLGregorianCalendar.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PayGroupLookupCode", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderPayGroupLookupCode(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderPayGroupLookupCode_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "RemitToSupplierId", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<Long> createInvoiceInterfaceHeaderRemitToSupplierId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceHeaderRemitToSupplierId_QNAME, Long.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ThirdPartyRegistrationNumber", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderThirdPartyRegistrationNumber(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderThirdPartyRegistrationNumber_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute9", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderGlobalAttribute9(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute9_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GoodsReceivedDate", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceInterfaceHeaderGoodsReceivedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceInterfaceHeaderGoodsReceivedDate_QNAME, XMLGregorianCalendar.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ReferenceKey3", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderReferenceKey3(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderReferenceKey3_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ReferenceKey2", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderReferenceKey2(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderReferenceKey2_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ReferenceKey1", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderReferenceKey1(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderReferenceKey1_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PrepayGlDate", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceInterfaceHeaderPrepayGlDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceInterfaceHeaderPrepayGlDate_QNAME, XMLGregorianCalendar.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PartyId", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<Long> createInvoiceInterfaceHeaderPartyId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceHeaderPartyId_QNAME, Long.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "AcctsPayCodeCombinationId", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<Long> createInvoiceInterfaceHeaderAcctsPayCodeCombinationId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceHeaderAcctsPayCodeCombinationId_QNAME, Long.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PaymentCurrencyCode", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<String> createInvoiceInterfaceHeaderPaymentCurrencyCode(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderPaymentCurrencyCode_QNAME, String.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "SupplierTaxExchangeRate", scope = InvoiceInterfaceHeader.class)
    public JAXBElement<BigDecimal> createInvoiceInterfaceHeaderSupplierTaxExchangeRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceInterfaceHeaderSupplierTaxExchangeRate_QNAME, BigDecimal.class, InvoiceInterfaceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PjcTaskNumber", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLinePjcTaskNumber(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLinePjcTaskNumber_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ReferenceKey5", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineReferenceKey5(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderReferenceKey5_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ReferenceKey4", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineReferenceKey4(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderReferenceKey4_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ReceiptNumber", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineReceiptNumber(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineReceiptNumber_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TaxRegimeCode", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineTaxRegimeCode(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineTaxRegimeCode_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "AssetCategoryId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLineAssetCategoryId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceLineAssetCategoryId_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PjcFundingSourceName", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLinePjcFundingSourceName(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLinePjcFundingSourceName_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "POReleaseId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLinePOReleaseId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceLinePOReleaseId_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProjectContractId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<BigDecimal> createInvoiceInterfaceLineProjectContractId(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceInterfaceLineProjectContractId_QNAME, BigDecimal.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PurchasingCategoryId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLinePurchasingCategoryId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceLinePurchasingCategoryId_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Type1099", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineType1099(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineType1099_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProjectContractLineId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<BigDecimal> createInvoiceInterfaceLineProjectContractLineId(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceInterfaceLineProjectContractLineId_QNAME, BigDecimal.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProductCategory", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineProductCategory(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineProductCategory_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TaxClassificationCode", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineTaxClassificationCode(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineTaxClassificationCode_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "DeferredAccountingFlag", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Boolean> createInvoiceInterfaceLineDeferredAccountingFlag(Boolean value) {
        return new JAXBElement<Boolean>(_InvoiceInterfaceLineDeferredAccountingFlag_QNAME, Boolean.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "AssessableValue", scope = InvoiceInterfaceLine.class)
    public JAXBElement<BigDecimal> createInvoiceInterfaceLineAssessableValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceInterfaceLineAssessableValue_QNAME, BigDecimal.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProjectProjectId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<BigDecimal> createInvoiceInterfaceLineProjectProjectId(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceInterfaceLineProjectProjectId_QNAME, BigDecimal.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "SerialNumber", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineSerialNumber(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineSerialNumber_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "IncludedInTaxableLineFlag", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Boolean> createInvoiceInterfaceLineIncludedInTaxableLineFlag(Boolean value) {
        return new JAXBElement<Boolean>(_InvoiceInterfaceLineIncludedInTaxableLineFlag_QNAME, Boolean.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "StatisticalAmount", scope = InvoiceInterfaceLine.class)
    public JAXBElement<AmountType> createInvoiceInterfaceLineStatisticalAmount(AmountType value) {
        return new JAXBElement<AmountType>(_InvoiceInterfaceLineStatisticalAmount_QNAME, AmountType.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ControlAmount", scope = InvoiceInterfaceLine.class)
    public JAXBElement<AmountType> createInvoiceInterfaceLineControlAmount(AmountType value) {
        return new JAXBElement<AmountType>(_InvoiceInterfaceHeaderControlAmount_QNAME, AmountType.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "CostFactorName", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineCostFactorName(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineCostFactorName_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PriceCorrectInvoiceNumber", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLinePriceCorrectInvoiceNumber(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLinePriceCorrectInvoiceNumber_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute14", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineGlobalAttribute14(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute14_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PaCcArInvoiceId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLinePaCcArInvoiceId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceLinePaCcArInvoiceId_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute15", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineGlobalAttribute15(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute15_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute16", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineGlobalAttribute16(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute16_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute17", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineGlobalAttribute17(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute17_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute10", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineGlobalAttribute10(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute10_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute11", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineGlobalAttribute11(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute11_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute12", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineGlobalAttribute12(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute12_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute13", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineGlobalAttribute13(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute13_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TaxRate", scope = InvoiceInterfaceLine.class)
    public JAXBElement<BigDecimal> createInvoiceInterfaceLineTaxRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceInterfaceLineTaxRate_QNAME, BigDecimal.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "POHeaderId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLinePOHeaderId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceLinePOHeaderId_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "AccountSegment", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineAccountSegment(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineAccountSegment_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "AwtGroupName", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineAwtGroupName(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAwtGroupName_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PjcWorkType", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLinePjcWorkType(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLinePjcWorkType_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PurchasingCategory", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLinePurchasingCategory(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLinePurchasingCategory_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProjectUserDefineAttribute10", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineProjectUserDefineAttribute10(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineProjectUserDefineAttribute10_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TaxStatusCode", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineTaxStatusCode(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineTaxStatusCode_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "IncomeTaxRegion", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineIncomeTaxRegion(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineIncomeTaxRegion_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "POLineNumber", scope = InvoiceInterfaceLine.class)
    public JAXBElement<BigDecimal> createInvoiceInterfaceLinePOLineNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceInterfaceLinePOLineNumber_QNAME, BigDecimal.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PjcExpenditureTypeName", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLinePjcExpenditureTypeName(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLinePjcExpenditureTypeName_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "SourceTrxLevelType", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineSourceTrxLevelType(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineSourceTrxLevelType_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PaAdditionFlag", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Boolean> createInvoiceInterfaceLinePaAdditionFlag(Boolean value) {
        return new JAXBElement<Boolean>(_InvoiceInterfaceLinePaAdditionFlag_QNAME, Boolean.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "AwtGroupId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLineAwtGroupId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceHeaderAwtGroupId_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProjectUserDefineAttribute3", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineProjectUserDefineAttribute3(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineProjectUserDefineAttribute3_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProjectUserDefineAttribute4", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineProjectUserDefineAttribute4(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineProjectUserDefineAttribute4_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProjectUserDefineAttribute1", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineProjectUserDefineAttribute1(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineProjectUserDefineAttribute1_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProjectUserDefineAttribute2", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineProjectUserDefineAttribute2(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineProjectUserDefineAttribute2_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProjectUserDefineAttribute7", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineProjectUserDefineAttribute7(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineProjectUserDefineAttribute7_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProjectUserDefineAttribute8", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineProjectUserDefineAttribute8(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineProjectUserDefineAttribute8_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProjectUserDefineAttribute5", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineProjectUserDefineAttribute5(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineProjectUserDefineAttribute5_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "InvoiceLineId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLineInvoiceLineId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceLineInvoiceLineId_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProjectUserDefineAttribute6", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineProjectUserDefineAttribute6(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineProjectUserDefineAttribute6_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TaxCodeId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLineTaxCodeId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceLineTaxCodeId_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProjectUserDefineAttribute9", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineProjectUserDefineAttribute9(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineProjectUserDefineAttribute9_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute7", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineGlobalAttribute7(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute7_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute8", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineGlobalAttribute8(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute8_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute5", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineGlobalAttribute5(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute5_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute6", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineGlobalAttribute6(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute6_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute3", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineGlobalAttribute3(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute3_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute4", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineGlobalAttribute4(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute4_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute1", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineGlobalAttribute1(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute1_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute2", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineGlobalAttribute2(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute2_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "POLineId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLinePOLineId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceLinePOLineId_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "MatchOption", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineMatchOption(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineMatchOption_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "POShipmentNumber", scope = InvoiceInterfaceLine.class)
    public JAXBElement<BigDecimal> createInvoiceInterfaceLinePOShipmentNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceInterfaceLinePOShipmentNumber_QNAME, BigDecimal.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PjcOrganizationName", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLinePjcOrganizationName(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLinePjcOrganizationName_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProductType", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineProductType(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineProductType_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "SourceLineId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLineSourceLineId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceLineSourceLineId_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "InventoryItemId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLineInventoryItemId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceLineInventoryItemId_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "RequesterLastName", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineRequesterLastName(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderRequesterLastName_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ExpenditureType", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineExpenditureType(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineExpenditureType_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProjectTaskId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<BigDecimal> createInvoiceInterfaceLineProjectTaskId(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceInterfaceLineProjectTaskId_QNAME, BigDecimal.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ShipFromLocationId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLineShipFromLocationId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceLineShipFromLocationId_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProjectCapitalizableFlag", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Boolean> createInvoiceInterfaceLineProjectCapitalizableFlag(Boolean value) {
        return new JAXBElement<Boolean>(_InvoiceInterfaceLineProjectCapitalizableFlag_QNAME, Boolean.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "AssetsTrackingFlag", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Boolean> createInvoiceInterfaceLineAssetsTrackingFlag(Boolean value) {
        return new JAXBElement<Boolean>(_InvoiceInterfaceLineAssetsTrackingFlag_QNAME, Boolean.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PriceCorrectionFlag", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Boolean> createInvoiceInterfaceLinePriceCorrectionFlag(Boolean value) {
        return new JAXBElement<Boolean>(_InvoiceInterfaceLinePriceCorrectionFlag_QNAME, Boolean.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "DefAcctgStartDate", scope = InvoiceInterfaceLine.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceInterfaceLineDefAcctgStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceInterfaceLineDefAcctgStartDate_QNAME, XMLGregorianCalendar.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ConsumptionAdviceLineId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLineConsumptionAdviceLineId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceLineConsumptionAdviceLineId_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ExpenditureItemDate", scope = InvoiceInterfaceLine.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceInterfaceLineExpenditureItemDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceInterfaceLineExpenditureItemDate_QNAME, XMLGregorianCalendar.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttributeCategory", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineGlobalAttributeCategory(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttributeCategory_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TaxRateCode", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineTaxRateCode(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineTaxRateCode_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "RequesterId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLineRequesterId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceHeaderRequesterId_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "DistCodeCombinationId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLineDistCodeCombinationId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceLineDistCodeCombinationId_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PaCcArInvoiceLineNumber", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Integer> createInvoiceInterfaceLinePaCcArInvoiceLineNumber(Integer value) {
        return new JAXBElement<Integer>(_InvoiceInterfaceLinePaCcArInvoiceLineNumber_QNAME, Integer.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProjectWorkTypeId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<BigDecimal> createInvoiceInterfaceLineProjectWorkTypeId(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceInterfaceLineProjectWorkTypeId_QNAME, BigDecimal.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProrateAcrossFlag", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Boolean> createInvoiceInterfaceLineProrateAcrossFlag(Boolean value) {
        return new JAXBElement<Boolean>(_InvoiceInterfaceLineProrateAcrossFlag_QNAME, Boolean.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute9", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineGlobalAttribute9(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute9_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "SourceEntityCode", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineSourceEntityCode(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineSourceEntityCode_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ReferenceKey3", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineReferenceKey3(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderReferenceKey3_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ReferenceKey2", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineReferenceKey2(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderReferenceKey2_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ReferenceKey1", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineReferenceKey1(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderReferenceKey1_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "FinalMatchFlag", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Boolean> createInvoiceInterfaceLineFinalMatchFlag(Boolean value) {
        return new JAXBElement<Boolean>(_InvoiceInterfaceLineFinalMatchFlag_QNAME, Boolean.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProjectContextCategory", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineProjectContextCategory(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineProjectContextCategory_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "OrgId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLineOrgId(Long value) {
        return new JAXBElement<Long>(_ApSupplierRejectionsOrgId_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TrxBusinessCategory", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineTrxBusinessCategory(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineTrxBusinessCategory_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PriceCorrectInvoiceLineNumber", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Integer> createInvoiceInterfaceLinePriceCorrectInvoiceLineNumber(Integer value) {
        return new JAXBElement<Integer>(_InvoiceInterfaceLinePriceCorrectInvoiceLineNumber_QNAME, Integer.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "UnitPrice", scope = InvoiceInterfaceLine.class)
    public JAXBElement<AmountType> createInvoiceInterfaceLineUnitPrice(AmountType value) {
        return new JAXBElement<AmountType>(_InvoiceInterfaceLineUnitPrice_QNAME, AmountType.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "DefAcctgPeriodType", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineDefAcctgPeriodType(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineDefAcctgPeriodType_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Tax", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineTax(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineTax_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "POLineLocationId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLinePOLineLocationId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceLinePOLineLocationId_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "UnitOfMeasLookupCode", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineUnitOfMeasLookupCode(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineUnitOfMeasLookupCode_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ExternalDocumentLineReference", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineExternalDocumentLineReference(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineExternalDocumentLineReference_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProductTable", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineProductTable(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderProductTable_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "DefAcctgNumberOfPeriods", scope = InvoiceInterfaceLine.class)
    public JAXBElement<BigDecimal> createInvoiceInterfaceLineDefAcctgNumberOfPeriods(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceInterfaceLineDefAcctgNumberOfPeriods_QNAME, BigDecimal.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Manufacturer", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineManufacturer(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineManufacturer_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PaQuantity", scope = InvoiceInterfaceLine.class)
    public JAXBElement<MeasureType> createInvoiceInterfaceLinePaQuantity(MeasureType value) {
        return new JAXBElement<MeasureType>(_InvoiceInterfaceLinePaQuantity_QNAME, MeasureType.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProjectExpenditureTypeId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<BigDecimal> createInvoiceInterfaceLineProjectExpenditureTypeId(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceInterfaceLineProjectExpenditureTypeId_QNAME, BigDecimal.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "InvoicedQuantity", scope = InvoiceInterfaceLine.class)
    public JAXBElement<MeasureType> createInvoiceInterfaceLineInvoicedQuantity(MeasureType value) {
        return new JAXBElement<MeasureType>(_InvoiceInterfaceLineInvoicedQuantity_QNAME, MeasureType.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "UserDefinedFiscClass", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineUserDefinedFiscClass(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineUserDefinedFiscClass_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ConsumptionAdviceHeaderId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLineConsumptionAdviceHeaderId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceLineConsumptionAdviceHeaderId_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "DefAcctgEndDate", scope = InvoiceInterfaceLine.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceInterfaceLineDefAcctgEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceInterfaceLineDefAcctgEndDate_QNAME, XMLGregorianCalendar.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TaxRateId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLineTaxRateId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceLineTaxRateId_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ConsumptionAdviceLineNumber", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Integer> createInvoiceInterfaceLineConsumptionAdviceLineNumber(Integer value) {
        return new JAXBElement<Integer>(_InvoiceInterfaceLineConsumptionAdviceLineNumber_QNAME, Integer.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ModelNumber", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineModelNumber(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineModelNumber_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PjcContractName", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLinePjcContractName(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLinePjcContractName_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ExpenditureOrganizationId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLineExpenditureOrganizationId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceLineExpenditureOrganizationId_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "VendorItemNumber", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineVendorItemNumber(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineVendorItemNumber_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "CreditCardTrxId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLineCreditCardTrxId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceLineCreditCardTrxId_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ItemDescription", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineItemDescription(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineItemDescription_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "RequesterFirstName", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineRequesterFirstName(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderRequesterFirstName_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Attribute3", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineAttribute3(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAttribute3_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Attribute2", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineAttribute2(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAttribute2_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Attribute1", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineAttribute1(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAttribute1_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "AccountingDate", scope = InvoiceInterfaceLine.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceInterfaceLineAccountingDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceInterfaceLineAccountingDate_QNAME, XMLGregorianCalendar.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Attribute7", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineAttribute7(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAttribute7_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Attribute6", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineAttribute6(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAttribute6_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Attribute5", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineAttribute5(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAttribute5_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Attribute4", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineAttribute4(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAttribute4_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Attribute9", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineAttribute9(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAttribute9_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "BalancingSegment", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineBalancingSegment(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineBalancingSegment_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Attribute8", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineAttribute8(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAttribute8_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ShipToLocationCode", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineShipToLocationCode(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineShipToLocationCode_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PrimaryIntendedUse", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLinePrimaryIntendedUse(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLinePrimaryIntendedUse_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TaxCode", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineTaxCode(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineTaxCode_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "SourceApplicationId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLineSourceApplicationId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceLineSourceApplicationId_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProjectId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLineProjectId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceLineProjectId_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "FinalDischargeLocationId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLineFinalDischargeLocationId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceLineFinalDischargeLocationId_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "CostCenterSegment", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineCostCenterSegment(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineCostCenterSegment_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PjcTaskName", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLinePjcTaskName(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLinePjcTaskName_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ShipToLocationId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLineShipToLocationId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceLineShipToLocationId_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PjcFundingSourceNumber", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLinePjcFundingSourceNumber(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLinePjcFundingSourceNumber_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "DistributionSetName", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineDistributionSetName(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineDistributionSetName_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "USSGLTransactionCode", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineUSSGLTransactionCode(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderUSSGLTransactionCode_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProjectReservedAttribute1", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineProjectReservedAttribute1(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineProjectReservedAttribute1_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProjectReservedAttribute2", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineProjectReservedAttribute2(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineProjectReservedAttribute2_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ReceiptLineNumber", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineReceiptLineNumber(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineReceiptLineNumber_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PjcContractNumber", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLinePjcContractNumber(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLinePjcContractNumber_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProjectReservedAttribute7", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineProjectReservedAttribute7(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineProjectReservedAttribute7_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProjectReservedAttribute8", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineProjectReservedAttribute8(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineProjectReservedAttribute8_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProjectReservedAttribute9", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineProjectReservedAttribute9(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineProjectReservedAttribute9_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProjectReservedAttribute3", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineProjectReservedAttribute3(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineProjectReservedAttribute3_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PONumber", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLinePONumber(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderPONumber_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProjectReservedAttribute4", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineProjectReservedAttribute4(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineProjectReservedAttribute4_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProjectReservedAttribute5", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineProjectReservedAttribute5(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineProjectReservedAttribute5_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProjectOrganizationId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<BigDecimal> createInvoiceInterfaceLineProjectOrganizationId(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceInterfaceLineProjectOrganizationId_QNAME, BigDecimal.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProjectReservedAttribute6", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineProjectReservedAttribute6(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineProjectReservedAttribute6_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PODistributionId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLinePODistributionId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceLinePODistributionId_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "BudgetDate", scope = InvoiceInterfaceLine.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceInterfaceLineBudgetDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceInterfaceHeaderBudgetDate_QNAME, XMLGregorianCalendar.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TaxableFlag", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Boolean> createInvoiceInterfaceLineTaxableFlag(Boolean value) {
        return new JAXBElement<Boolean>(_InvoiceInterfaceLineTaxableFlag_QNAME, Boolean.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "DistCodeConcatenated", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineDistCodeConcatenated(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineDistCodeConcatenated_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute20", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineGlobalAttribute20(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute20_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "AwardId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLineAwardId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceLineAwardId_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "CostFactorId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLineCostFactorId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceLineCostFactorId_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "DistributionSetId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLineDistributionSetId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceLineDistributionSetId_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ShipFromLocationCode", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineShipFromLocationCode(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineShipFromLocationCode_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "FinalDischargeLocationCode", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineFinalDischargeLocationCode(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineFinalDischargeLocationCode_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ApplicationId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLineApplicationId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceHeaderApplicationId_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PackingSlip", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLinePackingSlip(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLinePackingSlip_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ConsumptionAdviceNumber", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineConsumptionAdviceNumber(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineConsumptionAdviceNumber_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute18", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineGlobalAttribute18(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute18_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Reference1", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineReference1(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderReference1_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "SourceTrxId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLineSourceTrxId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceLineSourceTrxId_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "GlobalAttribute19", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineGlobalAttribute19(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderGlobalAttribute19_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Reference2", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineReference2(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderReference2_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ReleaseNumber", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Integer> createInvoiceInterfaceLineReleaseNumber(Integer value) {
        return new JAXBElement<Integer>(_InvoiceInterfaceLineReleaseNumber_QNAME, Integer.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProjectExpenditureItemDate", scope = InvoiceInterfaceLine.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceInterfaceLineProjectExpenditureItemDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceInterfaceLineProjectExpenditureItemDate_QNAME, XMLGregorianCalendar.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PaCcProcessedCode", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLinePaCcProcessedCode(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLinePaCcProcessedCode_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TaxJurisdictionCode", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineTaxJurisdictionCode(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineTaxJurisdictionCode_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "DefaultDistCcid", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLineDefaultDistCcid(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceLineDefaultDistCcid_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "LineNumber", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Integer> createInvoiceInterfaceLineLineNumber(Integer value) {
        return new JAXBElement<Integer>(_InvoiceInterfaceLineLineNumber_QNAME, Integer.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "WarrantyNumber", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineWarrantyNumber(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineWarrantyNumber_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "DefAccrualCodeConcatenated", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineDefAccrualCodeConcatenated(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineDefAccrualCodeConcatenated_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "AttributeCategory", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineAttributeCategory(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAttributeCategory_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PjcProjectNumber", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLinePjcProjectNumber(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLinePjcProjectNumber_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "AssetBookTypeCode", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineAssetBookTypeCode(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineAssetBookTypeCode_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Description", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineDescription(String value) {
        return new JAXBElement<String>(_ApSupplierRejectionsDescription_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "TaskId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLineTaskId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceLineTaskId_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PjcProjectName", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLinePjcProjectName(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLinePjcProjectName_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "LineGroupNumber", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Integer> createInvoiceInterfaceLineLineGroupNumber(Integer value) {
        return new JAXBElement<Integer>(_InvoiceInterfaceLineLineGroupNumber_QNAME, Integer.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProjectBillableFlag", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Boolean> createInvoiceInterfaceLineProjectBillableFlag(Boolean value) {
        return new JAXBElement<Boolean>(_InvoiceInterfaceLineProjectBillableFlag_QNAME, Boolean.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Attribute15", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineAttribute15(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAttribute15_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Attribute12", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineAttribute12(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAttribute12_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Attribute11", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineAttribute11(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAttribute11_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Attribute14", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineAttribute14(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAttribute14_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "SourceEventClassCode", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineSourceEventClassCode(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineSourceEventClassCode_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Attribute13", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineAttribute13(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAttribute13_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProjectReservedAttribute10", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineProjectReservedAttribute10(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineProjectReservedAttribute10_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "RequesterEmployeeNumber", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineRequesterEmployeeNumber(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderRequesterEmployeeNumber_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "Attribute10", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineAttribute10(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceHeaderAttribute10_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProjectFundingAllocationId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<BigDecimal> createInvoiceInterfaceLineProjectFundingAllocationId(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceInterfaceLineProjectFundingAllocationId_QNAME, BigDecimal.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "DefAcctgAccrualCcid", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLineDefAcctgAccrualCcid(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceLineDefAcctgAccrualCcid_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "PODistributionNumber", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Integer> createInvoiceInterfaceLinePODistributionNumber(Integer value) {
        return new JAXBElement<Integer>(_InvoiceInterfaceLinePODistributionNumber_QNAME, Integer.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "ProductFiscClassification", scope = InvoiceInterfaceLine.class)
    public JAXBElement<String> createInvoiceInterfaceLineProductFiscClassification(String value) {
        return new JAXBElement<String>(_InvoiceInterfaceLineProductFiscClassification_QNAME, String.class, InvoiceInterfaceLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", name = "RcvTransactionId", scope = InvoiceInterfaceLine.class)
    public JAXBElement<Long> createInvoiceInterfaceLineRcvTransactionId(Long value) {
        return new JAXBElement<Long>(_InvoiceInterfaceLineRcvTransactionId_QNAME, Long.class, InvoiceInterfaceLine.class, value);
    }

}
