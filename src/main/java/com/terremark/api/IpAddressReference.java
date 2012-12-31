
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IpAddressReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IpAddressReference">
 *   &lt;complexContent>
 *     &lt;extension base="{}Reference">
 *       &lt;sequence>
 *         &lt;element name="Network" type="{}Reference" minOccurs="0"/>
 *         &lt;element name="Host" type="{}Reference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IpAddressReference", propOrder = {
    "network",
    "host"
})
public class IpAddressReference
    extends Reference
{

    @XmlElement(name = "Network", nillable = true)
    protected Reference network;
    @XmlElement(name = "Host", nillable = true)
    protected Reference host;

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setNetwork(Reference value) {
        this.network = value;
    }

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setHost(Reference value) {
        this.host = value;
    }

}
