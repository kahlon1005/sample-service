package com.bcldb.services;

import javax.inject.Inject;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.jboss.logging.Logger;

import producteligibilityservice.ErrorMessage;
import producteligibilityservice.ProductEligibilityService;

import com.bcldb.services.common.EmptyRequestType;
import com.bcldb.services.common.GetVersionResponse;
import com.bcldb.services.ejb.ProductEligibilityServiceBean;
import com.bcldb.services.eligibilityservice.GetEligibilityByCustomerRequest;
import com.bcldb.services.eligibilityservice.GetEligibilityByCustomerResponse;
import com.bcldb.services.eligibilityservice.GetEligibilityByEffectiveDateRequest;
import com.bcldb.services.eligibilityservice.GetEligibilityByEffectiveDateResponse;
import com.bcldb.services.eligibilityservice.GetEligibilityBySKURequest;
import com.bcldb.services.eligibilityservice.GetEligibilityBySKUResponse;


@WebService(name = "ProductEligibilityService", targetNamespace = "urn:ProductEligibilityService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.bcldb.services.common.ObjectFactory.class,
    com.bcldb.services.eligibilityservice.ObjectFactory.class,
    com.bcldb.services.common.type.ObjectFactory.class
})
public class ProductEligibilityServiceImpl implements ProductEligibilityService {

private static final Logger log = Logger.getLogger(ProductEligibilityServiceImpl.class);
	
	@Inject
	ProductEligibilityServiceBean service = new ProductEligibilityServiceBean();	
	
	@Override
	public GetVersionResponse getVersionInfo(EmptyRequestType part) throws ErrorMessage {
		return service.getVersionInfo(part);
	}

	@Override
	public GetEligibilityBySKUResponse getEligibilityBySKU(GetEligibilityBySKURequest part) throws ErrorMessage {
		return service.getEligibilityBySKU(part);
	}

	@Override
	public GetEligibilityByCustomerResponse getEligibilityByCustomer(GetEligibilityByCustomerRequest part) throws ErrorMessage {
		return service.getEligibilityByCustomer(part);
	}

	@Override
	public GetEligibilityByEffectiveDateResponse getEligibilityByEffectiveDate(GetEligibilityByEffectiveDateRequest part) throws ErrorMessage {
		return service.getEligibilityByEffectiveDate(part);
	}

}
