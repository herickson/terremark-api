
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceBurst complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceBurst">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Actions" type="{}ArrayOfAction" minOccurs="0"/>
 *         &lt;element name="Status" type="{}ResourceBurstStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceBurst", propOrder = {
    "actions",
    "status"
})
public class ResourceBurst
    extends ToStringGenerator
{

    @XmlElement(name = "Status")
    protected ResourceBurstStatus status;
    @XmlElementWrapper(name = "Actions")
    @XmlElement(name = "Action")
    protected List<Action> actions;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceBurstStatus }
     *     
     */
    public ResourceBurstStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceBurstStatus }
     *     
     */
    public void setStatus(ResourceBurstStatus value) {
        this.status = value;
    }

    public List<Action> getActions() {
        if (actions == null) {
            actions = new ArrayList<Action>();
        }
        return actions;
    }

}
