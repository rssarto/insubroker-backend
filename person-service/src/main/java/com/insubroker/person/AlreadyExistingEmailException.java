package com.insubroker.person;

@SuppressWarnings("serial")
public class AlreadyExistingEmailException extends RuntimeException {
	
	public AlreadyExistingEmailException(String message) {
		super(message);
	}

}
