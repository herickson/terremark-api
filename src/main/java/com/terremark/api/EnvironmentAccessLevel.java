
package com.terremark.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnvironmentAccessLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnvironmentAccessLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoAccess"/>
 *     &lt;enumeration value="ReadOnly"/>
 *     &lt;enumeration value="User"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnvironmentAccessLevel")
@XmlEnum
public enum EnvironmentAccessLevel {

    @XmlEnumValue("NoAccess")
    NO_ACCESS("NoAccess"),
    @XmlEnumValue("ReadOnly")
    READ_ONLY("ReadOnly"),
    @XmlEnumValue("User")
    USER("User");
    private final String value;

    EnvironmentAccessLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnvironmentAccessLevel fromValue(String v) {
        for (EnvironmentAccessLevel c: EnvironmentAccessLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
