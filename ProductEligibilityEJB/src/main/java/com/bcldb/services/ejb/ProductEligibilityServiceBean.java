package com.bcldb.services.ejb;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.jboss.logging.Logger;

import producteligibilityservice.ErrorMessage;

import com.bcldb.services.common.EmptyRequestType;
import com.bcldb.services.common.GetVersionResponse;
import com.bcldb.services.common.type.SeverityType;
import com.bcldb.services.eligibilityservice.CustomerEligibilityType;
import com.bcldb.services.eligibilityservice.GetEligibilityByCustomerRequest;
import com.bcldb.services.eligibilityservice.GetEligibilityByCustomerResponse;
import com.bcldb.services.eligibilityservice.GetEligibilityByEffectiveDateRequest;
import com.bcldb.services.eligibilityservice.GetEligibilityByEffectiveDateResponse;
import com.bcldb.services.eligibilityservice.GetEligibilityBySKURequest;
import com.bcldb.services.eligibilityservice.GetEligibilityBySKUResponse;
import com.bcldb.services.eligibilityservice.SKUEligibilityType;
import com.bcldb.services.model.BusinessRuleException;
import com.bcldb.services.model.ProductCustomerEligibilityEnt;
import com.bcldb.services.util.CommonHelper;
import com.bcldb.services.util.DTOConverter;
import com.bcldb.services.util.ErrorHandler;
import com.bcldb.services.util.ParamValidator;

@Stateless
public class ProductEligibilityServiceBean {
	
	private static final Logger logger = Logger.getLogger(ProductEligibilityServiceBean.class);
	private static final String VERSION_NO = "1.1";
	
	private final static String errorMsg_1;
	
	static{    
		errorMsg_1 = "The effective date must be defined.";
	}
	
	
	@PersistenceContext
	private EntityManager em;

	ErrorHandler handler = new ErrorHandler();
	ParamValidator validator = new ParamValidator();
	DTOConverter dtoConverter = new DTOConverter(); 

	public GetVersionResponse getVersionInfo(EmptyRequestType part) throws ErrorMessage {
		GetVersionResponse dto = new GetVersionResponse();
		dto.setVersion(VERSION_NO);				
		return dto;
	
	}
	
	public GetEligibilityBySKUResponse getEligibilityBySKU(GetEligibilityBySKURequest part) throws ErrorMessage {
		GetEligibilityBySKUResponse dto = new GetEligibilityBySKUResponse();
		
		validator.validateRequest(part, handler);
		validator.validateSku(part.getSKU(), handler);
		
		try{		
			for(String sku : part.getSKU()){
				
				List<ProductCustomerEligibilityEnt> el = getEligibilityBySKU(sku);
				SKUEligibilityType entry = dtoConverter.convertSKUEligibilityType(el);				
				dto.getSKUEligibilities().add(entry);
			}
			
		}catch(ErrorMessage e){
            logger.error("Business logic error",e);
            throw e;        
        }catch(Throwable e){
            logger.error("Web service operation \"getEligibilityBySKU\" error for SKU :" + part.getSKU(), e);
            handler.reportError(ErrorHandler.ERROR_CODE_1, "Service operation error: "+e.getMessage(), SeverityType.MAJOR);
        }		
		return dto;
	}
	
	public GetEligibilityByCustomerResponse getEligibilityByCustomer(GetEligibilityByCustomerRequest part) throws ErrorMessage {
		GetEligibilityByCustomerResponse dto = new GetEligibilityByCustomerResponse();
		validator.validateRequest(part, handler);
		
		validator.validateCustType(part.getCustomerType(), handler);
		
		try{
			for(String custType : part.getCustomerType()){
				List<ProductCustomerEligibilityEnt> el = getEligibilityByCustomer(custType);
				CustomerEligibilityType entry = dtoConverter.convertCustomerEligibityType(el);				
				dto.getCustomerEligibilities().add(entry);				
			}			
		}catch(ErrorMessage e){
            logger.error("Business logic error",e);
            throw e;        
        }catch(Throwable e){
            logger.error("Web service operation \"getEligibilityByCustomer\" error for custType :" + part.getCustomerType() , e);
            handler.reportError(ErrorHandler.ERROR_CODE_1, "Service operation error: "+e.getMessage(), SeverityType.MAJOR);
        }
		return dto;
	}
	
	public GetEligibilityByEffectiveDateResponse getEligibilityByEffectiveDate(GetEligibilityByEffectiveDateRequest part) throws ErrorMessage {
		GetEligibilityByEffectiveDateResponse dto = new GetEligibilityByEffectiveDateResponse();
		
		validator.validateRequest(part, handler);
		
		Date effDate = CommonHelper.gregorian2Date(part.getEffectiveDate());
		if (!validator.isDateDefined(effDate)) throw new BusinessRuleException(errorMsg_1);
		
		try{			
			List<ProductCustomerEligibilityEnt> el = getEligibilityByEffectiveDate(effDate);
			for(ProductCustomerEligibilityEnt eligibility : el){
				CustomerEligibilityType entry = new CustomerEligibilityType();
				entry = dtoConverter.convertEligibilityByEffectiveDate(eligibility);				
				dto.getCustomerEligibilities().add(entry);
			}					
						
		}catch(ErrorMessage e){
            logger.error("Business logic error",e);
            throw e;        
        }catch(Throwable e){
            logger.error("Web service operation \"getEligibilityByEffectiveDate\" error for effectiveDate :" + part.getEffectiveDate(), e);
            handler.reportError(ErrorHandler.ERROR_CODE_1, "Service operation error: "+e.getMessage(), SeverityType.MAJOR);
        }
		return dto;
	}
	
	
	@SuppressWarnings("unchecked")
	private List<ProductCustomerEligibilityEnt> getEligibilityBySKU(String sku) {
		Query q = em.createNamedQuery(ProductCustomerEligibilityEnt.FIND_BY_SKU);
		q.setParameter("sku", Integer.parseInt(sku));
		
		List<ProductCustomerEligibilityEnt> el = q.getResultList();
		return el;
	}
	
	@SuppressWarnings("unchecked")
	private List<ProductCustomerEligibilityEnt> getEligibilityByCustomer(
			String custType) {
		Query q = em.createNamedQuery(ProductCustomerEligibilityEnt.FIND_BY_CTYPE);
		q.setParameter("custType", custType);
		
		List<ProductCustomerEligibilityEnt> el = q.getResultList();
		return el;
	}
	
	@SuppressWarnings("unchecked")
	private List<ProductCustomerEligibilityEnt> getEligibilityByEffectiveDate(Date effDate) {
		Query q = em.createNamedQuery(ProductCustomerEligibilityEnt.FIND_BY_EFFECTIVE_DATE);
		q.setParameter("effDate", effDate);
		
		List<ProductCustomerEligibilityEnt> el = q.getResultList();
		return el;
	}
	
}
