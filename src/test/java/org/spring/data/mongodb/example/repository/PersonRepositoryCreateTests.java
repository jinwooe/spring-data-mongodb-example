package org.spring.data.mongodb.example.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:org/spring/data/mongodb/ExampleConfigurationTests-context.xml")
public class PersonRepositoryCreateTests {
	@Autowired
	private PersonRepository repository;
	
	@Test
	public void create() {
		Person person = new Person();
		person.setFirstname("Alice");
		person.setLastname("Smith");
		Address address = new Address();
		address.setStreet("New York 12");
		address.setZipCode("123-456");
		person.setAddress(address);		
		
		repository.save(person);
		
		person = new Person();
		person.setFirstname("Bob");
		person.setLastname("Smith");
		address = new Address();
		address.setStreet("New York 12");
		address.setZipCode("222-555");
		person.setAddress(address);	
		
		repository.save(person);
	}
}
