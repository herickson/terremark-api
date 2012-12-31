
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Role complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Role">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="RoleType" type="{}RoleTypeEnum" minOccurs="0"/>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Category" type="{}RoleCategory" minOccurs="0"/>
 *         &lt;element name="IsAdminRole" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BusinessOperations" type="{}BusinessOperationReferences" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Role", propOrder = {
    "roleType",
    "active",
    "category",
    "isAdminRole",
    "businessOperations"
})
@javax.xml.bind.annotation.XmlRootElement(name = "Role")
public class Role
    extends Resource
{

    @XmlElement(name = "RoleType")
    protected RoleTypeEnum roleType;
    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "Category")
    protected RoleCategory category;
    @XmlElement(name = "IsAdminRole")
    protected Boolean isAdminRole;
    @XmlElementWrapper(name = "BusinessOperations")
    @XmlElement(name = "BusinessOperation")
    protected List<Reference> businessOperations;

    /**
     * Gets the value of the roleType property.
     * 
     * @return
     *     possible object is
     *     {@link RoleTypeEnum }
     *     
     */
    public RoleTypeEnum getRoleType() {
        return roleType;
    }

    /**
     * Sets the value of the roleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleTypeEnum }
     *     
     */
    public void setRoleType(RoleTypeEnum value) {
        this.roleType = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link RoleCategory }
     *     
     */
    public RoleCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleCategory }
     *     
     */
    public void setCategory(RoleCategory value) {
        this.category = value;
    }

    /**
     * Gets the value of the isAdminRole property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAdminRole() {
        return isAdminRole;
    }

    /**
     * Sets the value of the isAdminRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAdminRole(Boolean value) {
        this.isAdminRole = value;
    }

    public List<Reference> getBusinessOperations() {
        if (businessOperations == null) {
            businessOperations = new ArrayList<Reference>();
        }
        return businessOperations;
    }

}
