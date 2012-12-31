
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatingSystemFamilies complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatingSystemFamilies">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="OperatingSystemFamily" type="{}OperatingSystemFamily" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingSystemFamilies", propOrder = {
    "operatingSystemFamilies"
})
@javax.xml.bind.annotation.XmlRootElement(name = "OperatingSystemFamilies")
public class OperatingSystemFamilies
    extends Resource
{

    @XmlElement(name = "OperatingSystemFamily", nillable = true)
    protected List<OperatingSystemFamily> operatingSystemFamilies;

    /**
     * Gets the value of the operatingSystemFamilies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatingSystemFamilies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatingSystemFamilies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperatingSystemFamily }
     * 
     * 
     */
    public List<OperatingSystemFamily> getOperatingSystemFamilies() {
        if (operatingSystemFamilies == null) {
            operatingSystemFamilies = new ArrayList<OperatingSystemFamily>();
        }
        return this.operatingSystemFamilies;
    }

}
