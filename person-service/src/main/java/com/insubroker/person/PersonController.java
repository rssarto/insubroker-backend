package com.insubroker.person;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@Autowired
	private PersonRepository personRepository;
	
	@GetMapping("/person/{id}")
	public PersonModel getPerson(@PathVariable long id) {
		return new PersonModel("ricardo.soares.sarto@gmail.com", "Ricardo Sarto", "123456");
	}
	
	@PostMapping("/person")
	public void addPerson(@Valid @RequestBody PersonModel person) {
		if( this.personRepository.findByEmail(person.getEmail()) == null ) {
			this.personRepository.save(person);			
		}
		
		throw new AlreadyExistingEmailException(String.format("Already existing e-mail: %1s", person.getEmail())); 
	}
}
