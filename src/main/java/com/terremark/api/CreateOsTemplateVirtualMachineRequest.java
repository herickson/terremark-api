
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateOsTemplateVirtualMachineRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateOsTemplateVirtualMachineRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{}CreateVirtualMachineRequest">
 *       &lt;sequence>
 *         &lt;element name="LinuxCustomization" type="{}LinuxCustomization" minOccurs="0"/>
 *         &lt;element name="WindowsCustomization" type="{}WindowsCustomization" minOccurs="0"/>
 *         &lt;element name="PoweredOn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateOsTemplateVirtualMachineRequest", propOrder = {
    "linuxCustomization",
    "windowsCustomization",
    "poweredOn"
})
@XmlSeeAlso({
    CreateVirtualMachine.class
})
public class CreateOsTemplateVirtualMachineRequest
    extends CreateVirtualMachineRequest
{

    @XmlElement(name = "LinuxCustomization", nillable = true)
    protected LinuxCustomization linuxCustomization;
    @XmlElement(name = "WindowsCustomization", nillable = true)
    protected WindowsCustomization windowsCustomization;
    @XmlElement(name = "PoweredOn", nillable = true)
    protected Boolean poweredOn;

    /**
     * Gets the value of the linuxCustomization property.
     * 
     * @return
     *     possible object is
     *     {@link LinuxCustomization }
     *     
     */
    public LinuxCustomization getLinuxCustomization() {
        return linuxCustomization;
    }

    /**
     * Sets the value of the linuxCustomization property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinuxCustomization }
     *     
     */
    public void setLinuxCustomization(LinuxCustomization value) {
        this.linuxCustomization = value;
    }

    /**
     * Gets the value of the windowsCustomization property.
     * 
     * @return
     *     possible object is
     *     {@link WindowsCustomization }
     *     
     */
    public WindowsCustomization getWindowsCustomization() {
        return windowsCustomization;
    }

    /**
     * Sets the value of the windowsCustomization property.
     * 
     * @param value
     *     allowed object is
     *     {@link WindowsCustomization }
     *     
     */
    public void setWindowsCustomization(WindowsCustomization value) {
        this.windowsCustomization = value;
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

}
