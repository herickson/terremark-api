
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CatalogLog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogLog">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="CatalogLogEntry" type="{}CatalogLogEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogLog", propOrder = {
    "catalogLogEntries"
})
@javax.xml.bind.annotation.XmlRootElement(name = "CatalogLog")
public class CatalogLog
    extends Resource
{

    @XmlElement(name = "CatalogLogEntry", nillable = true)
    protected List<CatalogLogEntry> catalogLogEntries;

    /**
     * Gets the value of the catalogLogEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the catalogLogEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatalogLogEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CatalogLogEntry }
     * 
     * 
     */
    public List<CatalogLogEntry> getCatalogLogEntries() {
        if (catalogLogEntries == null) {
            catalogLogEntries = new ArrayList<CatalogLogEntry>();
        }
        return this.catalogLogEntries;
    }

}
