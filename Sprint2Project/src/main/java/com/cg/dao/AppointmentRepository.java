package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entities.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment,String> {

}
