
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PingMonitor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PingMonitor">
 *   &lt;complexContent>
 *     &lt;extension base="{}ConfigurableInternetServiceMonitor">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PingMonitor")
@javax.xml.bind.annotation.XmlRootElement(name = "PingMonitor")
public class PingMonitor
    extends ConfigurableInternetServiceMonitor
{


}
