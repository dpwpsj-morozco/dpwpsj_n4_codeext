
package com.oracle.xmlns.adf.svc.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FindCriteria complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FindCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fetchStart" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fetchSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="filter" type="{http://xmlns.oracle.com/adf/svc/types/}ViewCriteria" minOccurs="0"/>
 *         &lt;element name="sortOrder" type="{http://xmlns.oracle.com/adf/svc/types/}SortOrder" minOccurs="0"/>
 *         &lt;element name="findAttribute" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="excludeAttribute" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="childFindCriteria" type="{http://xmlns.oracle.com/adf/svc/types/}ChildFindCriteria" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindCriteria", propOrder = {
    "fetchStart",
    "fetchSize",
    "filter",
    "sortOrder",
    "findAttribute",
    "excludeAttribute",
    "childFindCriteria"
})
@XmlSeeAlso({
    ChildFindCriteria.class
})
public class FindCriteria {

    @XmlElement(defaultValue = "0")
    protected int fetchStart;
    @XmlElement(defaultValue = "-1")
    protected int fetchSize;
    protected ViewCriteria filter;
    protected SortOrder sortOrder;
    protected List<String> findAttribute;
    @XmlElement(defaultValue = "false")
    protected boolean excludeAttribute;
    protected List<ChildFindCriteria> childFindCriteria;

    /**
     * Obtiene el valor de la propiedad fetchStart.
     * 
     */
    public int getFetchStart() {
        return fetchStart;
    }

    /**
     * Define el valor de la propiedad fetchStart.
     * 
     */
    public void setFetchStart(int value) {
        this.fetchStart = value;
    }

    /**
     * Obtiene el valor de la propiedad fetchSize.
     * 
     */
    public int getFetchSize() {
        return fetchSize;
    }

    /**
     * Define el valor de la propiedad fetchSize.
     * 
     */
    public void setFetchSize(int value) {
        this.fetchSize = value;
    }

    /**
     * Obtiene el valor de la propiedad filter.
     * 
     * @return
     *     possible object is
     *     {@link ViewCriteria }
     *     
     */
    public ViewCriteria getFilter() {
        return filter;
    }

    /**
     * Define el valor de la propiedad filter.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewCriteria }
     *     
     */
    public void setFilter(ViewCriteria value) {
        this.filter = value;
    }

    /**
     * Obtiene el valor de la propiedad sortOrder.
     * 
     * @return
     *     possible object is
     *     {@link SortOrder }
     *     
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }

    /**
     * Define el valor de la propiedad sortOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link SortOrder }
     *     
     */
    public void setSortOrder(SortOrder value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the findAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the findAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFindAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFindAttribute() {
        if (findAttribute == null) {
            findAttribute = new ArrayList<String>();
        }
        return this.findAttribute;
    }

    /**
     * Obtiene el valor de la propiedad excludeAttribute.
     * 
     */
    public boolean isExcludeAttribute() {
        return excludeAttribute;
    }

    /**
     * Define el valor de la propiedad excludeAttribute.
     * 
     */
    public void setExcludeAttribute(boolean value) {
        this.excludeAttribute = value;
    }

    /**
     * Gets the value of the childFindCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childFindCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildFindCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildFindCriteria }
     * 
     * 
     */
    public List<ChildFindCriteria> getChildFindCriteria() {
        if (childFindCriteria == null) {
            childFindCriteria = new ArrayList<ChildFindCriteria>();
        }
        return this.childFindCriteria;
    }

}
