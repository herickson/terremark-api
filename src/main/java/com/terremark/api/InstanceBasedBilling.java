
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstanceBasedBilling complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstanceBasedBilling">
 *   &lt;complexContent>
 *     &lt;extension base="{}BillingCost">
 *       &lt;sequence>
 *         &lt;element name="ComputeCost" type="{}ComputeCost" minOccurs="0"/>
 *         &lt;element name="LicenseCost" type="{}LicenseCost" minOccurs="0"/>
 *         &lt;element name="StorageCost" type="{}StorageCost" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstanceBasedBilling", propOrder = {
    "computeCost",
    "licenseCost",
    "storageCost"
})
public class InstanceBasedBilling
    extends BillingCost
{

    @XmlElement(name = "ComputeCost", nillable = true)
    protected ComputeCost computeCost;
    @XmlElement(name = "LicenseCost", nillable = true)
    protected LicenseCost licenseCost;
    @XmlElement(name = "StorageCost", nillable = true)
    protected StorageCost storageCost;

    /**
     * Gets the value of the computeCost property.
     * 
     * @return
     *     possible object is
     *     {@link ComputeCost }
     *     
     */
    public ComputeCost getComputeCost() {
        return computeCost;
    }

    /**
     * Sets the value of the computeCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputeCost }
     *     
     */
    public void setComputeCost(ComputeCost value) {
        this.computeCost = value;
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

    /**
     * Gets the value of the storageCost property.
     * 
     * @return
     *     possible object is
     *     {@link StorageCost }
     *     
     */
    public StorageCost getStorageCost() {
        return storageCost;
    }

    /**
     * Sets the value of the storageCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageCost }
     *     
     */
    public void setStorageCost(StorageCost value) {
        this.storageCost = value;
    }

}
