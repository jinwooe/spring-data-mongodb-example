package org.spring.data.mongodb.example.repository;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:org/spring/data/mongodb/ExampleConfigurationTests-context.xml")
public class PersonRepositoryReadTests {
	@Autowired
	private PersonRepository repository;
	
	@Test
	public void findAll() {
		List<Person> persons = repository.findAll();
		System.out.println("findAll Test");
		System.out.println("==================================================");
		for(Person p : persons) {
			System.out.println(p);
		}
		System.out.println("==================================================");
	}
	
	@Test
	public void findByLastname() {
		List<Person> persons = repository.findByLastname("Smith");
		System.out.println("findByLastname");
		System.out.println("==================================================");
		for(Person p : persons) {
			System.out.println(p);
		}
		System.out.println("==================================================");
	}
	
	@Test
	public void findByFirstname() {
		List<Person> persons = repository.findByFirstname("Alice");
		System.out.println("findByFirstname");
		System.out.println("==================================================");
		for(Person p : persons) {
			System.out.println(p);
		}
		System.out.println("==================================================");		
	}
}
