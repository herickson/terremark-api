
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertNotification">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="AlertRules" type="{}AlertRules" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertNotification", propOrder = {
    "alertRules"
})
@javax.xml.bind.annotation.XmlRootElement(name = "AlertNotification")
public class AlertNotification
    extends Resource
{

    @XmlElement(name = "AlertRules", nillable = true)
    protected AlertRules alertRules;

    /**
     * Gets the value of the alertRules property.
     * 
     * @return
     *     possible object is
     *     {@link AlertRules }
     *     
     */
    public AlertRules getAlertRules() {
        return alertRules;
    }

    /**
     * Sets the value of the alertRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertRules }
     *     
     */
    public void setAlertRules(AlertRules value) {
        this.alertRules = value;
    }

}
