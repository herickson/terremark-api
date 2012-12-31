
package com.terremark.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingUnit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BillingUnit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Each"/>
 *     &lt;enumeration value="GHz"/>
 *     &lt;enumeration value="GB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BillingUnit")
@XmlEnum
public enum BillingUnit {

    @XmlEnumValue("Each")
    EACH("Each"),
    @XmlEnumValue("GHz")
    G_HZ("GHz"),
    GB("GB");
    private final String value;

    BillingUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BillingUnit fromValue(String v) {
        for (BillingUnit c: BillingUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
