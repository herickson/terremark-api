
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Template complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Template">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="OperatingSystem" type="{}Reference" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ComputeMatrix" type="{}ComputeMatrix" minOccurs="0"/>
 *         &lt;element name="Processor" type="{}ConfigurationOptionRange" minOccurs="0"/>
 *         &lt;element name="Memory" type="{}ResourceCapacityRange" minOccurs="0"/>
 *         &lt;element name="Storage" type="{}TemplateStorage" minOccurs="0"/>
 *         &lt;element name="NetworkAdapters" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Customization" type="{}CustomizationOption" minOccurs="0"/>
 *         &lt;element name="LicensedSoftware" type="{}DeviceLicensedSoftware" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TemplateVersions" type="{}TemplateVersions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Template", propOrder = {
    "operatingSystem",
    "description",
    "computeMatrix",
    "processor",
    "memory",
    "storage",
    "networkAdapters",
    "customization",
    "licensedSoftware",
    "version",
    "templateVersions"
})
@javax.xml.bind.annotation.XmlRootElement(name = "Template")
public class Template
    extends Resource
{

    @XmlElement(name = "OperatingSystem", nillable = true)
    protected Reference operatingSystem;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "Processor", nillable = true)
    protected ConfigurationOptionRange processor;
    @XmlElement(name = "Memory", nillable = true)
    protected ResourceCapacityRange memory;
    @XmlElement(name = "Storage", nillable = true)
    protected TemplateStorage storage;
    @XmlElement(name = "NetworkAdapters")
    protected Integer networkAdapters;
    @XmlElement(name = "Customization", nillable = true)
    protected CustomizationOption customization;
    @XmlElement(name = "LicensedSoftware", nillable = true)
    protected DeviceLicensedSoftware licensedSoftware;
    @XmlElement(name = "Version", nillable = true)
    protected String version;
    @XmlElement(name = "TemplateVersions", nillable = true)
    protected TemplateVersions templateVersions;
    @XmlElementWrapper(name = "ComputeMatrix")
    @XmlElement(name = "Entry")
    protected List<ComputeMatrixEntry> computeMatrix;

    /**
     * Gets the value of the operatingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * Sets the value of the operatingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setOperatingSystem(Reference value) {
        this.operatingSystem = value;
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
     * Gets the value of the storage property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateStorage }
     *     
     */
    public TemplateStorage getStorage() {
        return storage;
    }

    /**
     * Sets the value of the storage property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateStorage }
     *     
     */
    public void setStorage(TemplateStorage value) {
        this.storage = value;
    }

    /**
     * Gets the value of the networkAdapters property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNetworkAdapters() {
        return networkAdapters;
    }

    /**
     * Sets the value of the networkAdapters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNetworkAdapters(Integer value) {
        this.networkAdapters = value;
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

    /**
     * Gets the value of the licensedSoftware property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceLicensedSoftware }
     *     
     */
    public DeviceLicensedSoftware getLicensedSoftware() {
        return licensedSoftware;
    }

    /**
     * Sets the value of the licensedSoftware property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceLicensedSoftware }
     *     
     */
    public void setLicensedSoftware(DeviceLicensedSoftware value) {
        this.licensedSoftware = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the templateVersions property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateVersions }
     *     
     */
    public TemplateVersions getTemplateVersions() {
        return templateVersions;
    }

    /**
     * Sets the value of the templateVersions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateVersions }
     *     
     */
    public void setTemplateVersions(TemplateVersions value) {
        this.templateVersions = value;
    }

    public List<ComputeMatrixEntry> getComputeMatrix() {
        if (computeMatrix == null) {
            computeMatrix = new ArrayList<ComputeMatrixEntry>();
        }
        return computeMatrix;
    }

}
