
package com.oracle.xmlns.apps.financials.payables.invoices.quickinvoices.invoiceinterfaceservice.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="VendorEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "requestId",
    "vendorEmailAddress"
})
@XmlRootElement(name = "getSupplierRejectionsAsync")
public class GetSupplierRejectionsAsync {

    @XmlElement(name = "RequestId")
    protected long requestId;
    @XmlElement(name = "VendorEmailAddress", required = true)
    protected String vendorEmailAddress;

    /**
     * Obtiene el valor de la propiedad requestId.
     * 
     */
    public long getRequestId() {
        return requestId;
    }

    /**
     * Define el valor de la propiedad requestId.
     * 
     */
    public void setRequestId(long value) {
        this.requestId = value;
    }

    /**
     * Obtiene el valor de la propiedad vendorEmailAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorEmailAddress() {
        return vendorEmailAddress;
    }

    /**
     * Define el valor de la propiedad vendorEmailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorEmailAddress(String value) {
        this.vendorEmailAddress = value;
    }

}
