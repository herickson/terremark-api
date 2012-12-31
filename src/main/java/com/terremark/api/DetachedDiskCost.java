
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetachedDiskCost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetachedDiskCost">
 *   &lt;complexContent>
 *     &lt;extension base="{}Reference">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{}DeviceStatus" minOccurs="0"/>
 *         &lt;element name="Total" type="{}Cost" minOccurs="0"/>
 *         &lt;element name="StorageCost" type="{}DeviceStorageCost" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetachedDiskCost", propOrder = {
    "status",
    "total",
    "storageCost"
})
public class DetachedDiskCost
    extends Reference
{

    @XmlElement(name = "Status")
    protected DeviceStatus status;
    @XmlElement(name = "Total", nillable = true)
    protected Cost total;
    @XmlElement(name = "StorageCost", nillable = true)
    protected DeviceStorageCost storageCost;

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

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link Cost }
     *     
     */
    public Cost getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cost }
     *     
     */
    public void setTotal(Cost value) {
        this.total = value;
    }

    /**
     * Gets the value of the storageCost property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceStorageCost }
     *     
     */
    public DeviceStorageCost getStorageCost() {
        return storageCost;
    }

    /**
     * Sets the value of the storageCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStorageCost }
     *     
     */
    public void setStorageCost(DeviceStorageCost value) {
        this.storageCost = value;
    }

}
