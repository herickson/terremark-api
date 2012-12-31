
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineIpAddresses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualMachineIpAddresses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssignedIpAddresses" type="{}AssignedIpAddresses" minOccurs="0"/>
 *         &lt;element name="DetectedIpAddresses" type="{}DeviceIps" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineIpAddresses", propOrder = {
    "assignedIpAddresses",
    "detectedIpAddresses"
})
public class VirtualMachineIpAddresses
    extends ToStringGenerator
{

    @XmlElement(name = "AssignedIpAddresses", nillable = true)
    protected AssignedIpAddresses assignedIpAddresses;
    @XmlElementWrapper(name = "DetectedIpAddresses")
    @XmlElement(name = "IpAddress")
    protected List<String> detectedIpAddresses;

    /**
     * Gets the value of the assignedIpAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link AssignedIpAddresses }
     *     
     */
    public AssignedIpAddresses getAssignedIpAddresses() {
        return assignedIpAddresses;
    }

    /**
     * Sets the value of the assignedIpAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignedIpAddresses }
     *     
     */
    public void setAssignedIpAddresses(AssignedIpAddresses value) {
        this.assignedIpAddresses = value;
    }

    public List<String> getDetectedIpAddresses() {
        if (detectedIpAddresses == null) {
            detectedIpAddresses = new ArrayList<String>();
        }
        return detectedIpAddresses;
    }

}
