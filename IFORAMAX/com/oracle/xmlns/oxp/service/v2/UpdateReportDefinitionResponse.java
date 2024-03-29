
package com.oracle.xmlns.oxp.service.v2;

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
 *         &lt;element name="updateReportDefinitionReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "updateReportDefinitionReturn"
})
@XmlRootElement(name = "updateReportDefinitionResponse")
public class UpdateReportDefinitionResponse {

    protected boolean updateReportDefinitionReturn;

    /**
     * Obtiene el valor de la propiedad updateReportDefinitionReturn.
     * 
     */
    public boolean isUpdateReportDefinitionReturn() {
        return updateReportDefinitionReturn;
    }

    /**
     * Define el valor de la propiedad updateReportDefinitionReturn.
     * 
     */
    public void setUpdateReportDefinitionReturn(boolean value) {
        this.updateReportDefinitionReturn = value;
    }

}
