
package com.terremark.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublicIpTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PublicIpTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="rnat"/>
 *     &lt;enumeration value="defaultRnat"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PublicIpTypeEnum")
@XmlEnum
public enum PublicIpTypeEnum {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("rnat")
    RNAT("rnat"),
    @XmlEnumValue("defaultRnat")
    DEFAULT_RNAT("defaultRnat");
    private final String value;

    PublicIpTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PublicIpTypeEnum fromValue(String v) {
        for (PublicIpTypeEnum c: PublicIpTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
