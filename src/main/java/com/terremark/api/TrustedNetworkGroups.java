
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrustedNetworkGroups complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrustedNetworkGroups">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="TrustedNetworkGroup" type="{}TrustedNetworkGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrustedNetworkGroups", propOrder = {
    "trustedNetworkGroups"
})
@javax.xml.bind.annotation.XmlRootElement(name = "TrustedNetworkGroups")
public class TrustedNetworkGroups
    extends Resource
{

    @XmlElement(name = "TrustedNetworkGroup", nillable = true)
    protected List<TrustedNetworkGroup> trustedNetworkGroups;

    /**
     * Gets the value of the trustedNetworkGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trustedNetworkGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrustedNetworkGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrustedNetworkGroup }
     * 
     * 
     */
    public List<TrustedNetworkGroup> getTrustedNetworkGroups() {
        if (trustedNetworkGroups == null) {
            trustedNetworkGroups = new ArrayList<TrustedNetworkGroup>();
        }
        return this.trustedNetworkGroups;
    }

}
