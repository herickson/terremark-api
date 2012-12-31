
package com.terremark.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoleCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="System"/>
 *     &lt;enumeration value="Custom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleCategory")
@XmlEnum
public enum RoleCategory {

    @XmlEnumValue("System")
    SYSTEM("System"),
    @XmlEnumValue("Custom")
    CUSTOM("Custom");
    private final String value;

    RoleCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoleCategory fromValue(String v) {
        for (RoleCategory c: RoleCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
