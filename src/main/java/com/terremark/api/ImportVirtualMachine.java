
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportVirtualMachine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportVirtualMachine">
 *   &lt;complexContent>
 *     &lt;extension base="{}CreateVirtualMachineRequest">
 *       &lt;sequence>
 *         &lt;element name="CatalogEntry" type="{}Reference"/>
 *         &lt;element name="NetworkMappings" type="{}ImportNetworkMappings"/>
 *         &lt;element name="OperatingSystem" type="{}Reference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportVirtualMachine", propOrder = {
    "catalogEntry",
    "networkMappings",
    "operatingSystem"
})
@javax.xml.bind.annotation.XmlRootElement(name = "ImportVirtualMachine")
public class ImportVirtualMachine
    extends CreateVirtualMachineRequest
{

    @XmlElement(name = "CatalogEntry", required = true, nillable = true)
    protected Reference catalogEntry;
    @XmlElement(name = "OperatingSystem", nillable = true)
    protected Reference operatingSystem;
    @XmlElementWrapper(name = "NetworkMappings")
    @XmlElement(name = "NetworkMapping")
    protected List<ImportNetworkMapping> networkMappings;

    /**
     * Gets the value of the catalogEntry property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getCatalogEntry() {
        return catalogEntry;
    }

    /**
     * Sets the value of the catalogEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setCatalogEntry(Reference value) {
        this.catalogEntry = value;
    }

    /**
     * Gets the value of the operatingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * Sets the value of the operatingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setOperatingSystem(Reference value) {
        this.operatingSystem = value;
    }

    public List<ImportNetworkMapping> getNetworkMappings() {
        if (networkMappings == null) {
            networkMappings = new ArrayList<ImportNetworkMapping>();
        }
        return networkMappings;
    }

}
