
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateHttpMonitor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateHttpMonitor">
 *   &lt;complexContent>
 *     &lt;extension base="{}CreateInternetServiceMonitorRequest">
 *       &lt;sequence>
 *         &lt;element name="RequestUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HttpHeaders" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseCodes" type="{}HttpMonitorResponseCodes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateHttpMonitor", propOrder = {
    "requestUri",
    "httpHeaders",
    "responseCodes"
})
@javax.xml.bind.annotation.XmlRootElement(name = "CreateHttpMonitor")
public class CreateHttpMonitor
    extends CreateInternetServiceMonitorRequest
{

    @XmlElement(name = "RequestUri", nillable = true)
    protected String requestUri;
    @XmlElement(name = "HttpHeaders", nillable = true)
    protected String httpHeaders;
    @XmlElementWrapper(name = "ResponseCodes")
    @XmlElement(name = "ResponseCode")
    protected List<String> responseCodes;

    /**
     * Gets the value of the requestUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestUri() {
        return requestUri;
    }

    /**
     * Sets the value of the requestUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestUri(String value) {
        this.requestUri = value;
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

    public List<String> getResponseCodes() {
        if (responseCodes == null) {
            responseCodes = new ArrayList<String>();
        }
        return responseCodes;
    }

}
