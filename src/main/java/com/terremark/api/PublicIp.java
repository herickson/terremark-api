
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublicIp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicIp">
 *   &lt;complexContent>
 *     &lt;extension base="{}Entity">
 *       &lt;sequence>
 *         &lt;element name="PublicIpType" type="{}PublicIpTypeEnum" minOccurs="0"/>
 *         &lt;element name="IsInternal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InternetServices" type="{}ArrayOfInternetService" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicIp", propOrder = {
    "publicIpType",
    "isInternal",
    "internetServices"
})
@javax.xml.bind.annotation.XmlRootElement(name = "PublicIp")
public class PublicIp
    extends Entity
{

    @XmlElement(name = "PublicIpType")
    protected PublicIpTypeEnum publicIpType;
    @XmlElement(name = "IsInternal")
    protected Boolean isInternal;
    @XmlElementWrapper(name = "InternetServices")
    @XmlElement(name = "InternetService")
    protected List<InternetService> internetServices;

    /**
     * Gets the value of the publicIpType property.
     * 
     * @return
     *     possible object is
     *     {@link PublicIpTypeEnum }
     *     
     */
    public PublicIpTypeEnum getPublicIpType() {
        return publicIpType;
    }

    /**
     * Sets the value of the publicIpType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicIpTypeEnum }
     *     
     */
    public void setPublicIpType(PublicIpTypeEnum value) {
        this.publicIpType = value;
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

    public List<InternetService> getInternetServices() {
        if (internetServices == null) {
            internetServices = new ArrayList<InternetService>();
        }
        return internetServices;
    }

}
