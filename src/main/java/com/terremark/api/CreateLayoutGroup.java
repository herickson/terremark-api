
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateLayoutGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateLayoutGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Row" type="{}Reference" minOccurs="0"/>
 *         &lt;element name="NewRowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateLayoutGroup", propOrder = {
    "row",
    "newRowName"
})
@javax.xml.bind.annotation.XmlRootElement(name = "CreateLayoutGroup")
public class CreateLayoutGroup
    extends ToStringGenerator
{

    @XmlElement(name = "Row", nillable = true)
    protected Reference row;
    @XmlElement(name = "NewRowName", nillable = true)
    protected String newRowName;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     * Gets the value of the row property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getRow() {
        return row;
    }

    /**
     * Sets the value of the row property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setRow(Reference value) {
        this.row = value;
    }

    /**
     * Gets the value of the newRowName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewRowName() {
        return newRowName;
    }

    /**
     * Sets the value of the newRowName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewRowName(String value) {
        this.newRowName = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
