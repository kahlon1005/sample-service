
package com.bcldb.services.common.type;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bcldb.services.common.type package. 
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

    private final static QName _ServicePostResponse_QNAME = new QName("http://type.common.services.bcldb.com", "servicePostResponse");
    private final static QName _ServiceError_QNAME = new QName("http://type.common.services.bcldb.com", "ServiceError");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bcldb.services.common.type
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PostServiceResponseType }
     * 
     */
    public PostServiceResponseType createPostServiceResponseType() {
        return new PostServiceResponseType();
    }

    /**
     * Create an instance of {@link ServiceErrorType }
     * 
     */
    public ServiceErrorType createServiceErrorType() {
        return new ServiceErrorType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostServiceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://type.common.services.bcldb.com", name = "servicePostResponse")
    public JAXBElement<PostServiceResponseType> createServicePostResponse(PostServiceResponseType value) {
        return new JAXBElement<PostServiceResponseType>(_ServicePostResponse_QNAME, PostServiceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://type.common.services.bcldb.com", name = "ServiceError")
    public JAXBElement<ServiceErrorType> createServiceError(ServiceErrorType value) {
        return new JAXBElement<ServiceErrorType>(_ServiceError_QNAME, ServiceErrorType.class, null, value);
    }

}
