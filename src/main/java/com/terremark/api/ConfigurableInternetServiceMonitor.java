
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigurableInternetServiceMonitor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigurableInternetServiceMonitor">
 *   &lt;complexContent>
 *     &lt;extension base="{}InternetServiceMonitor">
 *       &lt;sequence>
 *         &lt;element name="Interval" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="ResponseTimeout" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="Retries" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="Downtime" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurableInternetServiceMonitor", propOrder = {
    "interval",
    "responseTimeout",
    "retries",
    "downtime",
    "enabled"
})
@XmlSeeAlso({
    HttpMonitor.class,
    PingMonitor.class,
    EcvMonitor.class
})
public class ConfigurableInternetServiceMonitor
    extends InternetServiceMonitor
{

    @XmlElement(name = "Interval")
    @XmlSchemaType(name = "unsignedInt")
    protected Long interval;
    @XmlElement(name = "ResponseTimeout")
    @XmlSchemaType(name = "unsignedInt")
    protected Long responseTimeout;
    @XmlElement(name = "Retries")
    @XmlSchemaType(name = "unsignedInt")
    protected Long retries;
    @XmlElement(name = "Downtime")
    @XmlSchemaType(name = "unsignedInt")
    protected Long downtime;
    @XmlElement(name = "Enabled")
    protected Boolean enabled;

    /**
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInterval(Long value) {
        this.interval = value;
    }

    /**
     * Gets the value of the responseTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResponseTimeout() {
        return responseTimeout;
    }

    /**
     * Sets the value of the responseTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResponseTimeout(Long value) {
        this.responseTimeout = value;
    }

    /**
     * Gets the value of the retries property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRetries() {
        return retries;
    }

    /**
     * Sets the value of the retries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRetries(Long value) {
        this.retries = value;
    }

    /**
     * Gets the value of the downtime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDowntime() {
        return downtime;
    }

    /**
     * Sets the value of the downtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDowntime(Long value) {
        this.downtime = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

}
