package com.insubroker.person;

import com.insubroker.exception.BadRequestException;

@SuppressWarnings("serial")
public class AlreadyExistingEmailException extends BadRequestException {
	
	public AlreadyExistingEmailException(String message) {
		super(message);
	}

}
