
package com.terremark.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Unit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Unit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MB"/>
 *     &lt;enumeration value="MHz"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Unit")
@XmlEnum
public enum Unit {

    MB("MB"),
    @XmlEnumValue("MHz")
    M_HZ("MHz");
    private final String value;

    Unit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Unit fromValue(String v) {
        for (Unit c: Unit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
