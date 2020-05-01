package com.cg.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class DiagnosticCenter {
	@Id
	private String centerId;
	private String centerName;
	@OneToMany(mappedBy = "center",cascade = CascadeType.ALL)
	private List<Test> List_Tests;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "center" )
	private List<Appointment>  appmlists;
	public String getCenterId() {
		return centerId;
	}
	public void setCenterId(String centerId) {
		this.centerId = centerId;
	}
	public String getCenterName() {
		return centerName;
	}
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	public List<Test> getListOfTests() {
		return List_Tests;
	}
	public void setListOfTests(List<Test> listOfTests) {
		List_Tests = listOfTests;
	}
	public List<Appointment> getAppointmentlists() {
		return appmlists;
	}
	public void setAppointmentlists(List<Appointment> appointmentlists) {
		this.appmlists = appointmentlists;
	}
	public DiagnosticCenter(String centerId, String centerName, List<Test> listOfTests,
			List<Appointment> appointmentlists) {
		super();
		this.centerId = centerId;
		this.centerName = centerName;
		this.List_Tests = listOfTests;
		this.appmlists = appointmentlists;
	}
	public DiagnosticCenter()
	{
		
	}

}
