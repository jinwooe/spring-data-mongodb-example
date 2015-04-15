package org.spring.data.mongodb.example.repository;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonRepositoryUpdateUsingCustomTests {
	@Autowired
	private PersonRepository repository;
	
	@Test
	public void updateUsingCustom() {
		repository.updateByLastname("Smith", "Catherine");
	}
}
