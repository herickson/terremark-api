
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FirewallAcls complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FirewallAcls">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="FirewallAcl" type="{}FirewallAcl" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FirewallAcls", propOrder = {
    "firewallAcls"
})
@javax.xml.bind.annotation.XmlRootElement(name = "FirewallAcls")
public class FirewallAcls
    extends Resource
{

    @XmlElement(name = "FirewallAcl", nillable = true)
    protected List<FirewallAcl> firewallAcls;

    /**
     * Gets the value of the firewallAcls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the firewallAcls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFirewallAcls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FirewallAcl }
     * 
     * 
     */
    public List<FirewallAcl> getFirewallAcls() {
        if (firewallAcls == null) {
            firewallAcls = new ArrayList<FirewallAcl>();
        }
        return this.firewallAcls;
    }

}
