
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdminOrganization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdminOrganization">
 *   &lt;complexContent>
 *     &lt;extension base="{}Entity">
 *       &lt;sequence>
 *         &lt;element name="SecurityGroups" type="{}SecurityGroupReferenceList" minOccurs="0"/>
 *         &lt;element name="SshKeys" type="{}SshKeyReferenceList" minOccurs="0"/>
 *         &lt;element name="MultifactorSummary" type="{}MultifactorSummary" minOccurs="0"/>
 *         &lt;element name="SupportAccess" type="{}SupportAccess" minOccurs="0"/>
 *         &lt;element name="PasswordComplexityRules" type="{}PasswordComplexityRules" minOccurs="0"/>
 *         &lt;element name="LoginBanner" type="{}LoginBanner" minOccurs="0"/>
 *         &lt;element name="AuthenticationLevels" type="{}AuthenticationLevels" minOccurs="0"/>
 *         &lt;element name="AlertNotification" type="{}AlertNotification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdminOrganization", propOrder = {
    "securityGroups",
    "sshKeys",
    "multifactorSummary",
    "supportAccess",
    "passwordComplexityRules",
    "loginBanner",
    "authenticationLevels",
    "alertNotification"
})
@javax.xml.bind.annotation.XmlRootElement(name = "AdminOrganization")
public class AdminOrganization
    extends Entity
{

    @XmlElement(name = "SecurityGroups", nillable = true)
    protected SecurityGroupReferenceList securityGroups;
    @XmlElement(name = "SshKeys", nillable = true)
    protected SshKeyReferenceList sshKeys;
    @XmlElement(name = "MultifactorSummary", nillable = true)
    protected MultifactorSummary multifactorSummary;
    @XmlElement(name = "SupportAccess", nillable = true)
    protected SupportAccess supportAccess;
    @XmlElement(name = "PasswordComplexityRules", nillable = true)
    protected PasswordComplexityRules passwordComplexityRules;
    @XmlElement(name = "LoginBanner", nillable = true)
    protected LoginBanner loginBanner;
    @XmlElement(name = "AuthenticationLevels", nillable = true)
    protected AuthenticationLevels authenticationLevels;
    @XmlElement(name = "AlertNotification", nillable = true)
    protected AlertNotification alertNotification;

    /**
     * Gets the value of the securityGroups property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityGroupReferenceList }
     *     
     */
    public SecurityGroupReferenceList getSecurityGroups() {
        return securityGroups;
    }

    /**
     * Sets the value of the securityGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityGroupReferenceList }
     *     
     */
    public void setSecurityGroups(SecurityGroupReferenceList value) {
        this.securityGroups = value;
    }

    /**
     * Gets the value of the sshKeys property.
     * 
     * @return
     *     possible object is
     *     {@link SshKeyReferenceList }
     *     
     */
    public SshKeyReferenceList getSshKeys() {
        return sshKeys;
    }

    /**
     * Sets the value of the sshKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link SshKeyReferenceList }
     *     
     */
    public void setSshKeys(SshKeyReferenceList value) {
        this.sshKeys = value;
    }

    /**
     * Gets the value of the multifactorSummary property.
     * 
     * @return
     *     possible object is
     *     {@link MultifactorSummary }
     *     
     */
    public MultifactorSummary getMultifactorSummary() {
        return multifactorSummary;
    }

    /**
     * Sets the value of the multifactorSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultifactorSummary }
     *     
     */
    public void setMultifactorSummary(MultifactorSummary value) {
        this.multifactorSummary = value;
    }

    /**
     * Gets the value of the supportAccess property.
     * 
     * @return
     *     possible object is
     *     {@link SupportAccess }
     *     
     */
    public SupportAccess getSupportAccess() {
        return supportAccess;
    }

    /**
     * Sets the value of the supportAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportAccess }
     *     
     */
    public void setSupportAccess(SupportAccess value) {
        this.supportAccess = value;
    }

    /**
     * Gets the value of the passwordComplexityRules property.
     * 
     * @return
     *     possible object is
     *     {@link PasswordComplexityRules }
     *     
     */
    public PasswordComplexityRules getPasswordComplexityRules() {
        return passwordComplexityRules;
    }

    /**
     * Sets the value of the passwordComplexityRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link PasswordComplexityRules }
     *     
     */
    public void setPasswordComplexityRules(PasswordComplexityRules value) {
        this.passwordComplexityRules = value;
    }

    /**
     * Gets the value of the loginBanner property.
     * 
     * @return
     *     possible object is
     *     {@link LoginBanner }
     *     
     */
    public LoginBanner getLoginBanner() {
        return loginBanner;
    }

    /**
     * Sets the value of the loginBanner property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginBanner }
     *     
     */
    public void setLoginBanner(LoginBanner value) {
        this.loginBanner = value;
    }

    /**
     * Gets the value of the authenticationLevels property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationLevels }
     *     
     */
    public AuthenticationLevels getAuthenticationLevels() {
        return authenticationLevels;
    }

    /**
     * Sets the value of the authenticationLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationLevels }
     *     
     */
    public void setAuthenticationLevels(AuthenticationLevels value) {
        this.authenticationLevels = value;
    }

    /**
     * Gets the value of the alertNotification property.
     * 
     * @return
     *     possible object is
     *     {@link AlertNotification }
     *     
     */
    public AlertNotification getAlertNotification() {
        return alertNotification;
    }

    /**
     * Sets the value of the alertNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertNotification }
     *     
     */
    public void setAlertNotification(AlertNotification value) {
        this.alertNotification = value;
    }

}
