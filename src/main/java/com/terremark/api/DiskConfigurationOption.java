
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiskConfigurationOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiskConfigurationOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Minimum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Maximum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SystemDisk" type="{}DiskConfigurationOptionRange" minOccurs="0"/>
 *         &lt;element name="DataDisk" type="{}DiskConfigurationOptionRange" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiskConfigurationOption", propOrder = {
    "minimum",
    "maximum",
    "systemDisk",
    "dataDisk"
})
public class DiskConfigurationOption
    extends ToStringGenerator
{

    @XmlElement(name = "Minimum")
    protected int minimum;
    @XmlElement(name = "Maximum")
    protected int maximum;
    @XmlElement(name = "SystemDisk", nillable = true)
    protected DiskConfigurationOptionRange systemDisk;
    @XmlElement(name = "DataDisk", nillable = true)
    protected DiskConfigurationOptionRange dataDisk;

    /**
     * Gets the value of the minimum property.
     * 
     */
    public int getMinimum() {
        return minimum;
    }

    /**
     * Sets the value of the minimum property.
     * 
     */
    public void setMinimum(int value) {
        this.minimum = value;
    }

    /**
     * Gets the value of the maximum property.
     * 
     */
    public int getMaximum() {
        return maximum;
    }

    /**
     * Sets the value of the maximum property.
     * 
     */
    public void setMaximum(int value) {
        this.maximum = value;
    }

    /**
     * Gets the value of the systemDisk property.
     * 
     * @return
     *     possible object is
     *     {@link DiskConfigurationOptionRange }
     *     
     */
    public DiskConfigurationOptionRange getSystemDisk() {
        return systemDisk;
    }

    /**
     * Sets the value of the systemDisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiskConfigurationOptionRange }
     *     
     */
    public void setSystemDisk(DiskConfigurationOptionRange value) {
        this.systemDisk = value;
    }

    /**
     * Gets the value of the dataDisk property.
     * 
     * @return
     *     possible object is
     *     {@link DiskConfigurationOptionRange }
     *     
     */
    public DiskConfigurationOptionRange getDataDisk() {
        return dataDisk;
    }

    /**
     * Sets the value of the dataDisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiskConfigurationOptionRange }
     *     
     */
    public void setDataDisk(DiskConfigurationOptionRange value) {
        this.dataDisk = value;
    }

}
