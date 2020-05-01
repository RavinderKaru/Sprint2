package com.cg.entities;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Person {
	@Id
	private String userId;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "center",targetEntity = Appointment.class)
	private List<DiagnosticCenter> centerList;
	private String userPassword;
	private BigInteger contactNo;
	private String userRole;
	private String userEmail;
	private int age;
	private String gender;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<DiagnosticCenter> getCenterList() {
		return centerList;
	}
	public void setCenterList(List<DiagnosticCenter> centerList) {
		this.centerList = centerList;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public BigInteger getContactNo() {
		return contactNo;
	}
	public void setContactNo(BigInteger contactNo) {
		this.contactNo = contactNo;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Person(String userId, List<DiagnosticCenter> centerList, String userPassword, BigInteger contactNo,
			String userRole, String userEmail, int age, String gender) {
		super();
		this.userId = userId;
		this.centerList = centerList;
		this.userPassword = userPassword;
		this.contactNo = contactNo;
		this.userRole = userRole;
		this.userEmail = userEmail;
		this.age = age;
		this.gender = gender;
	}
	
	
public Person()
{
	
}
}
