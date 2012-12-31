
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateVirtualMachine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateVirtualMachine">
 *   &lt;complexContent>
 *     &lt;extension base="{}CreateOsTemplateVirtualMachineRequest">
 *       &lt;sequence>
 *         &lt;element name="Template" type="{}Reference"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateVirtualMachine", propOrder = {
    "template"
})
@javax.xml.bind.annotation.XmlRootElement(name = "CreateVirtualMachine")
public class CreateVirtualMachine
    extends CreateOsTemplateVirtualMachineRequest
{

    @XmlElement(name = "Template", required = true, nillable = true)
    protected Reference template;

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setTemplate(Reference value) {
        this.template = value;
    }

}
