package com.bcldb.services.util;


import java.util.Date;
import java.util.Iterator;
import java.util.List;

import producteligibilityservice.ErrorMessage;

import com.bcldb.services.common.type.SeverityType;

public final class ParamValidator {
	
	
	public void validateRequest(Object obj, ErrorHandler handler) throws ErrorMessage {
        if (obj == null){
            handler.reportError(ErrorHandler.ERROR_CODE_2,"The request is not valid.", SeverityType.WARN);            
        }
    }
	
	public void validateSku(List<String> skus, ErrorHandler handler) throws ErrorMessage {
        if (skus == null || skus.isEmpty()) {
            handler.reportError(ErrorHandler.ERROR_CODE_2, "No valid product SKU found in the request.", SeverityType.WARN);
        }
        for(String sku : skus){
            validateSku(sku, handler);
        }
    }
	
	public Long validateSku(String sku, ErrorHandler handler) throws ErrorMessage {
        if (hasValue(sku)){
            if (hasPosNumValue(sku)) {
                return new Long(sku);
            }else{
                handler.reportError(ErrorHandler.ERROR_CODE_2, "Product SKU \""+sku+"\" is invalid.", SeverityType.WARN);                
            }
        }
        return null;
    }
		
	public void validateCustType(List<String> custType, ErrorHandler handler) throws ErrorMessage {        
        if (custType != null && !custType.isEmpty()) {
            Iterator<String> it = custType.listIterator();
            while(it.hasNext()){
                validateCustType(it.next(),handler);
            }            
        }else{
            handler.reportError(ErrorHandler.ERROR_CODE_2, "No customer type found in the request.",
                            SeverityType.WARN);
        }
    }
	
	public void validateCustType(String custType, ErrorHandler handler) throws ErrorMessage {        
        if (!hasValue(custType)) {             
            handler.reportError(ErrorHandler.ERROR_CODE_2, "Customer type cannot be defined empty in the request.",
                                    SeverityType.WARN);
        }
    }
	
	public boolean hasValue(String flag){
        return flag != null && flag.trim().length() > 0;
    }
	
	public boolean hasPosNumValue(String flag){
        boolean res = false;
        try{
            res = Long.valueOf(flag.trim()).intValue() > 0;
        }catch(Throwable e){
        }
        return res;
    }
	
	public boolean isDateDefined(Date date){
        return date != null;
    }
	
}
