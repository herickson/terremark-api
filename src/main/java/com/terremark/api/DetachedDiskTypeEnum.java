
package com.terremark.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetachedDiskTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DetachedDiskTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="System"/>
 *     &lt;enumeration value="Data"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DetachedDiskTypeEnum")
@XmlEnum
public enum DetachedDiskTypeEnum {

    @XmlEnumValue("System")
    SYSTEM("System"),
    @XmlEnumValue("Data")
    DATA("Data");
    private final String value;

    DetachedDiskTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DetachedDiskTypeEnum fromValue(String v) {
        for (DetachedDiskTypeEnum c: DetachedDiskTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
