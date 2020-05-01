package com.cg.Services;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.dao.DiagnosticCenterRepository;
import com.cg.entities.DiagnosticCenter;

public class DiagnosticCenterService {
	@Autowired
	DiagnosticCenterRepository diagnosticCenterRepository;
	
	public void addDiagnosticCenter(DiagnosticCenter d)
	{
		diagnosticCenterRepository.save(d);
	}

}
