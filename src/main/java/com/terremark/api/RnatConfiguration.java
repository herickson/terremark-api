
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RnatConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RnatConfiguration">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="Networks" type="{}ArrayOfNetworkRnat" minOccurs="0"/>
 *         &lt;element name="Rnats" type="{}ArrayOfRnat" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RnatConfiguration", propOrder = {
    "networks",
    "rnats"
})
@javax.xml.bind.annotation.XmlRootElement(name = "RnatConfiguration")
public class RnatConfiguration
    extends Resource
{

    @XmlElementWrapper(name = "Networks")
    @XmlElement(name = "NetworkRnat")
    protected List<NetworkRnat> networks;
    @XmlElementWrapper(name = "Rnats")
    @XmlElement(name = "Rnat")
    protected List<Rnat> rnats;

    public List<NetworkRnat> getNetworks() {
        if (networks == null) {
            networks = new ArrayList<NetworkRnat>();
        }
        return networks;
    }

    public List<Rnat> getRnats() {
        if (rnats == null) {
            rnats = new ArrayList<Rnat>();
        }
        return rnats;
    }

}
