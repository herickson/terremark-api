
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublicIpAddressReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicIpAddressReference">
 *   &lt;complexContent>
 *     &lt;extension base="{}Reference">
 *       &lt;sequence>
 *         &lt;element name="IpType" type="{}PublicIpTypeEnum" minOccurs="0"/>
 *         &lt;element name="IsInternal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicIpAddressReference", propOrder = {
    "ipType",
    "isInternal"
})
public class PublicIpAddressReference
    extends Reference
{

    @XmlElement(name = "IpType")
    protected PublicIpTypeEnum ipType;
    @XmlElement(name = "IsInternal")
    protected Boolean isInternal;

    /**
     * Gets the value of the ipType property.
     * 
     * @return
     *     possible object is
     *     {@link PublicIpTypeEnum }
     *     
     */
    public PublicIpTypeEnum getIpType() {
        return ipType;
    }

    /**
     * Sets the value of the ipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicIpTypeEnum }
     *     
     */
    public void setIpType(PublicIpTypeEnum value) {
        this.ipType = value;
    }

    /**
     * Gets the value of the isInternal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInternal() {
        return isInternal;
    }

    /**
     * Sets the value of the isInternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInternal(Boolean value) {
        this.isInternal = value;
    }

}
