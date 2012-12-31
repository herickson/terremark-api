
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Tickets complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tickets">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="TicketReference" type="{}TicketReference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tickets", propOrder = {
    "ticketReferences"
})
@javax.xml.bind.annotation.XmlRootElement(name = "Tickets")
public class Tickets
    extends Resource
{

    @XmlElement(name = "TicketReference", nillable = true)
    protected List<TicketReference> ticketReferences;

    /**
     * Gets the value of the ticketReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketReference }
     * 
     * 
     */
    public List<TicketReference> getTicketReferences() {
        if (ticketReferences == null) {
            ticketReferences = new ArrayList<TicketReference>();
        }
        return this.ticketReferences;
    }

}
