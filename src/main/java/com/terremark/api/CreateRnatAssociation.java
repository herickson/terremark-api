
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateRnatAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateRnatAssociation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PublicIp" type="{}Reference"/>
 *         &lt;element name="IpAddress" type="{}Reference"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateRnatAssociation", propOrder = {
    "publicIp",
    "ipAddress"
})
@javax.xml.bind.annotation.XmlRootElement(name = "CreateRnatAssociation")
public class CreateRnatAssociation
    extends ToStringGenerator
{

    @XmlElement(name = "PublicIp", required = true, nillable = true)
    protected Reference publicIp;
    @XmlElement(name = "IpAddress", required = true, nillable = true)
    protected Reference ipAddress;

    /**
     * Gets the value of the publicIp property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getPublicIp() {
        return publicIp;
    }

    /**
     * Sets the value of the publicIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setPublicIp(Reference value) {
        this.publicIp = value;
    }

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

}
