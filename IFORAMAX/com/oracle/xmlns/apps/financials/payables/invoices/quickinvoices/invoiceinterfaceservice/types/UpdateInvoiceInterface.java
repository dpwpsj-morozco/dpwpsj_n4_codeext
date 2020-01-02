
package com.oracle.xmlns.apps.financials.payables.invoices.quickinvoices.invoiceinterfaceservice.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
    "invoiceInterfaceHeader"
})
@XmlRootElement(name = "updateInvoiceInterface")
public class UpdateInvoiceInterface {

    @XmlElement(required = true)
    protected InvoiceInterfaceHeader invoiceInterfaceHeader;

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

}
