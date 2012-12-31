
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateGuestProcess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateGuestProcess">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProgramPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Arguments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Interpreter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Script" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateGuestProcess", propOrder = {
    "programPath",
    "arguments",
    "interpreter",
    "script"
})
@javax.xml.bind.annotation.XmlRootElement(name = "CreateGuestProcess")
public class CreateGuestProcess
    extends ToStringGenerator
{

    @XmlElement(name = "ProgramPath", nillable = true)
    protected String programPath;
    @XmlElement(name = "Arguments", nillable = true)
    protected String arguments;
    @XmlElement(name = "Interpreter", nillable = true)
    protected String interpreter;
    @XmlElement(name = "Script", nillable = true)
    protected String script;

    /**
     * Gets the value of the programPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramPath() {
        return programPath;
    }

    /**
     * Sets the value of the programPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramPath(String value) {
        this.programPath = value;
    }

    /**
     * Gets the value of the arguments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArguments() {
        return arguments;
    }

    /**
     * Sets the value of the arguments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArguments(String value) {
        this.arguments = value;
    }

    /**
     * Gets the value of the interpreter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterpreter() {
        return interpreter;
    }

    /**
     * Sets the value of the interpreter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterpreter(String value) {
        this.interpreter = value;
    }

    /**
     * Gets the value of the script property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScript() {
        return script;
    }

    /**
     * Sets the value of the script property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScript(String value) {
        this.script = value;
    }

}
