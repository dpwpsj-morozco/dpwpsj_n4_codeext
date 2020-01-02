
package com.oracle.xmlns.apps.financials.payables.invoices.quickinvoices.invoiceinterfaceservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.oracle.xmlns.adf.svc.types.AmountType;


/**
 * <p>Clase Java para InvoiceInterfaceHeader complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvoiceInterfaceHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrgId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OperatingUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="VendorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorSiteCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorSiteId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AcctsPayCodeCombinationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AddTaxToInvoiceAmountFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AmountApplicableToDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ApplicationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ApplyAdvancesFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Attribute1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attribute10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attribute11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attribute12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attribute13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attribute14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attribute15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attribute2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attribute3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attribute4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attribute5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attribute6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attribute7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attribute8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attribute9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttributeCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AwtGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AwtGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankChargeBearer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CalculateTaxDuringImportFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ControlAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="CorrectionPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorrectionYear" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CustomerRegistrationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryChannelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExchangeDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ExchangeRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExclusivePaymentFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExternalBankAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ExternalDocumentReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="GlobalAttribute1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalAttribute10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalAttribute11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalAttribute12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalAttribute13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalAttribute14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalAttribute15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalAttribute16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalAttribute17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalAttribute18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalAttribute19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalAttribute2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalAttribute20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalAttribute3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalAttribute4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalAttribute5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalAttribute6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalAttribute7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalAttribute8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalAttribute9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalAttributeCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GoodsReceivedDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="GroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImportDocumentDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ImportDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="InvoiceCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="InvoiceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="InvoiceIncludesPrepayFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceReceivedDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="InvoiceTypeLookupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegalEntityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LegalEntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NetOfRetainageFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NoExchangeRateBaseAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="PaidOnBehalfEmployeeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartySiteId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PayGroupLookupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayProcTrxnTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentCrossRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PaymentCrossRateDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="PaymentCrossRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentFunction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentMethodCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentMethodLookupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentPriority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaymentReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentReasonComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PONumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PortOfEntryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrepayApplyAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="PrepayGlDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="PrepayLineNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PrepayNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductTable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reference1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reference2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenceKey1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenceKey2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenceKey3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenceKey4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenceKey5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RemittanceMessage1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RemittanceMessage2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RemittanceMessage3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RemitToSupplierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RemitToSupplierId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RemitToAddressName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RemitToAddressId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RelationshipId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RemitToSupplierNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequesterEmployeeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequesterFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequesterId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RequesterLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SettlementPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupplierTaxExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SupplierTaxInvoiceDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="SupplierTaxInvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxInvoiceInternalSequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxInvoiceRecordingDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="TaxRelatedInvoiceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TaxationCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TermsDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="TermsId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TermsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniqueRemittanceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UriCheckDigit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USSGLTransactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VoucherNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkflowFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="B2BSiteCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="B2BProgramName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BudgetDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="LoadRequestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FirstPartyRegistrationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FirstPartyRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThirdPartyRegistrationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ThirdPartyRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttributeDate1" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="AttributeDate2" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="AttributeDate3" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="AttributeDate4" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="AttributeDate5" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="AttributeNumber1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AttributeNumber2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AttributeNumber3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AttributeNumber4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AttributeNumber5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ImageDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImageDocumentUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalAttributeDate1" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="GlobalAttributeDate2" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="GlobalAttributeDate3" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="GlobalAttributeDate4" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="GlobalAttributeDate5" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="GlobalAttributeNumber1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="GlobalAttributeNumber2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="GlobalAttributeNumber3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="GlobalAttributeNumber4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="GlobalAttributeNumber5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InvoiceInterfaceLine" type="{http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/}InvoiceInterfaceLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InvoiceHeaderRejection" type="{http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/}InvoiceHeaderRejection" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceInterfaceHeader", propOrder = {
    "source",
    "orgId",
    "operatingUnit",
    "vendorId",
    "vendorName",
    "vendorNumber",
    "vendorSiteCode",
    "vendorSiteId",
    "acctsPayCodeCombinationId",
    "addTaxToInvoiceAmountFlag",
    "amountApplicableToDiscount",
    "applicationId",
    "applyAdvancesFlag",
    "attribute1",
    "attribute10",
    "attribute11",
    "attribute12",
    "attribute13",
    "attribute14",
    "attribute15",
    "attribute2",
    "attribute3",
    "attribute4",
    "attribute5",
    "attribute6",
    "attribute7",
    "attribute8",
    "attribute9",
    "attributeCategory",
    "awtGroupId",
    "awtGroupName",
    "bankChargeBearer",
    "calculateTaxDuringImportFlag",
    "controlAmount",
    "correctionPeriod",
    "correctionYear",
    "customerRegistrationCode",
    "customerRegistrationNumber",
    "deliveryChannelCode",
    "description",
    "documentCategoryCode",
    "documentSubType",
    "exchangeDate",
    "exchangeRate",
    "exchangeRateType",
    "exclusivePaymentFlag",
    "externalBankAccountId",
    "externalDocumentReference",
    "glDate",
    "globalAttribute1",
    "globalAttribute10",
    "globalAttribute11",
    "globalAttribute12",
    "globalAttribute13",
    "globalAttribute14",
    "globalAttribute15",
    "globalAttribute16",
    "globalAttribute17",
    "globalAttribute18",
    "globalAttribute19",
    "globalAttribute2",
    "globalAttribute20",
    "globalAttribute3",
    "globalAttribute4",
    "globalAttribute5",
    "globalAttribute6",
    "globalAttribute7",
    "globalAttribute8",
    "globalAttribute9",
    "globalAttributeCategory",
    "goodsReceivedDate",
    "groupId",
    "importDocumentDate",
    "importDocumentNumber",
    "invoiceAmount",
    "invoiceCurrencyCode",
    "invoiceDate",
    "invoiceId",
    "invoiceIncludesPrepayFlag",
    "invoiceNumber",
    "invoiceReceivedDate",
    "invoiceTypeLookupCode",
    "legalEntityId",
    "legalEntityName",
    "netOfRetainageFlag",
    "noExchangeRateBaseAmount",
    "paidOnBehalfEmployeeId",
    "partyId",
    "partySiteId",
    "payGroupLookupCode",
    "payProcTrxnTypeCode",
    "paymentCrossRate",
    "paymentCrossRateDate",
    "paymentCrossRateType",
    "paymentCurrencyCode",
    "paymentFunction",
    "paymentMethodCode",
    "paymentMethodLookupCode",
    "paymentPriority",
    "paymentReasonCode",
    "paymentReasonComments",
    "poNumber",
    "portOfEntryCode",
    "prepayApplyAmount",
    "prepayGlDate",
    "prepayLineNumber",
    "prepayNumber",
    "productTable",
    "reference1",
    "reference2",
    "referenceKey1",
    "referenceKey2",
    "referenceKey3",
    "referenceKey4",
    "referenceKey5",
    "remittanceMessage1",
    "remittanceMessage2",
    "remittanceMessage3",
    "remitToSupplierName",
    "remitToSupplierId",
    "remitToAddressName",
    "remitToAddressId",
    "relationshipId",
    "remitToSupplierNumber",
    "requesterEmployeeNumber",
    "requesterFirstName",
    "requesterId",
    "requesterLastName",
    "settlementPriority",
    "shipToLocation",
    "supplierTaxExchangeRate",
    "supplierTaxInvoiceDate",
    "supplierTaxInvoiceNumber",
    "taxInvoiceInternalSequence",
    "taxInvoiceRecordingDate",
    "taxRelatedInvoiceId",
    "taxationCountry",
    "termsDate",
    "termsId",
    "termsName",
    "uniqueRemittanceIdentifier",
    "uriCheckDigit",
    "ussglTransactionCode",
    "vendorEmailAddress",
    "voucherNumber",
    "workflowFlag",
    "b2BSiteCode",
    "b2BProgramName",
    "budgetDate",
    "loadRequestId",
    "firstPartyRegistrationId",
    "firstPartyRegistrationNumber",
    "thirdPartyRegistrationId",
    "thirdPartyRegistrationNumber",
    "status",
    "attributeDate1",
    "attributeDate2",
    "attributeDate3",
    "attributeDate4",
    "attributeDate5",
    "attributeNumber1",
    "attributeNumber2",
    "attributeNumber3",
    "attributeNumber4",
    "attributeNumber5",
    "imageDocumentNumber",
    "imageDocumentUri",
    "globalAttributeDate1",
    "globalAttributeDate2",
    "globalAttributeDate3",
    "globalAttributeDate4",
    "globalAttributeDate5",
    "globalAttributeNumber1",
    "globalAttributeNumber2",
    "globalAttributeNumber3",
    "globalAttributeNumber4",
    "globalAttributeNumber5",
    "invoiceInterfaceLine",
    "invoiceHeaderRejection"
})
public class InvoiceInterfaceHeader {

    @XmlElementRef(name = "Source", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> source;
    @XmlElement(name = "OrgId")
    protected BigDecimal orgId;
    @XmlElementRef(name = "OperatingUnit", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operatingUnit;
    @XmlElement(name = "VendorId")
    protected Long vendorId;
    @XmlElementRef(name = "VendorName", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vendorName;
    @XmlElementRef(name = "VendorNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vendorNumber;
    @XmlElementRef(name = "VendorSiteCode", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vendorSiteCode;
    @XmlElement(name = "VendorSiteId")
    protected Long vendorSiteId;
    @XmlElementRef(name = "AcctsPayCodeCombinationId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> acctsPayCodeCombinationId;
    @XmlElementRef(name = "AddTaxToInvoiceAmountFlag", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> addTaxToInvoiceAmountFlag;
    @XmlElementRef(name = "AmountApplicableToDiscount", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> amountApplicableToDiscount;
    @XmlElementRef(name = "ApplicationId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> applicationId;
    @XmlElementRef(name = "ApplyAdvancesFlag", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> applyAdvancesFlag;
    @XmlElementRef(name = "Attribute1", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attribute1;
    @XmlElementRef(name = "Attribute10", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attribute10;
    @XmlElementRef(name = "Attribute11", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attribute11;
    @XmlElementRef(name = "Attribute12", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attribute12;
    @XmlElementRef(name = "Attribute13", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attribute13;
    @XmlElementRef(name = "Attribute14", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attribute14;
    @XmlElementRef(name = "Attribute15", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attribute15;
    @XmlElementRef(name = "Attribute2", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attribute2;
    @XmlElementRef(name = "Attribute3", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attribute3;
    @XmlElementRef(name = "Attribute4", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attribute4;
    @XmlElementRef(name = "Attribute5", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attribute5;
    @XmlElementRef(name = "Attribute6", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attribute6;
    @XmlElementRef(name = "Attribute7", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attribute7;
    @XmlElementRef(name = "Attribute8", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attribute8;
    @XmlElementRef(name = "Attribute9", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attribute9;
    @XmlElementRef(name = "AttributeCategory", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attributeCategory;
    @XmlElementRef(name = "AwtGroupId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> awtGroupId;
    @XmlElementRef(name = "AwtGroupName", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> awtGroupName;
    @XmlElementRef(name = "BankChargeBearer", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankChargeBearer;
    @XmlElementRef(name = "CalculateTaxDuringImportFlag", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> calculateTaxDuringImportFlag;
    @XmlElementRef(name = "ControlAmount", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> controlAmount;
    @XmlElementRef(name = "CorrectionPeriod", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> correctionPeriod;
    @XmlElementRef(name = "CorrectionYear", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> correctionYear;
    @XmlElementRef(name = "CustomerRegistrationCode", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerRegistrationCode;
    @XmlElementRef(name = "CustomerRegistrationNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerRegistrationNumber;
    @XmlElementRef(name = "DeliveryChannelCode", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryChannelCode;
    @XmlElementRef(name = "Description", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "DocumentCategoryCode", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> documentCategoryCode;
    @XmlElementRef(name = "DocumentSubType", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> documentSubType;
    @XmlElementRef(name = "ExchangeDate", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> exchangeDate;
    @XmlElementRef(name = "ExchangeRate", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> exchangeRate;
    @XmlElementRef(name = "ExchangeRateType", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exchangeRateType;
    @XmlElementRef(name = "ExclusivePaymentFlag", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> exclusivePaymentFlag;
    @XmlElementRef(name = "ExternalBankAccountId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> externalBankAccountId;
    @XmlElementRef(name = "ExternalDocumentReference", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> externalDocumentReference;
    @XmlElementRef(name = "GlDate", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> glDate;
    @XmlElementRef(name = "GlobalAttribute1", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> globalAttribute1;
    @XmlElementRef(name = "GlobalAttribute10", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> globalAttribute10;
    @XmlElementRef(name = "GlobalAttribute11", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> globalAttribute11;
    @XmlElementRef(name = "GlobalAttribute12", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> globalAttribute12;
    @XmlElementRef(name = "GlobalAttribute13", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> globalAttribute13;
    @XmlElementRef(name = "GlobalAttribute14", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> globalAttribute14;
    @XmlElementRef(name = "GlobalAttribute15", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> globalAttribute15;
    @XmlElementRef(name = "GlobalAttribute16", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> globalAttribute16;
    @XmlElementRef(name = "GlobalAttribute17", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> globalAttribute17;
    @XmlElementRef(name = "GlobalAttribute18", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> globalAttribute18;
    @XmlElementRef(name = "GlobalAttribute19", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> globalAttribute19;
    @XmlElementRef(name = "GlobalAttribute2", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> globalAttribute2;
    @XmlElementRef(name = "GlobalAttribute20", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> globalAttribute20;
    @XmlElementRef(name = "GlobalAttribute3", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> globalAttribute3;
    @XmlElementRef(name = "GlobalAttribute4", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> globalAttribute4;
    @XmlElementRef(name = "GlobalAttribute5", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> globalAttribute5;
    @XmlElementRef(name = "GlobalAttribute6", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> globalAttribute6;
    @XmlElementRef(name = "GlobalAttribute7", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> globalAttribute7;
    @XmlElementRef(name = "GlobalAttribute8", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> globalAttribute8;
    @XmlElementRef(name = "GlobalAttribute9", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> globalAttribute9;
    @XmlElementRef(name = "GlobalAttributeCategory", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> globalAttributeCategory;
    @XmlElementRef(name = "GoodsReceivedDate", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> goodsReceivedDate;
    @XmlElementRef(name = "GroupId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> groupId;
    @XmlElementRef(name = "ImportDocumentDate", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> importDocumentDate;
    @XmlElementRef(name = "ImportDocumentNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> importDocumentNumber;
    @XmlElement(name = "InvoiceAmount")
    protected AmountType invoiceAmount;
    @XmlElementRef(name = "InvoiceCurrencyCode", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> invoiceCurrencyCode;
    @XmlElementRef(name = "InvoiceDate", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> invoiceDate;
    @XmlElementRef(name = "InvoiceId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> invoiceId;
    @XmlElementRef(name = "InvoiceIncludesPrepayFlag", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> invoiceIncludesPrepayFlag;
    @XmlElement(name = "InvoiceNumber")
    protected String invoiceNumber;
    @XmlElementRef(name = "InvoiceReceivedDate", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> invoiceReceivedDate;
    @XmlElementRef(name = "InvoiceTypeLookupCode", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> invoiceTypeLookupCode;
    @XmlElementRef(name = "LegalEntityId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> legalEntityId;
    @XmlElementRef(name = "LegalEntityName", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> legalEntityName;
    @XmlElementRef(name = "NetOfRetainageFlag", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> netOfRetainageFlag;
    @XmlElementRef(name = "NoExchangeRateBaseAmount", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> noExchangeRateBaseAmount;
    @XmlElementRef(name = "PaidOnBehalfEmployeeId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> paidOnBehalfEmployeeId;
    @XmlElementRef(name = "PartyId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> partyId;
    @XmlElementRef(name = "PartySiteId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> partySiteId;
    @XmlElementRef(name = "PayGroupLookupCode", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payGroupLookupCode;
    @XmlElementRef(name = "PayProcTrxnTypeCode", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payProcTrxnTypeCode;
    @XmlElementRef(name = "PaymentCrossRate", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> paymentCrossRate;
    @XmlElementRef(name = "PaymentCrossRateDate", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> paymentCrossRateDate;
    @XmlElementRef(name = "PaymentCrossRateType", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentCrossRateType;
    @XmlElementRef(name = "PaymentCurrencyCode", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentCurrencyCode;
    @XmlElementRef(name = "PaymentFunction", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentFunction;
    @XmlElementRef(name = "PaymentMethodCode", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentMethodCode;
    @XmlElementRef(name = "PaymentMethodLookupCode", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentMethodLookupCode;
    @XmlElementRef(name = "PaymentPriority", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> paymentPriority;
    @XmlElementRef(name = "PaymentReasonCode", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentReasonCode;
    @XmlElementRef(name = "PaymentReasonComments", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentReasonComments;
    @XmlElementRef(name = "PONumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> poNumber;
    @XmlElementRef(name = "PortOfEntryCode", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> portOfEntryCode;
    @XmlElementRef(name = "PrepayApplyAmount", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> prepayApplyAmount;
    @XmlElementRef(name = "PrepayGlDate", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> prepayGlDate;
    @XmlElementRef(name = "PrepayLineNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> prepayLineNumber;
    @XmlElementRef(name = "PrepayNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prepayNumber;
    @XmlElementRef(name = "ProductTable", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productTable;
    @XmlElementRef(name = "Reference1", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reference1;
    @XmlElementRef(name = "Reference2", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reference2;
    @XmlElementRef(name = "ReferenceKey1", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceKey1;
    @XmlElementRef(name = "ReferenceKey2", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceKey2;
    @XmlElementRef(name = "ReferenceKey3", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceKey3;
    @XmlElementRef(name = "ReferenceKey4", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceKey4;
    @XmlElementRef(name = "ReferenceKey5", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceKey5;
    @XmlElementRef(name = "RemittanceMessage1", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remittanceMessage1;
    @XmlElementRef(name = "RemittanceMessage2", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remittanceMessage2;
    @XmlElementRef(name = "RemittanceMessage3", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remittanceMessage3;
    @XmlElementRef(name = "RemitToSupplierName", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remitToSupplierName;
    @XmlElementRef(name = "RemitToSupplierId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> remitToSupplierId;
    @XmlElementRef(name = "RemitToAddressName", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remitToAddressName;
    @XmlElementRef(name = "RemitToAddressId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> remitToAddressId;
    @XmlElementRef(name = "RelationshipId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> relationshipId;
    @XmlElementRef(name = "RemitToSupplierNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remitToSupplierNumber;
    @XmlElementRef(name = "RequesterEmployeeNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requesterEmployeeNumber;
    @XmlElementRef(name = "RequesterFirstName", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requesterFirstName;
    @XmlElementRef(name = "RequesterId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> requesterId;
    @XmlElementRef(name = "RequesterLastName", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requesterLastName;
    @XmlElementRef(name = "SettlementPriority", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> settlementPriority;
    @XmlElementRef(name = "ShipToLocation", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipToLocation;
    @XmlElementRef(name = "SupplierTaxExchangeRate", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> supplierTaxExchangeRate;
    @XmlElementRef(name = "SupplierTaxInvoiceDate", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> supplierTaxInvoiceDate;
    @XmlElementRef(name = "SupplierTaxInvoiceNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> supplierTaxInvoiceNumber;
    @XmlElementRef(name = "TaxInvoiceInternalSequence", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taxInvoiceInternalSequence;
    @XmlElementRef(name = "TaxInvoiceRecordingDate", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> taxInvoiceRecordingDate;
    @XmlElementRef(name = "TaxRelatedInvoiceId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> taxRelatedInvoiceId;
    @XmlElementRef(name = "TaxationCountry", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taxationCountry;
    @XmlElementRef(name = "TermsDate", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> termsDate;
    @XmlElementRef(name = "TermsId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> termsId;
    @XmlElementRef(name = "TermsName", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> termsName;
    @XmlElementRef(name = "UniqueRemittanceIdentifier", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uniqueRemittanceIdentifier;
    @XmlElementRef(name = "UriCheckDigit", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uriCheckDigit;
    @XmlElementRef(name = "USSGLTransactionCode", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ussglTransactionCode;
    @XmlElementRef(name = "VendorEmailAddress", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vendorEmailAddress;
    @XmlElementRef(name = "VoucherNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> voucherNumber;
    @XmlElementRef(name = "WorkflowFlag", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> workflowFlag;
    @XmlElementRef(name = "B2BSiteCode", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> b2BSiteCode;
    @XmlElementRef(name = "B2BProgramName", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> b2BProgramName;
    @XmlElementRef(name = "BudgetDate", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> budgetDate;
    @XmlElementRef(name = "LoadRequestId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> loadRequestId;
    @XmlElementRef(name = "FirstPartyRegistrationId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> firstPartyRegistrationId;
    @XmlElementRef(name = "FirstPartyRegistrationNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstPartyRegistrationNumber;
    @XmlElementRef(name = "ThirdPartyRegistrationId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> thirdPartyRegistrationId;
    @XmlElementRef(name = "ThirdPartyRegistrationNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> thirdPartyRegistrationNumber;
    @XmlElementRef(name = "Status", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "AttributeDate1", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> attributeDate1;
    @XmlElementRef(name = "AttributeDate2", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> attributeDate2;
    @XmlElementRef(name = "AttributeDate3", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> attributeDate3;
    @XmlElementRef(name = "AttributeDate4", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> attributeDate4;
    @XmlElementRef(name = "AttributeDate5", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> attributeDate5;
    @XmlElementRef(name = "AttributeNumber1", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> attributeNumber1;
    @XmlElementRef(name = "AttributeNumber2", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> attributeNumber2;
    @XmlElementRef(name = "AttributeNumber3", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> attributeNumber3;
    @XmlElementRef(name = "AttributeNumber4", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> attributeNumber4;
    @XmlElementRef(name = "AttributeNumber5", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> attributeNumber5;
    @XmlElementRef(name = "ImageDocumentNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> imageDocumentNumber;
    @XmlElementRef(name = "ImageDocumentUri", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> imageDocumentUri;
    @XmlElementRef(name = "GlobalAttributeDate1", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> globalAttributeDate1;
    @XmlElementRef(name = "GlobalAttributeDate2", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> globalAttributeDate2;
    @XmlElementRef(name = "GlobalAttributeDate3", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> globalAttributeDate3;
    @XmlElementRef(name = "GlobalAttributeDate4", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> globalAttributeDate4;
    @XmlElementRef(name = "GlobalAttributeDate5", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> globalAttributeDate5;
    @XmlElementRef(name = "GlobalAttributeNumber1", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> globalAttributeNumber1;
    @XmlElementRef(name = "GlobalAttributeNumber2", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> globalAttributeNumber2;
    @XmlElementRef(name = "GlobalAttributeNumber3", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> globalAttributeNumber3;
    @XmlElementRef(name = "GlobalAttributeNumber4", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> globalAttributeNumber4;
    @XmlElementRef(name = "GlobalAttributeNumber5", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> globalAttributeNumber5;
    @XmlElement(name = "InvoiceInterfaceLine")
    protected List<InvoiceInterfaceLine> invoiceInterfaceLine;
    @XmlElement(name = "InvoiceHeaderRejection")
    protected List<InvoiceHeaderRejection> invoiceHeaderRejection;

    /**
     * Obtiene el valor de la propiedad source.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSource() {
        return source;
    }

    /**
     * Define el valor de la propiedad source.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSource(JAXBElement<String> value) {
        this.source = value;
    }

    /**
     * Obtiene el valor de la propiedad orgId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrgId() {
        return orgId;
    }

    /**
     * Define el valor de la propiedad orgId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrgId(BigDecimal value) {
        this.orgId = value;
    }

    /**
     * Obtiene el valor de la propiedad operatingUnit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperatingUnit() {
        return operatingUnit;
    }

    /**
     * Define el valor de la propiedad operatingUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperatingUnit(JAXBElement<String> value) {
        this.operatingUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad vendorId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVendorId() {
        return vendorId;
    }

    /**
     * Define el valor de la propiedad vendorId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVendorId(Long value) {
        this.vendorId = value;
    }

    /**
     * Obtiene el valor de la propiedad vendorName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVendorName() {
        return vendorName;
    }

    /**
     * Define el valor de la propiedad vendorName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVendorName(JAXBElement<String> value) {
        this.vendorName = value;
    }

    /**
     * Obtiene el valor de la propiedad vendorNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVendorNumber() {
        return vendorNumber;
    }

    /**
     * Define el valor de la propiedad vendorNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVendorNumber(JAXBElement<String> value) {
        this.vendorNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad vendorSiteCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVendorSiteCode() {
        return vendorSiteCode;
    }

    /**
     * Define el valor de la propiedad vendorSiteCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVendorSiteCode(JAXBElement<String> value) {
        this.vendorSiteCode = value;
    }

    /**
     * Obtiene el valor de la propiedad vendorSiteId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVendorSiteId() {
        return vendorSiteId;
    }

    /**
     * Define el valor de la propiedad vendorSiteId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVendorSiteId(Long value) {
        this.vendorSiteId = value;
    }

    /**
     * Obtiene el valor de la propiedad acctsPayCodeCombinationId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAcctsPayCodeCombinationId() {
        return acctsPayCodeCombinationId;
    }

    /**
     * Define el valor de la propiedad acctsPayCodeCombinationId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAcctsPayCodeCombinationId(JAXBElement<Long> value) {
        this.acctsPayCodeCombinationId = value;
    }

    /**
     * Obtiene el valor de la propiedad addTaxToInvoiceAmountFlag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAddTaxToInvoiceAmountFlag() {
        return addTaxToInvoiceAmountFlag;
    }

    /**
     * Define el valor de la propiedad addTaxToInvoiceAmountFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAddTaxToInvoiceAmountFlag(JAXBElement<Boolean> value) {
        this.addTaxToInvoiceAmountFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad amountApplicableToDiscount.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAmountApplicableToDiscount() {
        return amountApplicableToDiscount;
    }

    /**
     * Define el valor de la propiedad amountApplicableToDiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAmountApplicableToDiscount(JAXBElement<BigDecimal> value) {
        this.amountApplicableToDiscount = value;
    }

    /**
     * Obtiene el valor de la propiedad applicationId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getApplicationId() {
        return applicationId;
    }

    /**
     * Define el valor de la propiedad applicationId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setApplicationId(JAXBElement<Long> value) {
        this.applicationId = value;
    }

    /**
     * Obtiene el valor de la propiedad applyAdvancesFlag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getApplyAdvancesFlag() {
        return applyAdvancesFlag;
    }

    /**
     * Define el valor de la propiedad applyAdvancesFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setApplyAdvancesFlag(JAXBElement<Boolean> value) {
        this.applyAdvancesFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad attribute1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttribute1() {
        return attribute1;
    }

    /**
     * Define el valor de la propiedad attribute1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttribute1(JAXBElement<String> value) {
        this.attribute1 = value;
    }

    /**
     * Obtiene el valor de la propiedad attribute10.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttribute10() {
        return attribute10;
    }

    /**
     * Define el valor de la propiedad attribute10.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttribute10(JAXBElement<String> value) {
        this.attribute10 = value;
    }

    /**
     * Obtiene el valor de la propiedad attribute11.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttribute11() {
        return attribute11;
    }

    /**
     * Define el valor de la propiedad attribute11.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttribute11(JAXBElement<String> value) {
        this.attribute11 = value;
    }

    /**
     * Obtiene el valor de la propiedad attribute12.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttribute12() {
        return attribute12;
    }

    /**
     * Define el valor de la propiedad attribute12.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttribute12(JAXBElement<String> value) {
        this.attribute12 = value;
    }

    /**
     * Obtiene el valor de la propiedad attribute13.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttribute13() {
        return attribute13;
    }

    /**
     * Define el valor de la propiedad attribute13.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttribute13(JAXBElement<String> value) {
        this.attribute13 = value;
    }

    /**
     * Obtiene el valor de la propiedad attribute14.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttribute14() {
        return attribute14;
    }

    /**
     * Define el valor de la propiedad attribute14.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttribute14(JAXBElement<String> value) {
        this.attribute14 = value;
    }

    /**
     * Obtiene el valor de la propiedad attribute15.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttribute15() {
        return attribute15;
    }

    /**
     * Define el valor de la propiedad attribute15.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttribute15(JAXBElement<String> value) {
        this.attribute15 = value;
    }

    /**
     * Obtiene el valor de la propiedad attribute2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttribute2() {
        return attribute2;
    }

    /**
     * Define el valor de la propiedad attribute2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttribute2(JAXBElement<String> value) {
        this.attribute2 = value;
    }

    /**
     * Obtiene el valor de la propiedad attribute3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttribute3() {
        return attribute3;
    }

    /**
     * Define el valor de la propiedad attribute3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttribute3(JAXBElement<String> value) {
        this.attribute3 = value;
    }

    /**
     * Obtiene el valor de la propiedad attribute4.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttribute4() {
        return attribute4;
    }

    /**
     * Define el valor de la propiedad attribute4.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttribute4(JAXBElement<String> value) {
        this.attribute4 = value;
    }

    /**
     * Obtiene el valor de la propiedad attribute5.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttribute5() {
        return attribute5;
    }

    /**
     * Define el valor de la propiedad attribute5.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttribute5(JAXBElement<String> value) {
        this.attribute5 = value;
    }

    /**
     * Obtiene el valor de la propiedad attribute6.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttribute6() {
        return attribute6;
    }

    /**
     * Define el valor de la propiedad attribute6.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttribute6(JAXBElement<String> value) {
        this.attribute6 = value;
    }

    /**
     * Obtiene el valor de la propiedad attribute7.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttribute7() {
        return attribute7;
    }

    /**
     * Define el valor de la propiedad attribute7.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttribute7(JAXBElement<String> value) {
        this.attribute7 = value;
    }

    /**
     * Obtiene el valor de la propiedad attribute8.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttribute8() {
        return attribute8;
    }

    /**
     * Define el valor de la propiedad attribute8.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttribute8(JAXBElement<String> value) {
        this.attribute8 = value;
    }

    /**
     * Obtiene el valor de la propiedad attribute9.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttribute9() {
        return attribute9;
    }

    /**
     * Define el valor de la propiedad attribute9.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttribute9(JAXBElement<String> value) {
        this.attribute9 = value;
    }

    /**
     * Obtiene el valor de la propiedad attributeCategory.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttributeCategory() {
        return attributeCategory;
    }

    /**
     * Define el valor de la propiedad attributeCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttributeCategory(JAXBElement<String> value) {
        this.attributeCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad awtGroupId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAwtGroupId() {
        return awtGroupId;
    }

    /**
     * Define el valor de la propiedad awtGroupId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAwtGroupId(JAXBElement<Long> value) {
        this.awtGroupId = value;
    }

    /**
     * Obtiene el valor de la propiedad awtGroupName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAwtGroupName() {
        return awtGroupName;
    }

    /**
     * Define el valor de la propiedad awtGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAwtGroupName(JAXBElement<String> value) {
        this.awtGroupName = value;
    }

    /**
     * Obtiene el valor de la propiedad bankChargeBearer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankChargeBearer() {
        return bankChargeBearer;
    }

    /**
     * Define el valor de la propiedad bankChargeBearer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankChargeBearer(JAXBElement<String> value) {
        this.bankChargeBearer = value;
    }

    /**
     * Obtiene el valor de la propiedad calculateTaxDuringImportFlag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCalculateTaxDuringImportFlag() {
        return calculateTaxDuringImportFlag;
    }

    /**
     * Define el valor de la propiedad calculateTaxDuringImportFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCalculateTaxDuringImportFlag(JAXBElement<Boolean> value) {
        this.calculateTaxDuringImportFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad controlAmount.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getControlAmount() {
        return controlAmount;
    }

    /**
     * Define el valor de la propiedad controlAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setControlAmount(JAXBElement<AmountType> value) {
        this.controlAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad correctionPeriod.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorrectionPeriod() {
        return correctionPeriod;
    }

    /**
     * Define el valor de la propiedad correctionPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorrectionPeriod(JAXBElement<String> value) {
        this.correctionPeriod = value;
    }

    /**
     * Obtiene el valor de la propiedad correctionYear.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCorrectionYear() {
        return correctionYear;
    }

    /**
     * Define el valor de la propiedad correctionYear.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCorrectionYear(JAXBElement<BigDecimal> value) {
        this.correctionYear = value;
    }

    /**
     * Obtiene el valor de la propiedad customerRegistrationCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerRegistrationCode() {
        return customerRegistrationCode;
    }

    /**
     * Define el valor de la propiedad customerRegistrationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerRegistrationCode(JAXBElement<String> value) {
        this.customerRegistrationCode = value;
    }

    /**
     * Obtiene el valor de la propiedad customerRegistrationNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerRegistrationNumber() {
        return customerRegistrationNumber;
    }

    /**
     * Define el valor de la propiedad customerRegistrationNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerRegistrationNumber(JAXBElement<String> value) {
        this.customerRegistrationNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad deliveryChannelCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryChannelCode() {
        return deliveryChannelCode;
    }

    /**
     * Define el valor de la propiedad deliveryChannelCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryChannelCode(JAXBElement<String> value) {
        this.deliveryChannelCode = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad documentCategoryCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumentCategoryCode() {
        return documentCategoryCode;
    }

    /**
     * Define el valor de la propiedad documentCategoryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumentCategoryCode(JAXBElement<String> value) {
        this.documentCategoryCode = value;
    }

    /**
     * Obtiene el valor de la propiedad documentSubType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumentSubType() {
        return documentSubType;
    }

    /**
     * Define el valor de la propiedad documentSubType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumentSubType(JAXBElement<String> value) {
        this.documentSubType = value;
    }

    /**
     * Obtiene el valor de la propiedad exchangeDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExchangeDate() {
        return exchangeDate;
    }

    /**
     * Define el valor de la propiedad exchangeDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExchangeDate(JAXBElement<XMLGregorianCalendar> value) {
        this.exchangeDate = value;
    }

    /**
     * Obtiene el valor de la propiedad exchangeRate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Define el valor de la propiedad exchangeRate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setExchangeRate(JAXBElement<BigDecimal> value) {
        this.exchangeRate = value;
    }

    /**
     * Obtiene el valor de la propiedad exchangeRateType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExchangeRateType() {
        return exchangeRateType;
    }

    /**
     * Define el valor de la propiedad exchangeRateType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExchangeRateType(JAXBElement<String> value) {
        this.exchangeRateType = value;
    }

    /**
     * Obtiene el valor de la propiedad exclusivePaymentFlag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getExclusivePaymentFlag() {
        return exclusivePaymentFlag;
    }

    /**
     * Define el valor de la propiedad exclusivePaymentFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setExclusivePaymentFlag(JAXBElement<Boolean> value) {
        this.exclusivePaymentFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad externalBankAccountId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getExternalBankAccountId() {
        return externalBankAccountId;
    }

    /**
     * Define el valor de la propiedad externalBankAccountId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setExternalBankAccountId(JAXBElement<Long> value) {
        this.externalBankAccountId = value;
    }

    /**
     * Obtiene el valor de la propiedad externalDocumentReference.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExternalDocumentReference() {
        return externalDocumentReference;
    }

    /**
     * Define el valor de la propiedad externalDocumentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExternalDocumentReference(JAXBElement<String> value) {
        this.externalDocumentReference = value;
    }

    /**
     * Obtiene el valor de la propiedad glDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getGlDate() {
        return glDate;
    }

    /**
     * Define el valor de la propiedad glDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setGlDate(JAXBElement<XMLGregorianCalendar> value) {
        this.glDate = value;
    }

    /**
     * Obtiene el valor de la propiedad globalAttribute1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGlobalAttribute1() {
        return globalAttribute1;
    }

    /**
     * Define el valor de la propiedad globalAttribute1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGlobalAttribute1(JAXBElement<String> value) {
        this.globalAttribute1 = value;
    }

    /**
     * Obtiene el valor de la propiedad globalAttribute10.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGlobalAttribute10() {
        return globalAttribute10;
    }

    /**
     * Define el valor de la propiedad globalAttribute10.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGlobalAttribute10(JAXBElement<String> value) {
        this.globalAttribute10 = value;
    }

    /**
     * Obtiene el valor de la propiedad globalAttribute11.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGlobalAttribute11() {
        return globalAttribute11;
    }

    /**
     * Define el valor de la propiedad globalAttribute11.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGlobalAttribute11(JAXBElement<String> value) {
        this.globalAttribute11 = value;
    }

    /**
     * Obtiene el valor de la propiedad globalAttribute12.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGlobalAttribute12() {
        return globalAttribute12;
    }

    /**
     * Define el valor de la propiedad globalAttribute12.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGlobalAttribute12(JAXBElement<String> value) {
        this.globalAttribute12 = value;
    }

    /**
     * Obtiene el valor de la propiedad globalAttribute13.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGlobalAttribute13() {
        return globalAttribute13;
    }

    /**
     * Define el valor de la propiedad globalAttribute13.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGlobalAttribute13(JAXBElement<String> value) {
        this.globalAttribute13 = value;
    }

    /**
     * Obtiene el valor de la propiedad globalAttribute14.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGlobalAttribute14() {
        return globalAttribute14;
    }

    /**
     * Define el valor de la propiedad globalAttribute14.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGlobalAttribute14(JAXBElement<String> value) {
        this.globalAttribute14 = value;
    }

    /**
     * Obtiene el valor de la propiedad globalAttribute15.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGlobalAttribute15() {
        return globalAttribute15;
    }

    /**
     * Define el valor de la propiedad globalAttribute15.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGlobalAttribute15(JAXBElement<String> value) {
        this.globalAttribute15 = value;
    }

    /**
     * Obtiene el valor de la propiedad globalAttribute16.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGlobalAttribute16() {
        return globalAttribute16;
    }

    /**
     * Define el valor de la propiedad globalAttribute16.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGlobalAttribute16(JAXBElement<String> value) {
        this.globalAttribute16 = value;
    }

    /**
     * Obtiene el valor de la propiedad globalAttribute17.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGlobalAttribute17() {
        return globalAttribute17;
    }

    /**
     * Define el valor de la propiedad globalAttribute17.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGlobalAttribute17(JAXBElement<String> value) {
        this.globalAttribute17 = value;
    }

    /**
     * Obtiene el valor de la propiedad globalAttribute18.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGlobalAttribute18() {
        return globalAttribute18;
    }

    /**
     * Define el valor de la propiedad globalAttribute18.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGlobalAttribute18(JAXBElement<String> value) {
        this.globalAttribute18 = value;
    }

    /**
     * Obtiene el valor de la propiedad globalAttribute19.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGlobalAttribute19() {
        return globalAttribute19;
    }

    /**
     * Define el valor de la propiedad globalAttribute19.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGlobalAttribute19(JAXBElement<String> value) {
        this.globalAttribute19 = value;
    }

    /**
     * Obtiene el valor de la propiedad globalAttribute2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGlobalAttribute2() {
        return globalAttribute2;
    }

    /**
     * Define el valor de la propiedad globalAttribute2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGlobalAttribute2(JAXBElement<String> value) {
        this.globalAttribute2 = value;
    }

    /**
     * Obtiene el valor de la propiedad globalAttribute20.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGlobalAttribute20() {
        return globalAttribute20;
    }

    /**
     * Define el valor de la propiedad globalAttribute20.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGlobalAttribute20(JAXBElement<String> value) {
        this.globalAttribute20 = value;
    }

    /**
     * Obtiene el valor de la propiedad globalAttribute3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGlobalAttribute3() {
        return globalAttribute3;
    }

    /**
     * Define el valor de la propiedad globalAttribute3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGlobalAttribute3(JAXBElement<String> value) {
        this.globalAttribute3 = value;
    }

    /**
     * Obtiene el valor de la propiedad globalAttribute4.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGlobalAttribute4() {
        return globalAttribute4;
    }

    /**
     * Define el valor de la propiedad globalAttribute4.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGlobalAttribute4(JAXBElement<String> value) {
        this.globalAttribute4 = value;
    }

    /**
     * Obtiene el valor de la propiedad globalAttribute5.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGlobalAttribute5() {
        return globalAttribute5;
    }

    /**
     * Define el valor de la propiedad globalAttribute5.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGlobalAttribute5(JAXBElement<String> value) {
        this.globalAttribute5 = value;
    }

    /**
     * Obtiene el valor de la propiedad globalAttribute6.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGlobalAttribute6() {
        return globalAttribute6;
    }

    /**
     * Define el valor de la propiedad globalAttribute6.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGlobalAttribute6(JAXBElement<String> value) {
        this.globalAttribute6 = value;
    }

    /**
     * Obtiene el valor de la propiedad globalAttribute7.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGlobalAttribute7() {
        return globalAttribute7;
    }

    /**
     * Define el valor de la propiedad globalAttribute7.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGlobalAttribute7(JAXBElement<String> value) {
        this.globalAttribute7 = value;
    }

    /**
     * Obtiene el valor de la propiedad globalAttribute8.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGlobalAttribute8() {
        return globalAttribute8;
    }

    /**
     * Define el valor de la propiedad globalAttribute8.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGlobalAttribute8(JAXBElement<String> value) {
        this.globalAttribute8 = value;
    }

    /**
     * Obtiene el valor de la propiedad globalAttribute9.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGlobalAttribute9() {
        return globalAttribute9;
    }

    /**
     * Define el valor de la propiedad globalAttribute9.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGlobalAttribute9(JAXBElement<String> value) {
        this.globalAttribute9 = value;
    }

    /**
     * Obtiene el valor de la propiedad globalAttributeCategory.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGlobalAttributeCategory() {
        return globalAttributeCategory;
    }

    /**
     * Define el valor de la propiedad globalAttributeCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGlobalAttributeCategory(JAXBElement<String> value) {
        this.globalAttributeCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad goodsReceivedDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getGoodsReceivedDate() {
        return goodsReceivedDate;
    }

    /**
     * Define el valor de la propiedad goodsReceivedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setGoodsReceivedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.goodsReceivedDate = value;
    }

    /**
     * Obtiene el valor de la propiedad groupId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGroupId() {
        return groupId;
    }

    /**
     * Define el valor de la propiedad groupId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGroupId(JAXBElement<String> value) {
        this.groupId = value;
    }

    /**
     * Obtiene el valor de la propiedad importDocumentDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getImportDocumentDate() {
        return importDocumentDate;
    }

    /**
     * Define el valor de la propiedad importDocumentDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setImportDocumentDate(JAXBElement<XMLGregorianCalendar> value) {
        this.importDocumentDate = value;
    }

    /**
     * Obtiene el valor de la propiedad importDocumentNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImportDocumentNumber() {
        return importDocumentNumber;
    }

    /**
     * Define el valor de la propiedad importDocumentNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImportDocumentNumber(JAXBElement<String> value) {
        this.importDocumentNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceAmount.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvoiceAmount() {
        return invoiceAmount;
    }

    /**
     * Define el valor de la propiedad invoiceAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvoiceAmount(AmountType value) {
        this.invoiceAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvoiceCurrencyCode() {
        return invoiceCurrencyCode;
    }

    /**
     * Define el valor de la propiedad invoiceCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvoiceCurrencyCode(JAXBElement<String> value) {
        this.invoiceCurrencyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Define el valor de la propiedad invoiceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setInvoiceDate(JAXBElement<XMLGregorianCalendar> value) {
        this.invoiceDate = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInvoiceId() {
        return invoiceId;
    }

    /**
     * Define el valor de la propiedad invoiceId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInvoiceId(JAXBElement<Long> value) {
        this.invoiceId = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceIncludesPrepayFlag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInvoiceIncludesPrepayFlag() {
        return invoiceIncludesPrepayFlag;
    }

    /**
     * Define el valor de la propiedad invoiceIncludesPrepayFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInvoiceIncludesPrepayFlag(JAXBElement<Boolean> value) {
        this.invoiceIncludesPrepayFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Define el valor de la propiedad invoiceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceReceivedDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getInvoiceReceivedDate() {
        return invoiceReceivedDate;
    }

    /**
     * Define el valor de la propiedad invoiceReceivedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setInvoiceReceivedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.invoiceReceivedDate = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceTypeLookupCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvoiceTypeLookupCode() {
        return invoiceTypeLookupCode;
    }

    /**
     * Define el valor de la propiedad invoiceTypeLookupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvoiceTypeLookupCode(JAXBElement<String> value) {
        this.invoiceTypeLookupCode = value;
    }

    /**
     * Obtiene el valor de la propiedad legalEntityId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLegalEntityId() {
        return legalEntityId;
    }

    /**
     * Define el valor de la propiedad legalEntityId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLegalEntityId(JAXBElement<Long> value) {
        this.legalEntityId = value;
    }

    /**
     * Obtiene el valor de la propiedad legalEntityName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLegalEntityName() {
        return legalEntityName;
    }

    /**
     * Define el valor de la propiedad legalEntityName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLegalEntityName(JAXBElement<String> value) {
        this.legalEntityName = value;
    }

    /**
     * Obtiene el valor de la propiedad netOfRetainageFlag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNetOfRetainageFlag() {
        return netOfRetainageFlag;
    }

    /**
     * Define el valor de la propiedad netOfRetainageFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNetOfRetainageFlag(JAXBElement<Boolean> value) {
        this.netOfRetainageFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad noExchangeRateBaseAmount.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getNoExchangeRateBaseAmount() {
        return noExchangeRateBaseAmount;
    }

    /**
     * Define el valor de la propiedad noExchangeRateBaseAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setNoExchangeRateBaseAmount(JAXBElement<AmountType> value) {
        this.noExchangeRateBaseAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad paidOnBehalfEmployeeId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPaidOnBehalfEmployeeId() {
        return paidOnBehalfEmployeeId;
    }

    /**
     * Define el valor de la propiedad paidOnBehalfEmployeeId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPaidOnBehalfEmployeeId(JAXBElement<Long> value) {
        this.paidOnBehalfEmployeeId = value;
    }

    /**
     * Obtiene el valor de la propiedad partyId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPartyId() {
        return partyId;
    }

    /**
     * Define el valor de la propiedad partyId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPartyId(JAXBElement<Long> value) {
        this.partyId = value;
    }

    /**
     * Obtiene el valor de la propiedad partySiteId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPartySiteId() {
        return partySiteId;
    }

    /**
     * Define el valor de la propiedad partySiteId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPartySiteId(JAXBElement<Long> value) {
        this.partySiteId = value;
    }

    /**
     * Obtiene el valor de la propiedad payGroupLookupCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayGroupLookupCode() {
        return payGroupLookupCode;
    }

    /**
     * Define el valor de la propiedad payGroupLookupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayGroupLookupCode(JAXBElement<String> value) {
        this.payGroupLookupCode = value;
    }

    /**
     * Obtiene el valor de la propiedad payProcTrxnTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayProcTrxnTypeCode() {
        return payProcTrxnTypeCode;
    }

    /**
     * Define el valor de la propiedad payProcTrxnTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayProcTrxnTypeCode(JAXBElement<String> value) {
        this.payProcTrxnTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentCrossRate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPaymentCrossRate() {
        return paymentCrossRate;
    }

    /**
     * Define el valor de la propiedad paymentCrossRate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPaymentCrossRate(JAXBElement<BigDecimal> value) {
        this.paymentCrossRate = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentCrossRateDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPaymentCrossRateDate() {
        return paymentCrossRateDate;
    }

    /**
     * Define el valor de la propiedad paymentCrossRateDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPaymentCrossRateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.paymentCrossRateDate = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentCrossRateType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentCrossRateType() {
        return paymentCrossRateType;
    }

    /**
     * Define el valor de la propiedad paymentCrossRateType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentCrossRateType(JAXBElement<String> value) {
        this.paymentCrossRateType = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentCurrencyCode() {
        return paymentCurrencyCode;
    }

    /**
     * Define el valor de la propiedad paymentCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentCurrencyCode(JAXBElement<String> value) {
        this.paymentCurrencyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentFunction.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentFunction() {
        return paymentFunction;
    }

    /**
     * Define el valor de la propiedad paymentFunction.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentFunction(JAXBElement<String> value) {
        this.paymentFunction = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentMethodCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentMethodCode() {
        return paymentMethodCode;
    }

    /**
     * Define el valor de la propiedad paymentMethodCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentMethodCode(JAXBElement<String> value) {
        this.paymentMethodCode = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentMethodLookupCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentMethodLookupCode() {
        return paymentMethodLookupCode;
    }

    /**
     * Define el valor de la propiedad paymentMethodLookupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentMethodLookupCode(JAXBElement<String> value) {
        this.paymentMethodLookupCode = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentPriority.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPaymentPriority() {
        return paymentPriority;
    }

    /**
     * Define el valor de la propiedad paymentPriority.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPaymentPriority(JAXBElement<Integer> value) {
        this.paymentPriority = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentReasonCode() {
        return paymentReasonCode;
    }

    /**
     * Define el valor de la propiedad paymentReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentReasonCode(JAXBElement<String> value) {
        this.paymentReasonCode = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentReasonComments.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentReasonComments() {
        return paymentReasonComments;
    }

    /**
     * Define el valor de la propiedad paymentReasonComments.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentReasonComments(JAXBElement<String> value) {
        this.paymentReasonComments = value;
    }

    /**
     * Obtiene el valor de la propiedad poNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPONumber() {
        return poNumber;
    }

    /**
     * Define el valor de la propiedad poNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPONumber(JAXBElement<String> value) {
        this.poNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad portOfEntryCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPortOfEntryCode() {
        return portOfEntryCode;
    }

    /**
     * Define el valor de la propiedad portOfEntryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPortOfEntryCode(JAXBElement<String> value) {
        this.portOfEntryCode = value;
    }

    /**
     * Obtiene el valor de la propiedad prepayApplyAmount.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getPrepayApplyAmount() {
        return prepayApplyAmount;
    }

    /**
     * Define el valor de la propiedad prepayApplyAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setPrepayApplyAmount(JAXBElement<AmountType> value) {
        this.prepayApplyAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad prepayGlDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPrepayGlDate() {
        return prepayGlDate;
    }

    /**
     * Define el valor de la propiedad prepayGlDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPrepayGlDate(JAXBElement<XMLGregorianCalendar> value) {
        this.prepayGlDate = value;
    }

    /**
     * Obtiene el valor de la propiedad prepayLineNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrepayLineNumber() {
        return prepayLineNumber;
    }

    /**
     * Define el valor de la propiedad prepayLineNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrepayLineNumber(JAXBElement<Integer> value) {
        this.prepayLineNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad prepayNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrepayNumber() {
        return prepayNumber;
    }

    /**
     * Define el valor de la propiedad prepayNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrepayNumber(JAXBElement<String> value) {
        this.prepayNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad productTable.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductTable() {
        return productTable;
    }

    /**
     * Define el valor de la propiedad productTable.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductTable(JAXBElement<String> value) {
        this.productTable = value;
    }

    /**
     * Obtiene el valor de la propiedad reference1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReference1() {
        return reference1;
    }

    /**
     * Define el valor de la propiedad reference1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReference1(JAXBElement<String> value) {
        this.reference1 = value;
    }

    /**
     * Obtiene el valor de la propiedad reference2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReference2() {
        return reference2;
    }

    /**
     * Define el valor de la propiedad reference2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReference2(JAXBElement<String> value) {
        this.reference2 = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceKey1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenceKey1() {
        return referenceKey1;
    }

    /**
     * Define el valor de la propiedad referenceKey1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenceKey1(JAXBElement<String> value) {
        this.referenceKey1 = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceKey2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenceKey2() {
        return referenceKey2;
    }

    /**
     * Define el valor de la propiedad referenceKey2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenceKey2(JAXBElement<String> value) {
        this.referenceKey2 = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceKey3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenceKey3() {
        return referenceKey3;
    }

    /**
     * Define el valor de la propiedad referenceKey3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenceKey3(JAXBElement<String> value) {
        this.referenceKey3 = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceKey4.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenceKey4() {
        return referenceKey4;
    }

    /**
     * Define el valor de la propiedad referenceKey4.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenceKey4(JAXBElement<String> value) {
        this.referenceKey4 = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceKey5.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenceKey5() {
        return referenceKey5;
    }

    /**
     * Define el valor de la propiedad referenceKey5.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenceKey5(JAXBElement<String> value) {
        this.referenceKey5 = value;
    }

    /**
     * Obtiene el valor de la propiedad remittanceMessage1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemittanceMessage1() {
        return remittanceMessage1;
    }

    /**
     * Define el valor de la propiedad remittanceMessage1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemittanceMessage1(JAXBElement<String> value) {
        this.remittanceMessage1 = value;
    }

    /**
     * Obtiene el valor de la propiedad remittanceMessage2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemittanceMessage2() {
        return remittanceMessage2;
    }

    /**
     * Define el valor de la propiedad remittanceMessage2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemittanceMessage2(JAXBElement<String> value) {
        this.remittanceMessage2 = value;
    }

    /**
     * Obtiene el valor de la propiedad remittanceMessage3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemittanceMessage3() {
        return remittanceMessage3;
    }

    /**
     * Define el valor de la propiedad remittanceMessage3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemittanceMessage3(JAXBElement<String> value) {
        this.remittanceMessage3 = value;
    }

    /**
     * Obtiene el valor de la propiedad remitToSupplierName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemitToSupplierName() {
        return remitToSupplierName;
    }

    /**
     * Define el valor de la propiedad remitToSupplierName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemitToSupplierName(JAXBElement<String> value) {
        this.remitToSupplierName = value;
    }

    /**
     * Obtiene el valor de la propiedad remitToSupplierId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRemitToSupplierId() {
        return remitToSupplierId;
    }

    /**
     * Define el valor de la propiedad remitToSupplierId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRemitToSupplierId(JAXBElement<Long> value) {
        this.remitToSupplierId = value;
    }

    /**
     * Obtiene el valor de la propiedad remitToAddressName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemitToAddressName() {
        return remitToAddressName;
    }

    /**
     * Define el valor de la propiedad remitToAddressName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemitToAddressName(JAXBElement<String> value) {
        this.remitToAddressName = value;
    }

    /**
     * Obtiene el valor de la propiedad remitToAddressId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRemitToAddressId() {
        return remitToAddressId;
    }

    /**
     * Define el valor de la propiedad remitToAddressId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRemitToAddressId(JAXBElement<Long> value) {
        this.remitToAddressId = value;
    }

    /**
     * Obtiene el valor de la propiedad relationshipId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRelationshipId() {
        return relationshipId;
    }

    /**
     * Define el valor de la propiedad relationshipId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRelationshipId(JAXBElement<Long> value) {
        this.relationshipId = value;
    }

    /**
     * Obtiene el valor de la propiedad remitToSupplierNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemitToSupplierNumber() {
        return remitToSupplierNumber;
    }

    /**
     * Define el valor de la propiedad remitToSupplierNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemitToSupplierNumber(JAXBElement<String> value) {
        this.remitToSupplierNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad requesterEmployeeNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequesterEmployeeNumber() {
        return requesterEmployeeNumber;
    }

    /**
     * Define el valor de la propiedad requesterEmployeeNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequesterEmployeeNumber(JAXBElement<String> value) {
        this.requesterEmployeeNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad requesterFirstName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequesterFirstName() {
        return requesterFirstName;
    }

    /**
     * Define el valor de la propiedad requesterFirstName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequesterFirstName(JAXBElement<String> value) {
        this.requesterFirstName = value;
    }

    /**
     * Obtiene el valor de la propiedad requesterId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRequesterId() {
        return requesterId;
    }

    /**
     * Define el valor de la propiedad requesterId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRequesterId(JAXBElement<Long> value) {
        this.requesterId = value;
    }

    /**
     * Obtiene el valor de la propiedad requesterLastName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequesterLastName() {
        return requesterLastName;
    }

    /**
     * Define el valor de la propiedad requesterLastName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequesterLastName(JAXBElement<String> value) {
        this.requesterLastName = value;
    }

    /**
     * Obtiene el valor de la propiedad settlementPriority.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSettlementPriority() {
        return settlementPriority;
    }

    /**
     * Define el valor de la propiedad settlementPriority.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSettlementPriority(JAXBElement<String> value) {
        this.settlementPriority = value;
    }

    /**
     * Obtiene el valor de la propiedad shipToLocation.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipToLocation() {
        return shipToLocation;
    }

    /**
     * Define el valor de la propiedad shipToLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipToLocation(JAXBElement<String> value) {
        this.shipToLocation = value;
    }

    /**
     * Obtiene el valor de la propiedad supplierTaxExchangeRate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSupplierTaxExchangeRate() {
        return supplierTaxExchangeRate;
    }

    /**
     * Define el valor de la propiedad supplierTaxExchangeRate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSupplierTaxExchangeRate(JAXBElement<BigDecimal> value) {
        this.supplierTaxExchangeRate = value;
    }

    /**
     * Obtiene el valor de la propiedad supplierTaxInvoiceDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSupplierTaxInvoiceDate() {
        return supplierTaxInvoiceDate;
    }

    /**
     * Define el valor de la propiedad supplierTaxInvoiceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSupplierTaxInvoiceDate(JAXBElement<XMLGregorianCalendar> value) {
        this.supplierTaxInvoiceDate = value;
    }

    /**
     * Obtiene el valor de la propiedad supplierTaxInvoiceNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSupplierTaxInvoiceNumber() {
        return supplierTaxInvoiceNumber;
    }

    /**
     * Define el valor de la propiedad supplierTaxInvoiceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSupplierTaxInvoiceNumber(JAXBElement<String> value) {
        this.supplierTaxInvoiceNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad taxInvoiceInternalSequence.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxInvoiceInternalSequence() {
        return taxInvoiceInternalSequence;
    }

    /**
     * Define el valor de la propiedad taxInvoiceInternalSequence.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxInvoiceInternalSequence(JAXBElement<String> value) {
        this.taxInvoiceInternalSequence = value;
    }

    /**
     * Obtiene el valor de la propiedad taxInvoiceRecordingDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTaxInvoiceRecordingDate() {
        return taxInvoiceRecordingDate;
    }

    /**
     * Define el valor de la propiedad taxInvoiceRecordingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTaxInvoiceRecordingDate(JAXBElement<XMLGregorianCalendar> value) {
        this.taxInvoiceRecordingDate = value;
    }

    /**
     * Obtiene el valor de la propiedad taxRelatedInvoiceId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTaxRelatedInvoiceId() {
        return taxRelatedInvoiceId;
    }

    /**
     * Define el valor de la propiedad taxRelatedInvoiceId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTaxRelatedInvoiceId(JAXBElement<Long> value) {
        this.taxRelatedInvoiceId = value;
    }

    /**
     * Obtiene el valor de la propiedad taxationCountry.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxationCountry() {
        return taxationCountry;
    }

    /**
     * Define el valor de la propiedad taxationCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxationCountry(JAXBElement<String> value) {
        this.taxationCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad termsDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTermsDate() {
        return termsDate;
    }

    /**
     * Define el valor de la propiedad termsDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTermsDate(JAXBElement<XMLGregorianCalendar> value) {
        this.termsDate = value;
    }

    /**
     * Obtiene el valor de la propiedad termsId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTermsId() {
        return termsId;
    }

    /**
     * Define el valor de la propiedad termsId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTermsId(JAXBElement<Long> value) {
        this.termsId = value;
    }

    /**
     * Obtiene el valor de la propiedad termsName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTermsName() {
        return termsName;
    }

    /**
     * Define el valor de la propiedad termsName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTermsName(JAXBElement<String> value) {
        this.termsName = value;
    }

    /**
     * Obtiene el valor de la propiedad uniqueRemittanceIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUniqueRemittanceIdentifier() {
        return uniqueRemittanceIdentifier;
    }

    /**
     * Define el valor de la propiedad uniqueRemittanceIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUniqueRemittanceIdentifier(JAXBElement<String> value) {
        this.uniqueRemittanceIdentifier = value;
    }

    /**
     * Obtiene el valor de la propiedad uriCheckDigit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUriCheckDigit() {
        return uriCheckDigit;
    }

    /**
     * Define el valor de la propiedad uriCheckDigit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUriCheckDigit(JAXBElement<String> value) {
        this.uriCheckDigit = value;
    }

    /**
     * Obtiene el valor de la propiedad ussglTransactionCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUSSGLTransactionCode() {
        return ussglTransactionCode;
    }

    /**
     * Define el valor de la propiedad ussglTransactionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUSSGLTransactionCode(JAXBElement<String> value) {
        this.ussglTransactionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad vendorEmailAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVendorEmailAddress() {
        return vendorEmailAddress;
    }

    /**
     * Define el valor de la propiedad vendorEmailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVendorEmailAddress(JAXBElement<String> value) {
        this.vendorEmailAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad voucherNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVoucherNumber() {
        return voucherNumber;
    }

    /**
     * Define el valor de la propiedad voucherNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVoucherNumber(JAXBElement<String> value) {
        this.voucherNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad workflowFlag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getWorkflowFlag() {
        return workflowFlag;
    }

    /**
     * Define el valor de la propiedad workflowFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setWorkflowFlag(JAXBElement<Boolean> value) {
        this.workflowFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad b2BSiteCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getB2BSiteCode() {
        return b2BSiteCode;
    }

    /**
     * Define el valor de la propiedad b2BSiteCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setB2BSiteCode(JAXBElement<String> value) {
        this.b2BSiteCode = value;
    }

    /**
     * Obtiene el valor de la propiedad b2BProgramName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getB2BProgramName() {
        return b2BProgramName;
    }

    /**
     * Define el valor de la propiedad b2BProgramName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setB2BProgramName(JAXBElement<String> value) {
        this.b2BProgramName = value;
    }

    /**
     * Obtiene el valor de la propiedad budgetDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBudgetDate() {
        return budgetDate;
    }

    /**
     * Define el valor de la propiedad budgetDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBudgetDate(JAXBElement<XMLGregorianCalendar> value) {
        this.budgetDate = value;
    }

    /**
     * Obtiene el valor de la propiedad loadRequestId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLoadRequestId() {
        return loadRequestId;
    }

    /**
     * Define el valor de la propiedad loadRequestId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLoadRequestId(JAXBElement<Long> value) {
        this.loadRequestId = value;
    }

    /**
     * Obtiene el valor de la propiedad firstPartyRegistrationId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getFirstPartyRegistrationId() {
        return firstPartyRegistrationId;
    }

    /**
     * Define el valor de la propiedad firstPartyRegistrationId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setFirstPartyRegistrationId(JAXBElement<Long> value) {
        this.firstPartyRegistrationId = value;
    }

    /**
     * Obtiene el valor de la propiedad firstPartyRegistrationNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstPartyRegistrationNumber() {
        return firstPartyRegistrationNumber;
    }

    /**
     * Define el valor de la propiedad firstPartyRegistrationNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstPartyRegistrationNumber(JAXBElement<String> value) {
        this.firstPartyRegistrationNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad thirdPartyRegistrationId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getThirdPartyRegistrationId() {
        return thirdPartyRegistrationId;
    }

    /**
     * Define el valor de la propiedad thirdPartyRegistrationId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setThirdPartyRegistrationId(JAXBElement<Long> value) {
        this.thirdPartyRegistrationId = value;
    }

    /**
     * Obtiene el valor de la propiedad thirdPartyRegistrationNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getThirdPartyRegistrationNumber() {
        return thirdPartyRegistrationNumber;
    }

    /**
     * Define el valor de la propiedad thirdPartyRegistrationNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setThirdPartyRegistrationNumber(JAXBElement<String> value) {
        this.thirdPartyRegistrationNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad attributeDate1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAttributeDate1() {
        return attributeDate1;
    }

    /**
     * Define el valor de la propiedad attributeDate1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAttributeDate1(JAXBElement<XMLGregorianCalendar> value) {
        this.attributeDate1 = value;
    }

    /**
     * Obtiene el valor de la propiedad attributeDate2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAttributeDate2() {
        return attributeDate2;
    }

    /**
     * Define el valor de la propiedad attributeDate2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAttributeDate2(JAXBElement<XMLGregorianCalendar> value) {
        this.attributeDate2 = value;
    }

    /**
     * Obtiene el valor de la propiedad attributeDate3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAttributeDate3() {
        return attributeDate3;
    }

    /**
     * Define el valor de la propiedad attributeDate3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAttributeDate3(JAXBElement<XMLGregorianCalendar> value) {
        this.attributeDate3 = value;
    }

    /**
     * Obtiene el valor de la propiedad attributeDate4.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAttributeDate4() {
        return attributeDate4;
    }

    /**
     * Define el valor de la propiedad attributeDate4.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAttributeDate4(JAXBElement<XMLGregorianCalendar> value) {
        this.attributeDate4 = value;
    }

    /**
     * Obtiene el valor de la propiedad attributeDate5.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAttributeDate5() {
        return attributeDate5;
    }

    /**
     * Define el valor de la propiedad attributeDate5.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAttributeDate5(JAXBElement<XMLGregorianCalendar> value) {
        this.attributeDate5 = value;
    }

    /**
     * Obtiene el valor de la propiedad attributeNumber1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAttributeNumber1() {
        return attributeNumber1;
    }

    /**
     * Define el valor de la propiedad attributeNumber1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAttributeNumber1(JAXBElement<BigDecimal> value) {
        this.attributeNumber1 = value;
    }

    /**
     * Obtiene el valor de la propiedad attributeNumber2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAttributeNumber2() {
        return attributeNumber2;
    }

    /**
     * Define el valor de la propiedad attributeNumber2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAttributeNumber2(JAXBElement<BigDecimal> value) {
        this.attributeNumber2 = value;
    }

    /**
     * Obtiene el valor de la propiedad attributeNumber3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAttributeNumber3() {
        return attributeNumber3;
    }

    /**
     * Define el valor de la propiedad attributeNumber3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAttributeNumber3(JAXBElement<BigDecimal> value) {
        this.attributeNumber3 = value;
    }

    /**
     * Obtiene el valor de la propiedad attributeNumber4.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAttributeNumber4() {
        return attributeNumber4;
    }

    /**
     * Define el valor de la propiedad attributeNumber4.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAttributeNumber4(JAXBElement<BigDecimal> value) {
        this.attributeNumber4 = value;
    }

    /**
     * Obtiene el valor de la propiedad attributeNumber5.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAttributeNumber5() {
        return attributeNumber5;
    }

    /**
     * Define el valor de la propiedad attributeNumber5.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAttributeNumber5(JAXBElement<BigDecimal> value) {
        this.attributeNumber5 = value;
    }

    /**
     * Obtiene el valor de la propiedad imageDocumentNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImageDocumentNumber() {
        return imageDocumentNumber;
    }

    /**
     * Define el valor de la propiedad imageDocumentNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImageDocumentNumber(JAXBElement<String> value) {
        this.imageDocumentNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad imageDocumentUri.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImageDocumentUri() {
        return imageDocumentUri;
    }

    /**
     * Define el valor de la propiedad imageDocumentUri.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImageDocumentUri(JAXBElement<String> value) {
        this.imageDocumentUri = value;
    }

    /**
     * Obtiene el valor de la propiedad globalAttributeDate1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getGlobalAttributeDate1() {
        return globalAttributeDate1;
    }

    /**
     * Define el valor de la propiedad globalAttributeDate1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setGlobalAttributeDate1(JAXBElement<XMLGregorianCalendar> value) {
        this.globalAttributeDate1 = value;
    }

    /**
     * Obtiene el valor de la propiedad globalAttributeDate2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getGlobalAttributeDate2() {
        return globalAttributeDate2;
    }

    /**
     * Define el valor de la propiedad globalAttributeDate2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setGlobalAttributeDate2(JAXBElement<XMLGregorianCalendar> value) {
        this.globalAttributeDate2 = value;
    }

    /**
     * Obtiene el valor de la propiedad globalAttributeDate3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getGlobalAttributeDate3() {
        return globalAttributeDate3;
    }

    /**
     * Define el valor de la propiedad globalAttributeDate3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setGlobalAttributeDate3(JAXBElement<XMLGregorianCalendar> value) {
        this.globalAttributeDate3 = value;
    }

    /**
     * Obtiene el valor de la propiedad globalAttributeDate4.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getGlobalAttributeDate4() {
        return globalAttributeDate4;
    }

    /**
     * Define el valor de la propiedad globalAttributeDate4.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setGlobalAttributeDate4(JAXBElement<XMLGregorianCalendar> value) {
        this.globalAttributeDate4 = value;
    }

    /**
     * Obtiene el valor de la propiedad globalAttributeDate5.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getGlobalAttributeDate5() {
        return globalAttributeDate5;
    }

    /**
     * Define el valor de la propiedad globalAttributeDate5.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setGlobalAttributeDate5(JAXBElement<XMLGregorianCalendar> value) {
        this.globalAttributeDate5 = value;
    }

    /**
     * Obtiene el valor de la propiedad globalAttributeNumber1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getGlobalAttributeNumber1() {
        return globalAttributeNumber1;
    }

    /**
     * Define el valor de la propiedad globalAttributeNumber1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setGlobalAttributeNumber1(JAXBElement<BigDecimal> value) {
        this.globalAttributeNumber1 = value;
    }

    /**
     * Obtiene el valor de la propiedad globalAttributeNumber2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getGlobalAttributeNumber2() {
        return globalAttributeNumber2;
    }

    /**
     * Define el valor de la propiedad globalAttributeNumber2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setGlobalAttributeNumber2(JAXBElement<BigDecimal> value) {
        this.globalAttributeNumber2 = value;
    }

    /**
     * Obtiene el valor de la propiedad globalAttributeNumber3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getGlobalAttributeNumber3() {
        return globalAttributeNumber3;
    }

    /**
     * Define el valor de la propiedad globalAttributeNumber3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setGlobalAttributeNumber3(JAXBElement<BigDecimal> value) {
        this.globalAttributeNumber3 = value;
    }

    /**
     * Obtiene el valor de la propiedad globalAttributeNumber4.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getGlobalAttributeNumber4() {
        return globalAttributeNumber4;
    }

    /**
     * Define el valor de la propiedad globalAttributeNumber4.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setGlobalAttributeNumber4(JAXBElement<BigDecimal> value) {
        this.globalAttributeNumber4 = value;
    }

    /**
     * Obtiene el valor de la propiedad globalAttributeNumber5.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getGlobalAttributeNumber5() {
        return globalAttributeNumber5;
    }

    /**
     * Define el valor de la propiedad globalAttributeNumber5.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setGlobalAttributeNumber5(JAXBElement<BigDecimal> value) {
        this.globalAttributeNumber5 = value;
    }

    /**
     * Gets the value of the invoiceInterfaceLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceInterfaceLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceInterfaceLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceInterfaceLine }
     * 
     * 
     */
    public List<InvoiceInterfaceLine> getInvoiceInterfaceLine() {
        if (invoiceInterfaceLine == null) {
            invoiceInterfaceLine = new ArrayList<InvoiceInterfaceLine>();
        }
        return this.invoiceInterfaceLine;
    }

    /**
     * Gets the value of the invoiceHeaderRejection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceHeaderRejection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceHeaderRejection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceHeaderRejection }
     * 
     * 
     */
    public List<InvoiceHeaderRejection> getInvoiceHeaderRejection() {
        if (invoiceHeaderRejection == null) {
            invoiceHeaderRejection = new ArrayList<InvoiceHeaderRejection>();
        }
        return this.invoiceHeaderRejection;
    }

}
