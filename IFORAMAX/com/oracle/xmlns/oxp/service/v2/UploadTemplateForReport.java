
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
 *         &lt;element name="reportAbsolutePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="templateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="templateType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="locale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="templateData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "reportAbsolutePath",
    "templateName",
    "templateType",
    "locale",
    "templateData",
    "userID",
    "password"
})
@XmlRootElement(name = "uploadTemplateForReport")
public class UploadTemplateForReport {

    @XmlElement(required = true)
    protected String reportAbsolutePath;
    @XmlElement(required = true)
    protected String templateName;
    @XmlElement(required = true)
    protected String templateType;
    @XmlElement(required = true)
    protected String locale;
    @XmlElement(required = true)
    protected byte[] templateData;
    @XmlElement(required = true)
    protected String userID;
    @XmlElement(required = true)
    protected String password;

    /**
     * Obtiene el valor de la propiedad reportAbsolutePath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportAbsolutePath() {
        return reportAbsolutePath;
    }

    /**
     * Define el valor de la propiedad reportAbsolutePath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportAbsolutePath(String value) {
        this.reportAbsolutePath = value;
    }

    /**
     * Obtiene el valor de la propiedad templateName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * Define el valor de la propiedad templateName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateName(String value) {
        this.templateName = value;
    }

    /**
     * Obtiene el valor de la propiedad templateType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateType() {
        return templateType;
    }

    /**
     * Define el valor de la propiedad templateType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateType(String value) {
        this.templateType = value;
    }

    /**
     * Obtiene el valor de la propiedad locale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Define el valor de la propiedad locale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * Obtiene el valor de la propiedad templateData.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTemplateData() {
        return templateData;
    }

    /**
     * Define el valor de la propiedad templateData.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setTemplateData(byte[] value) {
        this.templateData = value;
    }

    /**
     * Obtiene el valor de la propiedad userID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Define el valor de la propiedad userID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

}
