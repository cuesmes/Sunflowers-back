package com.project.school;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TeacherManager {
	
	@Autowired
	TeacherRepository teacherRepository;
	
	@PostConstruct
	public void init()
	{
		Teacher nt = new Teacher();
		nt.setLogin("a1");
		nt.setPassword("k1");
		nt.setAddress("lol");
		nt.setCity("ehhe");
		nt.setContactNumber("33");
		nt.setDateOfBirth(java.sql.Date.valueOf( "2009-12-12" ));
		nt.setFirstName("Jakub");
		nt.setLastName("nazw");
	teacherRepository.save(nt);
	}
	

}
