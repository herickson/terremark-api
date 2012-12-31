
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkHostNetwork complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkHostNetwork">
 *   &lt;complexContent>
 *     &lt;extension base="{}NetworkReference">
 *       &lt;sequence>
 *         &lt;element name="IpAddresses" type="{}NetworkHostIpAddresses" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkHostNetwork", propOrder = {
    "ipAddresses"
})
public class NetworkHostNetwork
    extends NetworkReference
{

    @XmlElementWrapper(name = "IpAddresses")
    @XmlElement(name = "IpAddress")
    protected List<NetworkHostIpAddress> ipAddresses;

    public List<NetworkHostIpAddress> getIpAddresses() {
        if (ipAddresses == null) {
            ipAddresses = new ArrayList<NetworkHostIpAddress>();
        }
        return ipAddresses;
    }

}
