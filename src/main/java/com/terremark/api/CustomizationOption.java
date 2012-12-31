
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomizationOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomizationOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{}CustomizationTypeEnum"/>
 *         &lt;element name="CanPowerOn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PasswordRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SshKeyRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationOption", propOrder = {
    "type",
    "canPowerOn",
    "passwordRequired",
    "sshKeyRequired"
})
public class CustomizationOption
    extends ToStringGenerator
{

    @XmlElement(name = "Type", required = true)
    protected CustomizationTypeEnum type;
    @XmlElement(name = "CanPowerOn")
    protected boolean canPowerOn;
    @XmlElement(name = "PasswordRequired")
    protected boolean passwordRequired;
    @XmlElement(name = "SshKeyRequired")
    protected boolean sshKeyRequired;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationTypeEnum }
     *     
     */
    public CustomizationTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationTypeEnum }
     *     
     */
    public void setType(CustomizationTypeEnum value) {
        this.type = value;
    }

    /**
     * Gets the value of the canPowerOn property.
     * 
     */
    public boolean isCanPowerOn() {
        return canPowerOn;
    }

    /**
     * Sets the value of the canPowerOn property.
     * 
     */
    public void setCanPowerOn(boolean value) {
        this.canPowerOn = value;
    }

    /**
     * Gets the value of the passwordRequired property.
     * 
     */
    public boolean isPasswordRequired() {
        return passwordRequired;
    }

    /**
     * Sets the value of the passwordRequired property.
     * 
     */
    public void setPasswordRequired(boolean value) {
        this.passwordRequired = value;
    }

    /**
     * Gets the value of the sshKeyRequired property.
     * 
     */
    public boolean isSshKeyRequired() {
        return sshKeyRequired;
    }

    /**
     * Sets the value of the sshKeyRequired property.
     * 
     */
    public void setSshKeyRequired(boolean value) {
        this.sshKeyRequired = value;
    }

}
