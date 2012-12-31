
package com.terremark.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlertTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Alarm"/>
 *     &lt;enumeration value="Incident"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlertTypeEnum")
@XmlEnum
public enum AlertTypeEnum {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Alarm")
    ALARM("Alarm"),
    @XmlEnumValue("Incident")
    INCIDENT("Incident");
    private final String value;

    AlertTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlertTypeEnum fromValue(String v) {
        for (AlertTypeEnum c: AlertTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
