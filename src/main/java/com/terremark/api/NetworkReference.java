
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkReference">
 *   &lt;complexContent>
 *     &lt;extension base="{}Reference">
 *       &lt;sequence>
 *         &lt;element name="Links" type="{}ArrayOfLink" minOccurs="0"/>
 *         &lt;element name="NetworkType" type="{}NetworkTypeEnum" minOccurs="0"/>
 *         &lt;element name="NetworkOverlay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkReference", propOrder = {
    "links",
    "networkType",
    "networkOverlay"
})
@XmlSeeAlso({
    NetworkHostSummaryNetwork.class,
    NetworkHostNetwork.class
})
public class NetworkReference
    extends Reference
{

    @XmlElement(name = "NetworkType")
    protected NetworkTypeEnum networkType;
    @XmlElement(name = "NetworkOverlay")
    protected Boolean networkOverlay;
    @XmlElementWrapper(name = "Links")
    @XmlElement(name = "Link")
    protected List<Link> links;

    /**
     * Gets the value of the networkType property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkTypeEnum }
     *     
     */
    public NetworkTypeEnum getNetworkType() {
        return networkType;
    }

    /**
     * Sets the value of the networkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkTypeEnum }
     *     
     */
    public void setNetworkType(NetworkTypeEnum value) {
        this.networkType = value;
    }

    /**
     * Gets the value of the networkOverlay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetworkOverlay() {
        return networkOverlay;
    }

    /**
     * Sets the value of the networkOverlay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetworkOverlay(Boolean value) {
        this.networkOverlay = value;
    }

    public List<Link> getLinks() {
        if (links == null) {
            links = new ArrayList<Link>();
        }
        return links;
    }

}
