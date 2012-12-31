
package com.terremark.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineMediaStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VirtualMachineMediaStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unmounted"/>
 *     &lt;enumeration value="Mounted"/>
 *     &lt;enumeration value="IsoMounted"/>
 *     &lt;enumeration value="VmwareToolsMounted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VirtualMachineMediaStatus")
@XmlEnum
public enum VirtualMachineMediaStatus {

    @XmlEnumValue("Unmounted")
    UNMOUNTED("Unmounted"),
    @XmlEnumValue("Mounted")
    MOUNTED("Mounted"),
    @XmlEnumValue("IsoMounted")
    ISO_MOUNTED("IsoMounted"),
    @XmlEnumValue("VmwareToolsMounted")
    VMWARE_TOOLS_MOUNTED("VmwareToolsMounted");
    private final String value;

    VirtualMachineMediaStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VirtualMachineMediaStatus fromValue(String v) {
        for (VirtualMachineMediaStatus c: VirtualMachineMediaStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
