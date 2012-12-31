
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkRnat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkRnat">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="Network" type="{}NetworkReference" minOccurs="0"/>
 *         &lt;element name="Rnat" type="{}Reference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkRnat", propOrder = {
    "network",
    "rnat"
})
@javax.xml.bind.annotation.XmlRootElement(name = "NetworkRnat")
public class NetworkRnat
    extends Resource
{

    @XmlElement(name = "Network", nillable = true)
    protected NetworkReference network;
    @XmlElement(name = "Rnat", nillable = true)
    protected Reference rnat;

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkReference }
     *     
     */
    public NetworkReference getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkReference }
     *     
     */
    public void setNetwork(NetworkReference value) {
        this.network = value;
    }

    /**
     * Gets the value of the rnat property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getRnat() {
        return rnat;
    }

    /**
     * Sets the value of the rnat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setRnat(Reference value) {
        this.rnat = value;
    }

}
