
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicenseCost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LicenseCost">
 *   &lt;complexContent>
 *     &lt;extension base="{}BillingCost">
 *       &lt;sequence>
 *         &lt;element name="Licenses" type="{}ArrayOfLicense" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseCost", propOrder = {
    "licenses"
})
public class LicenseCost
    extends BillingCost
{

    @XmlElementWrapper(name = "Licenses")
    @XmlElement(name = "License")
    protected List<License> licenses;

    public List<License> getLicenses() {
        if (licenses == null) {
            licenses = new ArrayList<License>();
        }
        return licenses;
    }

}
