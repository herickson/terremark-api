
package com.terremark.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkHostSummaryNetwork complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkHostSummaryNetwork">
 *   &lt;complexContent>
 *     &lt;extension base="{}NetworkReference">
 *       &lt;sequence>
 *         &lt;element name="Hosts" type="{}NetworkHostSummaryHosts" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkHostSummaryNetwork", propOrder = {
    "hosts"
})
public class NetworkHostSummaryNetwork
    extends NetworkReference
{

    @XmlElementWrapper(name = "Hosts")
    @XmlElement(name = "Host")
    protected List<NetworkHostSummaryHost> hosts;

    public List<NetworkHostSummaryHost> getHosts() {
        if (hosts == null) {
            hosts = new ArrayList<NetworkHostSummaryHost>();
        }
        return hosts;
    }

}
