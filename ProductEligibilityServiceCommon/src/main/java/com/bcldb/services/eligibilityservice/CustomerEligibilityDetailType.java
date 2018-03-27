
package com.bcldb.services.eligibilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.bcldb.services.common.YesNoEnumType;


/**
 * <p>Java class for CustomerEligibilityDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerEligibilityDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SellingUnitOrder" type="{http://common.services.bcldb.com}yesNoEnumType"/>
 *         &lt;element name="CaseOrder" type="{http://common.services.bcldb.com}yesNoEnumType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerEligibilityDetailType", propOrder = {
    "customerType",
    "effectiveDate",
    "sellingUnitOrder",
    "caseOrder"
})
public class CustomerEligibilityDetailType {

    @XmlElement(name = "CustomerType", required = true)
    protected String customerType;
    @XmlElement(name = "EffectiveDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "SellingUnitOrder", required = true)
    protected YesNoEnumType sellingUnitOrder;
    @XmlElement(name = "CaseOrder", required = true)
    protected YesNoEnumType caseOrder;

    /**
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerType(String value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the sellingUnitOrder property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoEnumType }
     *     
     */
    public YesNoEnumType getSellingUnitOrder() {
        return sellingUnitOrder;
    }

    /**
     * Sets the value of the sellingUnitOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoEnumType }
     *     
     */
    public void setSellingUnitOrder(YesNoEnumType value) {
        this.sellingUnitOrder = value;
    }

    /**
     * Gets the value of the caseOrder property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoEnumType }
     *     
     */
    public YesNoEnumType getCaseOrder() {
        return caseOrder;
    }

    /**
     * Sets the value of the caseOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoEnumType }
     *     
     */
    public void setCaseOrder(YesNoEnumType value) {
        this.caseOrder = value;
    }

}
