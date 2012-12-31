
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference", propOrder = {
    "accessible"
})
@XmlSeeAlso({
    ComputePoolReference.class,
    TemplateVersionReference.class,
    DetachedDiskReference.class,
    DetachedDiskCost.class,
    RoleReference.class,
    ComputePoolCost.class,
    VirtualMachineMemoryUsageDetail.class,
    BackupInternetServiceReference.class,
    NetworkHostIpAddress.class,
    SecurityGroupReference.class,
    VirtualMachineReference.class,
    VirtualMachineCpuUsageDetail.class,
    DeviceCost.class,
    SshKeyReference.class,
    MeteredBillingEnvironment.class,
    DeviceMeteredBillingEnvironment.class,
    PublicIpAddressReference.class,
    TicketReference.class,
    DeviceUsageReference.class,
    IpAddressReference.class,
    VirtualMachinePerformanceStatistic.class,
    UserReference.class,
    EnvironmentSecurityGroupReference.class,
    NetworkReference.class,
    VirtualMachineStorageUsageDetail.class
})
public class Reference
    extends ToStringGenerator
{

    @XmlElement(nillable = true)
    protected Boolean accessible;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "href", required = true)
    protected String href;
    @XmlAttribute(name = "type")
    protected String type;

    /**
     * Gets the value of the accessible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccessible() {
        return accessible;
    }

    /**
     * Sets the value of the accessible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccessible(Boolean value) {
        this.accessible = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
