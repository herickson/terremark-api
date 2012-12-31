
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceStorageCost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceStorageCost">
 *   &lt;complexContent>
 *     &lt;extension base="{}BillingCost">
 *       &lt;sequence>
 *         &lt;element name="Configurations" type="{}ResourceUsages" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceStorageCost", propOrder = {
    "configurations"
})
public class DeviceStorageCost
    extends BillingCost
{

    @XmlElement(name = "Configurations", nillable = true)
    protected ResourceUsages configurations;

    /**
     * Gets the value of the configurations property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceUsages }
     *     
     */
    public ResourceUsages getConfigurations() {
        return configurations;
    }

    /**
     * Sets the value of the configurations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceUsages }
     *     
     */
    public void setConfigurations(ResourceUsages value) {
        this.configurations = value;
    }

}
