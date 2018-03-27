
package com.bcldb.services.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for yesNoEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="yesNoEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="YES"/>
 *     &lt;enumeration value="NO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "yesNoEnumType")
@XmlEnum
public enum YesNoEnumType {

    YES,
    NO;

    public String value() {
        return name();
    }

    public static YesNoEnumType fromValue(String v) {
        return valueOf(v);
    }

}
