
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdminOrganizations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdminOrganizations">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="AdminOrganization" type="{}AdminOrganization" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdminOrganizations", propOrder = {
    "adminOrganizations"
})
@javax.xml.bind.annotation.XmlRootElement(name = "AdminOrganizations")
public class AdminOrganizations
    extends Resource
{

    @XmlElement(name = "AdminOrganization", nillable = true)
    protected List<AdminOrganization> adminOrganizations;

    /**
     * Gets the value of the adminOrganizations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adminOrganizations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdminOrganizations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdminOrganization }
     * 
     * 
     */
    public List<AdminOrganization> getAdminOrganizations() {
        if (adminOrganizations == null) {
            adminOrganizations = new ArrayList<AdminOrganization>();
        }
        return this.adminOrganizations;
    }

}
