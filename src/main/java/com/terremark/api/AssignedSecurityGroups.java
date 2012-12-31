
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssignedSecurityGroups complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssignedSecurityGroups">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="EnvironmentSecurityGroups" type="{}EnvironmentSecurityGroupReferences" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssignedSecurityGroups", propOrder = {
    "environmentSecurityGroups"
})
public class AssignedSecurityGroups
    extends Resource
{

    @XmlElement(name = "EnvironmentSecurityGroups", nillable = true)
    protected EnvironmentSecurityGroupReferences environmentSecurityGroups;

    /**
     * Gets the value of the environmentSecurityGroups property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentSecurityGroupReferences }
     *     
     */
    public EnvironmentSecurityGroupReferences getEnvironmentSecurityGroups() {
        return environmentSecurityGroups;
    }

    /**
     * Sets the value of the environmentSecurityGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentSecurityGroupReferences }
     *     
     */
    public void setEnvironmentSecurityGroups(EnvironmentSecurityGroupReferences value) {
        this.environmentSecurityGroups = value;
    }

}
