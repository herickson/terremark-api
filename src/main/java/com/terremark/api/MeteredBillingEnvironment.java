
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeteredBillingEnvironment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeteredBillingEnvironment">
 *   &lt;complexContent>
 *     &lt;extension base="{}Reference">
 *       &lt;sequence>
 *         &lt;element name="Total" type="{}Cost" minOccurs="0"/>
 *         &lt;element name="ReservedBilling" type="{}ReservedBilling" minOccurs="0"/>
 *         &lt;element name="InstanceBasedBilling" type="{}InstanceBasedBilling" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeteredBillingEnvironment", propOrder = {
    "total",
    "reservedBilling",
    "instanceBasedBilling"
})
public class MeteredBillingEnvironment
    extends Reference
{

    @XmlElement(name = "Total", nillable = true)
    protected Cost total;
    @XmlElement(name = "ReservedBilling", nillable = true)
    protected ReservedBilling reservedBilling;
    @XmlElement(name = "InstanceBasedBilling", nillable = true)
    protected InstanceBasedBilling instanceBasedBilling;

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link Cost }
     *     
     */
    public Cost getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cost }
     *     
     */
    public void setTotal(Cost value) {
        this.total = value;
    }

    /**
     * Gets the value of the reservedBilling property.
     * 
     * @return
     *     possible object is
     *     {@link ReservedBilling }
     *     
     */
    public ReservedBilling getReservedBilling() {
        return reservedBilling;
    }

    /**
     * Sets the value of the reservedBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservedBilling }
     *     
     */
    public void setReservedBilling(ReservedBilling value) {
        this.reservedBilling = value;
    }

    /**
     * Gets the value of the instanceBasedBilling property.
     * 
     * @return
     *     possible object is
     *     {@link InstanceBasedBilling }
     *     
     */
    public InstanceBasedBilling getInstanceBasedBilling() {
        return instanceBasedBilling;
    }

    /**
     * Sets the value of the instanceBasedBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstanceBasedBilling }
     *     
     */
    public void setInstanceBasedBilling(InstanceBasedBilling value) {
        this.instanceBasedBilling = value;
    }

}
