
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeteredBilling complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeteredBilling">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Environments" type="{}MeteredBillingEnvironments" minOccurs="0"/>
 *         &lt;element name="InstanceBasedTotal" type="{}Cost" minOccurs="0"/>
 *         &lt;element name="InstanceBasedCommitedAmount" type="{}Cost" minOccurs="0"/>
 *         &lt;element name="InstanceBasedMonthlyTotal" type="{}Cost" minOccurs="0"/>
 *         &lt;element name="ReservedMonthlyTotal" type="{}Cost" minOccurs="0"/>
 *         &lt;element name="MonthlyTotalCost" type="{}Cost" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeteredBilling", propOrder = {
    "environments",
    "instanceBasedTotal",
    "instanceBasedCommitedAmount",
    "instanceBasedMonthlyTotal",
    "reservedMonthlyTotal",
    "monthlyTotalCost"
})
public class MeteredBilling
    extends ToStringGenerator
{

    @XmlElement(name = "Environments", nillable = true)
    protected MeteredBillingEnvironments environments;
    @XmlElement(name = "InstanceBasedTotal", nillable = true)
    protected Cost instanceBasedTotal;
    @XmlElement(name = "InstanceBasedCommitedAmount", nillable = true)
    protected Cost instanceBasedCommitedAmount;
    @XmlElement(name = "InstanceBasedMonthlyTotal", nillable = true)
    protected Cost instanceBasedMonthlyTotal;
    @XmlElement(name = "ReservedMonthlyTotal", nillable = true)
    protected Cost reservedMonthlyTotal;
    @XmlElement(name = "MonthlyTotalCost", nillable = true)
    protected Cost monthlyTotalCost;

    /**
     * Gets the value of the environments property.
     * 
     * @return
     *     possible object is
     *     {@link MeteredBillingEnvironments }
     *     
     */
    public MeteredBillingEnvironments getEnvironments() {
        return environments;
    }

    /**
     * Sets the value of the environments property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeteredBillingEnvironments }
     *     
     */
    public void setEnvironments(MeteredBillingEnvironments value) {
        this.environments = value;
    }

    /**
     * Gets the value of the instanceBasedTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Cost }
     *     
     */
    public Cost getInstanceBasedTotal() {
        return instanceBasedTotal;
    }

    /**
     * Sets the value of the instanceBasedTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cost }
     *     
     */
    public void setInstanceBasedTotal(Cost value) {
        this.instanceBasedTotal = value;
    }

    /**
     * Gets the value of the instanceBasedCommitedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Cost }
     *     
     */
    public Cost getInstanceBasedCommitedAmount() {
        return instanceBasedCommitedAmount;
    }

    /**
     * Sets the value of the instanceBasedCommitedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cost }
     *     
     */
    public void setInstanceBasedCommitedAmount(Cost value) {
        this.instanceBasedCommitedAmount = value;
    }

    /**
     * Gets the value of the instanceBasedMonthlyTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Cost }
     *     
     */
    public Cost getInstanceBasedMonthlyTotal() {
        return instanceBasedMonthlyTotal;
    }

    /**
     * Sets the value of the instanceBasedMonthlyTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cost }
     *     
     */
    public void setInstanceBasedMonthlyTotal(Cost value) {
        this.instanceBasedMonthlyTotal = value;
    }

    /**
     * Gets the value of the reservedMonthlyTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Cost }
     *     
     */
    public Cost getReservedMonthlyTotal() {
        return reservedMonthlyTotal;
    }

    /**
     * Sets the value of the reservedMonthlyTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cost }
     *     
     */
    public void setReservedMonthlyTotal(Cost value) {
        this.reservedMonthlyTotal = value;
    }

    /**
     * Gets the value of the monthlyTotalCost property.
     * 
     * @return
     *     possible object is
     *     {@link Cost }
     *     
     */
    public Cost getMonthlyTotalCost() {
        return monthlyTotalCost;
    }

    /**
     * Sets the value of the monthlyTotalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cost }
     *     
     */
    public void setMonthlyTotalCost(Cost value) {
        this.monthlyTotalCost = value;
    }

}
