
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateRole">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RoleType" type="{}RoleTypeEnum" minOccurs="0"/>
 *         &lt;element name="BusinessOperations" type="{}BusinessOperationReferences" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateRole", propOrder = {
    "name",
    "active",
    "roleType",
    "businessOperations"
})
@javax.xml.bind.annotation.XmlRootElement(name = "CreateRole")
public class CreateRole
    extends ToStringGenerator
{

    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "RoleType")
    protected RoleTypeEnum roleType;
    @XmlElementWrapper(name = "BusinessOperations")
    @XmlElement(name = "BusinessOperation")
    protected List<Reference> businessOperations;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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

    public List<Reference> getBusinessOperations() {
        if (businessOperations == null) {
            businessOperations = new ArrayList<Reference>();
        }
        return businessOperations;
    }

}
