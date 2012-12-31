
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReservedBilling complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservedBilling">
 *   &lt;complexContent>
 *     &lt;extension base="{}BillingCost">
 *       &lt;sequence>
 *         &lt;element name="BurstingCost" type="{}BurstingCost" minOccurs="0"/>
 *         &lt;element name="LicenseCost" type="{}LicenseCost" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservedBilling", propOrder = {
    "burstingCost",
    "licenseCost"
})
public class ReservedBilling
    extends BillingCost
{

    @XmlElement(name = "BurstingCost", nillable = true)
    protected BurstingCost burstingCost;
    @XmlElement(name = "LicenseCost", nillable = true)
    protected LicenseCost licenseCost;

    /**
     * Gets the value of the burstingCost property.
     * 
     * @return
     *     possible object is
     *     {@link BurstingCost }
     *     
     */
    public BurstingCost getBurstingCost() {
        return burstingCost;
    }

    /**
     * Sets the value of the burstingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BurstingCost }
     *     
     */
    public void setBurstingCost(BurstingCost value) {
        this.burstingCost = value;
    }

    /**
     * Gets the value of the licenseCost property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseCost }
     *     
     */
    public LicenseCost getLicenseCost() {
        return licenseCost;
    }

    /**
     * Sets the value of the licenseCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseCost }
     *     
     */
    public void setLicenseCost(LicenseCost value) {
        this.licenseCost = value;
    }

}
