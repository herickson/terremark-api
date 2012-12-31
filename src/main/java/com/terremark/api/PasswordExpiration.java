
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PasswordExpiration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PasswordExpiration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PasswordExpirationEnforced" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExpirationInDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExpirationNoticeInDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DoNotExpireBeforeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PasswordExpiration", propOrder = {
    "passwordExpirationEnforced",
    "expirationInDays",
    "expirationNoticeInDays",
    "doNotExpireBeforeDate"
})
public class PasswordExpiration
    extends ToStringGenerator
{

    @XmlElement(name = "PasswordExpirationEnforced", nillable = true)
    protected Boolean passwordExpirationEnforced;
    @XmlElement(name = "ExpirationInDays", nillable = true)
    protected Integer expirationInDays;
    @XmlElement(name = "ExpirationNoticeInDays", nillable = true)
    protected Integer expirationNoticeInDays;
    @XmlElement(name = "DoNotExpireBeforeDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar doNotExpireBeforeDate;

    /**
     * Gets the value of the passwordExpirationEnforced property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPasswordExpirationEnforced() {
        return passwordExpirationEnforced;
    }

    /**
     * Sets the value of the passwordExpirationEnforced property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPasswordExpirationEnforced(Boolean value) {
        this.passwordExpirationEnforced = value;
    }

    /**
     * Gets the value of the expirationInDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpirationInDays() {
        return expirationInDays;
    }

    /**
     * Sets the value of the expirationInDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpirationInDays(Integer value) {
        this.expirationInDays = value;
    }

    /**
     * Gets the value of the expirationNoticeInDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpirationNoticeInDays() {
        return expirationNoticeInDays;
    }

    /**
     * Sets the value of the expirationNoticeInDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpirationNoticeInDays(Integer value) {
        this.expirationNoticeInDays = value;
    }

    /**
     * Gets the value of the doNotExpireBeforeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDoNotExpireBeforeDate() {
        return doNotExpireBeforeDate;
    }

    /**
     * Sets the value of the doNotExpireBeforeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDoNotExpireBeforeDate(XMLGregorianCalendar value) {
        this.doNotExpireBeforeDate = value;
    }

}
