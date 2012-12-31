
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BurstUsage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BurstUsage">
 *   &lt;complexContent>
 *     &lt;extension base="{}ResourceUsage">
 *       &lt;sequence>
 *         &lt;element name="Usage" type="{}ResourceCapacity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BurstUsage", propOrder = {
    "usage"
})
public class BurstUsage
    extends ResourceUsage
{

    @XmlElement(name = "Usage", nillable = true)
    protected ResourceCapacity usage;

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceCapacity }
     *     
     */
    public ResourceCapacity getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceCapacity }
     *     
     */
    public void setUsage(ResourceCapacity value) {
        this.usage = value;
    }

}
