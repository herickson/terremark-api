
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceLicensedSoftwareCost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceLicensedSoftwareCost">
 *   &lt;complexContent>
 *     &lt;extension base="{}BillingCost">
 *       &lt;sequence>
 *         &lt;element name="Licenses" type="{}ArrayOfDeviceLicensedSoftwareUsage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceLicensedSoftwareCost", propOrder = {
    "licenses"
})
public class DeviceLicensedSoftwareCost
    extends BillingCost
{

    @XmlElementWrapper(name = "Licenses")
    @XmlElement(name = "DeviceLicensedSoftwareUsage")
    protected List<DeviceLicensedSoftwareUsage> licenses;

    public List<DeviceLicensedSoftwareUsage> getLicenses() {
        if (licenses == null) {
            licenses = new ArrayList<DeviceLicensedSoftwareUsage>();
        }
        return licenses;
    }

}
