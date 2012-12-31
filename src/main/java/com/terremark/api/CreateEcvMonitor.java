
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateEcvMonitor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateEcvMonitor">
 *   &lt;complexContent>
 *     &lt;extension base="{}CreateInternetServiceMonitorRequest">
 *       &lt;sequence>
 *         &lt;element name="SendString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HttpHeaders" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceiveString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateEcvMonitor", propOrder = {
    "sendString",
    "httpHeaders",
    "receiveString"
})
@javax.xml.bind.annotation.XmlRootElement(name = "CreateEcvMonitor")
public class CreateEcvMonitor
    extends CreateInternetServiceMonitorRequest
{

    @XmlElement(name = "SendString", nillable = true)
    protected String sendString;
    @XmlElement(name = "HttpHeaders", nillable = true)
    protected String httpHeaders;
    @XmlElement(name = "ReceiveString", nillable = true)
    protected String receiveString;

    /**
     * Gets the value of the sendString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendString() {
        return sendString;
    }

    /**
     * Sets the value of the sendString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendString(String value) {
        this.sendString = value;
    }

    /**
     * Gets the value of the httpHeaders property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpHeaders() {
        return httpHeaders;
    }

    /**
     * Sets the value of the httpHeaders property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpHeaders(String value) {
        this.httpHeaders = value;
    }

    /**
     * Gets the value of the receiveString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveString() {
        return receiveString;
    }

    /**
     * Sets the value of the receiveString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveString(String value) {
        this.receiveString = value;
    }

}
