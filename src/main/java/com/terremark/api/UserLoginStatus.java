
package com.terremark.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserLoginStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserLoginStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="LockedOut"/>
 *     &lt;enumeration value="AccountReset"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserLoginStatus")
@XmlEnum
public enum UserLoginStatus {

    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("LockedOut")
    LOCKED_OUT("LockedOut"),
    @XmlEnumValue("AccountReset")
    ACCOUNT_RESET("AccountReset");
    private final String value;

    UserLoginStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserLoginStatus fromValue(String v) {
        for (UserLoginStatus c: UserLoginStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
