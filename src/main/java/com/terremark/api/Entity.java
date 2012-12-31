
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Entity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Entity">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="Tasks" type="{}Tasks" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Entity", propOrder = {
    "tasks"
})
@XmlSeeAlso({
    User.class,
    EnvironmentSecurityGroup.class,
    InternetService.class,
    TrustedNetworkGroup.class,
    DeviceTag.class,
    Environment.class,
    FirewallLog.class,
    NodeService.class,
    SecurityGroup.class,
    PublicIp.class,
    ComputePool.class,
    Device.class,
    AdminOrganization.class,
    CatalogEntry.class,
    BackupInternetService.class,
    SshKey.class,
    CatalogLocation.class,
    FirewallAcl.class,
    Organization.class,
    Contact.class
})
public class Entity
    extends Resource
{

    @XmlElement(name = "Tasks", nillable = true)
    protected Tasks tasks;

    /**
     * Gets the value of the tasks property.
     * 
     * @return
     *     possible object is
     *     {@link Tasks }
     *     
     */
    public Tasks getTasks() {
        return tasks;
    }

    /**
     * Sets the value of the tasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tasks }
     *     
     */
    public void setTasks(Tasks value) {
        this.tasks = value;
    }

}
