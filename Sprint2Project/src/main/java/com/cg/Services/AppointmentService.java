package com.cg.Services;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.dao.AppointmentRepository;
import com.cg.entities.Appointment;

public class AppointmentService {
	
	@Autowired
	AppointmentRepository AppointmentRepository;
	
	public void addAppointment(Appointment a)
	{
		AppointmentRepository.save(a);
	}
}
