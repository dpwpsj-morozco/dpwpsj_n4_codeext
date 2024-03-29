
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
 *         &lt;element name="getReportDefinitionReturn" type="{http://xmlns.oracle.com/oxp/service/v2}ReportDefinition"/>
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
    "getReportDefinitionReturn"
})
@XmlRootElement(name = "getReportDefinitionResponse")
public class GetReportDefinitionResponse {

    @XmlElement(required = true)
    protected ReportDefinition getReportDefinitionReturn;

    /**
     * Obtiene el valor de la propiedad getReportDefinitionReturn.
     * 
     * @return
     *     possible object is
     *     {@link ReportDefinition }
     *     
     */
    public ReportDefinition getGetReportDefinitionReturn() {
        return getReportDefinitionReturn;
    }

    /**
     * Define el valor de la propiedad getReportDefinitionReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDefinition }
     *     
     */
    public void setGetReportDefinitionReturn(ReportDefinition value) {
        this.getReportDefinitionReturn = value;
    }

}
