
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateBlankVirtualMachine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateBlankVirtualMachine">
 *   &lt;complexContent>
 *     &lt;extension base="{}CreateVirtualMachineRequest">
 *       &lt;sequence>
 *         &lt;element name="OperatingSystem" type="{}Reference"/>
 *         &lt;element name="Disks" type="{}Disks"/>
 *         &lt;element name="NetworkAdapterSettings" type="{}NetworkAdapterSettings"/>
 *         &lt;element name="DetachedDisks" type="{}DetachedVirtualDiskReferences"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateBlankVirtualMachine", propOrder = {
    "operatingSystem",
    "disks",
    "networkAdapterSettings",
    "detachedDisks"
})
@javax.xml.bind.annotation.XmlRootElement(name = "CreateBlankVirtualMachine")
public class CreateBlankVirtualMachine
    extends CreateVirtualMachineRequest
{

    @XmlElement(name = "OperatingSystem", required = true, nillable = true)
    protected Reference operatingSystem;
    @XmlElementWrapper(name = "Disks")
    @XmlElement(name = "Disk")
    protected List<VirtualDisk> disks;
    @XmlElementWrapper(name = "NetworkAdapterSettings")
    @XmlElement(name = "NetworkAdapter")
    protected List<NetworkAdapterSetting> networkAdapterSettings;
    @XmlElementWrapper(name = "DetachedDisks")
    @XmlElement(name = "DetachedDisk")
    protected List<Reference> detachedDisks;

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

    public List<VirtualDisk> getDisks() {
        if (disks == null) {
            disks = new ArrayList<VirtualDisk>();
        }
        return disks;
    }

    public List<NetworkAdapterSetting> getNetworkAdapterSettings() {
        if (networkAdapterSettings == null) {
            networkAdapterSettings = new ArrayList<NetworkAdapterSetting>();
        }
        return networkAdapterSettings;
    }

    public List<Reference> getDetachedDisks() {
        if (detachedDisks == null) {
            detachedDisks = new ArrayList<Reference>();
        }
        return detachedDisks;
    }

}
