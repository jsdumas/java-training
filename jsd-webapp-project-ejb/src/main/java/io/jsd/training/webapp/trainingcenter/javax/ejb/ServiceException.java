package io.jsd.training.webapp.trainingcenter.javax.ejb;

public class ServiceException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public ServiceException(String message, Throwable e){
		super(message, e);
	}

}