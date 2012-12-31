
package com.terremark.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersistenceTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PersistenceTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="SourceIp"/>
 *     &lt;enumeration value="SslSession"/>
 *     &lt;enumeration value="CookieInsert"/>
 *     &lt;enumeration value="SessionCookie"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PersistenceTypeEnum")
@XmlEnum
public enum PersistenceTypeEnum {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("SourceIp")
    SOURCE_IP("SourceIp"),
    @XmlEnumValue("SslSession")
    SSL_SESSION("SslSession"),
    @XmlEnumValue("CookieInsert")
    COOKIE_INSERT("CookieInsert"),
    @XmlEnumValue("SessionCookie")
    SESSION_COOKIE("SessionCookie");
    private final String value;

    PersistenceTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersistenceTypeEnum fromValue(String v) {
        for (PersistenceTypeEnum c: PersistenceTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
