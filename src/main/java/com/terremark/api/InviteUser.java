
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InviteUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InviteUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Contact" type="{}Reference" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserRole" type="{}UserRole"/>
 *         &lt;element name="MultifactorAuthentication" type="{}MultifactorAuthentication" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InviteUser", propOrder = {
    "contact",
    "firstName",
    "lastName",
    "userRole",
    "multifactorAuthentication"
})
@javax.xml.bind.annotation.XmlRootElement(name = "InviteUser")
public class InviteUser
    extends ToStringGenerator
{

    @XmlElement(name = "Contact", nillable = true)
    protected Reference contact;
    @XmlElement(name = "FirstName", nillable = true)
    protected String firstName;
    @XmlElement(name = "LastName", nillable = true)
    protected String lastName;
    @XmlElement(name = "UserRole", required = true, nillable = true)
    protected UserRole userRole;
    @XmlElement(name = "MultifactorAuthentication", nillable = true)
    protected MultifactorAuthentication multifactorAuthentication;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setContact(Reference value) {
        this.contact = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the userRole property.
     * 
     * @return
     *     possible object is
     *     {@link UserRole }
     *     
     */
    public UserRole getUserRole() {
        return userRole;
    }

    /**
     * Sets the value of the userRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserRole }
     *     
     */
    public void setUserRole(UserRole value) {
        this.userRole = value;
    }

    /**
     * Gets the value of the multifactorAuthentication property.
     * 
     * @return
     *     possible object is
     *     {@link MultifactorAuthentication }
     *     
     */
    public MultifactorAuthentication getMultifactorAuthentication() {
        return multifactorAuthentication;
    }

    /**
     * Sets the value of the multifactorAuthentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultifactorAuthentication }
     *     
     */
    public void setMultifactorAuthentication(MultifactorAuthentication value) {
        this.multifactorAuthentication = value;
    }

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

}
