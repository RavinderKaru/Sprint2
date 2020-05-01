package com.cg.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Test {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String testId;
	private String testName;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="center_center_Id",referencedColumnName = "centerId")
	private DiagnosticCenter center;
@OneToMany(mappedBy = "test",cascade = CascadeType.ALL)
private List<Appointment> listOfAppointments;

	
public Test(String testId, String testName, List<Appointment> listOfAppointments, DiagnosticCenter center) {
		super();
		this.testId = testId;
		this.testName = testName;
		this.listOfAppointments = listOfAppointments;
		this.center = center;
	}
public String getTestId() {
		return testId;
	}
	public void setTestId(String testId) {
		this.testId = testId;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public List<Appointment> getListOfAppointments() {
		return listOfAppointments;
	}
	public void setListOfAppointments(List<Appointment> listOfAppointments) {
		this.listOfAppointments = listOfAppointments;
	}
	public DiagnosticCenter getCenter() {
		return center;
	}
	public void setCenter(DiagnosticCenter center) {
		this.center = center;
	}
	public Test()
	{
		
	}

}
