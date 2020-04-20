package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.DAO.DiagnosticCenterRepository;
import com.cg.Entities.DiagnosticCenter;



@RestController
public class HealthController {
	@Autowired
	DiagnosticCenterRepository dao;
	@PostMapping(value = "/add")
	public String add(@RequestBody DiagnosticCenter d)
	{
		dao.save(d).getListOfTests();
		return "added";
	}

}
