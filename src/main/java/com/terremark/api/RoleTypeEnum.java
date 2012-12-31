
package com.terremark.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoleTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Organization"/>
 *     &lt;enumeration value="Environment"/>
 *     &lt;enumeration value="SecurityGroup"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleTypeEnum")
@XmlEnum
public enum RoleTypeEnum {

    @XmlEnumValue("Organization")
    ORGANIZATION("Organization"),
    @XmlEnumValue("Environment")
    ENVIRONMENT("Environment"),
    @XmlEnumValue("SecurityGroup")
    SECURITY_GROUP("SecurityGroup");
    private final String value;

    RoleTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoleTypeEnum fromValue(String v) {
        for (RoleTypeEnum c: RoleTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
