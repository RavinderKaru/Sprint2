package com.cg;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.dao.AppointmentRepository;
import com.cg.dao.DiagnosticCenterRepository;
import com.cg.dao.PersonRepository;
import com.cg.dao.TestRepository;
import com.cg.entities.Appointment;
import com.cg.entities.DiagnosticCenter;
import com.cg.entities.Person;
import com.cg.entities.Test;


@SpringBootApplication
public class Sprint2ProjectApplication implements CommandLineRunner {

	

	
	@Autowired
	DiagnosticCenterRepository diagnosticCenterRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Sprint2ProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		 * System.out.println("hi"); DiagnosticCenter diagnosticCenter=new
		 * DiagnosticCenter(); diagnosticCenter.setCenterId("D11");
		 * diagnosticCenter.setCenterName("iii"); //tests list Test test = new Test();
		 * test.setTestId("T111"); test.setTestName("TEFT");
		 * test.setCenter(diagnosticCenter); Test test1 = new Test();
		 * test1.setTestId("T2222"); test1.setTestName("FFF");
		 * test1.setCenter(diagnosticCenter);
		 * diagnosticCenter.setListOfTests(Arrays.asList(test,test1));
		 * 
		 * diagnosticCenterRepository.save(diagnosticCenter); System.out.println("ha");
		 */	// TODO Auto-generated method stub
		
		
		
		
//		DiagnosticCenter d1=new DiagnosticCenter();
//		d1.setCenterId("D1");
//		d1.setCenterName("Done");
//		
//		
//		Appointment a1=new Appointment();
//		a1.setAppointmentId(BigInteger.valueOf(Long.parseLong("123")));
//		a1.setApproved(false);
//		a1.setCenter(d1);
//		a1.setTest(t1);
//		a1.setDatetime(LocalDateTime.now());
//		
//		Person p=new Person();
//		p.setUserId("123");
//		p.setAge(12);
//		p.setContactNo(BigInteger.valueOf(Long.parseLong("9908803484")));
//		p.setUserEmail("kkkkk@");
//		p.setUserPassword("*****");
//		//p.getCenterList().add(d1);
//		p.setUserRole("ADMIN");
//	p.setGender("MALE");
//		a1.setPerson(p);
//		
//		
//		appointmentRepository.save(a1);
		}
	
	
	
	/*SAIRA PROJECT TESTING
	 * Person u=new Person();
		u.setUserId(2);
		u.setUserName("Ravi");
		u.setContactNo(123654789);
		u.setEmailId("abc@gmail.com");
		u.setUserPassword("qwerty");
		//u.setAppointment(a);
		
		Test t=new Test();
		t.setTestId(2);
		t.setTestName("bloodtest");
		//t.setAppointmentList(Arrays.asList(a));
		
		DiagnosticCenter d=new DiagnosticCenter();
		d.setCenterId(2);
		d.setCenterName("ABC");
		d.setContactNumber(147852369);
		d.setAddress("Vijayawada");
//		d.getListOfTests().add(t);
//		d.getAppointmentList().add(a);
		d.setListOfTests(Arrays.asList(t));
		t.setCenter(d);
		Appointment a=new Appointment();
		a.setAppointmentId(2);
		a.setApproved(true);
		a.setDatetime(LocalDateTime.now());
		a.setUser(u);
		a.setCenter(d);
		a.setTest(t);
		
		
		d.setAppointmentList(Arrays.asList(a));
		u.setAppointment(a);
		 
		
		appd.save(a);
		
		
		
	 * 
	 */

}
