package com.bcldb.services.util;


import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import producteligibilityservice.ErrorMessage;

import com.bcldb.services.common.type.ServiceErrorType;
import com.bcldb.services.common.type.SeverityType;

public final class ErrorHandler {
    // common runtime errors
    public static final int ERROR_CODE_1 = 1000;
    // request paraemters validation
    public static final int ERROR_CODE_2 = 2000;
    // business error
    public static final int ERROR_CODE_3 = 3000;
    

    public ErrorHandler() {
        super();
    }
    
    public void reportError(int code, String message, SeverityType severity)throws ErrorMessage{
        ServiceErrorType error = new ServiceErrorType();
        error.setTimestamp(getTimestamp());
        error.setErrorCode(code);
        error.setSeverity(severity);
        error.setErrorMessage(message);
        throw new ErrorMessage(message, error);
    }
    
    public void reportError(ServiceErrorType error)throws ErrorMessage{
        error.setTimestamp(getTimestamp());
        throw new ErrorMessage(null,error);
    }
    
    XMLGregorianCalendar getTimestamp(){
        XMLGregorianCalendar timestamp = null;
        try{
            timestamp = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
        }catch(DatatypeConfigurationException e){
        }
        return timestamp;
    }
}
