
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CatalogEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogEntry">
 *   &lt;complexContent>
 *     &lt;extension base="{}Entity">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{}CatalogEntryStatus" minOccurs="0"/>
 *         &lt;element name="Alerts" type="{}CatalogAlerts" minOccurs="0"/>
 *         &lt;element name="Files" type="{}CatalogItemFiles" minOccurs="0"/>
 *         &lt;element name="Configuration" type="{}Reference" minOccurs="0"/>
 *         &lt;element name="CatalogType" type="{}CatalogEntryTypeEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogEntry", propOrder = {
    "status",
    "alerts",
    "files",
    "configuration",
    "catalogType"
})
@javax.xml.bind.annotation.XmlRootElement(name = "CatalogEntry")
public class CatalogEntry
    extends Entity
{

    @XmlElement(name = "Status")
    protected CatalogEntryStatus status;
    @XmlElement(name = "Configuration", nillable = true)
    protected Reference configuration;
    @XmlElement(name = "CatalogType")
    protected CatalogEntryTypeEnum catalogType;
    @XmlElementWrapper(name = "Alerts")
    @XmlElement(name = "Alert")
    protected List<CatalogAlert> alerts;
    @XmlElementWrapper(name = "Files")
    @XmlElement(name = "File")
    protected List<CatalogItemFile> files;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogEntryStatus }
     *     
     */
    public CatalogEntryStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogEntryStatus }
     *     
     */
    public void setStatus(CatalogEntryStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the configuration property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setConfiguration(Reference value) {
        this.configuration = value;
    }

    /**
     * Gets the value of the catalogType property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogEntryTypeEnum }
     *     
     */
    public CatalogEntryTypeEnum getCatalogType() {
        return catalogType;
    }

    /**
     * Sets the value of the catalogType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogEntryTypeEnum }
     *     
     */
    public void setCatalogType(CatalogEntryTypeEnum value) {
        this.catalogType = value;
    }

    public List<CatalogAlert> getAlerts() {
        if (alerts == null) {
            alerts = new ArrayList<CatalogAlert>();
        }
        return alerts;
    }

    public List<CatalogItemFile> getFiles() {
        if (files == null) {
            files = new ArrayList<CatalogItemFile>();
        }
        return files;
    }

}
