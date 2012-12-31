
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StorageCost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StorageCost">
 *   &lt;complexContent>
 *     &lt;extension base="{}BillingCost">
 *       &lt;sequence>
 *         &lt;element name="VirtualMachines" type="{}VirtualMachineUsageReferences" minOccurs="0"/>
 *         &lt;element name="DetachedDisks" type="{}DetachedDiskUsageReferences" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageCost", propOrder = {
    "virtualMachines",
    "detachedDisks"
})
public class StorageCost
    extends BillingCost
{

    @XmlElement(name = "VirtualMachines", nillable = true)
    protected VirtualMachineUsageReferences virtualMachines;
    @XmlElement(name = "DetachedDisks", nillable = true)
    protected DetachedDiskUsageReferences detachedDisks;

    /**
     * Gets the value of the virtualMachines property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineUsageReferences }
     *     
     */
    public VirtualMachineUsageReferences getVirtualMachines() {
        return virtualMachines;
    }

    /**
     * Sets the value of the virtualMachines property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineUsageReferences }
     *     
     */
    public void setVirtualMachines(VirtualMachineUsageReferences value) {
        this.virtualMachines = value;
    }

    /**
     * Gets the value of the detachedDisks property.
     * 
     * @return
     *     possible object is
     *     {@link DetachedDiskUsageReferences }
     *     
     */
    public DetachedDiskUsageReferences getDetachedDisks() {
        return detachedDisks;
    }

    /**
     * Sets the value of the detachedDisks property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetachedDiskUsageReferences }
     *     
     */
    public void setDetachedDisks(DetachedDiskUsageReferences value) {
        this.detachedDisks = value;
    }

}
