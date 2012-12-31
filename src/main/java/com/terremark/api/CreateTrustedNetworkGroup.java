
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateTrustedNetworkGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateTrustedNetworkGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Hosts" type="{}TrustedNetworkGroupHosts" minOccurs="0"/>
 *         &lt;element name="Networks" type="{}TrustedNetworkGroupNetworks" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateTrustedNetworkGroup", propOrder = {
    "hosts",
    "networks"
})
@javax.xml.bind.annotation.XmlRootElement(name = "CreateTrustedNetworkGroup")
public class CreateTrustedNetworkGroup
    extends ToStringGenerator
{

    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlElementWrapper(name = "Hosts")
    @XmlElement(name = "IpAddress")
    protected List<String> hosts;
    @XmlElementWrapper(name = "Networks")
    @XmlElement(name = "Network")
    protected List<ExternalNetwork> networks;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    public List<String> getHosts() {
        if (hosts == null) {
            hosts = new ArrayList<String>();
        }
        return hosts;
    }

    public List<ExternalNetwork> getNetworks() {
        if (networks == null) {
            networks = new ArrayList<ExternalNetwork>();
        }
        return networks;
    }

}
