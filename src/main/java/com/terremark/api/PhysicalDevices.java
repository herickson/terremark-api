
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalDevices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalDevices">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="PhysicalDevice" type="{}PhysicalDevice" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalDevices", propOrder = {
    "physicalDevices"
})
@javax.xml.bind.annotation.XmlRootElement(name = "PhysicalDevices")
public class PhysicalDevices
    extends Resource
{

    @XmlElement(name = "PhysicalDevice", nillable = true)
    protected List<PhysicalDevice> physicalDevices;

    /**
     * Gets the value of the physicalDevices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalDevices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalDevices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalDevice }
     * 
     * 
     */
    public List<PhysicalDevice> getPhysicalDevices() {
        if (physicalDevices == null) {
            physicalDevices = new ArrayList<PhysicalDevice>();
        }
        return this.physicalDevices;
    }

}
