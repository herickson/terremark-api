
package com.terremark.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoftwareTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SoftwareTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OperatingSystem"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SoftwareTypeEnum")
@XmlEnum
public enum SoftwareTypeEnum {

    @XmlEnumValue("OperatingSystem")
    OPERATING_SYSTEM("OperatingSystem"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    SoftwareTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoftwareTypeEnum fromValue(String v) {
        for (SoftwareTypeEnum c: SoftwareTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
