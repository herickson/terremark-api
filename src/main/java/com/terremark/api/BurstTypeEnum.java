
package com.terremark.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BurstTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BurstTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Memory"/>
 *     &lt;enumeration value="Processor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BurstTypeEnum")
@XmlEnum
public enum BurstTypeEnum {

    @XmlEnumValue("Memory")
    MEMORY("Memory"),
    @XmlEnumValue("Processor")
    PROCESSOR("Processor");
    private final String value;

    BurstTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BurstTypeEnum fromValue(String v) {
        for (BurstTypeEnum c: BurstTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
