
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
 *         &lt;element name="removeTemplateForReportInSessionReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "removeTemplateForReportInSessionReturn"
})
@XmlRootElement(name = "removeTemplateForReportInSessionResponse")
public class RemoveTemplateForReportInSessionResponse {

    protected boolean removeTemplateForReportInSessionReturn;

    /**
     * Obtiene el valor de la propiedad removeTemplateForReportInSessionReturn.
     * 
     */
    public boolean isRemoveTemplateForReportInSessionReturn() {
        return removeTemplateForReportInSessionReturn;
    }

    /**
     * Define el valor de la propiedad removeTemplateForReportInSessionReturn.
     * 
     */
    public void setRemoveTemplateForReportInSessionReturn(boolean value) {
        this.removeTemplateForReportInSessionReturn = value;
    }

}
