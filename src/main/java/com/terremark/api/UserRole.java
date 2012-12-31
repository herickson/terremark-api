
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserRole">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="OrganizationRole" type="{}Reference" minOccurs="0"/>
 *         &lt;element name="EnvironmentRoles" type="{}ArrayOfEnvironmentRole" minOccurs="0"/>
 *         &lt;element name="SecurityGroupRoles" type="{}ArrayOfSecurityGroupRole" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserRole", propOrder = {
    "organizationRole",
    "environmentRoles",
    "securityGroupRoles"
})
@javax.xml.bind.annotation.XmlRootElement(name = "UserRole")
public class UserRole
    extends Resource
{

    @XmlElement(name = "OrganizationRole", nillable = true)
    protected Reference organizationRole;
    @XmlElementWrapper(name = "EnvironmentRoles")
    @XmlElement(name = "EnvironmentRole")
    protected List<EnvironmentRole> environmentRoles;
    @XmlElementWrapper(name = "SecurityGroupRoles")
    @XmlElement(name = "SecurityGroupRole")
    protected List<SecurityGroupRole> securityGroupRoles;

    /**
     * Gets the value of the organizationRole property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getOrganizationRole() {
        return organizationRole;
    }

    /**
     * Sets the value of the organizationRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setOrganizationRole(Reference value) {
        this.organizationRole = value;
    }

    public List<EnvironmentRole> getEnvironmentRoles() {
        if (environmentRoles == null) {
            environmentRoles = new ArrayList<EnvironmentRole>();
        }
        return environmentRoles;
    }

    public List<SecurityGroupRole> getSecurityGroupRoles() {
        if (securityGroupRoles == null) {
            securityGroupRoles = new ArrayList<SecurityGroupRole>();
        }
        return securityGroupRoles;
    }

}
