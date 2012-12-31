
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RnatHostAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RnatHostAssociation">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="IpAddress" type="{}IpAddressReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RnatHostAssociation", propOrder = {
    "ipAddress"
})
@javax.xml.bind.annotation.XmlRootElement(name = "RnatHostAssociation")
public class RnatHostAssociation
    extends Resource
{

    @XmlElement(name = "IpAddress", nillable = true)
    protected IpAddressReference ipAddress;

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link IpAddressReference }
     *     
     */
    public IpAddressReference getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link IpAddressReference }
     *     
     */
    public void setIpAddress(IpAddressReference value) {
        this.ipAddress = value;
    }

}
