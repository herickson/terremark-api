
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnvironmentSecurityGroupReferences complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnvironmentSecurityGroupReferences">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnvironmentSecurityGroup" type="{}EnvironmentSecurityGroupReference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvironmentSecurityGroupReferences", propOrder = {
    "environmentSecurityGroups"
})
public class EnvironmentSecurityGroupReferences
    extends ToStringGenerator
{

    @XmlElement(name = "EnvironmentSecurityGroup", nillable = true)
    protected List<EnvironmentSecurityGroupReference> environmentSecurityGroups;

    /**
     * Gets the value of the environmentSecurityGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the environmentSecurityGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnvironmentSecurityGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnvironmentSecurityGroupReference }
     * 
     * 
     */
    public List<EnvironmentSecurityGroupReference> getEnvironmentSecurityGroups() {
        if (environmentSecurityGroups == null) {
            environmentSecurityGroups = new ArrayList<EnvironmentSecurityGroupReference>();
        }
        return this.environmentSecurityGroups;
    }

}
