package io.jsd.training.webapp.realestatemanager.controller;

public class ControllerException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ControllerException(String message, Throwable e){
		super(message, e);
	}

}
