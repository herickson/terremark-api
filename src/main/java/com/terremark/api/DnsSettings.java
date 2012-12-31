
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DnsSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DnsSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrimaryDns" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondaryDns" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DnsSettings", propOrder = {
    "primaryDns",
    "secondaryDns"
})
public class DnsSettings
    extends ToStringGenerator
{

    @XmlElement(name = "PrimaryDns", nillable = true)
    protected String primaryDns;
    @XmlElement(name = "SecondaryDns", nillable = true)
    protected String secondaryDns;

    /**
     * Gets the value of the primaryDns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryDns() {
        return primaryDns;
    }

    /**
     * Sets the value of the primaryDns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryDns(String value) {
        this.primaryDns = value;
    }

    /**
     * Gets the value of the secondaryDns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryDns() {
        return secondaryDns;
    }

    /**
     * Sets the value of the secondaryDns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryDns(String value) {
        this.secondaryDns = value;
    }

}
