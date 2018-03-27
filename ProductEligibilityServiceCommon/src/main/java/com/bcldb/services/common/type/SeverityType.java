
package com.bcldb.services.common.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for severityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="severityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WARN"/>
 *     &lt;enumeration value="MINOR"/>
 *     &lt;enumeration value="MAJOR"/>
 *     &lt;enumeration value="CRITICAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "severityType")
@XmlEnum
public enum SeverityType {

    WARN,
    MINOR,
    MAJOR,
    CRITICAL;

    public String value() {
        return name();
    }

    public static SeverityType fromValue(String v) {
        return valueOf(v);
    }

}
