
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LayoutGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LayoutGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="VirtualMachines" type="{}VirtualMachineReferences" minOccurs="0"/>
 *         &lt;element name="PhysicalDevices" type="{}PhysicalDeviceReferences" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LayoutGroup", propOrder = {
    "index",
    "virtualMachines",
    "physicalDevices"
})
@javax.xml.bind.annotation.XmlRootElement(name = "LayoutGroup")
public class LayoutGroup
    extends Resource
{

    @XmlElement(name = "Index")
    protected Integer index;
    @XmlElementWrapper(name = "VirtualMachines")
    @XmlElement(name = "VirtualMachine")
    protected List<VirtualMachineReference> virtualMachines;
    @XmlElementWrapper(name = "PhysicalDevices")
    @XmlElement(name = "PhysicalDevice")
    protected List<Reference> physicalDevices;

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndex(Integer value) {
        this.index = value;
    }

    public List<VirtualMachineReference> getVirtualMachines() {
        if (virtualMachines == null) {
            virtualMachines = new ArrayList<VirtualMachineReference>();
        }
        return virtualMachines;
    }

    public List<Reference> getPhysicalDevices() {
        if (physicalDevices == null) {
            physicalDevices = new ArrayList<Reference>();
        }
        return physicalDevices;
    }

}
