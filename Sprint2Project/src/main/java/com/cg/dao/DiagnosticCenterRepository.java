package com.cg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entities.DiagnosticCenter;
import com.cg.entities.Test;

public interface DiagnosticCenterRepository extends JpaRepository<DiagnosticCenter, String> {
public List<DiagnosticCenter> findByCenterName(String centerName);

}
