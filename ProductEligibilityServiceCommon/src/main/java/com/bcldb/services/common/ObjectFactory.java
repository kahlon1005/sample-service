
package com.bcldb.services.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bcldb.services.common package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetVersionInfoRequest_QNAME = new QName("http://common.services.bcldb.com", "GetVersionInfoRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bcldb.services.common
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DateRangeType }
     * 
     */
    public DateRangeType createDateRangeType() {
        return new DateRangeType();
    }

    /**
     * Create an instance of {@link GetVersionResponse }
     * 
     */
    public GetVersionResponse createGetVersionResponse() {
        return new GetVersionResponse();
    }

    /**
     * Create an instance of {@link EmptyRequestType }
     * 
     */
    public EmptyRequestType createEmptyRequestType() {
        return new EmptyRequestType();
    }

    /**
     * Create an instance of {@link MonetaryValueType }
     * 
     */
    public MonetaryValueType createMonetaryValueType() {
        return new MonetaryValueType();
    }

    /**
     * Create an instance of {@link MandatoryDateRangeType }
     * 
     */
    public MandatoryDateRangeType createMandatoryDateRangeType() {
        return new MandatoryDateRangeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.services.bcldb.com", name = "GetVersionInfoRequest")
    public JAXBElement<EmptyRequestType> createGetVersionInfoRequest(EmptyRequestType value) {
        return new JAXBElement<EmptyRequestType>(_GetVersionInfoRequest_QNAME, EmptyRequestType.class, null, value);
    }

}
