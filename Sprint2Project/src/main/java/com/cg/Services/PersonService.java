package com.cg.Services;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.DAO.PersonRepository;
import com.cg.Entities.Person;

public class PersonService {
	@Autowired
	PersonRepository personRepository;
	
	public void addPerson(Person p)
	{
		personRepository.save(p);
	}

}
