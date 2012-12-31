
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComputePools complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComputePools">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ComputePool" type="{}ComputePoolReference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComputePools", propOrder = {
    "computePools"
})
@javax.xml.bind.annotation.XmlRootElement(name = "ComputePools")
public class ComputePools
    extends ToStringGenerator
{

    @XmlElement(name = "ComputePool", nillable = true)
    protected List<ComputePoolReference> computePools;

    /**
     * Gets the value of the computePools property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the computePools property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComputePools().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComputePoolReference }
     * 
     * 
     */
    public List<ComputePoolReference> getComputePools() {
        if (computePools == null) {
            computePools = new ArrayList<ComputePoolReference>();
        }
        return this.computePools;
    }

}
