package com.cg.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.Entities.DiagnosticCenter;
import com.cg.Entities.Test;

public interface DiagnosticCenterRepository extends JpaRepository<DiagnosticCenter, String> {
public List<DiagnosticCenter> findByCenterName(String centerName);

}
