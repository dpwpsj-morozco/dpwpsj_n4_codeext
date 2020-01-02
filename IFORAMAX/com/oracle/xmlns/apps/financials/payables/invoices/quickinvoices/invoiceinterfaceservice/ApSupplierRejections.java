
package com.oracle.xmlns.apps.financials.payables.invoices.quickinvoices.invoiceinterfaceservice;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.oracle.xmlns.adf.svc.types.AmountType;


/**
 * <p>Clase Java para ApSupplierRejections complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ApSupplierRejections">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvoiceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Invoicenum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Linenumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InvoiceDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="InvoiceCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="OrgId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="VendorId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="VendorSiteId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="VendorSiteCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LoadRequestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DisplayedField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TokenName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TokenValue1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TokenName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TokenValue2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TokenName3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TokenValue3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TokenName4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TokenValue4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TokenName5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TokenValue5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TokenName6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TokenValue6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TokenName7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TokenValue7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TokenName8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TokenValue8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TokenName9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TokenValue9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TokenName10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TokenValue10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApSupplierRejections", propOrder = {
    "invoiceId",
    "invoicenum",
    "linenumber",
    "invoiceDate",
    "invoiceCurrencyCode",
    "invoiceAmount",
    "orgId",
    "vendorId",
    "vendorSiteId",
    "vendorSiteCode",
    "vendorEmailAddress",
    "parentId",
    "loadRequestId",
    "displayedField",
    "description",
    "tokenName1",
    "tokenValue1",
    "tokenName2",
    "tokenValue2",
    "tokenName3",
    "tokenValue3",
    "tokenName4",
    "tokenValue4",
    "tokenName5",
    "tokenValue5",
    "tokenName6",
    "tokenValue6",
    "tokenName7",
    "tokenValue7",
    "tokenName8",
    "tokenValue8",
    "tokenName9",
    "tokenValue9",
    "tokenName10",
    "tokenValue10"
})
public class ApSupplierRejections {

    @XmlElementRef(name = "InvoiceId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> invoiceId;
    @XmlElementRef(name = "Invoicenum", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> invoicenum;
    @XmlElementRef(name = "Linenumber", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> linenumber;
    @XmlElementRef(name = "InvoiceDate", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> invoiceDate;
    @XmlElementRef(name = "InvoiceCurrencyCode", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> invoiceCurrencyCode;
    @XmlElementRef(name = "InvoiceAmount", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> invoiceAmount;
    @XmlElementRef(name = "OrgId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> orgId;
    @XmlElementRef(name = "VendorId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> vendorId;
    @XmlElementRef(name = "VendorSiteId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> vendorSiteId;
    @XmlElementRef(name = "VendorSiteCode", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vendorSiteCode;
    @XmlElementRef(name = "VendorEmailAddress", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vendorEmailAddress;
    @XmlElementRef(name = "ParentId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> parentId;
    @XmlElementRef(name = "LoadRequestId", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> loadRequestId;
    @XmlElement(name = "DisplayedField")
    protected String displayedField;
    @XmlElementRef(name = "Description", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "TokenName1", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenName1;
    @XmlElementRef(name = "TokenValue1", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenValue1;
    @XmlElementRef(name = "TokenName2", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenName2;
    @XmlElementRef(name = "TokenValue2", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenValue2;
    @XmlElementRef(name = "TokenName3", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenName3;
    @XmlElementRef(name = "TokenValue3", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenValue3;
    @XmlElementRef(name = "TokenName4", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenName4;
    @XmlElementRef(name = "TokenValue4", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenValue4;
    @XmlElementRef(name = "TokenName5", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenName5;
    @XmlElementRef(name = "TokenValue5", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenValue5;
    @XmlElementRef(name = "TokenName6", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenName6;
    @XmlElementRef(name = "TokenValue6", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenValue6;
    @XmlElementRef(name = "TokenName7", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenName7;
    @XmlElementRef(name = "TokenValue7", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenValue7;
    @XmlElementRef(name = "TokenName8", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenName8;
    @XmlElementRef(name = "TokenValue8", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenValue8;
    @XmlElementRef(name = "TokenName9", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenName9;
    @XmlElementRef(name = "TokenValue9", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenValue9;
    @XmlElementRef(name = "TokenName10", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenName10;
    @XmlElementRef(name = "TokenValue10", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenValue10;

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
     * Obtiene el valor de la propiedad invoicenum.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvoicenum() {
        return invoicenum;
    }

    /**
     * Define el valor de la propiedad invoicenum.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvoicenum(JAXBElement<String> value) {
        this.invoicenum = value;
    }

    /**
     * Obtiene el valor de la propiedad linenumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getLinenumber() {
        return linenumber;
    }

    /**
     * Define el valor de la propiedad linenumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLinenumber(JAXBElement<BigDecimal> value) {
        this.linenumber = value;
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
     * Obtiene el valor de la propiedad invoiceAmount.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getInvoiceAmount() {
        return invoiceAmount;
    }

    /**
     * Define el valor de la propiedad invoiceAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setInvoiceAmount(JAXBElement<AmountType> value) {
        this.invoiceAmount = value;
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
     * Obtiene el valor de la propiedad vendorId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getVendorId() {
        return vendorId;
    }

    /**
     * Define el valor de la propiedad vendorId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setVendorId(JAXBElement<Long> value) {
        this.vendorId = value;
    }

    /**
     * Obtiene el valor de la propiedad vendorSiteId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getVendorSiteId() {
        return vendorSiteId;
    }

    /**
     * Define el valor de la propiedad vendorSiteId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setVendorSiteId(JAXBElement<Long> value) {
        this.vendorSiteId = value;
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
     * Obtiene el valor de la propiedad parentId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getParentId() {
        return parentId;
    }

    /**
     * Define el valor de la propiedad parentId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setParentId(JAXBElement<Long> value) {
        this.parentId = value;
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
     * Obtiene el valor de la propiedad displayedField.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayedField() {
        return displayedField;
    }

    /**
     * Define el valor de la propiedad displayedField.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayedField(String value) {
        this.displayedField = value;
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
     * Obtiene el valor de la propiedad tokenName1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenName1() {
        return tokenName1;
    }

    /**
     * Define el valor de la propiedad tokenName1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenName1(JAXBElement<String> value) {
        this.tokenName1 = value;
    }

    /**
     * Obtiene el valor de la propiedad tokenValue1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenValue1() {
        return tokenValue1;
    }

    /**
     * Define el valor de la propiedad tokenValue1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenValue1(JAXBElement<String> value) {
        this.tokenValue1 = value;
    }

    /**
     * Obtiene el valor de la propiedad tokenName2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenName2() {
        return tokenName2;
    }

    /**
     * Define el valor de la propiedad tokenName2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenName2(JAXBElement<String> value) {
        this.tokenName2 = value;
    }

    /**
     * Obtiene el valor de la propiedad tokenValue2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenValue2() {
        return tokenValue2;
    }

    /**
     * Define el valor de la propiedad tokenValue2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenValue2(JAXBElement<String> value) {
        this.tokenValue2 = value;
    }

    /**
     * Obtiene el valor de la propiedad tokenName3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenName3() {
        return tokenName3;
    }

    /**
     * Define el valor de la propiedad tokenName3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenName3(JAXBElement<String> value) {
        this.tokenName3 = value;
    }

    /**
     * Obtiene el valor de la propiedad tokenValue3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenValue3() {
        return tokenValue3;
    }

    /**
     * Define el valor de la propiedad tokenValue3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenValue3(JAXBElement<String> value) {
        this.tokenValue3 = value;
    }

    /**
     * Obtiene el valor de la propiedad tokenName4.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenName4() {
        return tokenName4;
    }

    /**
     * Define el valor de la propiedad tokenName4.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenName4(JAXBElement<String> value) {
        this.tokenName4 = value;
    }

    /**
     * Obtiene el valor de la propiedad tokenValue4.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenValue4() {
        return tokenValue4;
    }

    /**
     * Define el valor de la propiedad tokenValue4.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenValue4(JAXBElement<String> value) {
        this.tokenValue4 = value;
    }

    /**
     * Obtiene el valor de la propiedad tokenName5.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenName5() {
        return tokenName5;
    }

    /**
     * Define el valor de la propiedad tokenName5.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenName5(JAXBElement<String> value) {
        this.tokenName5 = value;
    }

    /**
     * Obtiene el valor de la propiedad tokenValue5.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenValue5() {
        return tokenValue5;
    }

    /**
     * Define el valor de la propiedad tokenValue5.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenValue5(JAXBElement<String> value) {
        this.tokenValue5 = value;
    }

    /**
     * Obtiene el valor de la propiedad tokenName6.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenName6() {
        return tokenName6;
    }

    /**
     * Define el valor de la propiedad tokenName6.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenName6(JAXBElement<String> value) {
        this.tokenName6 = value;
    }

    /**
     * Obtiene el valor de la propiedad tokenValue6.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenValue6() {
        return tokenValue6;
    }

    /**
     * Define el valor de la propiedad tokenValue6.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenValue6(JAXBElement<String> value) {
        this.tokenValue6 = value;
    }

    /**
     * Obtiene el valor de la propiedad tokenName7.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenName7() {
        return tokenName7;
    }

    /**
     * Define el valor de la propiedad tokenName7.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenName7(JAXBElement<String> value) {
        this.tokenName7 = value;
    }

    /**
     * Obtiene el valor de la propiedad tokenValue7.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenValue7() {
        return tokenValue7;
    }

    /**
     * Define el valor de la propiedad tokenValue7.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenValue7(JAXBElement<String> value) {
        this.tokenValue7 = value;
    }

    /**
     * Obtiene el valor de la propiedad tokenName8.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenName8() {
        return tokenName8;
    }

    /**
     * Define el valor de la propiedad tokenName8.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenName8(JAXBElement<String> value) {
        this.tokenName8 = value;
    }

    /**
     * Obtiene el valor de la propiedad tokenValue8.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenValue8() {
        return tokenValue8;
    }

    /**
     * Define el valor de la propiedad tokenValue8.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenValue8(JAXBElement<String> value) {
        this.tokenValue8 = value;
    }

    /**
     * Obtiene el valor de la propiedad tokenName9.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenName9() {
        return tokenName9;
    }

    /**
     * Define el valor de la propiedad tokenName9.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenName9(JAXBElement<String> value) {
        this.tokenName9 = value;
    }

    /**
     * Obtiene el valor de la propiedad tokenValue9.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenValue9() {
        return tokenValue9;
    }

    /**
     * Define el valor de la propiedad tokenValue9.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenValue9(JAXBElement<String> value) {
        this.tokenValue9 = value;
    }

    /**
     * Obtiene el valor de la propiedad tokenName10.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenName10() {
        return tokenName10;
    }

    /**
     * Define el valor de la propiedad tokenName10.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenName10(JAXBElement<String> value) {
        this.tokenName10 = value;
    }

    /**
     * Obtiene el valor de la propiedad tokenValue10.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenValue10() {
        return tokenValue10;
    }

    /**
     * Define el valor de la propiedad tokenValue10.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenValue10(JAXBElement<String> value) {
        this.tokenValue10 = value;
    }

}
