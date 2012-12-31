
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceUsage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceUsage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnitCost" type="{}Cost" minOccurs="0"/>
 *         &lt;element name="TimePeriods" type="{}ArrayOfTimePeriod" minOccurs="0"/>
 *         &lt;element name="BilledDuration" type="{}ResourceCapacity" minOccurs="0"/>
 *         &lt;element name="ExtendedPrice" type="{}Cost" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceUsage", propOrder = {
    "unitCost",
    "timePeriods",
    "billedDuration",
    "extendedPrice"
})
@XmlSeeAlso({
    ComputeUsage.class,
    StorageUsage.class,
    BurstUsage.class,
    LicenseUsage.class
})
public class ResourceUsage
    extends ToStringGenerator
{

    @XmlElement(name = "UnitCost", nillable = true)
    protected Cost unitCost;
    @XmlElement(name = "BilledDuration", nillable = true)
    protected ResourceCapacity billedDuration;
    @XmlElement(name = "ExtendedPrice", nillable = true)
    protected Cost extendedPrice;
    @XmlElementWrapper(name = "TimePeriods")
    @XmlElement(name = "TimePeriod")
    protected List<TimePeriod> timePeriods;

    /**
     * Gets the value of the unitCost property.
     * 
     * @return
     *     possible object is
     *     {@link Cost }
     *     
     */
    public Cost getUnitCost() {
        return unitCost;
    }

    /**
     * Sets the value of the unitCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cost }
     *     
     */
    public void setUnitCost(Cost value) {
        this.unitCost = value;
    }

    /**
     * Gets the value of the billedDuration property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceCapacity }
     *     
     */
    public ResourceCapacity getBilledDuration() {
        return billedDuration;
    }

    /**
     * Sets the value of the billedDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceCapacity }
     *     
     */
    public void setBilledDuration(ResourceCapacity value) {
        this.billedDuration = value;
    }

    /**
     * Gets the value of the extendedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Cost }
     *     
     */
    public Cost getExtendedPrice() {
        return extendedPrice;
    }

    /**
     * Sets the value of the extendedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cost }
     *     
     */
    public void setExtendedPrice(Cost value) {
        this.extendedPrice = value;
    }

    public List<TimePeriod> getTimePeriods() {
        if (timePeriods == null) {
            timePeriods = new ArrayList<TimePeriod>();
        }
        return timePeriods;
    }

}
