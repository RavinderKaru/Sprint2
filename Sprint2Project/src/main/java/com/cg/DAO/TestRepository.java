package com.cg.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.Entities.Test;

public interface TestRepository extends JpaRepository<Test, String> {}
