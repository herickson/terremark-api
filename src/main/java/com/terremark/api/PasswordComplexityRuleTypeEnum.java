
package com.terremark.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PasswordComplexityRuleTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PasswordComplexityRuleTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Custom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PasswordComplexityRuleTypeEnum")
@XmlEnum
public enum PasswordComplexityRuleTypeEnum {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Custom")
    CUSTOM("Custom");
    private final String value;

    PasswordComplexityRuleTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PasswordComplexityRuleTypeEnum fromValue(String v) {
        for (PasswordComplexityRuleTypeEnum c: PasswordComplexityRuleTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
