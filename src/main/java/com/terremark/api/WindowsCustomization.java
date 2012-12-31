
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WindowsCustomization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WindowsCustomization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NetworkSettings" type="{}NetworkSettings"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LicenseKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WindowsCustomization", propOrder = {
    "networkSettings",
    "password",
    "licenseKey"
})
public class WindowsCustomization
    extends ToStringGenerator
{

    @XmlElement(name = "NetworkSettings", required = true, nillable = true)
    protected NetworkSettings networkSettings;
    @XmlElement(name = "Password", nillable = true)
    protected String password;
    @XmlElement(name = "LicenseKey", nillable = true)
    protected String licenseKey;

    /**
     * Gets the value of the networkSettings property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkSettings }
     *     
     */
    public NetworkSettings getNetworkSettings() {
        return networkSettings;
    }

    /**
     * Sets the value of the networkSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkSettings }
     *     
     */
    public void setNetworkSettings(NetworkSettings value) {
        this.networkSettings = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the licenseKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseKey() {
        return licenseKey;
    }

    /**
     * Sets the value of the licenseKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseKey(String value) {
        this.licenseKey = value;
    }

}
