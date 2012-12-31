
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublicIpAddresses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicIpAddresses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PublicIp" type="{}PublicIpAddressReference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicIpAddresses", propOrder = {
    "publicIps"
})
@javax.xml.bind.annotation.XmlRootElement(name = "PublicIpAddresses")
public class PublicIpAddresses
    extends ToStringGenerator
{

    @XmlElement(name = "PublicIp", nillable = true)
    protected List<PublicIpAddressReference> publicIps;

    /**
     * Gets the value of the publicIps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicIps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicIps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublicIpAddressReference }
     * 
     * 
     */
    public List<PublicIpAddressReference> getPublicIps() {
        if (publicIps == null) {
            publicIps = new ArrayList<PublicIpAddressReference>();
        }
        return this.publicIps;
    }

}
