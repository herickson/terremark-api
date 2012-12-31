
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityGroupReferenceList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityGroupReferenceList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SshKey" type="{}SecurityGroupReference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityGroupReferenceList", propOrder = {
    "sshKeies"
})
public class SecurityGroupReferenceList
    extends ToStringGenerator
{

    @XmlElement(name = "SshKey", nillable = true)
    protected List<SecurityGroupReference> sshKeies;

    /**
     * Gets the value of the sshKeies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sshKeies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSshKeies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityGroupReference }
     * 
     * 
     */
    public List<SecurityGroupReference> getSshKeies() {
        if (sshKeies == null) {
            sshKeies = new ArrayList<SecurityGroupReference>();
        }
        return this.sshKeies;
    }

}
