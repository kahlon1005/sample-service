
package com.bcldb.services.eligibilityservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SKUEligibilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SKUEligibilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SKU" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Eligibility" type="{http://eligibilityservice.services.bcldb.com}CustomerEligibilityDetailType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SKUEligibilityType", propOrder = {
    "sku",
    "eligibility"
})
public class SKUEligibilityType {

    @XmlElement(name = "SKU", required = true)
    protected String sku;
    @XmlElement(name = "Eligibility", required = true)
    protected List<CustomerEligibilityDetailType> eligibility;

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
     * Gets the value of the eligibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eligibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEligibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerEligibilityDetailType }
     * 
     * 
     */
    public List<CustomerEligibilityDetailType> getEligibility() {
        if (eligibility == null) {
            eligibility = new ArrayList<CustomerEligibilityDetailType>();
        }
        return this.eligibility;
    }

}
