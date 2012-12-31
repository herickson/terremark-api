
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineStorageUsageDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualMachineStorageUsageDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{}Reference">
 *       &lt;sequence>
 *         &lt;element name="DiskCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Allocated" type="{}ResourceCapacity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineStorageUsageDetail", propOrder = {
    "diskCount",
    "allocated"
})
public class VirtualMachineStorageUsageDetail
    extends Reference
{

    @XmlElement(name = "DiskCount")
    protected Integer diskCount;
    @XmlElement(name = "Allocated", nillable = true)
    protected ResourceCapacity allocated;

    /**
     * Gets the value of the diskCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiskCount() {
        return diskCount;
    }

    /**
     * Sets the value of the diskCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiskCount(Integer value) {
        this.diskCount = value;
    }

    /**
     * Gets the value of the allocated property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceCapacity }
     *     
     */
    public ResourceCapacity getAllocated() {
        return allocated;
    }

    /**
     * Sets the value of the allocated property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceCapacity }
     *     
     */
    public void setAllocated(ResourceCapacity value) {
        this.allocated = value;
    }

}
