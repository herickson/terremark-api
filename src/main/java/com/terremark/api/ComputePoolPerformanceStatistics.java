
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComputePoolPerformanceStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComputePoolPerformanceStatistics">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="Hourly" type="{}ComputePoolPerformanceStatistic" minOccurs="0"/>
 *         &lt;element name="Daily" type="{}ComputePoolPerformanceStatistic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComputePoolPerformanceStatistics", propOrder = {
    "hourly",
    "daily"
})
@javax.xml.bind.annotation.XmlRootElement(name = "ComputePoolPerformanceStatistics")
public class ComputePoolPerformanceStatistics
    extends Resource
{

    @XmlElement(name = "Hourly", nillable = true)
    protected ComputePoolPerformanceStatistic hourly;
    @XmlElement(name = "Daily", nillable = true)
    protected ComputePoolPerformanceStatistic daily;

    /**
     * Gets the value of the hourly property.
     * 
     * @return
     *     possible object is
     *     {@link ComputePoolPerformanceStatistic }
     *     
     */
    public ComputePoolPerformanceStatistic getHourly() {
        return hourly;
    }

    /**
     * Sets the value of the hourly property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputePoolPerformanceStatistic }
     *     
     */
    public void setHourly(ComputePoolPerformanceStatistic value) {
        this.hourly = value;
    }

    /**
     * Gets the value of the daily property.
     * 
     * @return
     *     possible object is
     *     {@link ComputePoolPerformanceStatistic }
     *     
     */
    public ComputePoolPerformanceStatistic getDaily() {
        return daily;
    }

    /**
     * Sets the value of the daily property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputePoolPerformanceStatistic }
     *     
     */
    public void setDaily(ComputePoolPerformanceStatistic value) {
        this.daily = value;
    }

}
