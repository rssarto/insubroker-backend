package com.insubroker.person;

import com.insubroker.exception.NotFoundException;

@SuppressWarnings("serial")
public class PersonNotFoundException extends NotFoundException {
	
	public PersonNotFoundException (String message) {
		super(message);
	}

}
