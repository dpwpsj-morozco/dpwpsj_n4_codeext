
package com.oracle.xmlns.adf.svc.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.adf.svc.errors.ServiceMessage;
import com.oracle.xmlns.apps.financials.payables.invoices.quickinvoices.invoiceinterfaceservice.InterfaceResponseResult;
import com.oracle.xmlns.apps.financials.payables.invoices.quickinvoices.invoiceinterfaceservice.InvoiceInterfaceHeaderResult;


/**
 * <p>Clase Java para MethodResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MethodResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Message" type="{http://xmlns.oracle.com/adf/svc/errors/}ServiceMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MethodResult", propOrder = {
    "message"
})
@XmlSeeAlso({
    InvoiceInterfaceHeaderResult.class,
    InterfaceResponseResult.class,
    BigIntegerResult.class,
    DateResult.class,
    DoubleResult.class,
    DataObjectResult.class,
    LongResult.class,
    BigDecimalResult.class,
    BooleanResult.class,
    TimestampResult.class,
    ShortResult.class,
    BytesResult.class,
    FloatResult.class,
    TimeResult.class,
    StringResult.class,
    DataHandlerResult.class,
    ByteResult.class,
    IntegerResult.class
})
public class MethodResult {

    @XmlElement(name = "Message")
    protected List<ServiceMessage> message;

    /**
     * Gets the value of the message property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the message property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceMessage }
     * 
     * 
     */
    public List<ServiceMessage> getMessage() {
        if (message == null) {
            message = new ArrayList<ServiceMessage>();
        }
        return this.message;
    }

}
