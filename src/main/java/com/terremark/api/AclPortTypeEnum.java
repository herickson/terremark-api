
package com.terremark.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AclPortTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AclPortTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Any"/>
 *     &lt;enumeration value="Specific"/>
 *     &lt;enumeration value="Range"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AclPortTypeEnum")
@XmlEnum
public enum AclPortTypeEnum {

    @XmlEnumValue("Any")
    ANY("Any"),
    @XmlEnumValue("Specific")
    SPECIFIC("Specific"),
    @XmlEnumValue("Range")
    RANGE("Range");
    private final String value;

    AclPortTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AclPortTypeEnum fromValue(String v) {
        for (AclPortTypeEnum c: AclPortTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
