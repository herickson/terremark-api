
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceLicensedSoftware complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceLicensedSoftware">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HourlyLicensedSoftware" type="{}Software" minOccurs="0"/>
 *         &lt;element name="MonthlyLicensedSoftware" type="{}Software" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceLicensedSoftware", propOrder = {
    "hourlyLicensedSoftware",
    "monthlyLicensedSoftware"
})
public class DeviceLicensedSoftware
    extends ToStringGenerator
{

    @XmlElementWrapper(name = "HourlyLicensedSoftware")
    @XmlElement(name = "Software")
    protected List<SoftwareEntry> hourlyLicensedSoftware;
    @XmlElementWrapper(name = "MonthlyLicensedSoftware")
    @XmlElement(name = "Software")
    protected List<SoftwareEntry> monthlyLicensedSoftware;

    public List<SoftwareEntry> getHourlyLicensedSoftware() {
        if (hourlyLicensedSoftware == null) {
            hourlyLicensedSoftware = new ArrayList<SoftwareEntry>();
        }
        return hourlyLicensedSoftware;
    }

    public List<SoftwareEntry> getMonthlyLicensedSoftware() {
        if (monthlyLicensedSoftware == null) {
            monthlyLicensedSoftware = new ArrayList<SoftwareEntry>();
        }
        return monthlyLicensedSoftware;
    }

}
