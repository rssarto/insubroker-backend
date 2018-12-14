package com.insubroker.person;

@SuppressWarnings("serial")
public class PersonNotFoundException extends RuntimeException {
	
	public PersonNotFoundException (String message) {
		super(message);
	}

}
