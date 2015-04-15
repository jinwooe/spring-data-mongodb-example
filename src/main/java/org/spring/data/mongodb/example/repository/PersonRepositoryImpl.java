package org.spring.data.mongodb.example.repository;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;
import static org.springframework.data.mongodb.core.query.Update.update;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.WriteResult;

public class PersonRepositoryImpl implements PersonRepositoryCustom {
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public int updateByLastname(String lastname, String firstname) {
		WriteResult result = mongoTemplate.updateMulti(query(where("lastname").is(lastname)), update("firstname", firstname), Person.class);
		return result.getN();
	}
}
