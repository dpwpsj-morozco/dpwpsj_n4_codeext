
package com.oracle.xmlns.adf.svc.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ChildFindCriteria complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ChildFindCriteria">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/adf/svc/types/}FindCriteria">
 *       &lt;sequence>
 *         &lt;element name="childAttrName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChildFindCriteria", propOrder = {
    "childAttrName"
})
public class ChildFindCriteria
    extends FindCriteria
{

    @XmlElement(required = true)
    protected String childAttrName;

    /**
     * Obtiene el valor de la propiedad childAttrName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildAttrName() {
        return childAttrName;
    }

    /**
     * Define el valor de la propiedad childAttrName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildAttrName(String value) {
        this.childAttrName = value;
    }

}
