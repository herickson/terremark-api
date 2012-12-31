
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InternetServiceMonitor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InternetServiceMonitor">
 *   &lt;complexContent>
 *     &lt;extension base="{}Resource">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternetServiceMonitor")
@XmlSeeAlso({
    LoopbackMonitor.class,
    DefaultMonitor.class,
    ConfigurableInternetServiceMonitor.class
})
public class InternetServiceMonitor
    extends Resource
{


}
