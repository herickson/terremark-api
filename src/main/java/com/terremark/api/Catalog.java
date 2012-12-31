
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Catalog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Catalog">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="Locations" type="{}CatalogLocations" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Catalog", propOrder = {
    "locations"
})
@javax.xml.bind.annotation.XmlRootElement(name = "Catalog")
public class Catalog
    extends Resource
{

    @XmlElementWrapper(name = "Locations")
    @XmlElement(name = "Location")
    protected List<CatalogLocation> locations;

    public List<CatalogLocation> getLocations() {
        if (locations == null) {
            locations = new ArrayList<CatalogLocation>();
        }
        return locations;
    }

}
