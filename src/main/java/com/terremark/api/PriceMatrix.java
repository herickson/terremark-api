
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceMatrix complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceMatrix">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="Compute" type="{}ComputeUnitCosts" minOccurs="0"/>
 *         &lt;element name="Storage" type="{}Cost" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceMatrix", propOrder = {
    "compute",
    "storage"
})
public class PriceMatrix
    extends Resource
{

    @XmlElement(name = "Compute", nillable = true)
    protected ComputeUnitCosts compute;
    @XmlElement(name = "Storage", nillable = true)
    protected Cost storage;

    /**
     * Gets the value of the compute property.
     * 
     * @return
     *     possible object is
     *     {@link ComputeUnitCosts }
     *     
     */
    public ComputeUnitCosts getCompute() {
        return compute;
    }

    /**
     * Sets the value of the compute property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputeUnitCosts }
     *     
     */
    public void setCompute(ComputeUnitCosts value) {
        this.compute = value;
    }

    /**
     * Gets the value of the storage property.
     * 
     * @return
     *     possible object is
     *     {@link Cost }
     *     
     */
    public Cost getStorage() {
        return storage;
    }

    /**
     * Sets the value of the storage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cost }
     *     
     */
    public void setStorage(Cost value) {
        this.storage = value;
    }

}
