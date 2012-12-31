
package com.terremark.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FirewallAclEndpointTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FirewallAclEndpointTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Any"/>
 *     &lt;enumeration value="IpAddress"/>
 *     &lt;enumeration value="Network"/>
 *     &lt;enumeration value="ExternalIp"/>
 *     &lt;enumeration value="ExternalNetwork"/>
 *     &lt;enumeration value="TrustedNetworkGroup"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FirewallAclEndpointTypeEnum")
@XmlEnum
public enum FirewallAclEndpointTypeEnum {

    @XmlEnumValue("Any")
    ANY("Any"),
    @XmlEnumValue("IpAddress")
    IP_ADDRESS("IpAddress"),
    @XmlEnumValue("Network")
    NETWORK("Network"),
    @XmlEnumValue("ExternalIp")
    EXTERNAL_IP("ExternalIp"),
    @XmlEnumValue("ExternalNetwork")
    EXTERNAL_NETWORK("ExternalNetwork"),
    @XmlEnumValue("TrustedNetworkGroup")
    TRUSTED_NETWORK_GROUP("TrustedNetworkGroup");
    private final String value;

    FirewallAclEndpointTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FirewallAclEndpointTypeEnum fromValue(String v) {
        for (FirewallAclEndpointTypeEnum c: FirewallAclEndpointTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
