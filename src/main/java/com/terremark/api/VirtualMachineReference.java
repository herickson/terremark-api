
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualMachineReference">
 *   &lt;complexContent>
 *     &lt;extension base="{}Reference">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{}VirtualMachineStatus" minOccurs="0"/>
 *         &lt;element name="ProcessorCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Memory" type="{}ResourceCapacity" minOccurs="0"/>
 *         &lt;element name="Storage" type="{}ResourceCapacity" minOccurs="0"/>
 *         &lt;element name="OperatingSystem" type="{}Reference" minOccurs="0"/>
 *         &lt;element name="PoweredOn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ToolsStatus" type="{}ToolsStatus" minOccurs="0"/>
 *         &lt;element name="Nics" type="{}Nics" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineReference", propOrder = {
    "status",
    "processorCount",
    "memory",
    "storage",
    "operatingSystem",
    "poweredOn",
    "toolsStatus",
    "nics"
})
public class VirtualMachineReference
    extends Reference
{

    @XmlElement(name = "Status", nillable = true)
    protected VirtualMachineStatus status;
    @XmlElement(name = "ProcessorCount", nillable = true)
    protected Integer processorCount;
    @XmlElement(name = "Memory", nillable = true)
    protected ResourceCapacity memory;
    @XmlElement(name = "Storage", nillable = true)
    protected ResourceCapacity storage;
    @XmlElement(name = "OperatingSystem", nillable = true)
    protected Reference operatingSystem;
    @XmlElement(name = "PoweredOn", nillable = true)
    protected Boolean poweredOn;
    @XmlElement(name = "ToolsStatus", nillable = true)
    protected ToolsStatus toolsStatus;
    @XmlElementWrapper(name = "Nics")
    @XmlElement(name = "Nic")
    protected List<VirtualNic> nics;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineStatus }
     *     
     */
    public VirtualMachineStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineStatus }
     *     
     */
    public void setStatus(VirtualMachineStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the processorCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProcessorCount() {
        return processorCount;
    }

    /**
     * Sets the value of the processorCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProcessorCount(Integer value) {
        this.processorCount = value;
    }

    /**
     * Gets the value of the memory property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceCapacity }
     *     
     */
    public ResourceCapacity getMemory() {
        return memory;
    }

    /**
     * Sets the value of the memory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceCapacity }
     *     
     */
    public void setMemory(ResourceCapacity value) {
        this.memory = value;
    }

    /**
     * Gets the value of the storage property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceCapacity }
     *     
     */
    public ResourceCapacity getStorage() {
        return storage;
    }

    /**
     * Sets the value of the storage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceCapacity }
     *     
     */
    public void setStorage(ResourceCapacity value) {
        this.storage = value;
    }

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
     * Gets the value of the poweredOn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPoweredOn() {
        return poweredOn;
    }

    /**
     * Sets the value of the poweredOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPoweredOn(Boolean value) {
        this.poweredOn = value;
    }

    /**
     * Gets the value of the toolsStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ToolsStatus }
     *     
     */
    public ToolsStatus getToolsStatus() {
        return toolsStatus;
    }

    /**
     * Sets the value of the toolsStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToolsStatus }
     *     
     */
    public void setToolsStatus(ToolsStatus value) {
        this.toolsStatus = value;
    }

    public List<VirtualNic> getNics() {
        if (nics == null) {
            nics = new ArrayList<VirtualNic>();
        }
        return nics;
    }

}
