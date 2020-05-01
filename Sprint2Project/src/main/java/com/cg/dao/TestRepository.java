package com.cg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entities.Test;

public interface TestRepository extends JpaRepository<Test, String> {}
