
package com.oracle.xmlns.adf.svc.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FindControl complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FindControl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="retrieveAllTranslations" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindControl", propOrder = {
    "retrieveAllTranslations"
})
public class FindControl {

    @XmlElement(defaultValue = "false")
    protected boolean retrieveAllTranslations;

    /**
     * Obtiene el valor de la propiedad retrieveAllTranslations.
     * 
     */
    public boolean isRetrieveAllTranslations() {
        return retrieveAllTranslations;
    }

    /**
     * Define el valor de la propiedad retrieveAllTranslations.
     * 
     */
    public void setRetrieveAllTranslations(boolean value) {
        this.retrieveAllTranslations = value;
    }

}
