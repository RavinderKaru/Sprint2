package com.cg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entities.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person, String> {

	 public Person findByUserEmail(String userEmail);
	

}
