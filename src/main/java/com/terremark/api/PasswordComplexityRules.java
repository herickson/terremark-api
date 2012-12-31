
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PasswordComplexityRules complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PasswordComplexityRules">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="RuleType" type="{}PasswordComplexityRuleTypeEnum"/>
 *         &lt;element name="CustomRules" type="{}CustomPasswordRules" minOccurs="0"/>
 *         &lt;element name="PasswordExpiration" type="{}PasswordExpiration" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PasswordComplexityRules", propOrder = {
    "ruleType",
    "customRules",
    "passwordExpiration",
    "description"
})
@javax.xml.bind.annotation.XmlRootElement(name = "PasswordComplexityRules")
public class PasswordComplexityRules
    extends Resource
{

    @XmlElement(name = "RuleType", required = true)
    protected PasswordComplexityRuleTypeEnum ruleType;
    @XmlElement(name = "CustomRules", nillable = true)
    protected CustomPasswordRules customRules;
    @XmlElement(name = "PasswordExpiration", nillable = true)
    protected PasswordExpiration passwordExpiration;
    @XmlElement(name = "Description", nillable = true)
    protected String description;

    /**
     * Gets the value of the ruleType property.
     * 
     * @return
     *     possible object is
     *     {@link PasswordComplexityRuleTypeEnum }
     *     
     */
    public PasswordComplexityRuleTypeEnum getRuleType() {
        return ruleType;
    }

    /**
     * Sets the value of the ruleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PasswordComplexityRuleTypeEnum }
     *     
     */
    public void setRuleType(PasswordComplexityRuleTypeEnum value) {
        this.ruleType = value;
    }

    /**
     * Gets the value of the customRules property.
     * 
     * @return
     *     possible object is
     *     {@link CustomPasswordRules }
     *     
     */
    public CustomPasswordRules getCustomRules() {
        return customRules;
    }

    /**
     * Sets the value of the customRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomPasswordRules }
     *     
     */
    public void setCustomRules(CustomPasswordRules value) {
        this.customRules = value;
    }

    /**
     * Gets the value of the passwordExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link PasswordExpiration }
     *     
     */
    public PasswordExpiration getPasswordExpiration() {
        return passwordExpiration;
    }

    /**
     * Sets the value of the passwordExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link PasswordExpiration }
     *     
     */
    public void setPasswordExpiration(PasswordExpiration value) {
        this.passwordExpiration = value;
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

}
