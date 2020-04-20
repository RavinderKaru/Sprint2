package com.cg.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.Entities.Person;

public interface PersonRepository extends JpaRepository<Person, String> {

}
