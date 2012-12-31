
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Organization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization">
 *   &lt;complexContent>
 *     &lt;extension base="{}Entity">
 *       &lt;sequence>
 *         &lt;element name="Locations" type="{}Locations" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization", propOrder = {
    "locations"
})
@javax.xml.bind.annotation.XmlRootElement(name = "Organization")
public class Organization
    extends Entity
{

    @XmlElementWrapper(name = "Locations")
    @XmlElement(name = "Location")
    protected List<OrganizationLocation> locations;

    public List<OrganizationLocation> getLocations() {
        if (locations == null) {
            locations = new ArrayList<OrganizationLocation>();
        }
        return locations;
    }

}
