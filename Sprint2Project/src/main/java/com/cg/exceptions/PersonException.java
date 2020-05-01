package com.cg.exceptions;

public class PersonException  extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;

	public PersonException(String message) {
		super();
		this.message = message;
	}
	public PersonException()
	{
		
	}
	
	
}
