package com.bcldb.services.model;

import javax.ejb.EJBException;

public class BusinessRuleException extends EJBException {
    
	private static final long serialVersionUID = 6328439798350899856L;
    
    public BusinessRuleException(String string, Exception exception) {
        super(string, exception);
    }

    public BusinessRuleException(Exception exception) {
        super(exception);
    }

    public BusinessRuleException(String string) {
        super(string);
    }

    public BusinessRuleException() {
        super();
    }
}