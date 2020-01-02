
package com.oracle.xmlns.apps.financials.payables.invoices.quickinvoices.invoiceinterfaceservice.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.financials.payables.invoices.quickinvoices.invoiceinterfaceservice.AttachmentDetails;
import com.oracle.xmlns.apps.financials.payables.invoices.quickinvoices.invoiceinterfaceservice.InvoiceInterfaceHeader;


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
 *         &lt;element name="invoiceInterfaceHeader" type="{http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/}InvoiceInterfaceHeader"/>
 *         &lt;element name="attachments" type="{http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/}AttachmentDetails" maxOccurs="unbounded" minOccurs="0"/>
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
    "invoiceInterfaceHeader",
    "attachments"
})
@XmlRootElement(name = "createInvoiceInterfaceWithAttachments")
public class CreateInvoiceInterfaceWithAttachments {

    @XmlElement(required = true)
    protected InvoiceInterfaceHeader invoiceInterfaceHeader;
    protected List<AttachmentDetails> attachments;

    /**
     * Obtiene el valor de la propiedad invoiceInterfaceHeader.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceInterfaceHeader }
     *     
     */
    public InvoiceInterfaceHeader getInvoiceInterfaceHeader() {
        return invoiceInterfaceHeader;
    }

    /**
     * Define el valor de la propiedad invoiceInterfaceHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceInterfaceHeader }
     *     
     */
    public void setInvoiceInterfaceHeader(InvoiceInterfaceHeader value) {
        this.invoiceInterfaceHeader = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentDetails }
     * 
     * 
     */
    public List<AttachmentDetails> getAttachments() {
        if (attachments == null) {
            attachments = new ArrayList<AttachmentDetails>();
        }
        return this.attachments;
    }

}
