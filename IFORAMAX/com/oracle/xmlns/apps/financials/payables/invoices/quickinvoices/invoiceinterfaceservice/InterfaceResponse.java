
package com.oracle.xmlns.apps.financials.payables.invoices.quickinvoices.invoiceinterfaceservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InterfaceResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InterfaceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReturnCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterfaceResponse", propOrder = {
    "returnCode",
    "returnMessage"
})
public class InterfaceResponse {

    @XmlElementRef(name = "ReturnCode", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> returnCode;
    @XmlElementRef(name = "ReturnMessage", namespace = "http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> returnMessage;

    /**
     * Obtiene el valor de la propiedad returnCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReturnCode() {
        return returnCode;
    }

    /**
     * Define el valor de la propiedad returnCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReturnCode(JAXBElement<String> value) {
        this.returnCode = value;
    }

    /**
     * Obtiene el valor de la propiedad returnMessage.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReturnMessage() {
        return returnMessage;
    }

    /**
     * Define el valor de la propiedad returnMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReturnMessage(JAXBElement<String> value) {
        this.returnMessage = value;
    }

}
