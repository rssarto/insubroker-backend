package com.insubroker.exception;

@SuppressWarnings("serial")
public abstract class NotFoundException extends RuntimeException {
	
	public NotFoundException(String message) {
		super(message);
	}

}
