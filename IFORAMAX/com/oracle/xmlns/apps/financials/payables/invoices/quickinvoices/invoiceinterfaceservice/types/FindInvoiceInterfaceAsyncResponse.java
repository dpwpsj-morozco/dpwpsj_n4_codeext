
package com.oracle.xmlns.apps.financials.payables.invoices.quickinvoices.invoiceinterfaceservice.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.financials.payables.invoices.quickinvoices.invoiceinterfaceservice.InvoiceInterfaceHeaderResult;


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
 *         &lt;element name="result" type="{http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/}InvoiceInterfaceHeaderResult"/>
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
    "result"
})
@XmlRootElement(name = "findInvoiceInterfaceAsyncResponse")
public class FindInvoiceInterfaceAsyncResponse {

    @XmlElement(required = true)
    protected InvoiceInterfaceHeaderResult result;

    /**
     * Obtiene el valor de la propiedad result.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceInterfaceHeaderResult }
     *     
     */
    public InvoiceInterfaceHeaderResult getResult() {
        return result;
    }

    /**
     * Define el valor de la propiedad result.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceInterfaceHeaderResult }
     *     
     */
    public void setResult(InvoiceInterfaceHeaderResult value) {
        this.result = value;
    }

}
