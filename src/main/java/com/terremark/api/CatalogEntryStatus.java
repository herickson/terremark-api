
package com.terremark.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CatalogEntryStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CatalogEntryStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Validated"/>
 *     &lt;enumeration value="Failed"/>
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="Validating"/>
 *     &lt;enumeration value="InProgress"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CatalogEntryStatus")
@XmlEnum
public enum CatalogEntryStatus {

    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Validated")
    VALIDATED("Validated"),
    @XmlEnumValue("Failed")
    FAILED("Failed"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("Validating")
    VALIDATING("Validating"),
    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    CatalogEntryStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CatalogEntryStatus fromValue(String v) {
        for (CatalogEntryStatus c: CatalogEntryStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
