
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizationLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationLocation">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="Catalog" type="{}Reference" minOccurs="0"/>
 *         &lt;element name="Environments" type="{}EnvironmentReferences" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationLocation", propOrder = {
    "catalog",
    "environments"
})
public class OrganizationLocation
    extends Resource
{

    @XmlElement(name = "Catalog", nillable = true)
    protected Reference catalog;
    @XmlElementWrapper(name = "Environments")
    @XmlElement(name = "Environment")
    protected List<Reference> environments;

    /**
     * Gets the value of the catalog property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getCatalog() {
        return catalog;
    }

    /**
     * Sets the value of the catalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setCatalog(Reference value) {
        this.catalog = value;
    }

    public List<Reference> getEnvironments() {
        if (environments == null) {
            environments = new ArrayList<Reference>();
        }
        return environments;
    }

}
