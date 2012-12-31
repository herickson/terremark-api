
package com.terremark.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NetworkTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Dmz"/>
 *     &lt;enumeration value="Internal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NetworkTypeEnum")
@XmlEnum
public enum NetworkTypeEnum {

    @XmlEnumValue("Dmz")
    DMZ("Dmz"),
    @XmlEnumValue("Internal")
    INTERNAL("Internal");
    private final String value;

    NetworkTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NetworkTypeEnum fromValue(String v) {
        for (NetworkTypeEnum c: NetworkTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
