
package com.oracle.xmlns.adf.svc.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReturnMode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ReturnMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Full"/>
 *     &lt;enumeration value="Key"/>
 *     &lt;enumeration value="None"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReturnMode")
@XmlEnum
public enum ReturnMode {

    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("Key")
    KEY("Key"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    ReturnMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReturnMode fromValue(String v) {
        for (ReturnMode c: ReturnMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
