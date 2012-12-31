
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssignedIpAddresses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssignedIpAddresses">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="Networks" type="{}DeviceNetworks" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssignedIpAddresses", propOrder = {
    "networks"
})
@javax.xml.bind.annotation.XmlRootElement(name = "AssignedIpAddresses")
public class AssignedIpAddresses
    extends Resource
{

    @XmlElementWrapper(name = "Networks")
    @XmlElement(name = "Network")
    protected List<DeviceNetwork> networks;

    public List<DeviceNetwork> getNetworks() {
        if (networks == null) {
            networks = new ArrayList<DeviceNetwork>();
        }
        return networks;
    }

}
