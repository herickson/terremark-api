
package com.terremark.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VirtualMachineStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotDeployed"/>
 *     &lt;enumeration value="Deployed"/>
 *     &lt;enumeration value="Orphaned"/>
 *     &lt;enumeration value="TaskInProgress"/>
 *     &lt;enumeration value="CopyInProgress"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VirtualMachineStatus")
@XmlEnum
public enum VirtualMachineStatus {

    @XmlEnumValue("NotDeployed")
    NOT_DEPLOYED("NotDeployed"),
    @XmlEnumValue("Deployed")
    DEPLOYED("Deployed"),
    @XmlEnumValue("Orphaned")
    ORPHANED("Orphaned"),
    @XmlEnumValue("TaskInProgress")
    TASK_IN_PROGRESS("TaskInProgress"),
    @XmlEnumValue("CopyInProgress")
    COPY_IN_PROGRESS("CopyInProgress");
    private final String value;

    VirtualMachineStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VirtualMachineStatus fromValue(String v) {
        for (VirtualMachineStatus c: VirtualMachineStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
