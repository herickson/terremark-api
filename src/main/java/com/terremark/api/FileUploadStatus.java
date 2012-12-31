
package com.terremark.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileUploadStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FileUploadStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ready"/>
 *     &lt;enumeration value="InProgress"/>
 *     &lt;enumeration value="Failed"/>
 *     &lt;enumeration value="Verified"/>
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="Stopped"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FileUploadStatus")
@XmlEnum
public enum FileUploadStatus {

    @XmlEnumValue("Ready")
    READY("Ready"),
    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),
    @XmlEnumValue("Failed")
    FAILED("Failed"),
    @XmlEnumValue("Verified")
    VERIFIED("Verified"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("Stopped")
    STOPPED("Stopped");
    private final String value;

    FileUploadStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FileUploadStatus fromValue(String v) {
        for (FileUploadStatus c: FileUploadStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
