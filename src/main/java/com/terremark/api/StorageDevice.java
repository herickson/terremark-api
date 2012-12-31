
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StorageDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StorageDevice">
 *   &lt;complexContent>
 *     &lt;extension base="{}PhysicalDevice">
 *       &lt;sequence>
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssignedIpAddresses" type="{}AssignedIpAddresses" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageDevice", propOrder = {
    "serialNumber",
    "assignedIpAddresses"
})
@javax.xml.bind.annotation.XmlRootElement(name = "StorageDevice")
public class StorageDevice
    extends PhysicalDevice
{

    @XmlElement(name = "SerialNumber", nillable = true)
    protected String serialNumber;
    @XmlElement(name = "AssignedIpAddresses", nillable = true)
    protected AssignedIpAddresses assignedIpAddresses;

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

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

}
