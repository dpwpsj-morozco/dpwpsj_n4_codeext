
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
import com.oracle.xmlns.adf.svc.types.MeasureType;


/**
 * <p>Clase Java para InvoiceInterfaceLine complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvoiceInterfaceLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountSegment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountingDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="ApplicationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AssessableValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AssetBookTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssetCategoryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AssetsTrackingFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
 *         &lt;element name="AwardId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AwtGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AwtGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BalancingSegment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ControlAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="CostCenterSegment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CostFactorId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CostFactorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardTrxId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DefAcctgEndDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="DefAcctgNumberOfPeriods" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DefAcctgPeriodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefAcctgStartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="DefaultDistCcid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DeferredAccountingFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DistCodeCombinationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DistCodeConcatenated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DistributionSetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DistributionSetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpenditureItemDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ExpenditureOrganizationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ExpenditureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalDocumentLineReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FinalMatchFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
 *         &lt;element name="IncludedInTaxableLineFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncomeTaxRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InventoryItemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="InvoiceLineId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ItemDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineGroupNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LineTypeLookupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MatchOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModelNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrgId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ProjectBillableFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProjectCapitalizableFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProjectContextCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectContractId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProjectContractLineId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProjectExpenditureItemDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ProjectExpenditureTypeId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProjectFundingAllocationId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProjectOrganizationId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProjectProjectId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProjectReservedAttribute1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectReservedAttribute10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectReservedAttribute2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectReservedAttribute3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectReservedAttribute4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectReservedAttribute5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectReservedAttribute6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectReservedAttribute7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectReservedAttribute8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectReservedAttribute9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectTaskId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProjectUserDefineAttribute1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectUserDefineAttribute10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectUserDefineAttribute2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectUserDefineAttribute3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectUserDefineAttribute4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectUserDefineAttribute5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectUserDefineAttribute6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectUserDefineAttribute7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectUserDefineAttribute8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectUserDefineAttribute9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectWorkTypeId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PaAdditionFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PaCcArInvoiceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PaCcArInvoiceLineNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaCcProcessedCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaQuantity" type="{http://xmlns.oracle.com/adf/svc/types/}MeasureType" minOccurs="0"/>
 *         &lt;element name="PackingSlip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POHeaderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PONumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POLineId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="POLineNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="POLineLocationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="POShipmentNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PODistributionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PODistributionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="POReleaseId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PriceCorrectInvoiceLineNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PriceCorrectInvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceCorrectionFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrimaryIntendedUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductFiscClassification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductTable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ProrateAcrossFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PurchasingCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurchasingCategoryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="InvoicedQuantity" type="{http://xmlns.oracle.com/adf/svc/types/}MeasureType" minOccurs="0"/>
 *         &lt;element name="RcvTransactionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ReceiptLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceiptNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reference1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reference2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenceKey1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenceKey2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenceKey3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenceKey4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenceKey5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReleaseNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RequesterEmployeeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequesterFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequesterId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RequesterLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToLocationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SourceApplicationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SourceEntityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceEventClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceLineId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SourceTrxId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SourceTrxLevelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatisticalAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="TaskId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxClassificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxCodeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TaxJurisdictionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaxRateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxRateId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TaxRegimeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxableFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TrxBusinessCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type1099" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitOfMeasLookupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitPrice" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="UserDefinedFiscClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USSGLTransactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorItemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarrantyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BudgetDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ConsumptionAdviceHeaderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ConsumptionAdviceLineId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ConsumptionAdviceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsumptionAdviceLineNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ShipFromLocationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ShipFromLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FinalDischargeLocationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FinalDischargeLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PjcExpenditureTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PjcOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PjcProjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PjcTaskNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PjcProjectNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PjcTaskName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PjcWorkType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PjcContractName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PjcContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PjcFundingSourceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PjcFundingSourceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefAcctgAccrualCcid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DefAccrualCodeConcatenated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceLineRejection" type="{http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/}InvoiceLineRejection" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceInterfaceLine", propOrder = {
    "accountSegment",
    "accountingDate",
    "amount",
    "applicationId",
    "assessableValue",
    "assetBookTypeCode",
    "assetCategoryId",
    "assetsTrackingFlag",
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
    "awardId",
    "awtGroupId",
    "awtGroupName",
    "balancingSegment",
    "controlAmount",
    "costCenterSegment",
    "costFactorId",
    "costFactorName",
    "creditCardTrxId",
    "defAcctgEndDate",
    "defAcctgNumberOfPeriods",
    "defAcctgPeriodType",
    "defAcctgStartDate",
    "defaultDistCcid",
    "deferredAccountingFlag",
    "description",
    "distCodeCombinationId",
    "distCodeConcatenated",
    "distributionSetId",
    "distributionSetName",
    "expenditureItemDate",
    "expenditureOrganizationId",
    "expenditureType",
    "externalDocumentLineReference",
    "finalMatchFlag",
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
    "includedInTaxableLineFlag",
    "incomeTaxRegion",
    "inventoryItemId",
    "invoiceLineId",
    "itemDescription",
    "lineGroupNumber",
    "lineNumber",
    "lineTypeLookupCode",
    "manufacturer",
    "matchOption",
    "modelNumber",
    "orgId",
    "projectBillableFlag",
    "projectCapitalizableFlag",
    "projectContextCategory",
    "projectContractId",
    "projectContractLineId",
    "projectExpenditureItemDate",
    "projectExpenditureTypeId",
    "projectFundingAllocationId",
    "projectOrganizationId",
    "projectProjectId",
    "projectReservedAttribute1",
    "projectReservedAttribute10",
    "projectReservedAttribute2",
    "projectReservedAttribute3",
    "projectReservedAttribute4",
    "projectReservedAttribute5",
    "projectReservedAttribute6",
    "projectReservedAttribute7",
    "projectReservedAttribute8",
    "projectReservedAttribute9",
    "projectTaskId",
    "projectUserDefineAttribute1",
    "projectUserDefineAttribute10",
    "projectUserDefineAttribute2",
    "projectUserDefineAttribute3",
    "projectUserDefineAttribute4",
    "projectUserDefineAttribute5",
    "projectUserDefineAttribute6",
    "projectUserDefineAttribute7",
    "projectUserDefineAttribute8",
    "projectUserDefineAttribute9",
    "projectWorkTypeId",
    "paAdditionFlag",
    "paCcArInvoiceId",
    "paCcArInvoiceLineNumber",
    "paCcProcessedCode",
    "paQuantity",
    "packingSlip",
    "poHeaderId",
    "poNumber",
    "poLineId",
    "poLineNumber",
    "poLineLocationId",
    "poShipmentNumber",
    "poDistributionId",
    "poDistributionNumber",
    "poReleaseId",
    "priceCorrectInvoiceLineNumber",
    "priceCorrectInvoiceNumber",
    "priceCorrectionFlag",
    "primaryIntendedUse",
    "productCategory",
    "productFiscClassification",
    "productTable",
    "productType",
    "projectId",
    "prorateAcrossFlag",
    "purchasingCategory",
    "purchasingCategoryId",
    "invoicedQuantity",
    "rcvTransactionId",
    "receiptLineNumber",
    "receiptNumber",
    "reference1",
    "reference2",
    "referenceKey1",
    "referenceKey2",
    "referenceKey3",
    "referenceKey4",
    "referenceKey5",
    "releaseNumber",
    "requesterEmployeeNumber",
    "requesterFirstName",
    "requesterId",
    "requesterLastName",
    "serialNumber",
    "shipToLocationCode",
    "shipToLocationId",
    "sourceApplicationId",
    "sourceEntityCode",
    "sourceEventClassCode",
    "sourceLineId",
    "sourceTrxId",
    "sourceTrxLevelType",
    "statisticalAmount",
    "taskId",
    "tax",
    "taxClassificationCode",
    "taxCode",
    "taxCodeId",
    "taxJurisdictionCode",
    "taxRate",
    "taxRateCode",
    "taxRateId",
    "taxRegimeCode",
    "taxStatusCode",
    "taxableFlag",
    "trxBusinessCategory",
    "type1099",
    "unitOfMeasLookupCode",
    "unitPrice",
    "userDefinedFiscClass",
    "ussglTransactionCode",
    "vendorItemNumber",
    "warrantyNumber",
    "budgetDate",
    "consumptionAdviceHeaderId",
    "consumptionAdviceLineId",
    "consumptionAdviceNumber",
    "consumptionAdviceLineNumber",
    "shipFromLocationId",
    "shipFromLocationCode",
    "finalDischargeLocationId",
    "finalDischargeLocationCode",
    "pjcExpenditureTypeName",
    "pjcOrganizationName",
    "pjcProjectName",
    "pjcTaskNumber",
    "pjcProjectNumber",
    "pjcTaskName",
    "pjcWorkType",
    "pjcContractName",
    "pjcContractNumber",
    "pjcFundingSourceName",
    "pjcFundingSourceNumber",
    "defAcctgAccrualCcid",
    "defAccrualCodeConcatenated",
    "invoiceLineRejection"
})
public class InvoiceInterfaceLine {

    @XmlElementRef(name = "AccountSegment", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountSegment;
    @XmlElementRef(name = "AccountingDate", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> accountingDate;
    @XmlElement(name = "Amount")
    protected AmountType amount;
    @XmlElementRef(name = "ApplicationId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> applicationId;
    @XmlElementRef(name = "AssessableValue", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> assessableValue;
    @XmlElementRef(name = "AssetBookTypeCode", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> assetBookTypeCode;
    @XmlElementRef(name = "AssetCategoryId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> assetCategoryId;
    @XmlElementRef(name = "AssetsTrackingFlag", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> assetsTrackingFlag;
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
    @XmlElementRef(name = "AwardId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> awardId;
    @XmlElementRef(name = "AwtGroupId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> awtGroupId;
    @XmlElementRef(name = "AwtGroupName", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> awtGroupName;
    @XmlElementRef(name = "BalancingSegment", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> balancingSegment;
    @XmlElementRef(name = "ControlAmount", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> controlAmount;
    @XmlElementRef(name = "CostCenterSegment", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> costCenterSegment;
    @XmlElementRef(name = "CostFactorId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> costFactorId;
    @XmlElementRef(name = "CostFactorName", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> costFactorName;
    @XmlElementRef(name = "CreditCardTrxId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> creditCardTrxId;
    @XmlElementRef(name = "DefAcctgEndDate", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> defAcctgEndDate;
    @XmlElementRef(name = "DefAcctgNumberOfPeriods", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> defAcctgNumberOfPeriods;
    @XmlElementRef(name = "DefAcctgPeriodType", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> defAcctgPeriodType;
    @XmlElementRef(name = "DefAcctgStartDate", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> defAcctgStartDate;
    @XmlElementRef(name = "DefaultDistCcid", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> defaultDistCcid;
    @XmlElementRef(name = "DeferredAccountingFlag", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> deferredAccountingFlag;
    @XmlElementRef(name = "Description", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "DistCodeCombinationId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> distCodeCombinationId;
    @XmlElementRef(name = "DistCodeConcatenated", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> distCodeConcatenated;
    @XmlElementRef(name = "DistributionSetId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> distributionSetId;
    @XmlElementRef(name = "DistributionSetName", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> distributionSetName;
    @XmlElementRef(name = "ExpenditureItemDate", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> expenditureItemDate;
    @XmlElementRef(name = "ExpenditureOrganizationId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> expenditureOrganizationId;
    @XmlElementRef(name = "ExpenditureType", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> expenditureType;
    @XmlElementRef(name = "ExternalDocumentLineReference", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> externalDocumentLineReference;
    @XmlElementRef(name = "FinalMatchFlag", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> finalMatchFlag;
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
    @XmlElementRef(name = "IncludedInTaxableLineFlag", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> includedInTaxableLineFlag;
    @XmlElementRef(name = "IncomeTaxRegion", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> incomeTaxRegion;
    @XmlElementRef(name = "InventoryItemId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> inventoryItemId;
    @XmlElementRef(name = "InvoiceLineId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> invoiceLineId;
    @XmlElementRef(name = "ItemDescription", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> itemDescription;
    @XmlElementRef(name = "LineGroupNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> lineGroupNumber;
    @XmlElementRef(name = "LineNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> lineNumber;
    @XmlElement(name = "LineTypeLookupCode")
    protected String lineTypeLookupCode;
    @XmlElementRef(name = "Manufacturer", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> manufacturer;
    @XmlElementRef(name = "MatchOption", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> matchOption;
    @XmlElementRef(name = "ModelNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modelNumber;
    @XmlElementRef(name = "OrgId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> orgId;
    @XmlElementRef(name = "ProjectBillableFlag", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> projectBillableFlag;
    @XmlElementRef(name = "ProjectCapitalizableFlag", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> projectCapitalizableFlag;
    @XmlElementRef(name = "ProjectContextCategory", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectContextCategory;
    @XmlElementRef(name = "ProjectContractId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> projectContractId;
    @XmlElementRef(name = "ProjectContractLineId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> projectContractLineId;
    @XmlElementRef(name = "ProjectExpenditureItemDate", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> projectExpenditureItemDate;
    @XmlElementRef(name = "ProjectExpenditureTypeId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> projectExpenditureTypeId;
    @XmlElementRef(name = "ProjectFundingAllocationId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> projectFundingAllocationId;
    @XmlElementRef(name = "ProjectOrganizationId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> projectOrganizationId;
    @XmlElementRef(name = "ProjectProjectId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> projectProjectId;
    @XmlElementRef(name = "ProjectReservedAttribute1", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectReservedAttribute1;
    @XmlElementRef(name = "ProjectReservedAttribute10", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectReservedAttribute10;
    @XmlElementRef(name = "ProjectReservedAttribute2", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectReservedAttribute2;
    @XmlElementRef(name = "ProjectReservedAttribute3", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectReservedAttribute3;
    @XmlElementRef(name = "ProjectReservedAttribute4", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectReservedAttribute4;
    @XmlElementRef(name = "ProjectReservedAttribute5", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectReservedAttribute5;
    @XmlElementRef(name = "ProjectReservedAttribute6", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectReservedAttribute6;
    @XmlElementRef(name = "ProjectReservedAttribute7", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectReservedAttribute7;
    @XmlElementRef(name = "ProjectReservedAttribute8", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectReservedAttribute8;
    @XmlElementRef(name = "ProjectReservedAttribute9", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectReservedAttribute9;
    @XmlElementRef(name = "ProjectTaskId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> projectTaskId;
    @XmlElementRef(name = "ProjectUserDefineAttribute1", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectUserDefineAttribute1;
    @XmlElementRef(name = "ProjectUserDefineAttribute10", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectUserDefineAttribute10;
    @XmlElementRef(name = "ProjectUserDefineAttribute2", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectUserDefineAttribute2;
    @XmlElementRef(name = "ProjectUserDefineAttribute3", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectUserDefineAttribute3;
    @XmlElementRef(name = "ProjectUserDefineAttribute4", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectUserDefineAttribute4;
    @XmlElementRef(name = "ProjectUserDefineAttribute5", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectUserDefineAttribute5;
    @XmlElementRef(name = "ProjectUserDefineAttribute6", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectUserDefineAttribute6;
    @XmlElementRef(name = "ProjectUserDefineAttribute7", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectUserDefineAttribute7;
    @XmlElementRef(name = "ProjectUserDefineAttribute8", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectUserDefineAttribute8;
    @XmlElementRef(name = "ProjectUserDefineAttribute9", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectUserDefineAttribute9;
    @XmlElementRef(name = "ProjectWorkTypeId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> projectWorkTypeId;
    @XmlElementRef(name = "PaAdditionFlag", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> paAdditionFlag;
    @XmlElementRef(name = "PaCcArInvoiceId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> paCcArInvoiceId;
    @XmlElementRef(name = "PaCcArInvoiceLineNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> paCcArInvoiceLineNumber;
    @XmlElementRef(name = "PaCcProcessedCode", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paCcProcessedCode;
    @XmlElementRef(name = "PaQuantity", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<MeasureType> paQuantity;
    @XmlElementRef(name = "PackingSlip", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> packingSlip;
    @XmlElementRef(name = "POHeaderId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> poHeaderId;
    @XmlElementRef(name = "PONumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> poNumber;
    @XmlElementRef(name = "POLineId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> poLineId;
    @XmlElementRef(name = "POLineNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> poLineNumber;
    @XmlElementRef(name = "POLineLocationId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> poLineLocationId;
    @XmlElementRef(name = "POShipmentNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> poShipmentNumber;
    @XmlElementRef(name = "PODistributionId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> poDistributionId;
    @XmlElementRef(name = "PODistributionNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> poDistributionNumber;
    @XmlElementRef(name = "POReleaseId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> poReleaseId;
    @XmlElementRef(name = "PriceCorrectInvoiceLineNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> priceCorrectInvoiceLineNumber;
    @XmlElementRef(name = "PriceCorrectInvoiceNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> priceCorrectInvoiceNumber;
    @XmlElementRef(name = "PriceCorrectionFlag", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> priceCorrectionFlag;
    @XmlElementRef(name = "PrimaryIntendedUse", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryIntendedUse;
    @XmlElementRef(name = "ProductCategory", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productCategory;
    @XmlElementRef(name = "ProductFiscClassification", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productFiscClassification;
    @XmlElementRef(name = "ProductTable", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productTable;
    @XmlElementRef(name = "ProductType", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productType;
    @XmlElementRef(name = "ProjectId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> projectId;
    @XmlElementRef(name = "ProrateAcrossFlag", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> prorateAcrossFlag;
    @XmlElementRef(name = "PurchasingCategory", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> purchasingCategory;
    @XmlElementRef(name = "PurchasingCategoryId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> purchasingCategoryId;
    @XmlElementRef(name = "InvoicedQuantity", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<MeasureType> invoicedQuantity;
    @XmlElementRef(name = "RcvTransactionId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> rcvTransactionId;
    @XmlElementRef(name = "ReceiptLineNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiptLineNumber;
    @XmlElementRef(name = "ReceiptNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiptNumber;
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
    @XmlElementRef(name = "ReleaseNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> releaseNumber;
    @XmlElementRef(name = "RequesterEmployeeNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requesterEmployeeNumber;
    @XmlElementRef(name = "RequesterFirstName", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requesterFirstName;
    @XmlElementRef(name = "RequesterId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> requesterId;
    @XmlElementRef(name = "RequesterLastName", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requesterLastName;
    @XmlElementRef(name = "SerialNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serialNumber;
    @XmlElementRef(name = "ShipToLocationCode", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipToLocationCode;
    @XmlElementRef(name = "ShipToLocationId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> shipToLocationId;
    @XmlElementRef(name = "SourceApplicationId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> sourceApplicationId;
    @XmlElementRef(name = "SourceEntityCode", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceEntityCode;
    @XmlElementRef(name = "SourceEventClassCode", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceEventClassCode;
    @XmlElementRef(name = "SourceLineId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> sourceLineId;
    @XmlElementRef(name = "SourceTrxId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> sourceTrxId;
    @XmlElementRef(name = "SourceTrxLevelType", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceTrxLevelType;
    @XmlElementRef(name = "StatisticalAmount", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> statisticalAmount;
    @XmlElementRef(name = "TaskId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> taskId;
    @XmlElementRef(name = "Tax", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tax;
    @XmlElementRef(name = "TaxClassificationCode", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taxClassificationCode;
    @XmlElementRef(name = "TaxCode", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taxCode;
    @XmlElementRef(name = "TaxCodeId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> taxCodeId;
    @XmlElementRef(name = "TaxJurisdictionCode", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taxJurisdictionCode;
    @XmlElementRef(name = "TaxRate", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> taxRate;
    @XmlElementRef(name = "TaxRateCode", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taxRateCode;
    @XmlElementRef(name = "TaxRateId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> taxRateId;
    @XmlElementRef(name = "TaxRegimeCode", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taxRegimeCode;
    @XmlElementRef(name = "TaxStatusCode", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taxStatusCode;
    @XmlElementRef(name = "TaxableFlag", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> taxableFlag;
    @XmlElementRef(name = "TrxBusinessCategory", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trxBusinessCategory;
    @XmlElementRef(name = "Type1099", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> type1099;
    @XmlElementRef(name = "UnitOfMeasLookupCode", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unitOfMeasLookupCode;
    @XmlElementRef(name = "UnitPrice", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> unitPrice;
    @XmlElementRef(name = "UserDefinedFiscClass", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userDefinedFiscClass;
    @XmlElementRef(name = "USSGLTransactionCode", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ussglTransactionCode;
    @XmlElementRef(name = "VendorItemNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vendorItemNumber;
    @XmlElementRef(name = "WarrantyNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> warrantyNumber;
    @XmlElementRef(name = "BudgetDate", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> budgetDate;
    @XmlElementRef(name = "ConsumptionAdviceHeaderId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> consumptionAdviceHeaderId;
    @XmlElementRef(name = "ConsumptionAdviceLineId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> consumptionAdviceLineId;
    @XmlElementRef(name = "ConsumptionAdviceNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consumptionAdviceNumber;
    @XmlElementRef(name = "ConsumptionAdviceLineNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> consumptionAdviceLineNumber;
    @XmlElementRef(name = "ShipFromLocationId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> shipFromLocationId;
    @XmlElementRef(name = "ShipFromLocationCode", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipFromLocationCode;
    @XmlElementRef(name = "FinalDischargeLocationId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> finalDischargeLocationId;
    @XmlElementRef(name = "FinalDischargeLocationCode", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> finalDischargeLocationCode;
    @XmlElementRef(name = "PjcExpenditureTypeName", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pjcExpenditureTypeName;
    @XmlElementRef(name = "PjcOrganizationName", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pjcOrganizationName;
    @XmlElementRef(name = "PjcProjectName", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pjcProjectName;
    @XmlElementRef(name = "PjcTaskNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pjcTaskNumber;
    @XmlElementRef(name = "PjcProjectNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pjcProjectNumber;
    @XmlElementRef(name = "PjcTaskName", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pjcTaskName;
    @XmlElementRef(name = "PjcWorkType", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pjcWorkType;
    @XmlElementRef(name = "PjcContractName", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pjcContractName;
    @XmlElementRef(name = "PjcContractNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pjcContractNumber;
    @XmlElementRef(name = "PjcFundingSourceName", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pjcFundingSourceName;
    @XmlElementRef(name = "PjcFundingSourceNumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pjcFundingSourceNumber;
    @XmlElementRef(name = "DefAcctgAccrualCcid", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> defAcctgAccrualCcid;
    @XmlElementRef(name = "DefAccrualCodeConcatenated", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> defAccrualCodeConcatenated;
    @XmlElement(name = "InvoiceLineRejection")
    protected List<InvoiceLineRejection> invoiceLineRejection;

    /**
     * Obtiene el valor de la propiedad accountSegment.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountSegment() {
        return accountSegment;
    }

    /**
     * Define el valor de la propiedad accountSegment.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountSegment(JAXBElement<String> value) {
        this.accountSegment = value;
    }

    /**
     * Obtiene el valor de la propiedad accountingDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAccountingDate() {
        return accountingDate;
    }

    /**
     * Define el valor de la propiedad accountingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAccountingDate(JAXBElement<XMLGregorianCalendar> value) {
        this.accountingDate = value;
    }

    /**
     * Obtiene el valor de la propiedad amount.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmount() {
        return amount;
    }

    /**
     * Define el valor de la propiedad amount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmount(AmountType value) {
        this.amount = value;
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
     * Obtiene el valor de la propiedad assessableValue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAssessableValue() {
        return assessableValue;
    }

    /**
     * Define el valor de la propiedad assessableValue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAssessableValue(JAXBElement<BigDecimal> value) {
        this.assessableValue = value;
    }

    /**
     * Obtiene el valor de la propiedad assetBookTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssetBookTypeCode() {
        return assetBookTypeCode;
    }

    /**
     * Define el valor de la propiedad assetBookTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssetBookTypeCode(JAXBElement<String> value) {
        this.assetBookTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad assetCategoryId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAssetCategoryId() {
        return assetCategoryId;
    }

    /**
     * Define el valor de la propiedad assetCategoryId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAssetCategoryId(JAXBElement<Long> value) {
        this.assetCategoryId = value;
    }

    /**
     * Obtiene el valor de la propiedad assetsTrackingFlag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAssetsTrackingFlag() {
        return assetsTrackingFlag;
    }

    /**
     * Define el valor de la propiedad assetsTrackingFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAssetsTrackingFlag(JAXBElement<Boolean> value) {
        this.assetsTrackingFlag = value;
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
     * Obtiene el valor de la propiedad awardId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAwardId() {
        return awardId;
    }

    /**
     * Define el valor de la propiedad awardId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAwardId(JAXBElement<Long> value) {
        this.awardId = value;
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
     * Obtiene el valor de la propiedad balancingSegment.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBalancingSegment() {
        return balancingSegment;
    }

    /**
     * Define el valor de la propiedad balancingSegment.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBalancingSegment(JAXBElement<String> value) {
        this.balancingSegment = value;
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
     * Obtiene el valor de la propiedad costCenterSegment.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCostCenterSegment() {
        return costCenterSegment;
    }

    /**
     * Define el valor de la propiedad costCenterSegment.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCostCenterSegment(JAXBElement<String> value) {
        this.costCenterSegment = value;
    }

    /**
     * Obtiene el valor de la propiedad costFactorId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCostFactorId() {
        return costFactorId;
    }

    /**
     * Define el valor de la propiedad costFactorId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCostFactorId(JAXBElement<Long> value) {
        this.costFactorId = value;
    }

    /**
     * Obtiene el valor de la propiedad costFactorName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCostFactorName() {
        return costFactorName;
    }

    /**
     * Define el valor de la propiedad costFactorName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCostFactorName(JAXBElement<String> value) {
        this.costFactorName = value;
    }

    /**
     * Obtiene el valor de la propiedad creditCardTrxId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCreditCardTrxId() {
        return creditCardTrxId;
    }

    /**
     * Define el valor de la propiedad creditCardTrxId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCreditCardTrxId(JAXBElement<Long> value) {
        this.creditCardTrxId = value;
    }

    /**
     * Obtiene el valor de la propiedad defAcctgEndDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDefAcctgEndDate() {
        return defAcctgEndDate;
    }

    /**
     * Define el valor de la propiedad defAcctgEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDefAcctgEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.defAcctgEndDate = value;
    }

    /**
     * Obtiene el valor de la propiedad defAcctgNumberOfPeriods.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDefAcctgNumberOfPeriods() {
        return defAcctgNumberOfPeriods;
    }

    /**
     * Define el valor de la propiedad defAcctgNumberOfPeriods.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDefAcctgNumberOfPeriods(JAXBElement<BigDecimal> value) {
        this.defAcctgNumberOfPeriods = value;
    }

    /**
     * Obtiene el valor de la propiedad defAcctgPeriodType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDefAcctgPeriodType() {
        return defAcctgPeriodType;
    }

    /**
     * Define el valor de la propiedad defAcctgPeriodType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDefAcctgPeriodType(JAXBElement<String> value) {
        this.defAcctgPeriodType = value;
    }

    /**
     * Obtiene el valor de la propiedad defAcctgStartDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDefAcctgStartDate() {
        return defAcctgStartDate;
    }

    /**
     * Define el valor de la propiedad defAcctgStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDefAcctgStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.defAcctgStartDate = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultDistCcid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDefaultDistCcid() {
        return defaultDistCcid;
    }

    /**
     * Define el valor de la propiedad defaultDistCcid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDefaultDistCcid(JAXBElement<Long> value) {
        this.defaultDistCcid = value;
    }

    /**
     * Obtiene el valor de la propiedad deferredAccountingFlag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDeferredAccountingFlag() {
        return deferredAccountingFlag;
    }

    /**
     * Define el valor de la propiedad deferredAccountingFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDeferredAccountingFlag(JAXBElement<Boolean> value) {
        this.deferredAccountingFlag = value;
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
     * Obtiene el valor de la propiedad distCodeCombinationId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDistCodeCombinationId() {
        return distCodeCombinationId;
    }

    /**
     * Define el valor de la propiedad distCodeCombinationId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDistCodeCombinationId(JAXBElement<Long> value) {
        this.distCodeCombinationId = value;
    }

    /**
     * Obtiene el valor de la propiedad distCodeConcatenated.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDistCodeConcatenated() {
        return distCodeConcatenated;
    }

    /**
     * Define el valor de la propiedad distCodeConcatenated.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDistCodeConcatenated(JAXBElement<String> value) {
        this.distCodeConcatenated = value;
    }

    /**
     * Obtiene el valor de la propiedad distributionSetId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDistributionSetId() {
        return distributionSetId;
    }

    /**
     * Define el valor de la propiedad distributionSetId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDistributionSetId(JAXBElement<Long> value) {
        this.distributionSetId = value;
    }

    /**
     * Obtiene el valor de la propiedad distributionSetName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDistributionSetName() {
        return distributionSetName;
    }

    /**
     * Define el valor de la propiedad distributionSetName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDistributionSetName(JAXBElement<String> value) {
        this.distributionSetName = value;
    }

    /**
     * Obtiene el valor de la propiedad expenditureItemDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExpenditureItemDate() {
        return expenditureItemDate;
    }

    /**
     * Define el valor de la propiedad expenditureItemDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExpenditureItemDate(JAXBElement<XMLGregorianCalendar> value) {
        this.expenditureItemDate = value;
    }

    /**
     * Obtiene el valor de la propiedad expenditureOrganizationId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getExpenditureOrganizationId() {
        return expenditureOrganizationId;
    }

    /**
     * Define el valor de la propiedad expenditureOrganizationId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setExpenditureOrganizationId(JAXBElement<Long> value) {
        this.expenditureOrganizationId = value;
    }

    /**
     * Obtiene el valor de la propiedad expenditureType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExpenditureType() {
        return expenditureType;
    }

    /**
     * Define el valor de la propiedad expenditureType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExpenditureType(JAXBElement<String> value) {
        this.expenditureType = value;
    }

    /**
     * Obtiene el valor de la propiedad externalDocumentLineReference.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExternalDocumentLineReference() {
        return externalDocumentLineReference;
    }

    /**
     * Define el valor de la propiedad externalDocumentLineReference.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExternalDocumentLineReference(JAXBElement<String> value) {
        this.externalDocumentLineReference = value;
    }

    /**
     * Obtiene el valor de la propiedad finalMatchFlag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getFinalMatchFlag() {
        return finalMatchFlag;
    }

    /**
     * Define el valor de la propiedad finalMatchFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setFinalMatchFlag(JAXBElement<Boolean> value) {
        this.finalMatchFlag = value;
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
     * Obtiene el valor de la propiedad includedInTaxableLineFlag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIncludedInTaxableLineFlag() {
        return includedInTaxableLineFlag;
    }

    /**
     * Define el valor de la propiedad includedInTaxableLineFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIncludedInTaxableLineFlag(JAXBElement<Boolean> value) {
        this.includedInTaxableLineFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad incomeTaxRegion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIncomeTaxRegion() {
        return incomeTaxRegion;
    }

    /**
     * Define el valor de la propiedad incomeTaxRegion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIncomeTaxRegion(JAXBElement<String> value) {
        this.incomeTaxRegion = value;
    }

    /**
     * Obtiene el valor de la propiedad inventoryItemId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInventoryItemId() {
        return inventoryItemId;
    }

    /**
     * Define el valor de la propiedad inventoryItemId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInventoryItemId(JAXBElement<Long> value) {
        this.inventoryItemId = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceLineId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInvoiceLineId() {
        return invoiceLineId;
    }

    /**
     * Define el valor de la propiedad invoiceLineId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInvoiceLineId(JAXBElement<Long> value) {
        this.invoiceLineId = value;
    }

    /**
     * Obtiene el valor de la propiedad itemDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItemDescription() {
        return itemDescription;
    }

    /**
     * Define el valor de la propiedad itemDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItemDescription(JAXBElement<String> value) {
        this.itemDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad lineGroupNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLineGroupNumber() {
        return lineGroupNumber;
    }

    /**
     * Define el valor de la propiedad lineGroupNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLineGroupNumber(JAXBElement<Integer> value) {
        this.lineGroupNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad lineNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLineNumber() {
        return lineNumber;
    }

    /**
     * Define el valor de la propiedad lineNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLineNumber(JAXBElement<Integer> value) {
        this.lineNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad lineTypeLookupCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineTypeLookupCode() {
        return lineTypeLookupCode;
    }

    /**
     * Define el valor de la propiedad lineTypeLookupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineTypeLookupCode(String value) {
        this.lineTypeLookupCode = value;
    }

    /**
     * Obtiene el valor de la propiedad manufacturer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getManufacturer() {
        return manufacturer;
    }

    /**
     * Define el valor de la propiedad manufacturer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setManufacturer(JAXBElement<String> value) {
        this.manufacturer = value;
    }

    /**
     * Obtiene el valor de la propiedad matchOption.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatchOption() {
        return matchOption;
    }

    /**
     * Define el valor de la propiedad matchOption.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatchOption(JAXBElement<String> value) {
        this.matchOption = value;
    }

    /**
     * Obtiene el valor de la propiedad modelNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getModelNumber() {
        return modelNumber;
    }

    /**
     * Define el valor de la propiedad modelNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setModelNumber(JAXBElement<String> value) {
        this.modelNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad orgId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOrgId() {
        return orgId;
    }

    /**
     * Define el valor de la propiedad orgId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOrgId(JAXBElement<Long> value) {
        this.orgId = value;
    }

    /**
     * Obtiene el valor de la propiedad projectBillableFlag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getProjectBillableFlag() {
        return projectBillableFlag;
    }

    /**
     * Define el valor de la propiedad projectBillableFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setProjectBillableFlag(JAXBElement<Boolean> value) {
        this.projectBillableFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad projectCapitalizableFlag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getProjectCapitalizableFlag() {
        return projectCapitalizableFlag;
    }

    /**
     * Define el valor de la propiedad projectCapitalizableFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setProjectCapitalizableFlag(JAXBElement<Boolean> value) {
        this.projectCapitalizableFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad projectContextCategory.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectContextCategory() {
        return projectContextCategory;
    }

    /**
     * Define el valor de la propiedad projectContextCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectContextCategory(JAXBElement<String> value) {
        this.projectContextCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad projectContractId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getProjectContractId() {
        return projectContractId;
    }

    /**
     * Define el valor de la propiedad projectContractId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setProjectContractId(JAXBElement<BigDecimal> value) {
        this.projectContractId = value;
    }

    /**
     * Obtiene el valor de la propiedad projectContractLineId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getProjectContractLineId() {
        return projectContractLineId;
    }

    /**
     * Define el valor de la propiedad projectContractLineId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setProjectContractLineId(JAXBElement<BigDecimal> value) {
        this.projectContractLineId = value;
    }

    /**
     * Obtiene el valor de la propiedad projectExpenditureItemDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getProjectExpenditureItemDate() {
        return projectExpenditureItemDate;
    }

    /**
     * Define el valor de la propiedad projectExpenditureItemDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setProjectExpenditureItemDate(JAXBElement<XMLGregorianCalendar> value) {
        this.projectExpenditureItemDate = value;
    }

    /**
     * Obtiene el valor de la propiedad projectExpenditureTypeId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getProjectExpenditureTypeId() {
        return projectExpenditureTypeId;
    }

    /**
     * Define el valor de la propiedad projectExpenditureTypeId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setProjectExpenditureTypeId(JAXBElement<BigDecimal> value) {
        this.projectExpenditureTypeId = value;
    }

    /**
     * Obtiene el valor de la propiedad projectFundingAllocationId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getProjectFundingAllocationId() {
        return projectFundingAllocationId;
    }

    /**
     * Define el valor de la propiedad projectFundingAllocationId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setProjectFundingAllocationId(JAXBElement<BigDecimal> value) {
        this.projectFundingAllocationId = value;
    }

    /**
     * Obtiene el valor de la propiedad projectOrganizationId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getProjectOrganizationId() {
        return projectOrganizationId;
    }

    /**
     * Define el valor de la propiedad projectOrganizationId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setProjectOrganizationId(JAXBElement<BigDecimal> value) {
        this.projectOrganizationId = value;
    }

    /**
     * Obtiene el valor de la propiedad projectProjectId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getProjectProjectId() {
        return projectProjectId;
    }

    /**
     * Define el valor de la propiedad projectProjectId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setProjectProjectId(JAXBElement<BigDecimal> value) {
        this.projectProjectId = value;
    }

    /**
     * Obtiene el valor de la propiedad projectReservedAttribute1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectReservedAttribute1() {
        return projectReservedAttribute1;
    }

    /**
     * Define el valor de la propiedad projectReservedAttribute1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectReservedAttribute1(JAXBElement<String> value) {
        this.projectReservedAttribute1 = value;
    }

    /**
     * Obtiene el valor de la propiedad projectReservedAttribute10.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectReservedAttribute10() {
        return projectReservedAttribute10;
    }

    /**
     * Define el valor de la propiedad projectReservedAttribute10.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectReservedAttribute10(JAXBElement<String> value) {
        this.projectReservedAttribute10 = value;
    }

    /**
     * Obtiene el valor de la propiedad projectReservedAttribute2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectReservedAttribute2() {
        return projectReservedAttribute2;
    }

    /**
     * Define el valor de la propiedad projectReservedAttribute2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectReservedAttribute2(JAXBElement<String> value) {
        this.projectReservedAttribute2 = value;
    }

    /**
     * Obtiene el valor de la propiedad projectReservedAttribute3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectReservedAttribute3() {
        return projectReservedAttribute3;
    }

    /**
     * Define el valor de la propiedad projectReservedAttribute3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectReservedAttribute3(JAXBElement<String> value) {
        this.projectReservedAttribute3 = value;
    }

    /**
     * Obtiene el valor de la propiedad projectReservedAttribute4.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectReservedAttribute4() {
        return projectReservedAttribute4;
    }

    /**
     * Define el valor de la propiedad projectReservedAttribute4.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectReservedAttribute4(JAXBElement<String> value) {
        this.projectReservedAttribute4 = value;
    }

    /**
     * Obtiene el valor de la propiedad projectReservedAttribute5.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectReservedAttribute5() {
        return projectReservedAttribute5;
    }

    /**
     * Define el valor de la propiedad projectReservedAttribute5.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectReservedAttribute5(JAXBElement<String> value) {
        this.projectReservedAttribute5 = value;
    }

    /**
     * Obtiene el valor de la propiedad projectReservedAttribute6.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectReservedAttribute6() {
        return projectReservedAttribute6;
    }

    /**
     * Define el valor de la propiedad projectReservedAttribute6.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectReservedAttribute6(JAXBElement<String> value) {
        this.projectReservedAttribute6 = value;
    }

    /**
     * Obtiene el valor de la propiedad projectReservedAttribute7.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectReservedAttribute7() {
        return projectReservedAttribute7;
    }

    /**
     * Define el valor de la propiedad projectReservedAttribute7.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectReservedAttribute7(JAXBElement<String> value) {
        this.projectReservedAttribute7 = value;
    }

    /**
     * Obtiene el valor de la propiedad projectReservedAttribute8.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectReservedAttribute8() {
        return projectReservedAttribute8;
    }

    /**
     * Define el valor de la propiedad projectReservedAttribute8.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectReservedAttribute8(JAXBElement<String> value) {
        this.projectReservedAttribute8 = value;
    }

    /**
     * Obtiene el valor de la propiedad projectReservedAttribute9.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectReservedAttribute9() {
        return projectReservedAttribute9;
    }

    /**
     * Define el valor de la propiedad projectReservedAttribute9.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectReservedAttribute9(JAXBElement<String> value) {
        this.projectReservedAttribute9 = value;
    }

    /**
     * Obtiene el valor de la propiedad projectTaskId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getProjectTaskId() {
        return projectTaskId;
    }

    /**
     * Define el valor de la propiedad projectTaskId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setProjectTaskId(JAXBElement<BigDecimal> value) {
        this.projectTaskId = value;
    }

    /**
     * Obtiene el valor de la propiedad projectUserDefineAttribute1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectUserDefineAttribute1() {
        return projectUserDefineAttribute1;
    }

    /**
     * Define el valor de la propiedad projectUserDefineAttribute1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectUserDefineAttribute1(JAXBElement<String> value) {
        this.projectUserDefineAttribute1 = value;
    }

    /**
     * Obtiene el valor de la propiedad projectUserDefineAttribute10.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectUserDefineAttribute10() {
        return projectUserDefineAttribute10;
    }

    /**
     * Define el valor de la propiedad projectUserDefineAttribute10.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectUserDefineAttribute10(JAXBElement<String> value) {
        this.projectUserDefineAttribute10 = value;
    }

    /**
     * Obtiene el valor de la propiedad projectUserDefineAttribute2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectUserDefineAttribute2() {
        return projectUserDefineAttribute2;
    }

    /**
     * Define el valor de la propiedad projectUserDefineAttribute2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectUserDefineAttribute2(JAXBElement<String> value) {
        this.projectUserDefineAttribute2 = value;
    }

    /**
     * Obtiene el valor de la propiedad projectUserDefineAttribute3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectUserDefineAttribute3() {
        return projectUserDefineAttribute3;
    }

    /**
     * Define el valor de la propiedad projectUserDefineAttribute3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectUserDefineAttribute3(JAXBElement<String> value) {
        this.projectUserDefineAttribute3 = value;
    }

    /**
     * Obtiene el valor de la propiedad projectUserDefineAttribute4.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectUserDefineAttribute4() {
        return projectUserDefineAttribute4;
    }

    /**
     * Define el valor de la propiedad projectUserDefineAttribute4.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectUserDefineAttribute4(JAXBElement<String> value) {
        this.projectUserDefineAttribute4 = value;
    }

    /**
     * Obtiene el valor de la propiedad projectUserDefineAttribute5.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectUserDefineAttribute5() {
        return projectUserDefineAttribute5;
    }

    /**
     * Define el valor de la propiedad projectUserDefineAttribute5.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectUserDefineAttribute5(JAXBElement<String> value) {
        this.projectUserDefineAttribute5 = value;
    }

    /**
     * Obtiene el valor de la propiedad projectUserDefineAttribute6.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectUserDefineAttribute6() {
        return projectUserDefineAttribute6;
    }

    /**
     * Define el valor de la propiedad projectUserDefineAttribute6.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectUserDefineAttribute6(JAXBElement<String> value) {
        this.projectUserDefineAttribute6 = value;
    }

    /**
     * Obtiene el valor de la propiedad projectUserDefineAttribute7.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectUserDefineAttribute7() {
        return projectUserDefineAttribute7;
    }

    /**
     * Define el valor de la propiedad projectUserDefineAttribute7.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectUserDefineAttribute7(JAXBElement<String> value) {
        this.projectUserDefineAttribute7 = value;
    }

    /**
     * Obtiene el valor de la propiedad projectUserDefineAttribute8.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectUserDefineAttribute8() {
        return projectUserDefineAttribute8;
    }

    /**
     * Define el valor de la propiedad projectUserDefineAttribute8.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectUserDefineAttribute8(JAXBElement<String> value) {
        this.projectUserDefineAttribute8 = value;
    }

    /**
     * Obtiene el valor de la propiedad projectUserDefineAttribute9.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectUserDefineAttribute9() {
        return projectUserDefineAttribute9;
    }

    /**
     * Define el valor de la propiedad projectUserDefineAttribute9.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectUserDefineAttribute9(JAXBElement<String> value) {
        this.projectUserDefineAttribute9 = value;
    }

    /**
     * Obtiene el valor de la propiedad projectWorkTypeId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getProjectWorkTypeId() {
        return projectWorkTypeId;
    }

    /**
     * Define el valor de la propiedad projectWorkTypeId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setProjectWorkTypeId(JAXBElement<BigDecimal> value) {
        this.projectWorkTypeId = value;
    }

    /**
     * Obtiene el valor de la propiedad paAdditionFlag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPaAdditionFlag() {
        return paAdditionFlag;
    }

    /**
     * Define el valor de la propiedad paAdditionFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPaAdditionFlag(JAXBElement<Boolean> value) {
        this.paAdditionFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad paCcArInvoiceId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPaCcArInvoiceId() {
        return paCcArInvoiceId;
    }

    /**
     * Define el valor de la propiedad paCcArInvoiceId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPaCcArInvoiceId(JAXBElement<Long> value) {
        this.paCcArInvoiceId = value;
    }

    /**
     * Obtiene el valor de la propiedad paCcArInvoiceLineNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPaCcArInvoiceLineNumber() {
        return paCcArInvoiceLineNumber;
    }

    /**
     * Define el valor de la propiedad paCcArInvoiceLineNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPaCcArInvoiceLineNumber(JAXBElement<Integer> value) {
        this.paCcArInvoiceLineNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad paCcProcessedCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaCcProcessedCode() {
        return paCcProcessedCode;
    }

    /**
     * Define el valor de la propiedad paCcProcessedCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaCcProcessedCode(JAXBElement<String> value) {
        this.paCcProcessedCode = value;
    }

    /**
     * Obtiene el valor de la propiedad paQuantity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
     *     
     */
    public JAXBElement<MeasureType> getPaQuantity() {
        return paQuantity;
    }

    /**
     * Define el valor de la propiedad paQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
     *     
     */
    public void setPaQuantity(JAXBElement<MeasureType> value) {
        this.paQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad packingSlip.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPackingSlip() {
        return packingSlip;
    }

    /**
     * Define el valor de la propiedad packingSlip.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPackingSlip(JAXBElement<String> value) {
        this.packingSlip = value;
    }

    /**
     * Obtiene el valor de la propiedad poHeaderId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPOHeaderId() {
        return poHeaderId;
    }

    /**
     * Define el valor de la propiedad poHeaderId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPOHeaderId(JAXBElement<Long> value) {
        this.poHeaderId = value;
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
     * Obtiene el valor de la propiedad poLineId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPOLineId() {
        return poLineId;
    }

    /**
     * Define el valor de la propiedad poLineId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPOLineId(JAXBElement<Long> value) {
        this.poLineId = value;
    }

    /**
     * Obtiene el valor de la propiedad poLineNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPOLineNumber() {
        return poLineNumber;
    }

    /**
     * Define el valor de la propiedad poLineNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPOLineNumber(JAXBElement<BigDecimal> value) {
        this.poLineNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad poLineLocationId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPOLineLocationId() {
        return poLineLocationId;
    }

    /**
     * Define el valor de la propiedad poLineLocationId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPOLineLocationId(JAXBElement<Long> value) {
        this.poLineLocationId = value;
    }

    /**
     * Obtiene el valor de la propiedad poShipmentNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPOShipmentNumber() {
        return poShipmentNumber;
    }

    /**
     * Define el valor de la propiedad poShipmentNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPOShipmentNumber(JAXBElement<BigDecimal> value) {
        this.poShipmentNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad poDistributionId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPODistributionId() {
        return poDistributionId;
    }

    /**
     * Define el valor de la propiedad poDistributionId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPODistributionId(JAXBElement<Long> value) {
        this.poDistributionId = value;
    }

    /**
     * Obtiene el valor de la propiedad poDistributionNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPODistributionNumber() {
        return poDistributionNumber;
    }

    /**
     * Define el valor de la propiedad poDistributionNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPODistributionNumber(JAXBElement<Integer> value) {
        this.poDistributionNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad poReleaseId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPOReleaseId() {
        return poReleaseId;
    }

    /**
     * Define el valor de la propiedad poReleaseId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPOReleaseId(JAXBElement<Long> value) {
        this.poReleaseId = value;
    }

    /**
     * Obtiene el valor de la propiedad priceCorrectInvoiceLineNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPriceCorrectInvoiceLineNumber() {
        return priceCorrectInvoiceLineNumber;
    }

    /**
     * Define el valor de la propiedad priceCorrectInvoiceLineNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPriceCorrectInvoiceLineNumber(JAXBElement<Integer> value) {
        this.priceCorrectInvoiceLineNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad priceCorrectInvoiceNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPriceCorrectInvoiceNumber() {
        return priceCorrectInvoiceNumber;
    }

    /**
     * Define el valor de la propiedad priceCorrectInvoiceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPriceCorrectInvoiceNumber(JAXBElement<String> value) {
        this.priceCorrectInvoiceNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad priceCorrectionFlag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPriceCorrectionFlag() {
        return priceCorrectionFlag;
    }

    /**
     * Define el valor de la propiedad priceCorrectionFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPriceCorrectionFlag(JAXBElement<Boolean> value) {
        this.priceCorrectionFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad primaryIntendedUse.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryIntendedUse() {
        return primaryIntendedUse;
    }

    /**
     * Define el valor de la propiedad primaryIntendedUse.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryIntendedUse(JAXBElement<String> value) {
        this.primaryIntendedUse = value;
    }

    /**
     * Obtiene el valor de la propiedad productCategory.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductCategory() {
        return productCategory;
    }

    /**
     * Define el valor de la propiedad productCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductCategory(JAXBElement<String> value) {
        this.productCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad productFiscClassification.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductFiscClassification() {
        return productFiscClassification;
    }

    /**
     * Define el valor de la propiedad productFiscClassification.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductFiscClassification(JAXBElement<String> value) {
        this.productFiscClassification = value;
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
     * Obtiene el valor de la propiedad productType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductType() {
        return productType;
    }

    /**
     * Define el valor de la propiedad productType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductType(JAXBElement<String> value) {
        this.productType = value;
    }

    /**
     * Obtiene el valor de la propiedad projectId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getProjectId() {
        return projectId;
    }

    /**
     * Define el valor de la propiedad projectId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setProjectId(JAXBElement<Long> value) {
        this.projectId = value;
    }

    /**
     * Obtiene el valor de la propiedad prorateAcrossFlag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getProrateAcrossFlag() {
        return prorateAcrossFlag;
    }

    /**
     * Define el valor de la propiedad prorateAcrossFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setProrateAcrossFlag(JAXBElement<Boolean> value) {
        this.prorateAcrossFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad purchasingCategory.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPurchasingCategory() {
        return purchasingCategory;
    }

    /**
     * Define el valor de la propiedad purchasingCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPurchasingCategory(JAXBElement<String> value) {
        this.purchasingCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad purchasingCategoryId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPurchasingCategoryId() {
        return purchasingCategoryId;
    }

    /**
     * Define el valor de la propiedad purchasingCategoryId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPurchasingCategoryId(JAXBElement<Long> value) {
        this.purchasingCategoryId = value;
    }

    /**
     * Obtiene el valor de la propiedad invoicedQuantity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
     *     
     */
    public JAXBElement<MeasureType> getInvoicedQuantity() {
        return invoicedQuantity;
    }

    /**
     * Define el valor de la propiedad invoicedQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
     *     
     */
    public void setInvoicedQuantity(JAXBElement<MeasureType> value) {
        this.invoicedQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad rcvTransactionId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRcvTransactionId() {
        return rcvTransactionId;
    }

    /**
     * Define el valor de la propiedad rcvTransactionId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRcvTransactionId(JAXBElement<Long> value) {
        this.rcvTransactionId = value;
    }

    /**
     * Obtiene el valor de la propiedad receiptLineNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiptLineNumber() {
        return receiptLineNumber;
    }

    /**
     * Define el valor de la propiedad receiptLineNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiptLineNumber(JAXBElement<String> value) {
        this.receiptLineNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad receiptNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiptNumber() {
        return receiptNumber;
    }

    /**
     * Define el valor de la propiedad receiptNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiptNumber(JAXBElement<String> value) {
        this.receiptNumber = value;
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
     * Obtiene el valor de la propiedad releaseNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getReleaseNumber() {
        return releaseNumber;
    }

    /**
     * Define el valor de la propiedad releaseNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setReleaseNumber(JAXBElement<Integer> value) {
        this.releaseNumber = value;
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
     * Obtiene el valor de la propiedad serialNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSerialNumber() {
        return serialNumber;
    }

    /**
     * Define el valor de la propiedad serialNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSerialNumber(JAXBElement<String> value) {
        this.serialNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad shipToLocationCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipToLocationCode() {
        return shipToLocationCode;
    }

    /**
     * Define el valor de la propiedad shipToLocationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipToLocationCode(JAXBElement<String> value) {
        this.shipToLocationCode = value;
    }

    /**
     * Obtiene el valor de la propiedad shipToLocationId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getShipToLocationId() {
        return shipToLocationId;
    }

    /**
     * Define el valor de la propiedad shipToLocationId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setShipToLocationId(JAXBElement<Long> value) {
        this.shipToLocationId = value;
    }

    /**
     * Obtiene el valor de la propiedad sourceApplicationId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSourceApplicationId() {
        return sourceApplicationId;
    }

    /**
     * Define el valor de la propiedad sourceApplicationId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSourceApplicationId(JAXBElement<Long> value) {
        this.sourceApplicationId = value;
    }

    /**
     * Obtiene el valor de la propiedad sourceEntityCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceEntityCode() {
        return sourceEntityCode;
    }

    /**
     * Define el valor de la propiedad sourceEntityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceEntityCode(JAXBElement<String> value) {
        this.sourceEntityCode = value;
    }

    /**
     * Obtiene el valor de la propiedad sourceEventClassCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceEventClassCode() {
        return sourceEventClassCode;
    }

    /**
     * Define el valor de la propiedad sourceEventClassCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceEventClassCode(JAXBElement<String> value) {
        this.sourceEventClassCode = value;
    }

    /**
     * Obtiene el valor de la propiedad sourceLineId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSourceLineId() {
        return sourceLineId;
    }

    /**
     * Define el valor de la propiedad sourceLineId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSourceLineId(JAXBElement<Long> value) {
        this.sourceLineId = value;
    }

    /**
     * Obtiene el valor de la propiedad sourceTrxId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSourceTrxId() {
        return sourceTrxId;
    }

    /**
     * Define el valor de la propiedad sourceTrxId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSourceTrxId(JAXBElement<Long> value) {
        this.sourceTrxId = value;
    }

    /**
     * Obtiene el valor de la propiedad sourceTrxLevelType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceTrxLevelType() {
        return sourceTrxLevelType;
    }

    /**
     * Define el valor de la propiedad sourceTrxLevelType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceTrxLevelType(JAXBElement<String> value) {
        this.sourceTrxLevelType = value;
    }

    /**
     * Obtiene el valor de la propiedad statisticalAmount.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getStatisticalAmount() {
        return statisticalAmount;
    }

    /**
     * Define el valor de la propiedad statisticalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setStatisticalAmount(JAXBElement<AmountType> value) {
        this.statisticalAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad taskId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTaskId() {
        return taskId;
    }

    /**
     * Define el valor de la propiedad taskId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTaskId(JAXBElement<Long> value) {
        this.taskId = value;
    }

    /**
     * Obtiene el valor de la propiedad tax.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTax() {
        return tax;
    }

    /**
     * Define el valor de la propiedad tax.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTax(JAXBElement<String> value) {
        this.tax = value;
    }

    /**
     * Obtiene el valor de la propiedad taxClassificationCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxClassificationCode() {
        return taxClassificationCode;
    }

    /**
     * Define el valor de la propiedad taxClassificationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxClassificationCode(JAXBElement<String> value) {
        this.taxClassificationCode = value;
    }

    /**
     * Obtiene el valor de la propiedad taxCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxCode() {
        return taxCode;
    }

    /**
     * Define el valor de la propiedad taxCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxCode(JAXBElement<String> value) {
        this.taxCode = value;
    }

    /**
     * Obtiene el valor de la propiedad taxCodeId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTaxCodeId() {
        return taxCodeId;
    }

    /**
     * Define el valor de la propiedad taxCodeId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTaxCodeId(JAXBElement<Long> value) {
        this.taxCodeId = value;
    }

    /**
     * Obtiene el valor de la propiedad taxJurisdictionCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxJurisdictionCode() {
        return taxJurisdictionCode;
    }

    /**
     * Define el valor de la propiedad taxJurisdictionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxJurisdictionCode(JAXBElement<String> value) {
        this.taxJurisdictionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad taxRate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTaxRate() {
        return taxRate;
    }

    /**
     * Define el valor de la propiedad taxRate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTaxRate(JAXBElement<BigDecimal> value) {
        this.taxRate = value;
    }

    /**
     * Obtiene el valor de la propiedad taxRateCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxRateCode() {
        return taxRateCode;
    }

    /**
     * Define el valor de la propiedad taxRateCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxRateCode(JAXBElement<String> value) {
        this.taxRateCode = value;
    }

    /**
     * Obtiene el valor de la propiedad taxRateId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTaxRateId() {
        return taxRateId;
    }

    /**
     * Define el valor de la propiedad taxRateId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTaxRateId(JAXBElement<Long> value) {
        this.taxRateId = value;
    }

    /**
     * Obtiene el valor de la propiedad taxRegimeCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxRegimeCode() {
        return taxRegimeCode;
    }

    /**
     * Define el valor de la propiedad taxRegimeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxRegimeCode(JAXBElement<String> value) {
        this.taxRegimeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad taxStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxStatusCode() {
        return taxStatusCode;
    }

    /**
     * Define el valor de la propiedad taxStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxStatusCode(JAXBElement<String> value) {
        this.taxStatusCode = value;
    }

    /**
     * Obtiene el valor de la propiedad taxableFlag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTaxableFlag() {
        return taxableFlag;
    }

    /**
     * Define el valor de la propiedad taxableFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTaxableFlag(JAXBElement<Boolean> value) {
        this.taxableFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad trxBusinessCategory.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrxBusinessCategory() {
        return trxBusinessCategory;
    }

    /**
     * Define el valor de la propiedad trxBusinessCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrxBusinessCategory(JAXBElement<String> value) {
        this.trxBusinessCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad type1099.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getType1099() {
        return type1099;
    }

    /**
     * Define el valor de la propiedad type1099.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setType1099(JAXBElement<String> value) {
        this.type1099 = value;
    }

    /**
     * Obtiene el valor de la propiedad unitOfMeasLookupCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnitOfMeasLookupCode() {
        return unitOfMeasLookupCode;
    }

    /**
     * Define el valor de la propiedad unitOfMeasLookupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnitOfMeasLookupCode(JAXBElement<String> value) {
        this.unitOfMeasLookupCode = value;
    }

    /**
     * Obtiene el valor de la propiedad unitPrice.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getUnitPrice() {
        return unitPrice;
    }

    /**
     * Define el valor de la propiedad unitPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setUnitPrice(JAXBElement<AmountType> value) {
        this.unitPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad userDefinedFiscClass.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserDefinedFiscClass() {
        return userDefinedFiscClass;
    }

    /**
     * Define el valor de la propiedad userDefinedFiscClass.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserDefinedFiscClass(JAXBElement<String> value) {
        this.userDefinedFiscClass = value;
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
     * Obtiene el valor de la propiedad vendorItemNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVendorItemNumber() {
        return vendorItemNumber;
    }

    /**
     * Define el valor de la propiedad vendorItemNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVendorItemNumber(JAXBElement<String> value) {
        this.vendorItemNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad warrantyNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWarrantyNumber() {
        return warrantyNumber;
    }

    /**
     * Define el valor de la propiedad warrantyNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWarrantyNumber(JAXBElement<String> value) {
        this.warrantyNumber = value;
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
     * Obtiene el valor de la propiedad consumptionAdviceHeaderId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getConsumptionAdviceHeaderId() {
        return consumptionAdviceHeaderId;
    }

    /**
     * Define el valor de la propiedad consumptionAdviceHeaderId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setConsumptionAdviceHeaderId(JAXBElement<Long> value) {
        this.consumptionAdviceHeaderId = value;
    }

    /**
     * Obtiene el valor de la propiedad consumptionAdviceLineId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getConsumptionAdviceLineId() {
        return consumptionAdviceLineId;
    }

    /**
     * Define el valor de la propiedad consumptionAdviceLineId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setConsumptionAdviceLineId(JAXBElement<Long> value) {
        this.consumptionAdviceLineId = value;
    }

    /**
     * Obtiene el valor de la propiedad consumptionAdviceNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsumptionAdviceNumber() {
        return consumptionAdviceNumber;
    }

    /**
     * Define el valor de la propiedad consumptionAdviceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsumptionAdviceNumber(JAXBElement<String> value) {
        this.consumptionAdviceNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad consumptionAdviceLineNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConsumptionAdviceLineNumber() {
        return consumptionAdviceLineNumber;
    }

    /**
     * Define el valor de la propiedad consumptionAdviceLineNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConsumptionAdviceLineNumber(JAXBElement<Integer> value) {
        this.consumptionAdviceLineNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad shipFromLocationId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getShipFromLocationId() {
        return shipFromLocationId;
    }

    /**
     * Define el valor de la propiedad shipFromLocationId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setShipFromLocationId(JAXBElement<Long> value) {
        this.shipFromLocationId = value;
    }

    /**
     * Obtiene el valor de la propiedad shipFromLocationCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipFromLocationCode() {
        return shipFromLocationCode;
    }

    /**
     * Define el valor de la propiedad shipFromLocationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipFromLocationCode(JAXBElement<String> value) {
        this.shipFromLocationCode = value;
    }

    /**
     * Obtiene el valor de la propiedad finalDischargeLocationId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getFinalDischargeLocationId() {
        return finalDischargeLocationId;
    }

    /**
     * Define el valor de la propiedad finalDischargeLocationId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setFinalDischargeLocationId(JAXBElement<Long> value) {
        this.finalDischargeLocationId = value;
    }

    /**
     * Obtiene el valor de la propiedad finalDischargeLocationCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFinalDischargeLocationCode() {
        return finalDischargeLocationCode;
    }

    /**
     * Define el valor de la propiedad finalDischargeLocationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFinalDischargeLocationCode(JAXBElement<String> value) {
        this.finalDischargeLocationCode = value;
    }

    /**
     * Obtiene el valor de la propiedad pjcExpenditureTypeName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPjcExpenditureTypeName() {
        return pjcExpenditureTypeName;
    }

    /**
     * Define el valor de la propiedad pjcExpenditureTypeName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPjcExpenditureTypeName(JAXBElement<String> value) {
        this.pjcExpenditureTypeName = value;
    }

    /**
     * Obtiene el valor de la propiedad pjcOrganizationName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPjcOrganizationName() {
        return pjcOrganizationName;
    }

    /**
     * Define el valor de la propiedad pjcOrganizationName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPjcOrganizationName(JAXBElement<String> value) {
        this.pjcOrganizationName = value;
    }

    /**
     * Obtiene el valor de la propiedad pjcProjectName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPjcProjectName() {
        return pjcProjectName;
    }

    /**
     * Define el valor de la propiedad pjcProjectName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPjcProjectName(JAXBElement<String> value) {
        this.pjcProjectName = value;
    }

    /**
     * Obtiene el valor de la propiedad pjcTaskNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPjcTaskNumber() {
        return pjcTaskNumber;
    }

    /**
     * Define el valor de la propiedad pjcTaskNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPjcTaskNumber(JAXBElement<String> value) {
        this.pjcTaskNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad pjcProjectNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPjcProjectNumber() {
        return pjcProjectNumber;
    }

    /**
     * Define el valor de la propiedad pjcProjectNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPjcProjectNumber(JAXBElement<String> value) {
        this.pjcProjectNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad pjcTaskName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPjcTaskName() {
        return pjcTaskName;
    }

    /**
     * Define el valor de la propiedad pjcTaskName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPjcTaskName(JAXBElement<String> value) {
        this.pjcTaskName = value;
    }

    /**
     * Obtiene el valor de la propiedad pjcWorkType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPjcWorkType() {
        return pjcWorkType;
    }

    /**
     * Define el valor de la propiedad pjcWorkType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPjcWorkType(JAXBElement<String> value) {
        this.pjcWorkType = value;
    }

    /**
     * Obtiene el valor de la propiedad pjcContractName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPjcContractName() {
        return pjcContractName;
    }

    /**
     * Define el valor de la propiedad pjcContractName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPjcContractName(JAXBElement<String> value) {
        this.pjcContractName = value;
    }

    /**
     * Obtiene el valor de la propiedad pjcContractNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPjcContractNumber() {
        return pjcContractNumber;
    }

    /**
     * Define el valor de la propiedad pjcContractNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPjcContractNumber(JAXBElement<String> value) {
        this.pjcContractNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad pjcFundingSourceName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPjcFundingSourceName() {
        return pjcFundingSourceName;
    }

    /**
     * Define el valor de la propiedad pjcFundingSourceName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPjcFundingSourceName(JAXBElement<String> value) {
        this.pjcFundingSourceName = value;
    }

    /**
     * Obtiene el valor de la propiedad pjcFundingSourceNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPjcFundingSourceNumber() {
        return pjcFundingSourceNumber;
    }

    /**
     * Define el valor de la propiedad pjcFundingSourceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPjcFundingSourceNumber(JAXBElement<String> value) {
        this.pjcFundingSourceNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad defAcctgAccrualCcid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDefAcctgAccrualCcid() {
        return defAcctgAccrualCcid;
    }

    /**
     * Define el valor de la propiedad defAcctgAccrualCcid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDefAcctgAccrualCcid(JAXBElement<Long> value) {
        this.defAcctgAccrualCcid = value;
    }

    /**
     * Obtiene el valor de la propiedad defAccrualCodeConcatenated.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDefAccrualCodeConcatenated() {
        return defAccrualCodeConcatenated;
    }

    /**
     * Define el valor de la propiedad defAccrualCodeConcatenated.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDefAccrualCodeConcatenated(JAXBElement<String> value) {
        this.defAccrualCodeConcatenated = value;
    }

    /**
     * Gets the value of the invoiceLineRejection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceLineRejection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceLineRejection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceLineRejection }
     * 
     * 
     */
    public List<InvoiceLineRejection> getInvoiceLineRejection() {
        if (invoiceLineRejection == null) {
            invoiceLineRejection = new ArrayList<InvoiceLineRejection>();
        }
        return this.invoiceLineRejection;
    }

}
