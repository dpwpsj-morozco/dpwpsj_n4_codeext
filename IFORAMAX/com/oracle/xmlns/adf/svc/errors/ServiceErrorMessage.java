
package com.oracle.xmlns.adf.svc.errors;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ServiceErrorMessage complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ServiceErrorMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/adf/svc/errors/}ServiceMessage">
 *       &lt;sequence>
 *         &lt;element name="sdoObject" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="exceptionClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceErrorMessage", propOrder = {
    "sdoObject",
    "exceptionClassName"
})
@XmlSeeAlso({
    ServiceDMLErrorMessage.class,
    ServiceAttrValErrorMessage.class,
    ServiceRowValErrorMessage.class
})
public class ServiceErrorMessage
    extends ServiceMessage
{

    protected Object sdoObject;
    protected String exceptionClassName;

    /**
     * Obtiene el valor de la propiedad sdoObject.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSdoObject() {
        return sdoObject;
    }

    /**
     * Define el valor de la propiedad sdoObject.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSdoObject(Object value) {
        this.sdoObject = value;
    }

    /**
     * Obtiene el valor de la propiedad exceptionClassName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionClassName() {
        return exceptionClassName;
    }

    /**
     * Define el valor de la propiedad exceptionClassName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionClassName(String value) {
        this.exceptionClassName = value;
    }

}
