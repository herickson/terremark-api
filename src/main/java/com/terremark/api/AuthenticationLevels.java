
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationLevels complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthenticationLevels">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="BasicEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HMACSHA1Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HMACSHA256Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HMACSHA512Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenticationLevels", propOrder = {
    "basicEnabled",
    "hmacsha1Enabled",
    "hmacsha256Enabled",
    "hmacsha512Enabled"
})
@javax.xml.bind.annotation.XmlRootElement(name = "AuthenticationLevels")
public class AuthenticationLevels
    extends Resource
{

    @XmlElement(name = "BasicEnabled")
    protected boolean basicEnabled;
    @XmlElement(name = "HMACSHA1Enabled")
    protected boolean hmacsha1Enabled;
    @XmlElement(name = "HMACSHA256Enabled")
    protected boolean hmacsha256Enabled;
    @XmlElement(name = "HMACSHA512Enabled")
    protected boolean hmacsha512Enabled;

    /**
     * Gets the value of the basicEnabled property.
     * 
     */
    public boolean isBasicEnabled() {
        return basicEnabled;
    }

    /**
     * Sets the value of the basicEnabled property.
     * 
     */
    public void setBasicEnabled(boolean value) {
        this.basicEnabled = value;
    }

    /**
     * Gets the value of the hmacsha1Enabled property.
     * 
     */
    public boolean isHMACSHA1Enabled() {
        return hmacsha1Enabled;
    }

    /**
     * Sets the value of the hmacsha1Enabled property.
     * 
     */
    public void setHMACSHA1Enabled(boolean value) {
        this.hmacsha1Enabled = value;
    }

    /**
     * Gets the value of the hmacsha256Enabled property.
     * 
     */
    public boolean isHMACSHA256Enabled() {
        return hmacsha256Enabled;
    }

    /**
     * Sets the value of the hmacsha256Enabled property.
     * 
     */
    public void setHMACSHA256Enabled(boolean value) {
        this.hmacsha256Enabled = value;
    }

    /**
     * Gets the value of the hmacsha512Enabled property.
     * 
     */
    public boolean isHMACSHA512Enabled() {
        return hmacsha512Enabled;
    }

    /**
     * Sets the value of the hmacsha512Enabled property.
     * 
     */
    public void setHMACSHA512Enabled(boolean value) {
        this.hmacsha512Enabled = value;
    }

}
