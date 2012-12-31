
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BurstingCost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BurstingCost">
 *   &lt;complexContent>
 *     &lt;extension base="{}BillingCost">
 *       &lt;sequence>
 *         &lt;element name="Bursts" type="{}ArrayOfBurst" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BurstingCost", propOrder = {
    "bursts"
})
public class BurstingCost
    extends BillingCost
{

    @XmlElementWrapper(name = "Bursts")
    @XmlElement(name = "Burst")
    protected List<Burst> bursts;

    public List<Burst> getBursts() {
        if (bursts == null) {
            bursts = new ArrayList<Burst>();
        }
        return bursts;
    }

}
