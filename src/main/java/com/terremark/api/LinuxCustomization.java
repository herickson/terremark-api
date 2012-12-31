
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinuxCustomization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinuxCustomization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NetworkSettings" type="{}NetworkSettings"/>
 *         &lt;element name="SshKey" type="{}Reference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinuxCustomization", propOrder = {
    "networkSettings",
    "sshKey"
})
public class LinuxCustomization
    extends ToStringGenerator
{

    @XmlElement(name = "NetworkSettings", required = true, nillable = true)
    protected NetworkSettings networkSettings;
    @XmlElement(name = "SshKey", nillable = true)
    protected Reference sshKey;

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
     * Gets the value of the sshKey property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getSshKey() {
        return sshKey;
    }

    /**
     * Sets the value of the sshKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setSshKey(Reference value) {
        this.sshKey = value;
    }

}
