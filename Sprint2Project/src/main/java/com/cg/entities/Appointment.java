package com.cg.entities;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Appointment {
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId",referencedColumnName = "userId")
	private Person person;
	@Id
	private BigInteger appointmentId;
	private LocalDateTime datetime;
	private boolean approved;
	@ManyToOne(cascade = CascadeType.ALL)
	private Test test;
	@ManyToOne(cascade = CascadeType.ALL)
	private DiagnosticCenter center;
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public BigInteger getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(BigInteger appointmentId) {
		this.appointmentId = appointmentId;
	}
	public LocalDateTime getDatetime() {
		return datetime;
	}
	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
	public DiagnosticCenter getCenter() {
		return center;
	}
	public void setCenter(DiagnosticCenter center) {
		this.center = center;
	}
	public Appointment(Person person, BigInteger appointmentId, LocalDateTime datetime, boolean approved, Test test,
			DiagnosticCenter center) {
		super();
		this.person = person;
		this.appointmentId = appointmentId;
		this.datetime = datetime;
		this.approved = approved;
		this.test = test;
		this.center = center;
	}
	public Appointment()
	{
	

}}
