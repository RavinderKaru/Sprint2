package com.cg;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.DAO.AppointmentRepository;
import com.cg.DAO.DiagnosticCenterRepository;
import com.cg.DAO.PersonRepository;
import com.cg.DAO.TestRepository;
import com.cg.Entities.Appointment;
import com.cg.Entities.DiagnosticCenter;
import com.cg.Entities.Person;
import com.cg.Entities.Test;

@SpringBootApplication
public class Sprint2ProjectApplication implements CommandLineRunner {

	

	
	@Autowired
	DiagnosticCenterRepository diagnosticCenterRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Sprint2ProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("hi");
		DiagnosticCenter diagnosticCenter=new DiagnosticCenter();
	    diagnosticCenter.setCenterId("D11");
	    diagnosticCenter.setCenterName("iii");
	    //tests list
	    Test test = new Test();
	   test.setTestId("T111");
	    test.setTestName("TEFT");
	    Test test1 = new Test();
	    test1.setTestId("T2222");
	    test1.setTestName("FFF");
	    diagnosticCenter.setListOfTests(Arrays.asList(test,test1));
	    
	    diagnosticCenterRepository.save(diagnosticCenter);
	    System.out.println("ha");
		// TODO Auto-generated method stub
		
		
		
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

}
