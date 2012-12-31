
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetachedDiskUsageReferences complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetachedDiskUsageReferences">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DetachedDisk" type="{}DetachedDiskUsageReference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetachedDiskUsageReferences", propOrder = {
    "detachedDisks"
})
public class DetachedDiskUsageReferences
    extends ToStringGenerator
{

    @XmlElement(name = "DetachedDisk", nillable = true)
    protected List<DetachedDiskUsageReference> detachedDisks;

    /**
     * Gets the value of the detachedDisks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detachedDisks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetachedDisks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetachedDiskUsageReference }
     * 
     * 
     */
    public List<DetachedDiskUsageReference> getDetachedDisks() {
        if (detachedDisks == null) {
            detachedDisks = new ArrayList<DetachedDiskUsageReference>();
        }
        return this.detachedDisks;
    }

}
