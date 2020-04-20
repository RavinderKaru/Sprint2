package com.cg.Services;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.DAO.AppointmentRepository;
import com.cg.Entities.Appointment;

public class AppointmentService {
	
	@Autowired
	AppointmentRepository AppointmentRepository;
	
	public void addAppointment(Appointment a)
	{
		AppointmentRepository.save(a);
	}
}
