
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalDeviceLicensedSoftware complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalDeviceLicensedSoftware">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HourlyLicensedSoftware" type="{}ArrayOfPhysicalServerSoftwareEntry" minOccurs="0"/>
 *         &lt;element name="LicenseProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MonthlyLicensedSoftware" type="{}ArrayOfPhysicalServerSoftwareEntry" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalDeviceLicensedSoftware", propOrder = {
    "hourlyLicensedSoftware",
    "licenseProvider",
    "monthlyLicensedSoftware"
})
public class PhysicalDeviceLicensedSoftware
    extends ToStringGenerator
{

    @XmlElement(name = "LicenseProvider", nillable = true)
    protected String licenseProvider;
    @XmlElementWrapper(name = "HourlyLicensedSoftware")
    @XmlElement(name = "PhysicalServerSoftwareEntry")
    protected List<PhysicalServerSoftwareEntry> hourlyLicensedSoftware;
    @XmlElementWrapper(name = "MonthlyLicensedSoftware")
    @XmlElement(name = "PhysicalServerSoftwareEntry")
    protected List<PhysicalServerSoftwareEntry> monthlyLicensedSoftware;

    /**
     * Gets the value of the licenseProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseProvider() {
        return licenseProvider;
    }

    /**
     * Sets the value of the licenseProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseProvider(String value) {
        this.licenseProvider = value;
    }

    public List<PhysicalServerSoftwareEntry> getHourlyLicensedSoftware() {
        if (hourlyLicensedSoftware == null) {
            hourlyLicensedSoftware = new ArrayList<PhysicalServerSoftwareEntry>();
        }
        return hourlyLicensedSoftware;
    }

    public List<PhysicalServerSoftwareEntry> getMonthlyLicensedSoftware() {
        if (monthlyLicensedSoftware == null) {
            monthlyLicensedSoftware = new ArrayList<PhysicalServerSoftwareEntry>();
        }
        return monthlyLicensedSoftware;
    }

}
