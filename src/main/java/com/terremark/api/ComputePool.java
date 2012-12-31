
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComputePool complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComputePool">
 *   &lt;complexContent>
 *     &lt;extension base="{}Entity">
 *       &lt;sequence>
 *         &lt;element name="VirtualMachines" type="{}VirtualMachineReferences" minOccurs="0"/>
 *         &lt;element name="Purchased" type="{}ComputePoolCapacity" minOccurs="0"/>
 *         &lt;element name="CpuBurst" type="{}ResourceBurst" minOccurs="0"/>
 *         &lt;element name="MemoryBurst" type="{}ResourceBurst" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComputePool", propOrder = {
    "virtualMachines",
    "purchased",
    "cpuBurst",
    "memoryBurst"
})
@javax.xml.bind.annotation.XmlRootElement(name = "ComputePool")
public class ComputePool
    extends Entity
{

    @XmlElement(name = "Purchased", nillable = true)
    protected ComputePoolCapacity purchased;
    @XmlElement(name = "CpuBurst", nillable = true)
    protected ResourceBurst cpuBurst;
    @XmlElement(name = "MemoryBurst", nillable = true)
    protected ResourceBurst memoryBurst;
    @XmlElementWrapper(name = "VirtualMachines")
    @XmlElement(name = "VirtualMachine")
    protected List<VirtualMachineReference> virtualMachines;

    /**
     * Gets the value of the purchased property.
     * 
     * @return
     *     possible object is
     *     {@link ComputePoolCapacity }
     *     
     */
    public ComputePoolCapacity getPurchased() {
        return purchased;
    }

    /**
     * Sets the value of the purchased property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputePoolCapacity }
     *     
     */
    public void setPurchased(ComputePoolCapacity value) {
        this.purchased = value;
    }

    /**
     * Gets the value of the cpuBurst property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceBurst }
     *     
     */
    public ResourceBurst getCpuBurst() {
        return cpuBurst;
    }

    /**
     * Sets the value of the cpuBurst property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceBurst }
     *     
     */
    public void setCpuBurst(ResourceBurst value) {
        this.cpuBurst = value;
    }

    /**
     * Gets the value of the memoryBurst property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceBurst }
     *     
     */
    public ResourceBurst getMemoryBurst() {
        return memoryBurst;
    }

    /**
     * Sets the value of the memoryBurst property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceBurst }
     *     
     */
    public void setMemoryBurst(ResourceBurst value) {
        this.memoryBurst = value;
    }

    public List<VirtualMachineReference> getVirtualMachines() {
        if (virtualMachines == null) {
            virtualMachines = new ArrayList<VirtualMachineReference>();
        }
        return virtualMachines;
    }

}
