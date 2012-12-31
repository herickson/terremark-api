
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FirewallLog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FirewallLog">
 *   &lt;complexContent>
 *     &lt;extension base="{}Entity">
 *       &lt;sequence>
 *         &lt;element name="IpAddress" type="{}Reference" minOccurs="0"/>
 *         &lt;element name="ExternalIpAddress" type="{}ExternalHost" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FirewallLog", propOrder = {
    "ipAddress",
    "externalIpAddress"
})
@javax.xml.bind.annotation.XmlRootElement(name = "FirewallLog")
public class FirewallLog
    extends Entity
{

    @XmlElement(name = "IpAddress", nillable = true)
    protected Reference ipAddress;
    @XmlElement(name = "ExternalIpAddress", nillable = true)
    protected ExternalHost externalIpAddress;

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setIpAddress(Reference value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the externalIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalHost }
     *     
     */
    public ExternalHost getExternalIpAddress() {
        return externalIpAddress;
    }

    /**
     * Sets the value of the externalIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalHost }
     *     
     */
    public void setExternalIpAddress(ExternalHost value) {
        this.externalIpAddress = value;
    }

}
