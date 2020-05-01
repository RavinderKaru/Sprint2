package com.cg.Services;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.dao.TestRepository;
import com.cg.entities.Test;

public class TestService {
	@Autowired
	TestRepository testRepository;
	
	public void addTest(Test t)
	{
		testRepository.save(t);
	}

}
