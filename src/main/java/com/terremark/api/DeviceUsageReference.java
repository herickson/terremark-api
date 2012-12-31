
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceUsageReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceUsageReference">
 *   &lt;complexContent>
 *     &lt;extension base="{}Reference">
 *       &lt;sequence>
 *         &lt;element name="ComputePool" type="{}Reference" minOccurs="0"/>
 *         &lt;element name="Status" type="{}DeviceStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceUsageReference", propOrder = {
    "computePool",
    "status"
})
@XmlSeeAlso({
    ServerLicenseUsageReference.class,
    VirtualMachineUsageReference.class,
    DetachedDiskUsageReference.class
})
public class DeviceUsageReference
    extends Reference
{

    @XmlElement(name = "ComputePool", nillable = true)
    protected Reference computePool;
    @XmlElement(name = "Status")
    protected DeviceStatus status;

    /**
     * Gets the value of the computePool property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getComputePool() {
        return computePool;
    }

    /**
     * Sets the value of the computePool property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setComputePool(Reference value) {
        this.computePool = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatus }
     *     
     */
    public DeviceStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatus }
     *     
     */
    public void setStatus(DeviceStatus value) {
        this.status = value;
    }

}
