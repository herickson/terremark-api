
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Threshold complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Threshold">
 *   &lt;complexContent>
 *     &lt;extension base="{}ResourceCapacity">
 *       &lt;sequence>
 *         &lt;element name="CompareType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Threshold", propOrder = {
    "compareType"
})
public class Threshold
    extends ResourceCapacity
{

    @XmlElement(name = "CompareType", nillable = true)
    protected String compareType;

    /**
     * Gets the value of the compareType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompareType() {
        return compareType;
    }

    /**
     * Sets the value of the compareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompareType(String value) {
        this.compareType = value;
    }

}
