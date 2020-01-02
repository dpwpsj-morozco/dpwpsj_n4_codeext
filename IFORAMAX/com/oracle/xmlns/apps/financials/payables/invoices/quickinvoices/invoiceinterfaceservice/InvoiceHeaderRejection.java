
package com.oracle.xmlns.apps.financials.payables.invoices.quickinvoices.invoiceinterfaceservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InvoiceHeaderRejection complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvoiceHeaderRejection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RejectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RejectionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceHeaderRejection", propOrder = {
    "rejectionCode",
    "rejectionDescription"
})
public class InvoiceHeaderRejection {

    @XmlElement(name = "RejectionCode")
    protected String rejectionCode;
    @XmlElementRef(name = "RejectionDescription", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rejectionDescription;

    /**
     * Obtiene el valor de la propiedad rejectionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectionCode() {
        return rejectionCode;
    }

    /**
     * Define el valor de la propiedad rejectionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectionCode(String value) {
        this.rejectionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad rejectionDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRejectionDescription() {
        return rejectionDescription;
    }

    /**
     * Define el valor de la propiedad rejectionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRejectionDescription(JAXBElement<String> value) {
        this.rejectionDescription = value;
    }

}
