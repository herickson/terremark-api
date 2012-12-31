
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for User complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="User">
 *   &lt;complexContent>
 *     &lt;extension base="{}Entity">
 *       &lt;sequence>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{}UserStatus" minOccurs="0"/>
 *         &lt;element name="LoginStatus" type="{}UserLoginStatus" minOccurs="0"/>
 *         &lt;element name="LastLogin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UserRole" type="{}UserRole" minOccurs="0"/>
 *         &lt;element name="MultifactorAuthentication" type="{}MultifactorAuthentication" minOccurs="0"/>
 *         &lt;element name="IsAdministrator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsApiUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsAlertNotificationEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsMultifactorAuthenticationEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ApiKeys" type="{}ApiKeys" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", propOrder = {
    "firstName",
    "lastName",
    "email",
    "status",
    "loginStatus",
    "lastLogin",
    "userRole",
    "multifactorAuthentication",
    "isAdministrator",
    "isApiUser",
    "isAlertNotificationEnabled",
    "isMultifactorAuthenticationEnabled",
    "apiKeys"
})
@javax.xml.bind.annotation.XmlRootElement(name = "User")
public class User
    extends Entity
{

    @XmlElement(name = "FirstName", nillable = true)
    protected String firstName;
    @XmlElement(name = "LastName", nillable = true)
    protected String lastName;
    @XmlElement(name = "Email", nillable = true)
    protected String email;
    @XmlElement(name = "Status")
    protected UserStatus status;
    @XmlElement(name = "LoginStatus")
    protected UserLoginStatus loginStatus;
    @XmlElement(name = "LastLogin", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastLogin;
    @XmlElement(name = "UserRole", nillable = true)
    protected UserRole userRole;
    @XmlElement(name = "MultifactorAuthentication", nillable = true)
    protected MultifactorAuthentication multifactorAuthentication;
    @XmlElement(name = "IsAdministrator")
    protected Boolean isAdministrator;
    @XmlElement(name = "IsApiUser")
    protected Boolean isApiUser;
    @XmlElement(name = "IsAlertNotificationEnabled")
    protected Boolean isAlertNotificationEnabled;
    @XmlElement(name = "IsMultifactorAuthenticationEnabled")
    protected Boolean isMultifactorAuthenticationEnabled;
    @XmlElement(name = "ApiKeys", nillable = true)
    protected ApiKeys apiKeys;

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
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link UserStatus }
     *     
     */
    public UserStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserStatus }
     *     
     */
    public void setStatus(UserStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the loginStatus property.
     * 
     * @return
     *     possible object is
     *     {@link UserLoginStatus }
     *     
     */
    public UserLoginStatus getLoginStatus() {
        return loginStatus;
    }

    /**
     * Sets the value of the loginStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserLoginStatus }
     *     
     */
    public void setLoginStatus(UserLoginStatus value) {
        this.loginStatus = value;
    }

    /**
     * Gets the value of the lastLogin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastLogin() {
        return lastLogin;
    }

    /**
     * Sets the value of the lastLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastLogin(XMLGregorianCalendar value) {
        this.lastLogin = value;
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
     * Gets the value of the isAdministrator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAdministrator() {
        return isAdministrator;
    }

    /**
     * Sets the value of the isAdministrator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAdministrator(Boolean value) {
        this.isAdministrator = value;
    }

    /**
     * Gets the value of the isApiUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsApiUser() {
        return isApiUser;
    }

    /**
     * Sets the value of the isApiUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsApiUser(Boolean value) {
        this.isApiUser = value;
    }

    /**
     * Gets the value of the isAlertNotificationEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAlertNotificationEnabled() {
        return isAlertNotificationEnabled;
    }

    /**
     * Sets the value of the isAlertNotificationEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAlertNotificationEnabled(Boolean value) {
        this.isAlertNotificationEnabled = value;
    }

    /**
     * Gets the value of the isMultifactorAuthenticationEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMultifactorAuthenticationEnabled() {
        return isMultifactorAuthenticationEnabled;
    }

    /**
     * Sets the value of the isMultifactorAuthenticationEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMultifactorAuthenticationEnabled(Boolean value) {
        this.isMultifactorAuthenticationEnabled = value;
    }

    /**
     * Gets the value of the apiKeys property.
     * 
     * @return
     *     possible object is
     *     {@link ApiKeys }
     *     
     */
    public ApiKeys getApiKeys() {
        return apiKeys;
    }

    /**
     * Sets the value of the apiKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiKeys }
     *     
     */
    public void setApiKeys(ApiKeys value) {
        this.apiKeys = value;
    }

}
