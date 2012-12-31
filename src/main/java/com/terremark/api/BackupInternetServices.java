
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BackupInternetServices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BackupInternetServices">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *       &lt;sequence>
 *         &lt;element name="BackupInternetService" type="{}BackupInternetService" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BackupInternetServices", propOrder = {
    "backupInternetServices"
})
@javax.xml.bind.annotation.XmlRootElement(name = "BackupInternetServices")
public class BackupInternetServices
    extends Resource
{

    @XmlElement(name = "BackupInternetService", nillable = true)
    protected List<BackupInternetService> backupInternetServices;

    /**
     * Gets the value of the backupInternetServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the backupInternetServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBackupInternetServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BackupInternetService }
     * 
     * 
     */
    public List<BackupInternetService> getBackupInternetServices() {
        if (backupInternetServices == null) {
            backupInternetServices = new ArrayList<BackupInternetService>();
        }
        return this.backupInternetServices;
    }

}
