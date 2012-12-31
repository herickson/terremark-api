
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotifyByEmailConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotifyByEmailConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Recipients" type="{}Recipients" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyByEmailConfiguration", propOrder = {
    "recipients"
})
public class NotifyByEmailConfiguration
    extends ToStringGenerator
{

    @XmlElementWrapper(name = "Recipients")
    @XmlElement(name = "Recipient")
    protected List<Recipient> recipients;

    public List<Recipient> getRecipients() {
        if (recipients == null) {
            recipients = new ArrayList<Recipient>();
        }
        return recipients;
    }

}
