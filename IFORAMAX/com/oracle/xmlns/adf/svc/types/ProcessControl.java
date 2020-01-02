
package com.oracle.xmlns.adf.svc.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ProcessControl complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProcessControl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnMode" type="{http://xmlns.oracle.com/adf/svc/types/}ReturnMode" minOccurs="0"/>
 *         &lt;element name="exceptionReturnMode" type="{http://xmlns.oracle.com/adf/svc/types/}ReturnMode" minOccurs="0"/>
 *         &lt;element name="partialFailureAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessControl", propOrder = {
    "returnMode",
    "exceptionReturnMode",
    "partialFailureAllowed"
})
public class ProcessControl {

    @XmlSchemaType(name = "string")
    protected ReturnMode returnMode;
    @XmlSchemaType(name = "string")
    protected ReturnMode exceptionReturnMode;
    @XmlElement(defaultValue = "false")
    protected boolean partialFailureAllowed;

    /**
     * Obtiene el valor de la propiedad returnMode.
     * 
     * @return
     *     possible object is
     *     {@link ReturnMode }
     *     
     */
    public ReturnMode getReturnMode() {
        return returnMode;
    }

    /**
     * Define el valor de la propiedad returnMode.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnMode }
     *     
     */
    public void setReturnMode(ReturnMode value) {
        this.returnMode = value;
    }

    /**
     * Obtiene el valor de la propiedad exceptionReturnMode.
     * 
     * @return
     *     possible object is
     *     {@link ReturnMode }
     *     
     */
    public ReturnMode getExceptionReturnMode() {
        return exceptionReturnMode;
    }

    /**
     * Define el valor de la propiedad exceptionReturnMode.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnMode }
     *     
     */
    public void setExceptionReturnMode(ReturnMode value) {
        this.exceptionReturnMode = value;
    }

    /**
     * Obtiene el valor de la propiedad partialFailureAllowed.
     * 
     */
    public boolean isPartialFailureAllowed() {
        return partialFailureAllowed;
    }

    /**
     * Define el valor de la propiedad partialFailureAllowed.
     * 
     */
    public void setPartialFailureAllowed(boolean value) {
        this.partialFailureAllowed = value;
    }

}
