
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineConfigurationOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualMachineConfigurationOptions">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="Processor" type="{}ConfigurationOptionRange" minOccurs="0"/>
 *         &lt;element name="Memory" type="{}ResourceCapacityRange" minOccurs="0"/>
 *         &lt;element name="Disk" type="{}DiskConfigurationOption" minOccurs="0"/>
 *         &lt;element name="NetworkAdapter" type="{}ConfigurationOptionRange" minOccurs="0"/>
 *         &lt;element name="Customization" type="{}CustomizationOption" minOccurs="0"/>
 *         &lt;element name="ComputeMatrix" type="{}ComputeMatrix" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineConfigurationOptions", propOrder = {
    "processor",
    "memory",
    "disk",
    "networkAdapter",
    "customization",
    "computeMatrix"
})
@javax.xml.bind.annotation.XmlRootElement(name = "VirtualMachineConfigurationOptions")
public class VirtualMachineConfigurationOptions
    extends Resource
{

    @XmlElement(name = "Processor", nillable = true)
    protected ConfigurationOptionRange processor;
    @XmlElement(name = "Memory", nillable = true)
    protected ResourceCapacityRange memory;
    @XmlElement(name = "Disk", nillable = true)
    protected DiskConfigurationOption disk;
    @XmlElement(name = "NetworkAdapter", nillable = true)
    protected ConfigurationOptionRange networkAdapter;
    @XmlElement(name = "Customization", nillable = true)
    protected CustomizationOption customization;
    @XmlElementWrapper(name = "ComputeMatrix")
    @XmlElement(name = "Entry")
    protected List<ComputeMatrixEntry> computeMatrix;

    /**
     * Gets the value of the processor property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationOptionRange }
     *     
     */
    public ConfigurationOptionRange getProcessor() {
        return processor;
    }

    /**
     * Sets the value of the processor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationOptionRange }
     *     
     */
    public void setProcessor(ConfigurationOptionRange value) {
        this.processor = value;
    }

    /**
     * Gets the value of the memory property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceCapacityRange }
     *     
     */
    public ResourceCapacityRange getMemory() {
        return memory;
    }

    /**
     * Sets the value of the memory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceCapacityRange }
     *     
     */
    public void setMemory(ResourceCapacityRange value) {
        this.memory = value;
    }

    /**
     * Gets the value of the disk property.
     * 
     * @return
     *     possible object is
     *     {@link DiskConfigurationOption }
     *     
     */
    public DiskConfigurationOption getDisk() {
        return disk;
    }

    /**
     * Sets the value of the disk property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiskConfigurationOption }
     *     
     */
    public void setDisk(DiskConfigurationOption value) {
        this.disk = value;
    }

    /**
     * Gets the value of the networkAdapter property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationOptionRange }
     *     
     */
    public ConfigurationOptionRange getNetworkAdapter() {
        return networkAdapter;
    }

    /**
     * Sets the value of the networkAdapter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationOptionRange }
     *     
     */
    public void setNetworkAdapter(ConfigurationOptionRange value) {
        this.networkAdapter = value;
    }

    /**
     * Gets the value of the customization property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationOption }
     *     
     */
    public CustomizationOption getCustomization() {
        return customization;
    }

    /**
     * Sets the value of the customization property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationOption }
     *     
     */
    public void setCustomization(CustomizationOption value) {
        this.customization = value;
    }

    public List<ComputeMatrixEntry> getComputeMatrix() {
        if (computeMatrix == null) {
            computeMatrix = new ArrayList<ComputeMatrixEntry>();
        }
        return computeMatrix;
    }

}
