
package com.bcldb.services.common.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for postServiceResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="postServiceResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="serviceError" type="{http://type.common.services.bcldb.com}serviceErrorType" minOccurs="0"/>
 *         &lt;element name="auxMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "postServiceResponseType", propOrder = {
    "success",
    "serviceError",
    "auxMessage"
})
public class PostServiceResponseType {

    protected boolean success;
    protected ServiceErrorType serviceError;
    protected String auxMessage;

    /**
     * Gets the value of the success property.
     * 
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     */
    public void setSuccess(boolean value) {
        this.success = value;
    }

    /**
     * Gets the value of the serviceError property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceErrorType }
     *     
     */
    public ServiceErrorType getServiceError() {
        return serviceError;
    }

    /**
     * Sets the value of the serviceError property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceErrorType }
     *     
     */
    public void setServiceError(ServiceErrorType value) {
        this.serviceError = value;
    }

    /**
     * Gets the value of the auxMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxMessage() {
        return auxMessage;
    }

    /**
     * Sets the value of the auxMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxMessage(String value) {
        this.auxMessage = value;
    }

}
