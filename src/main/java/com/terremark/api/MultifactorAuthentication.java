
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultifactorAuthentication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultifactorAuthentication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PrimaryPhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PrimaryExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BackupCountryCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BackupPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BackupExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultifactorAuthentication", propOrder = {
    "countryCode",
    "primaryPhone",
    "primaryExtension",
    "backupCountryCode",
    "backupPhone",
    "backupExtension",
    "pin"
})
@javax.xml.bind.annotation.XmlRootElement(name = "MultifactorAuthentication")
public class MultifactorAuthentication
    extends ToStringGenerator
{

    @XmlElement(name = "CountryCode")
    protected int countryCode;
    @XmlElement(name = "PrimaryPhone", required = true, nillable = true)
    protected String primaryPhone;
    @XmlElement(name = "PrimaryExtension", nillable = true)
    protected String primaryExtension;
    @XmlElement(name = "BackupCountryCode", nillable = true)
    protected Integer backupCountryCode;
    @XmlElement(name = "BackupPhone", nillable = true)
    protected String backupPhone;
    @XmlElement(name = "BackupExtension", nillable = true)
    protected String backupExtension;
    @XmlElement(name = "Pin", nillable = true)
    protected String pin;

    /**
     * Gets the value of the countryCode property.
     * 
     */
    public int getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     */
    public void setCountryCode(int value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the primaryPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPhone() {
        return primaryPhone;
    }

    /**
     * Sets the value of the primaryPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPhone(String value) {
        this.primaryPhone = value;
    }

    /**
     * Gets the value of the primaryExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryExtension() {
        return primaryExtension;
    }

    /**
     * Sets the value of the primaryExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryExtension(String value) {
        this.primaryExtension = value;
    }

    /**
     * Gets the value of the backupCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBackupCountryCode() {
        return backupCountryCode;
    }

    /**
     * Sets the value of the backupCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBackupCountryCode(Integer value) {
        this.backupCountryCode = value;
    }

    /**
     * Gets the value of the backupPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackupPhone() {
        return backupPhone;
    }

    /**
     * Sets the value of the backupPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackupPhone(String value) {
        this.backupPhone = value;
    }

    /**
     * Gets the value of the backupExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackupExtension() {
        return backupExtension;
    }

    /**
     * Sets the value of the backupExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackupExtension(String value) {
        this.backupExtension = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPin(String value) {
        this.pin = value;
    }

}
