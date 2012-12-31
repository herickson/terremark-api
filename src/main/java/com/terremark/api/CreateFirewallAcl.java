
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateFirewallAcl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateFirewallAcl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Permission" type="{}AclPermissionTypeEnum"/>
 *         &lt;element name="Protocol" type="{}ProtocolTypeEnum"/>
 *         &lt;element name="Source" type="{}FirewallAclEndpoint"/>
 *         &lt;element name="Destination" type="{}FirewallAclEndpoint" minOccurs="0"/>
 *         &lt;element name="PortRange" type="{}PortRange" minOccurs="0"/>
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateFirewallAcl", propOrder = {
    "permission",
    "protocol",
    "source",
    "destination",
    "portRange",
    "lineNumber"
})
@javax.xml.bind.annotation.XmlRootElement(name = "CreateFirewallAcl")
public class CreateFirewallAcl
    extends ToStringGenerator
{

    @XmlElement(name = "Permission", required = true)
    protected AclPermissionTypeEnum permission;
    @XmlElement(name = "Protocol", required = true)
    protected ProtocolTypeEnum protocol;
    @XmlElement(name = "Source", required = true, nillable = true)
    protected FirewallAclEndpoint source;
    @XmlElement(name = "Destination", nillable = true)
    protected FirewallAclEndpoint destination;
    @XmlElement(name = "PortRange", nillable = true)
    protected PortRange portRange;
    @XmlElement(name = "LineNumber", nillable = true)
    protected String lineNumber;

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

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNumber(String value) {
        this.lineNumber = value;
    }

}
