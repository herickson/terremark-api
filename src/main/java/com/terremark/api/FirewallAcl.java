
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FirewallAcl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FirewallAcl">
 *   &lt;complexContent>
 *     &lt;extension base="{}Entity">
 *       &lt;sequence>
 *         &lt;element name="Permission" type="{}AclPermissionTypeEnum" minOccurs="0"/>
 *         &lt;element name="AclType" type="{}AclTypeEnum" minOccurs="0"/>
 *         &lt;element name="PortType" type="{}AclPortTypeEnum" minOccurs="0"/>
 *         &lt;element name="Protocol" type="{}ProtocolTypeEnum" minOccurs="0"/>
 *         &lt;element name="Source" type="{}FirewallAclEndpoint" minOccurs="0"/>
 *         &lt;element name="Destination" type="{}FirewallAclEndpoint" minOccurs="0"/>
 *         &lt;element name="PortRange" type="{}PortRange" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FirewallAcl", propOrder = {
    "permission",
    "aclType",
    "portType",
    "protocol",
    "source",
    "destination",
    "portRange"
})
@javax.xml.bind.annotation.XmlRootElement(name = "FirewallAcl")
public class FirewallAcl
    extends Entity
{

    @XmlElement(name = "Permission")
    protected AclPermissionTypeEnum permission;
    @XmlElement(name = "AclType")
    protected AclTypeEnum aclType;
    @XmlElement(name = "PortType")
    protected AclPortTypeEnum portType;
    @XmlElement(name = "Protocol")
    protected ProtocolTypeEnum protocol;
    @XmlElement(name = "Source", nillable = true)
    protected FirewallAclEndpoint source;
    @XmlElement(name = "Destination", nillable = true)
    protected FirewallAclEndpoint destination;
    @XmlElement(name = "PortRange", nillable = true)
    protected PortRange portRange;

    /**
     * Gets the value of the permission property.
     * 
     * @return
     *     possible object is
     *     {@link AclPermissionTypeEnum }
     *     
     */
    public AclPermissionTypeEnum getPermission() {
        return permission;
    }

    /**
     * Sets the value of the permission property.
     * 
     * @param value
     *     allowed object is
     *     {@link AclPermissionTypeEnum }
     *     
     */
    public void setPermission(AclPermissionTypeEnum value) {
        this.permission = value;
    }

    /**
     * Gets the value of the aclType property.
     * 
     * @return
     *     possible object is
     *     {@link AclTypeEnum }
     *     
     */
    public AclTypeEnum getAclType() {
        return aclType;
    }

    /**
     * Sets the value of the aclType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AclTypeEnum }
     *     
     */
    public void setAclType(AclTypeEnum value) {
        this.aclType = value;
    }

    /**
     * Gets the value of the portType property.
     * 
     * @return
     *     possible object is
     *     {@link AclPortTypeEnum }
     *     
     */
    public AclPortTypeEnum getPortType() {
        return portType;
    }

    /**
     * Sets the value of the portType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AclPortTypeEnum }
     *     
     */
    public void setPortType(AclPortTypeEnum value) {
        this.portType = value;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolTypeEnum }
     *     
     */
    public ProtocolTypeEnum getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolTypeEnum }
     *     
     */
    public void setProtocol(ProtocolTypeEnum value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link FirewallAclEndpoint }
     *     
     */
    public FirewallAclEndpoint getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirewallAclEndpoint }
     *     
     */
    public void setSource(FirewallAclEndpoint value) {
        this.source = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link FirewallAclEndpoint }
     *     
     */
    public FirewallAclEndpoint getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirewallAclEndpoint }
     *     
     */
    public void setDestination(FirewallAclEndpoint value) {
        this.destination = value;
    }

    /**
     * Gets the value of the portRange property.
     * 
     * @return
     *     possible object is
     *     {@link PortRange }
     *     
     */
    public PortRange getPortRange() {
        return portRange;
    }

    /**
     * Sets the value of the portRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortRange }
     *     
     */
    public void setPortRange(PortRange value) {
        this.portRange = value;
    }

}
