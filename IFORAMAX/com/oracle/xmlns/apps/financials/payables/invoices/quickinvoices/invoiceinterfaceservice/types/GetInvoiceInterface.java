
package com.oracle.xmlns.apps.financials.payables.invoices.quickinvoices.invoiceinterfaceservice.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="invoiceId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="loadRequestId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "invoiceId",
    "loadRequestId"
})
@XmlRootElement(name = "getInvoiceInterface")
public class GetInvoiceInterface {

    protected long invoiceId;
    protected long loadRequestId;

    /**
     * Obtiene el valor de la propiedad invoiceId.
     * 
     */
    public long getInvoiceId() {
        return invoiceId;
    }

    /**
     * Define el valor de la propiedad invoiceId.
     * 
     */
    public void setInvoiceId(long value) {
        this.invoiceId = value;
    }

    /**
     * Obtiene el valor de la propiedad loadRequestId.
     * 
     */
    public long getLoadRequestId() {
        return loadRequestId;
    }

    /**
     * Define el valor de la propiedad loadRequestId.
     * 
     */
    public void setLoadRequestId(long value) {
        this.loadRequestId = value;
    }

}
