
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Templates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Templates">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="Families" type="{}TemplateFamilies" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Templates", propOrder = {
    "families"
})
@javax.xml.bind.annotation.XmlRootElement(name = "Templates")
public class Templates
    extends Resource
{

    @XmlElementWrapper(name = "Families")
    @XmlElement(name = "Family")
    protected List<TemplateFamily> families;

    public List<TemplateFamily> getFamilies() {
        if (families == null) {
            families = new ArrayList<TemplateFamily>();
        }
        return families;
    }

}
