
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertRuleTemplates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertRuleTemplates">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="AlertRuleTemplate" type="{}AlertRuleTemplate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertRuleTemplates", propOrder = {
    "alertRuleTemplates"
})
@javax.xml.bind.annotation.XmlRootElement(name = "AlertRuleTemplates")
public class AlertRuleTemplates
    extends Resource
{

    @XmlElement(name = "AlertRuleTemplate", nillable = true)
    protected List<AlertRuleTemplate> alertRuleTemplates;

    /**
     * Gets the value of the alertRuleTemplates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alertRuleTemplates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlertRuleTemplates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlertRuleTemplate }
     * 
     * 
     */
    public List<AlertRuleTemplate> getAlertRuleTemplates() {
        if (alertRuleTemplates == null) {
            alertRuleTemplates = new ArrayList<AlertRuleTemplate>();
        }
        return this.alertRuleTemplates;
    }

}
