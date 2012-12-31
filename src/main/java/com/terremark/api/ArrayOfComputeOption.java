
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfComputeOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfComputeOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ComputeOption" type="{}ComputeOption" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfComputeOption", propOrder = {
    "computeOptions"
})
public class ArrayOfComputeOption
    extends ToStringGenerator
{

    @XmlElement(name = "ComputeOption", nillable = true)
    protected List<ComputeOption> computeOptions;

    /**
     * Gets the value of the computeOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the computeOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComputeOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComputeOption }
     * 
     * 
     */
    public List<ComputeOption> getComputeOptions() {
        if (computeOptions == null) {
            computeOptions = new ArrayList<ComputeOption>();
        }
        return this.computeOptions;
    }

}
