
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
 *         &lt;element name="getReportParametersInSessionReturn" type="{http://xmlns.oracle.com/oxp/service/v2}ParamNameValues"/>
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
    "getReportParametersInSessionReturn"
})
@XmlRootElement(name = "getReportParametersInSessionResponse")
public class GetReportParametersInSessionResponse {

    @XmlElement(required = true)
    protected ParamNameValues getReportParametersInSessionReturn;

    /**
     * Obtiene el valor de la propiedad getReportParametersInSessionReturn.
     * 
     * @return
     *     possible object is
     *     {@link ParamNameValues }
     *     
     */
    public ParamNameValues getGetReportParametersInSessionReturn() {
        return getReportParametersInSessionReturn;
    }

    /**
     * Define el valor de la propiedad getReportParametersInSessionReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamNameValues }
     *     
     */
    public void setGetReportParametersInSessionReturn(ParamNameValues value) {
        this.getReportParametersInSessionReturn = value;
    }

}
