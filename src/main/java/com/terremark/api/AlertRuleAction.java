
package com.terremark.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertRuleAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlertRuleAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DoNotMonitor"/>
 *     &lt;enumeration value="LogOnly"/>
 *     &lt;enumeration value="NotifyByEmail"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlertRuleAction")
@XmlEnum
public enum AlertRuleAction {

    @XmlEnumValue("DoNotMonitor")
    DO_NOT_MONITOR("DoNotMonitor"),
    @XmlEnumValue("LogOnly")
    LOG_ONLY("LogOnly"),
    @XmlEnumValue("NotifyByEmail")
    NOTIFY_BY_EMAIL("NotifyByEmail");
    private final String value;

    AlertRuleAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlertRuleAction fromValue(String v) {
        for (AlertRuleAction c: AlertRuleAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
