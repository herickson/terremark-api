
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServerLicenseUsageReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServerLicenseUsageReference">
 *   &lt;complexContent>
 *     &lt;extension base="{}DeviceUsageReference">
 *       &lt;sequence>
 *         &lt;element name="Configuration" type="{}LicenseUsage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServerLicenseUsageReference", propOrder = {
    "configuration"
})
public class ServerLicenseUsageReference
    extends DeviceUsageReference
{

    @XmlElement(name = "Configuration", nillable = true)
    protected LicenseUsage configuration;

    /**
     * Gets the value of the configuration property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseUsage }
     *     
     */
    public LicenseUsage getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseUsage }
     *     
     */
    public void setConfiguration(LicenseUsage value) {
        this.configuration = value;
    }

}
