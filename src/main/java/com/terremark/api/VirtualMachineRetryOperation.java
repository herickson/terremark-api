
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineRetryOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualMachineRetryOperation">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="VirtualMachine" type="{}Reference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineRetryOperation", propOrder = {
    "virtualMachine"
})
public class VirtualMachineRetryOperation
    extends Resource
{

    @XmlElement(name = "VirtualMachine", nillable = true)
    protected Reference virtualMachine;

    /**
     * Gets the value of the virtualMachine property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getVirtualMachine() {
        return virtualMachine;
    }

    /**
     * Sets the value of the virtualMachine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setVirtualMachine(Reference value) {
        this.virtualMachine = value;
    }

}
