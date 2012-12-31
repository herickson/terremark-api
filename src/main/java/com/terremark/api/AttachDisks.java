
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttachDisks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachDisks">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DetachedDisks" type="{}DetachedVirtualDiskReferences"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachDisks", propOrder = {
    "detachedDisks"
})
@javax.xml.bind.annotation.XmlRootElement(name = "AttachDisks")
public class AttachDisks
    extends ToStringGenerator
{

    @XmlElementWrapper(name = "DetachedDisks")
    @XmlElement(name = "DetachedDisk")
    protected List<Reference> detachedDisks;

    public List<Reference> getDetachedDisks() {
        if (detachedDisks == null) {
            detachedDisks = new ArrayList<Reference>();
        }
        return detachedDisks;
    }

}
