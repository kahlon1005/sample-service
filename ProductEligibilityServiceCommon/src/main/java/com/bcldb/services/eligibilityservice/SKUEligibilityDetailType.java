
package com.bcldb.services.eligibilityservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.bcldb.services.common.YesNoEnumType;


/**
 * <p>Java class for SKUEligibilityDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SKUEligibilityDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SKU" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "SKUEligibilityDetailType", propOrder = {
    "sku",
    "effectiveDate",
    "sellingUnitOrder",
    "caseOrder"
})
public class SKUEligibilityDetailType {

    @XmlElement(name = "SKU", required = true)
    protected String sku;
    @XmlElement(name = "EffectiveDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "SellingUnitOrder", required = true)
    protected YesNoEnumType sellingUnitOrder;
    @XmlElement(name = "CaseOrder", required = true)
    protected YesNoEnumType caseOrder;

    /**
     * Gets the value of the sku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKU() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKU(String value) {
        this.sku = value;
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
