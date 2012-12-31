
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for License complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="License">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Component" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsageDetail" type="{}LicenseUsage" minOccurs="0"/>
 *         &lt;element name="Servers" type="{}ServerLicenseUsageReferences" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "License", propOrder = {
    "component",
    "description",
    "usageDetail",
    "servers"
})
public class License
    extends ToStringGenerator
{

    @XmlElement(name = "Component", nillable = true)
    protected String component;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "UsageDetail", nillable = true)
    protected LicenseUsage usageDetail;
    @XmlElement(name = "Servers", nillable = true)
    protected ServerLicenseUsageReferences servers;

    /**
     * Gets the value of the component property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponent() {
        return component;
    }

    /**
     * Sets the value of the component property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponent(String value) {
        this.component = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the usageDetail property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseUsage }
     *     
     */
    public LicenseUsage getUsageDetail() {
        return usageDetail;
    }

    /**
     * Sets the value of the usageDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseUsage }
     *     
     */
    public void setUsageDetail(LicenseUsage value) {
        this.usageDetail = value;
    }

    /**
     * Gets the value of the servers property.
     * 
     * @return
     *     possible object is
     *     {@link ServerLicenseUsageReferences }
     *     
     */
    public ServerLicenseUsageReferences getServers() {
        return servers;
    }

    /**
     * Sets the value of the servers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerLicenseUsageReferences }
     *     
     */
    public void setServers(ServerLicenseUsageReferences value) {
        this.servers = value;
    }

}
