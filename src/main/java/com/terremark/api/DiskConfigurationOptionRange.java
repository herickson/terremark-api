
package com.terremark.api;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiskConfigurationOptionRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiskConfigurationOptionRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResourceCapacityRange" type="{}ResourceCapacityRange" minOccurs="0"/>
 *         &lt;element name="MonthlyCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiskConfigurationOptionRange", propOrder = {
    "resourceCapacityRange",
    "monthlyCost"
})
public class DiskConfigurationOptionRange
    extends ToStringGenerator
{

    @XmlElement(name = "ResourceCapacityRange", nillable = true)
    protected ResourceCapacityRange resourceCapacityRange;
    @XmlElement(name = "MonthlyCost", nillable = true)
    protected BigDecimal monthlyCost;

    /**
     * Gets the value of the resourceCapacityRange property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceCapacityRange }
     *     
     */
    public ResourceCapacityRange getResourceCapacityRange() {
        return resourceCapacityRange;
    }

    /**
     * Sets the value of the resourceCapacityRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceCapacityRange }
     *     
     */
    public void setResourceCapacityRange(ResourceCapacityRange value) {
        this.resourceCapacityRange = value;
    }

    /**
     * Gets the value of the monthlyCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonthlyCost() {
        return monthlyCost;
    }

    /**
     * Sets the value of the monthlyCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonthlyCost(BigDecimal value) {
        this.monthlyCost = value;
    }

}
