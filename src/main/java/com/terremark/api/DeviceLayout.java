
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceLayout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceLayout">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="Rows" type="{}Rows" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceLayout", propOrder = {
    "rows"
})
@javax.xml.bind.annotation.XmlRootElement(name = "DeviceLayout")
public class DeviceLayout
    extends Resource
{

    @XmlElementWrapper(name = "Rows")
    @XmlElement(name = "Row")
    protected List<LayoutRow> rows;

    public List<LayoutRow> getRows() {
        if (rows == null) {
            rows = new ArrayList<LayoutRow>();
        }
        return rows;
    }

}
