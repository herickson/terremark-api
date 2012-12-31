
package com.terremark.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertEventTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlertEventTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Alarm"/>
 *     &lt;enumeration value="StartIncident"/>
 *     &lt;enumeration value="InIncident"/>
 *     &lt;enumeration value="EndIncident"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlertEventTypeEnum")
@XmlEnum
public enum AlertEventTypeEnum {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Alarm")
    ALARM("Alarm"),
    @XmlEnumValue("StartIncident")
    START_INCIDENT("StartIncident"),
    @XmlEnumValue("InIncident")
    IN_INCIDENT("InIncident"),
    @XmlEnumValue("EndIncident")
    END_INCIDENT("EndIncident");
    private final String value;

    AlertEventTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlertEventTypeEnum fromValue(String v) {
        for (AlertEventTypeEnum c: AlertEventTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
