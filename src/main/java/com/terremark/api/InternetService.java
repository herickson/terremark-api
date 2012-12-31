
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InternetService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InternetService">
 *   &lt;complexContent>
 *     &lt;extension base="{}Entity">
 *       &lt;sequence>
 *         &lt;element name="Protocol" type="{}ProtocolTypeEnum" minOccurs="0"/>
 *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="PortRanges" type="{}PortRanges" minOccurs="0"/>
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublicIp" type="{}Reference" minOccurs="0"/>
 *         &lt;element name="Persistence" type="{}InternetServicePersistence"/>
 *         &lt;element name="RedirectUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Monitor" type="{}Reference" minOccurs="0"/>
 *         &lt;element name="TrustedNetworkGroup" type="{}Reference" minOccurs="0"/>
 *         &lt;element name="BackupInternetService" type="{}Reference" minOccurs="0"/>
 *         &lt;element name="NodeServices" type="{}ArrayOfNodeService" minOccurs="0"/>
 *         &lt;element name="LoadBalancingMethod" type="{}LoadBalancingMethod" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternetService", propOrder = {
    "protocol",
    "port",
    "portRanges",
    "enabled",
    "description",
    "publicIp",
    "persistence",
    "redirectUrl",
    "monitor",
    "trustedNetworkGroup",
    "backupInternetService",
    "nodeServices",
    "loadBalancingMethod"
})
@javax.xml.bind.annotation.XmlRootElement(name = "InternetService")
public class InternetService
    extends Entity
{

    @XmlElement(name = "Protocol")
    protected ProtocolTypeEnum protocol;
    @XmlElement(name = "Port")
    @XmlSchemaType(name = "unsignedInt")
    protected Long port;
    @XmlElement(name = "PortRanges", nillable = true)
    protected PortRanges portRanges;
    @XmlElement(name = "Enabled")
    protected boolean enabled;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "PublicIp", nillable = true)
    protected Reference publicIp;
    @XmlElement(name = "Persistence", required = true, nillable = true)
    protected InternetServicePersistence persistence;
    @XmlElement(name = "RedirectUrl", nillable = true)
    protected String redirectUrl;
    @XmlElement(name = "Monitor", nillable = true)
    protected Reference monitor;
    @XmlElement(name = "TrustedNetworkGroup", nillable = true)
    protected Reference trustedNetworkGroup;
    @XmlElement(name = "BackupInternetService", nillable = true)
    protected Reference backupInternetService;
    @XmlElement(name = "LoadBalancingMethod", nillable = true)
    protected LoadBalancingMethod loadBalancingMethod;
    @XmlElementWrapper(name = "NodeServices")
    @XmlElement(name = "NodeService")
    protected List<NodeService> nodeServices;

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
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPort(Long value) {
        this.port = value;
    }

    /**
     * Gets the value of the portRanges property.
     * 
     * @return
     *     possible object is
     *     {@link PortRanges }
     *     
     */
    public PortRanges getPortRanges() {
        return portRanges;
    }

    /**
     * Sets the value of the portRanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortRanges }
     *     
     */
    public void setPortRanges(PortRanges value) {
        this.portRanges = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the publicIp property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getPublicIp() {
        return publicIp;
    }

    /**
     * Sets the value of the publicIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setPublicIp(Reference value) {
        this.publicIp = value;
    }

    /**
     * Gets the value of the persistence property.
     * 
     * @return
     *     possible object is
     *     {@link InternetServicePersistence }
     *     
     */
    public InternetServicePersistence getPersistence() {
        return persistence;
    }

    /**
     * Sets the value of the persistence property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternetServicePersistence }
     *     
     */
    public void setPersistence(InternetServicePersistence value) {
        this.persistence = value;
    }

    /**
     * Gets the value of the redirectUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * Sets the value of the redirectUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectUrl(String value) {
        this.redirectUrl = value;
    }

    /**
     * Gets the value of the monitor property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getMonitor() {
        return monitor;
    }

    /**
     * Sets the value of the monitor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setMonitor(Reference value) {
        this.monitor = value;
    }

    /**
     * Gets the value of the trustedNetworkGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getTrustedNetworkGroup() {
        return trustedNetworkGroup;
    }

    /**
     * Sets the value of the trustedNetworkGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setTrustedNetworkGroup(Reference value) {
        this.trustedNetworkGroup = value;
    }

    /**
     * Gets the value of the backupInternetService property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getBackupInternetService() {
        return backupInternetService;
    }

    /**
     * Sets the value of the backupInternetService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setBackupInternetService(Reference value) {
        this.backupInternetService = value;
    }

    /**
     * Gets the value of the loadBalancingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link LoadBalancingMethod }
     *     
     */
    public LoadBalancingMethod getLoadBalancingMethod() {
        return loadBalancingMethod;
    }

    /**
     * Sets the value of the loadBalancingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadBalancingMethod }
     *     
     */
    public void setLoadBalancingMethod(LoadBalancingMethod value) {
        this.loadBalancingMethod = value;
    }

    public List<NodeService> getNodeServices() {
        if (nodeServices == null) {
            nodeServices = new ArrayList<NodeService>();
        }
        return nodeServices;
    }

}
