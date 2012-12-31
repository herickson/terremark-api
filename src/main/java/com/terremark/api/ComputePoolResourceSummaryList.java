
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComputePoolResourceSummaryList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComputePoolResourceSummaryList">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="ComputePoolResourceSummary" type="{}ComputePoolResourceSummary" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComputePoolResourceSummaryList", propOrder = {
    "computePoolResourceSummaries"
})
@javax.xml.bind.annotation.XmlRootElement(name = "ComputePoolResourceSummaryList")
public class ComputePoolResourceSummaryList
    extends Resource
{

    @XmlElement(name = "ComputePoolResourceSummary", nillable = true)
    protected List<ComputePoolResourceSummary> computePoolResourceSummaries;

    /**
     * Gets the value of the computePoolResourceSummaries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the computePoolResourceSummaries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComputePoolResourceSummaries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComputePoolResourceSummary }
     * 
     * 
     */
    public List<ComputePoolResourceSummary> getComputePoolResourceSummaries() {
        if (computePoolResourceSummaries == null) {
            computePoolResourceSummaries = new ArrayList<ComputePoolResourceSummary>();
        }
        return this.computePoolResourceSummaries;
    }

}
