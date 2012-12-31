
package com.terremark.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomizationTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomizationTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Windows"/>
 *     &lt;enumeration value="Linux"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomizationTypeEnum")
@XmlEnum
public enum CustomizationTypeEnum {

    @XmlEnumValue("Windows")
    WINDOWS("Windows"),
    @XmlEnumValue("Linux")
    LINUX("Linux");
    private final String value;

    CustomizationTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomizationTypeEnum fromValue(String v) {
        for (CustomizationTypeEnum c: CustomizationTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
