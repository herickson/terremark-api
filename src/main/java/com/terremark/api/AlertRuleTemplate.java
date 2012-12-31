
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertRuleTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertRuleTemplate">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RuleGroup" type="{}AlertRuleGroup" minOccurs="0"/>
 *         &lt;element name="Threshold" type="{}Threshold" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertRuleTemplate", propOrder = {
    "description",
    "ruleGroup",
    "threshold"
})
@javax.xml.bind.annotation.XmlRootElement(name = "AlertRuleTemplate")
public class AlertRuleTemplate
    extends Resource
{

    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "RuleGroup")
    protected AlertRuleGroup ruleGroup;
    @XmlElement(name = "Threshold", nillable = true)
    protected Threshold threshold;

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
     * Gets the value of the ruleGroup property.
     * 
     * @return
     *     possible object is
     *     {@link AlertRuleGroup }
     *     
     */
    public AlertRuleGroup getRuleGroup() {
        return ruleGroup;
    }

    /**
     * Sets the value of the ruleGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertRuleGroup }
     *     
     */
    public void setRuleGroup(AlertRuleGroup value) {
        this.ruleGroup = value;
    }

    /**
     * Gets the value of the threshold property.
     * 
     * @return
     *     possible object is
     *     {@link Threshold }
     *     
     */
    public Threshold getThreshold() {
        return threshold;
    }

    /**
     * Sets the value of the threshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Threshold }
     *     
     */
    public void setThreshold(Threshold value) {
        this.threshold = value;
    }

}
