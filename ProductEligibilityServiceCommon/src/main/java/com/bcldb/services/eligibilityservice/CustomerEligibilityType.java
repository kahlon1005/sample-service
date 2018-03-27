
package com.bcldb.services.eligibilityservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerEligibilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerEligibilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Eligibility" type="{http://eligibilityservice.services.bcldb.com}SKUEligibilityDetailType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerEligibilityType", propOrder = {
    "customerType",
    "eligibility"
})
public class CustomerEligibilityType {

    @XmlElement(name = "CustomerType", required = true)
    protected String customerType;
    @XmlElement(name = "Eligibility", required = true)
    protected List<SKUEligibilityDetailType> eligibility;

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
     * {@link SKUEligibilityDetailType }
     * 
     * 
     */
    public List<SKUEligibilityDetailType> getEligibility() {
        if (eligibility == null) {
            eligibility = new ArrayList<SKUEligibilityDetailType>();
        }
        return this.eligibility;
    }

}
