
package com.terremark.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ToolsStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ToolsStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotInstalled"/>
 *     &lt;enumeration value="NotRunning"/>
 *     &lt;enumeration value="OutOfDate"/>
 *     &lt;enumeration value="Current"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ToolsStatus")
@XmlEnum
public enum ToolsStatus {

    @XmlEnumValue("NotInstalled")
    NOT_INSTALLED("NotInstalled"),
    @XmlEnumValue("NotRunning")
    NOT_RUNNING("NotRunning"),
    @XmlEnumValue("OutOfDate")
    OUT_OF_DATE("OutOfDate"),
    @XmlEnumValue("Current")
    CURRENT("Current");
    private final String value;

    ToolsStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ToolsStatus fromValue(String v) {
        for (ToolsStatus c: ToolsStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
