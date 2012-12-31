
package com.terremark.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CatalogEntryTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CatalogEntryTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Upload"/>
 *     &lt;enumeration value="Export"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CatalogEntryTypeEnum")
@XmlEnum
public enum CatalogEntryTypeEnum {

    @XmlEnumValue("Upload")
    UPLOAD("Upload"),
    @XmlEnumValue("Export")
    EXPORT("Export");
    private final String value;

    CatalogEntryTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CatalogEntryTypeEnum fromValue(String v) {
        for (CatalogEntryTypeEnum c: CatalogEntryTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
