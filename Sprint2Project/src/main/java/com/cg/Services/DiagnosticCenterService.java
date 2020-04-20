package com.cg.Services;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.DAO.DiagnosticCenterRepository;
import com.cg.Entities.DiagnosticCenter;

public class DiagnosticCenterService {
	@Autowired
	DiagnosticCenterRepository diagnosticCenterRepository;
	
	public void addDiagnosticCenter(DiagnosticCenter d)
	{
		diagnosticCenterRepository.save(d);
	}

}
