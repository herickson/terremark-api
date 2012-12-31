
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Burst complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Burst">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ComputePool" type="{}Reference" minOccurs="0"/>
 *         &lt;element name="Resource" type="{}BurstTypeEnum" minOccurs="0"/>
 *         &lt;element name="UsageDetail" type="{}BurstUsage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Burst", propOrder = {
    "computePool",
    "resource",
    "usageDetail"
})
public class Burst
    extends ToStringGenerator
{

    @XmlElement(name = "ComputePool", nillable = true)
    protected Reference computePool;
    @XmlElement(name = "Resource")
    protected BurstTypeEnum resource;
    @XmlElement(name = "UsageDetail", nillable = true)
    protected BurstUsage usageDetail;

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
     * Gets the value of the resource property.
     * 
     * @return
     *     possible object is
     *     {@link BurstTypeEnum }
     *     
     */
    public BurstTypeEnum getResource() {
        return resource;
    }

    /**
     * Sets the value of the resource property.
     * 
     * @param value
     *     allowed object is
     *     {@link BurstTypeEnum }
     *     
     */
    public void setResource(BurstTypeEnum value) {
        this.resource = value;
    }

    /**
     * Gets the value of the usageDetail property.
     * 
     * @return
     *     possible object is
     *     {@link BurstUsage }
     *     
     */
    public BurstUsage getUsageDetail() {
        return usageDetail;
    }

    /**
     * Sets the value of the usageDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link BurstUsage }
     *     
     */
    public void setUsageDetail(BurstUsage value) {
        this.usageDetail = value;
    }

}
