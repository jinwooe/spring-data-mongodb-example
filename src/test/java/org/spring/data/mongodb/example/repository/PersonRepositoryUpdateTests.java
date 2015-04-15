package org.spring.data.mongodb.example.repository;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:org/spring/data/mongodb/ExampleConfigurationTests-context.xml")
public class PersonRepositoryUpdateTests {
	@Autowired
	private PersonRepository repository;
	
	@Test
	public void update() {
		List<Person> persons = repository.findByLastname("Smith");
		for(Person p : persons) {
			p.setFirstname("Crystal");
			repository.save(p);
		}
	}
}
