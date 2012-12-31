
package com.terremark.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaskStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaskStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Queued"/>
 *     &lt;enumeration value="Running"/>
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="Complete"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaskStatus")
@XmlEnum
public enum TaskStatus {

    @XmlEnumValue("Queued")
    QUEUED("Queued"),
    @XmlEnumValue("Running")
    RUNNING("Running"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Complete")
    COMPLETE("Complete");
    private final String value;

    TaskStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaskStatus fromValue(String v) {
        for (TaskStatus c: TaskStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
