
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Resource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Resource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Links" type="{}ArrayOfLink" minOccurs="0"/>
 *         &lt;element name="Actions" type="{}ArrayOfAction" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Resource", propOrder = {
    "links",
    "actions"
})
@XmlSeeAlso({
    AlertRules.class,
    TrustedNetworkGroups.class,
    NetworkHost.class,
    OrganizationLocation.class,
    NetworkHostSummaryHost.class,
    DeviceNetwork.class,
    AttachDiskRetryOperation.class,
    ApiKey.class,
    ComputePoolResourceSummaryList.class,
    ComputePoolMemoryUsage.class,
    TicketGroups.class,
    DeviceLayout.class,
    Role.class,
    HardwareConfiguration.class,
    AlertRuleTemplates.class,
    OperatingSystem.class,
    ComputePoolResourceSummary.class,
    PhysicalDevices.class,
    ComputePoolCpuUsage.class,
    Template.class,
    ComputePoolMemoryUsageDetail.class,
    DetachedDisk.class,
    Users.class,
    SshKeys.class,
    OperatingSystemFamilies.class,
    VirtualMachineConfigurationOptions.class,
    BillingSummary.class,
    AdminOrganizations.class,
    UserCredentials.class,
    EnvironmentSecurityGroups.class,
    AlertRuleTemplate.class,
    ApiKeys.class,
    Network.class,
    BillingPeriods.class,
    AssignedSecurityGroups.class,
    Location.class,
    NetworkRnat.class,
    CatalogEntryConfiguration.class,
    Ticket.class,
    RnatHostAssociation.class,
    Catalog.class,
    Task.class,
    PerformanceStatistics.class,
    IpAddress.class,
    Alert.class,
    PasswordComplexityRules.class,
    RnatConfiguration.class,
    UserRole.class,
    PriceMatrix.class,
    Questions.class,
    BusinessOperations.class,
    LoginBanner.class,
    Rnat.class,
    LayoutGroup.class,
    AlertNotification.class,
    BandwidthUsage.class,
    DetachDiskRetryOperation.class,
    ComputeUnitCosts.class,
    GuestProcesses.class,
    DetachedDisks.class,
    EnvironmentNetworkSummary.class,
    AuthenticationLevels.class,
    AssignedIpAddresses.class,
    Contacts.class,
    Tickets.class,
    AlertRule.class,
    BackupInternetServices.class,
    ComputePoolCpuUsageDetail.class,
    DeviceTagList.class,
    DeviceBillingSummary.class,
    ComputePoolStorageUsageDetail.class,
    InternetServiceMonitor.class,
    CatalogLog.class,
    ComputePoolPerformanceStatistics.class,
    Organizations.class,
    Environments.class,
    SupportAccess.class,
    VirtualMachineRetryOperation.class,
    BusinessOperation.class,
    Entity.class,
    Templates.class,
    FirewallAcls.class,
    LayoutRow.class
})
public class Resource
    extends ToStringGenerator
{

    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "href")
    protected String href;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlElementWrapper(name = "Links")
    @XmlElement(name = "Link")
    protected List<Link> links;
    @XmlElementWrapper(name = "Actions")
    @XmlElement(name = "Action")
    protected List<Action> actions;

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

    public List<Link> getLinks() {
        if (links == null) {
            links = new ArrayList<Link>();
        }
        return links;
    }

    public List<Action> getActions() {
        if (actions == null) {
            actions = new ArrayList<Action>();
        }
        return actions;
    }

}
