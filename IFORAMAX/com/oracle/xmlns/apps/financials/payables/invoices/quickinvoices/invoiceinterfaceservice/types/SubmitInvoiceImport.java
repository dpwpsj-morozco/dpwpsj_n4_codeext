
package com.oracle.xmlns.apps.financials.payables.invoices.quickinvoices.invoiceinterfaceservice.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ledgerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="orgId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="importSet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountingDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date"/>
 *         &lt;element name="hold" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="holdReason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="summarizeReport" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ledgerId",
    "orgId",
    "importSet",
    "groupName",
    "accountingDate",
    "hold",
    "holdReason",
    "summarizeReport"
})
@XmlRootElement(name = "submitInvoiceImport")
public class SubmitInvoiceImport {

    protected long ledgerId;
    protected long orgId;
    @XmlElement(required = true)
    protected String importSet;
    @XmlElement(required = true)
    protected String groupName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar accountingDate;
    @XmlElement(required = true)
    protected String hold;
    @XmlElement(required = true)
    protected String holdReason;
    @XmlElement(required = true)
    protected String summarizeReport;

    /**
     * Obtiene el valor de la propiedad ledgerId.
     * 
     */
    public long getLedgerId() {
        return ledgerId;
    }

    /**
     * Define el valor de la propiedad ledgerId.
     * 
     */
    public void setLedgerId(long value) {
        this.ledgerId = value;
    }

    /**
     * Obtiene el valor de la propiedad orgId.
     * 
     */
    public long getOrgId() {
        return orgId;
    }

    /**
     * Define el valor de la propiedad orgId.
     * 
     */
    public void setOrgId(long value) {
        this.orgId = value;
    }

    /**
     * Obtiene el valor de la propiedad importSet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportSet() {
        return importSet;
    }

    /**
     * Define el valor de la propiedad importSet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportSet(String value) {
        this.importSet = value;
    }

    /**
     * Obtiene el valor de la propiedad groupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Define el valor de la propiedad groupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Obtiene el valor de la propiedad accountingDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAccountingDate() {
        return accountingDate;
    }

    /**
     * Define el valor de la propiedad accountingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAccountingDate(XMLGregorianCalendar value) {
        this.accountingDate = value;
    }

    /**
     * Obtiene el valor de la propiedad hold.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHold() {
        return hold;
    }

    /**
     * Define el valor de la propiedad hold.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHold(String value) {
        this.hold = value;
    }

    /**
     * Obtiene el valor de la propiedad holdReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldReason() {
        return holdReason;
    }

    /**
     * Define el valor de la propiedad holdReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldReason(String value) {
        this.holdReason = value;
    }

    /**
     * Obtiene el valor de la propiedad summarizeReport.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummarizeReport() {
        return summarizeReport;
    }

    /**
     * Define el valor de la propiedad summarizeReport.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummarizeReport(String value) {
        this.summarizeReport = value;
    }

}
