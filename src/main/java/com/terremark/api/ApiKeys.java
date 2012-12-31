
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApiKeys complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApiKeys">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="ApiKey" type="{}ApiKey" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApiKeys", propOrder = {
    "apiKeies"
})
@javax.xml.bind.annotation.XmlRootElement(name = "ApiKeys")
public class ApiKeys
    extends Resource
{

    @XmlElement(name = "ApiKey", nillable = true)
    protected List<ApiKey> apiKeies;

    /**
     * Gets the value of the apiKeies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apiKeies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApiKeies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApiKey }
     * 
     * 
     */
    public List<ApiKey> getApiKeies() {
        if (apiKeies == null) {
            apiKeies = new ArrayList<ApiKey>();
        }
        return this.apiKeies;
    }

}
