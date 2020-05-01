package com.cg.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.cg.dao.PersonRepository;
import com.cg.entities.Person;
@Service
public class PersonService {
	@Autowired
	PersonRepository personRepository;
	
	public void save(Person p)
	{
		personRepository.save(p);
	}
	public List<Person> fetchAll()
	{
	
		return personRepository.findAll();
	}
	public Person fetchByUserEmail(String userEmail)
	{
		return personRepository.findByUserEmail(userEmail);
		
		
	}

}
