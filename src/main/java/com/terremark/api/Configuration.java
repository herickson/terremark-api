
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Configuration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Configuration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmailConfiguration" type="{}NotifyByEmailConfiguration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Configuration", propOrder = {
    "emailConfiguration"
})
@javax.xml.bind.annotation.XmlRootElement(name = "Configuration")
public class Configuration
    extends ToStringGenerator
{

    @XmlElement(name = "EmailConfiguration", nillable = true)
    protected NotifyByEmailConfiguration emailConfiguration;

    /**
     * Gets the value of the emailConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link NotifyByEmailConfiguration }
     *     
     */
    public NotifyByEmailConfiguration getEmailConfiguration() {
        return emailConfiguration;
    }

    /**
     * Sets the value of the emailConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotifyByEmailConfiguration }
     *     
     */
    public void setEmailConfiguration(NotifyByEmailConfiguration value) {
        this.emailConfiguration = value;
    }

}
