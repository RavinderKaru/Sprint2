package com.cg.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.Entities.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment,String> {

}
