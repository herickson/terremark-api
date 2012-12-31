
package com.terremark.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CatalogItemLicenseTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CatalogItemLicenseTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Template"/>
 *     &lt;enumeration value="Custom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CatalogItemLicenseTypeEnum")
@XmlEnum
public enum CatalogItemLicenseTypeEnum {

    @XmlEnumValue("Template")
    TEMPLATE("Template"),
    @XmlEnumValue("Custom")
    CUSTOM("Custom");
    private final String value;

    CatalogItemLicenseTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CatalogItemLicenseTypeEnum fromValue(String v) {
        for (CatalogItemLicenseTypeEnum c: CatalogItemLicenseTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
