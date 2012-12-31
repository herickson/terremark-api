
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachinePerformanceStatistic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualMachinePerformanceStatistic">
 *   &lt;complexContent>
 *     &lt;extension base="{}Reference">
 *       &lt;sequence>
 *         &lt;element name="PerformanceStatistic" type="{}PerformanceStatistic" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachinePerformanceStatistic", propOrder = {
    "performanceStatistics"
})
public class VirtualMachinePerformanceStatistic
    extends Reference
{

    @XmlElement(name = "PerformanceStatistic", nillable = true)
    protected List<PerformanceStatistic> performanceStatistics;

    /**
     * Gets the value of the performanceStatistics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the performanceStatistics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerformanceStatistics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerformanceStatistic }
     * 
     * 
     */
    public List<PerformanceStatistic> getPerformanceStatistics() {
        if (performanceStatistics == null) {
            performanceStatistics = new ArrayList<PerformanceStatistic>();
        }
        return this.performanceStatistics;
    }

}
