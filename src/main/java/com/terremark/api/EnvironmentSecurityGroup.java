
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnvironmentSecurityGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnvironmentSecurityGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{}Entity">
 *       &lt;sequence>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AssignedDevices" type="{}AssignedDevices" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvironmentSecurityGroup", propOrder = {
    "isActive",
    "assignedDevices"
})
public class EnvironmentSecurityGroup
    extends Entity
{

    @XmlElement(name = "IsActive")
    protected Boolean isActive;
    @XmlElement(name = "AssignedDevices", nillable = true)
    protected AssignedDevices assignedDevices;

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the assignedDevices property.
     * 
     * @return
     *     possible object is
     *     {@link AssignedDevices }
     *     
     */
    public AssignedDevices getAssignedDevices() {
        return assignedDevices;
    }

    /**
     * Sets the value of the assignedDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignedDevices }
     *     
     */
    public void setAssignedDevices(AssignedDevices value) {
        this.assignedDevices = value;
    }

}
