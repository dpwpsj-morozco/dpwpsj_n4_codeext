
package com.oracle.xmlns.oxp.service.v2;

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
 *         &lt;element name="reportAbsPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newMobileAppDefn" type="{http://xmlns.oracle.com/oxp/service/v2}MobileAppDefinition"/>
 *         &lt;element name="bipSessionToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "reportAbsPath",
    "newMobileAppDefn",
    "bipSessionToken"
})
@XmlRootElement(name = "updateMobileAppDefinitionInSession")
public class UpdateMobileAppDefinitionInSession {

    @XmlElement(required = true)
    protected String reportAbsPath;
    @XmlElement(required = true)
    protected MobileAppDefinition newMobileAppDefn;
    @XmlElement(required = true)
    protected String bipSessionToken;

    /**
     * Obtiene el valor de la propiedad reportAbsPath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportAbsPath() {
        return reportAbsPath;
    }

    /**
     * Define el valor de la propiedad reportAbsPath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportAbsPath(String value) {
        this.reportAbsPath = value;
    }

    /**
     * Obtiene el valor de la propiedad newMobileAppDefn.
     * 
     * @return
     *     possible object is
     *     {@link MobileAppDefinition }
     *     
     */
    public MobileAppDefinition getNewMobileAppDefn() {
        return newMobileAppDefn;
    }

    /**
     * Define el valor de la propiedad newMobileAppDefn.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileAppDefinition }
     *     
     */
    public void setNewMobileAppDefn(MobileAppDefinition value) {
        this.newMobileAppDefn = value;
    }

    /**
     * Obtiene el valor de la propiedad bipSessionToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBipSessionToken() {
        return bipSessionToken;
    }

    /**
     * Define el valor de la propiedad bipSessionToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBipSessionToken(String value) {
        this.bipSessionToken = value;
    }

}
