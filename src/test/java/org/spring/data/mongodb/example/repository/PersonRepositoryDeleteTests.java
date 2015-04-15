package org.spring.data.mongodb.example.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:org/spring/data/mongodb/ExampleConfigurationTests-context.xml")
public class PersonRepositoryDeleteTests {
	@Autowired
	private PersonRepository repository;
	
	@Test
	public void delete() {
		repository.deletePersonByLastname("Smith");
	}
}
