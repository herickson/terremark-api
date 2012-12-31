
package com.terremark.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoadBalancingMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoadBalancingMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RoundRobin"/>
 *     &lt;enumeration value="LeastConnection"/>
 *     &lt;enumeration value="LeastResponseTime"/>
 *     &lt;enumeration value="LeastPackets"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LoadBalancingMethod")
@XmlEnum
public enum LoadBalancingMethod {

    @XmlEnumValue("RoundRobin")
    ROUND_ROBIN("RoundRobin"),
    @XmlEnumValue("LeastConnection")
    LEAST_CONNECTION("LeastConnection"),
    @XmlEnumValue("LeastResponseTime")
    LEAST_RESPONSE_TIME("LeastResponseTime"),
    @XmlEnumValue("LeastPackets")
    LEAST_PACKETS("LeastPackets");
    private final String value;

    LoadBalancingMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoadBalancingMethod fromValue(String v) {
        for (LoadBalancingMethod c: LoadBalancingMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
