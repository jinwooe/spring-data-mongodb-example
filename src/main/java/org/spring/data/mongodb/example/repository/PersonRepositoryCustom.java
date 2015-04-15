package org.spring.data.mongodb.example.repository;

public interface PersonRepositoryCustom {
	public int updateByLastname(String lastname, String firstname);
}
