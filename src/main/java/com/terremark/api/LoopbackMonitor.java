
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoopbackMonitor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoopbackMonitor">
 *   &lt;complexContent>
 *     &lt;extension base="{}InternetServiceMonitor">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoopbackMonitor")
@javax.xml.bind.annotation.XmlRootElement(name = "LoopbackMonitor")
public class LoopbackMonitor
    extends InternetServiceMonitor
{


}
