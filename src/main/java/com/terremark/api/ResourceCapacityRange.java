
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceCapacityRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceCapacityRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MinimumSize" type="{}ResourceCapacity" minOccurs="0"/>
 *         &lt;element name="MaximumSize" type="{}ResourceCapacity" minOccurs="0"/>
 *         &lt;element name="StepFactor" type="{}ResourceCapacity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceCapacityRange", propOrder = {
    "minimumSize",
    "maximumSize",
    "stepFactor"
})
public class ResourceCapacityRange
    extends ToStringGenerator
{

    @XmlElement(name = "MinimumSize", nillable = true)
    protected ResourceCapacity minimumSize;
    @XmlElement(name = "MaximumSize", nillable = true)
    protected ResourceCapacity maximumSize;
    @XmlElement(name = "StepFactor", nillable = true)
    protected ResourceCapacity stepFactor;

    /**
     * Gets the value of the minimumSize property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceCapacity }
     *     
     */
    public ResourceCapacity getMinimumSize() {
        return minimumSize;
    }

    /**
     * Sets the value of the minimumSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceCapacity }
     *     
     */
    public void setMinimumSize(ResourceCapacity value) {
        this.minimumSize = value;
    }

    /**
     * Gets the value of the maximumSize property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceCapacity }
     *     
     */
    public ResourceCapacity getMaximumSize() {
        return maximumSize;
    }

    /**
     * Sets the value of the maximumSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceCapacity }
     *     
     */
    public void setMaximumSize(ResourceCapacity value) {
        this.maximumSize = value;
    }

    /**
     * Gets the value of the stepFactor property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceCapacity }
     *     
     */
    public ResourceCapacity getStepFactor() {
        return stepFactor;
    }

    /**
     * Sets the value of the stepFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceCapacity }
     *     
     */
    public void setStepFactor(ResourceCapacity value) {
        this.stepFactor = value;
    }

}
