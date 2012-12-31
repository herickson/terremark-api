
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceMeteredBillingEnvironment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceMeteredBillingEnvironment">
 *   &lt;complexContent>
 *     &lt;extension base="{}Reference">
 *       &lt;sequence>
 *         &lt;element name="Total" type="{}Cost" minOccurs="0"/>
 *         &lt;element name="ComputePools" type="{}ComputePoolCostList" minOccurs="0"/>
 *         &lt;element name="PhysicalServers" type="{}DeviceCostList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceMeteredBillingEnvironment", propOrder = {
    "total",
    "computePools",
    "physicalServers"
})
public class DeviceMeteredBillingEnvironment
    extends Reference
{

    @XmlElement(name = "Total", nillable = true)
    protected Cost total;
    @XmlElement(name = "ComputePools", nillable = true)
    protected ComputePoolCostList computePools;
    @XmlElement(name = "PhysicalServers", nillable = true)
    protected DeviceCostList physicalServers;

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
     * Gets the value of the computePools property.
     * 
     * @return
     *     possible object is
     *     {@link ComputePoolCostList }
     *     
     */
    public ComputePoolCostList getComputePools() {
        return computePools;
    }

    /**
     * Sets the value of the computePools property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputePoolCostList }
     *     
     */
    public void setComputePools(ComputePoolCostList value) {
        this.computePools = value;
    }

    /**
     * Gets the value of the physicalServers property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceCostList }
     *     
     */
    public DeviceCostList getPhysicalServers() {
        return physicalServers;
    }

    /**
     * Sets the value of the physicalServers property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceCostList }
     *     
     */
    public void setPhysicalServers(DeviceCostList value) {
        this.physicalServers = value;
    }

}
