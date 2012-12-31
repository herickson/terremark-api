
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkHostIpAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkHostIpAddress">
 *   &lt;complexContent>
 *     &lt;extension base="{}Reference">
 *       &lt;sequence>
 *         &lt;element name="NodeServices" type="{}ArrayOfNodeService" minOccurs="0"/>
 *         &lt;element name="FirewallAcls" type="{}ArrayOfFirewallAcl" minOccurs="0"/>
 *         &lt;element name="FirewallLog" type="{}Reference" minOccurs="0"/>
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
@XmlType(name = "NetworkHostIpAddress", propOrder = {
    "nodeServices",
    "firewallAcls",
    "firewallLog",
    "rnat"
})
public class NetworkHostIpAddress
    extends Reference
{

    @XmlElement(name = "FirewallLog", nillable = true)
    protected Reference firewallLog;
    @XmlElement(name = "Rnat", nillable = true)
    protected Reference rnat;
    @XmlElementWrapper(name = "NodeServices")
    @XmlElement(name = "NodeService")
    protected List<NodeService> nodeServices;
    @XmlElementWrapper(name = "FirewallAcls")
    @XmlElement(name = "FirewallAcl")
    protected List<FirewallAcl> firewallAcls;

    /**
     * Gets the value of the firewallLog property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getFirewallLog() {
        return firewallLog;
    }

    /**
     * Sets the value of the firewallLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setFirewallLog(Reference value) {
        this.firewallLog = value;
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

    public List<NodeService> getNodeServices() {
        if (nodeServices == null) {
            nodeServices = new ArrayList<NodeService>();
        }
        return nodeServices;
    }

    public List<FirewallAcl> getFirewallAcls() {
        if (firewallAcls == null) {
            firewallAcls = new ArrayList<FirewallAcl>();
        }
        return firewallAcls;
    }

}
