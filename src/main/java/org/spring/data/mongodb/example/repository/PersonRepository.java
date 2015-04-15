package org.spring.data.mongodb.example.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface PersonRepository extends MongoRepository<Person, String>, PersonRepositoryCustom {
	
	public List<Person> findByLastname(String lastname);
	
	@Query("{firstname: ?0}")
	public List<Person> findByFirstname(String firstname);
	
	public Long deletePersonByLastname(String lastname);
	
}
