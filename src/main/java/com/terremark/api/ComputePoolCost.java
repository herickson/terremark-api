
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComputePoolCost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComputePoolCost">
 *   &lt;complexContent>
 *     &lt;extension base="{}Reference">
 *       &lt;sequence>
 *         &lt;element name="Total" type="{}Cost" minOccurs="0"/>
 *         &lt;element name="InstanceBased" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BurstingCost" type="{}BurstingCost" minOccurs="0"/>
 *         &lt;element name="Servers" type="{}DeviceCostList" minOccurs="0"/>
 *         &lt;element name="DetachedDisks" type="{}DetachedDiskCostList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComputePoolCost", propOrder = {
    "total",
    "instanceBased",
    "burstingCost",
    "servers",
    "detachedDisks"
})
public class ComputePoolCost
    extends Reference
{

    @XmlElement(name = "Total", nillable = true)
    protected Cost total;
    @XmlElement(name = "InstanceBased")
    protected Boolean instanceBased;
    @XmlElement(name = "BurstingCost", nillable = true)
    protected BurstingCost burstingCost;
    @XmlElement(name = "Servers", nillable = true)
    protected DeviceCostList servers;
    @XmlElement(name = "DetachedDisks", nillable = true)
    protected DetachedDiskCostList detachedDisks;

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
     * Gets the value of the instanceBased property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstanceBased() {
        return instanceBased;
    }

    /**
     * Sets the value of the instanceBased property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstanceBased(Boolean value) {
        this.instanceBased = value;
    }

    /**
     * Gets the value of the burstingCost property.
     * 
     * @return
     *     possible object is
     *     {@link BurstingCost }
     *     
     */
    public BurstingCost getBurstingCost() {
        return burstingCost;
    }

    /**
     * Sets the value of the burstingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BurstingCost }
     *     
     */
    public void setBurstingCost(BurstingCost value) {
        this.burstingCost = value;
    }

    /**
     * Gets the value of the servers property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceCostList }
     *     
     */
    public DeviceCostList getServers() {
        return servers;
    }

    /**
     * Sets the value of the servers property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceCostList }
     *     
     */
    public void setServers(DeviceCostList value) {
        this.servers = value;
    }

    /**
     * Gets the value of the detachedDisks property.
     * 
     * @return
     *     possible object is
     *     {@link DetachedDiskCostList }
     *     
     */
    public DetachedDiskCostList getDetachedDisks() {
        return detachedDisks;
    }

    /**
     * Sets the value of the detachedDisks property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetachedDiskCostList }
     *     
     */
    public void setDetachedDisks(DetachedDiskCostList value) {
        this.detachedDisks = value;
    }

}
