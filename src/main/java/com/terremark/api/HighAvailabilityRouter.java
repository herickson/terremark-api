
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HighAvailabilityRouter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HighAvailabilityRouter">
 *   &lt;complexContent>
 *     &lt;extension base="{}PhysicalDevice">
 *       &lt;sequence>
 *         &lt;element name="OutsideIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsideIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Devices" type="{}Devices" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HighAvailabilityRouter", propOrder = {
    "outsideIp",
    "insideIp",
    "devices"
})
@javax.xml.bind.annotation.XmlRootElement(name = "HighAvailabilityRouter")
public class HighAvailabilityRouter
    extends PhysicalDevice
{

    @XmlElement(name = "OutsideIp", nillable = true)
    protected String outsideIp;
    @XmlElement(name = "InsideIp", nillable = true)
    protected String insideIp;
    @XmlElementWrapper(name = "Devices")
    @XmlElement(name = "Device")
    protected List<PhysicalRouterDevice> devices;

    /**
     * Gets the value of the outsideIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutsideIp() {
        return outsideIp;
    }

    /**
     * Sets the value of the outsideIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutsideIp(String value) {
        this.outsideIp = value;
    }

    /**
     * Gets the value of the insideIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsideIp() {
        return insideIp;
    }

    /**
     * Sets the value of the insideIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsideIp(String value) {
        this.insideIp = value;
    }

    public List<PhysicalRouterDevice> getDevices() {
        if (devices == null) {
            devices = new ArrayList<PhysicalRouterDevice>();
        }
        return devices;
    }

}
