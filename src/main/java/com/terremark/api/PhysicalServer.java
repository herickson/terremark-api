
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalServer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalServer">
 *   &lt;complexContent>
 *     &lt;extension base="{}PhysicalDevice">
 *       &lt;sequence>
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LightsOutIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperatingSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssignedIpAddresses" type="{}AssignedIpAddresses" minOccurs="0"/>
 *         &lt;element name="LicensedSoftware" type="{}PhysicalDeviceLicensedSoftware" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalServer", propOrder = {
    "serialNumber",
    "lightsOutIp",
    "operatingSystem",
    "assignedIpAddresses",
    "licensedSoftware"
})
@javax.xml.bind.annotation.XmlRootElement(name = "PhysicalServer")
public class PhysicalServer
    extends PhysicalDevice
{

    @XmlElement(name = "SerialNumber", nillable = true)
    protected String serialNumber;
    @XmlElement(name = "LightsOutIp", nillable = true)
    protected String lightsOutIp;
    @XmlElement(name = "OperatingSystem", nillable = true)
    protected String operatingSystem;
    @XmlElement(name = "AssignedIpAddresses", nillable = true)
    protected AssignedIpAddresses assignedIpAddresses;
    @XmlElement(name = "LicensedSoftware", nillable = true)
    protected PhysicalDeviceLicensedSoftware licensedSoftware;

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
     * Gets the value of the lightsOutIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLightsOutIp() {
        return lightsOutIp;
    }

    /**
     * Sets the value of the lightsOutIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLightsOutIp(String value) {
        this.lightsOutIp = value;
    }

    /**
     * Gets the value of the operatingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * Sets the value of the operatingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingSystem(String value) {
        this.operatingSystem = value;
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

    /**
     * Gets the value of the licensedSoftware property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalDeviceLicensedSoftware }
     *     
     */
    public PhysicalDeviceLicensedSoftware getLicensedSoftware() {
        return licensedSoftware;
    }

    /**
     * Sets the value of the licensedSoftware property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalDeviceLicensedSoftware }
     *     
     */
    public void setLicensedSoftware(PhysicalDeviceLicensedSoftware value) {
        this.licensedSoftware = value;
    }

}
