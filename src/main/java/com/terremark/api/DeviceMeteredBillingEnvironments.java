
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceMeteredBillingEnvironments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceMeteredBillingEnvironments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Environment" type="{}DeviceMeteredBillingEnvironment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceMeteredBillingEnvironments", propOrder = {
    "environments"
})
public class DeviceMeteredBillingEnvironments
    extends ToStringGenerator
{

    @XmlElement(name = "Environment", nillable = true)
    protected List<DeviceMeteredBillingEnvironment> environments;

    /**
     * Gets the value of the environments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the environments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnvironments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceMeteredBillingEnvironment }
     * 
     * 
     */
    public List<DeviceMeteredBillingEnvironment> getEnvironments() {
        if (environments == null) {
            environments = new ArrayList<DeviceMeteredBillingEnvironment>();
        }
        return this.environments;
    }

}
