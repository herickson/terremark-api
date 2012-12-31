
package com.terremark.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtocolTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProtocolTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HTTP"/>
 *     &lt;enumeration value="HTTPS"/>
 *     &lt;enumeration value="TCP"/>
 *     &lt;enumeration value="UDP"/>
 *     &lt;enumeration value="IPSEC"/>
 *     &lt;enumeration value="FTP"/>
 *     &lt;enumeration value="Any"/>
 *     &lt;enumeration value="TCPUDP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProtocolTypeEnum")
@XmlEnum
public enum ProtocolTypeEnum {

    HTTP("HTTP"),
    HTTPS("HTTPS"),
    TCP("TCP"),
    UDP("UDP"),
    IPSEC("IPSEC"),
    FTP("FTP"),
    @XmlEnumValue("Any")
    ANY("Any"),
    TCPUDP("TCPUDP");
    private final String value;

    ProtocolTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProtocolTypeEnum fromValue(String v) {
        for (ProtocolTypeEnum c: ProtocolTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
