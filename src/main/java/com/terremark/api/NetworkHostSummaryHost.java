
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkHostSummaryHost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkHostSummaryHost">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="IpAddresses" type="{}IpAddressReferences" minOccurs="0"/>
 *         &lt;element name="PoweredOn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Status" type="{}VirtualMachineStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkHostSummaryHost", propOrder = {
    "ipAddresses",
    "poweredOn",
    "status"
})
public class NetworkHostSummaryHost
    extends Resource
{

    @XmlElement(name = "PoweredOn", nillable = true)
    protected Boolean poweredOn;
    @XmlElement(name = "Status", nillable = true)
    protected VirtualMachineStatus status;
    @XmlElementWrapper(name = "IpAddresses")
    @XmlElement(name = "IpAddress")
    protected List<Reference> ipAddresses;

    /**
     * Gets the value of the poweredOn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPoweredOn() {
        return poweredOn;
    }

    /**
     * Sets the value of the poweredOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPoweredOn(Boolean value) {
        this.poweredOn = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineStatus }
     *     
     */
    public VirtualMachineStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineStatus }
     *     
     */
    public void setStatus(VirtualMachineStatus value) {
        this.status = value;
    }

    public List<Reference> getIpAddresses() {
        if (ipAddresses == null) {
            ipAddresses = new ArrayList<Reference>();
        }
        return ipAddresses;
    }

}
