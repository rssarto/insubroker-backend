package com.insubroker.exception;

@SuppressWarnings("serial")
public abstract class BadRequestException extends RuntimeException {
	
	public BadRequestException(String message) {
		super(message);
	}

}
