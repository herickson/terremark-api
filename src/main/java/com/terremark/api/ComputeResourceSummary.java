
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComputeResourceSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComputeResourceSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Allocated" type="{}ResourceCapacity" minOccurs="0"/>
 *         &lt;element name="Consumed" type="{}ResourceCapacity" minOccurs="0"/>
 *         &lt;element name="Purchased" type="{}ResourceCapacity" minOccurs="0"/>
 *         &lt;element name="Utilization" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComputeResourceSummary", propOrder = {
    "allocated",
    "consumed",
    "purchased",
    "utilization"
})
@XmlSeeAlso({
    CpuComputeResourceSummary.class,
    MemoryComputeResourceSummary.class
})
public class ComputeResourceSummary
    extends ToStringGenerator
{

    @XmlElement(name = "Allocated", nillable = true)
    protected ResourceCapacity allocated;
    @XmlElement(name = "Consumed", nillable = true)
    protected ResourceCapacity consumed;
    @XmlElement(name = "Purchased", nillable = true)
    protected ResourceCapacity purchased;
    @XmlElement(name = "Utilization", nillable = true)
    protected Integer utilization;

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

    /**
     * Gets the value of the consumed property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceCapacity }
     *     
     */
    public ResourceCapacity getConsumed() {
        return consumed;
    }

    /**
     * Sets the value of the consumed property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceCapacity }
     *     
     */
    public void setConsumed(ResourceCapacity value) {
        this.consumed = value;
    }

    /**
     * Gets the value of the purchased property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceCapacity }
     *     
     */
    public ResourceCapacity getPurchased() {
        return purchased;
    }

    /**
     * Sets the value of the purchased property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceCapacity }
     *     
     */
    public void setPurchased(ResourceCapacity value) {
        this.purchased = value;
    }

    /**
     * Gets the value of the utilization property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUtilization() {
        return utilization;
    }

    /**
     * Sets the value of the utilization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUtilization(Integer value) {
        this.utilization = value;
    }

}
