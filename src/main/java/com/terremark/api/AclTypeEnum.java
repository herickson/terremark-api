
package com.terremark.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AclTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AclTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="internetService"/>
 *     &lt;enumeration value="custom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AclTypeEnum")
@XmlEnum
public enum AclTypeEnum {

    @XmlEnumValue("internetService")
    INTERNET_SERVICE("internetService"),
    @XmlEnumValue("custom")
    CUSTOM("custom");
    private final String value;

    AclTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AclTypeEnum fromValue(String v) {
        for (AclTypeEnum c: AclTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
