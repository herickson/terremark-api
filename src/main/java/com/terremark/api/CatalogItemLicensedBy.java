
package com.terremark.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CatalogItemLicensedBy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CatalogItemLicensedBy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ServiceProvider"/>
 *     &lt;enumeration value="Customer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CatalogItemLicensedBy")
@XmlEnum
public enum CatalogItemLicensedBy {

    @XmlEnumValue("ServiceProvider")
    SERVICE_PROVIDER("ServiceProvider"),
    @XmlEnumValue("Customer")
    CUSTOMER("Customer");
    private final String value;

    CatalogItemLicensedBy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CatalogItemLicensedBy fromValue(String v) {
        for (CatalogItemLicensedBy c: CatalogItemLicensedBy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
