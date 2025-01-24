package com.test.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.microservices.model.Student;
import com.test.microservices.service.StudentService;

@RestController
public class HomeController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/student")
	public Student saveStudentDetails(@RequestBody Student student) {
		System.out.println("Controller Executed");
		System.out.println("Student details = "+student.toString());
		//Student student1 = new Student(1, "Ayush", 29, "Delhi");
		return studentService.saveStudent(student);
		
	}
}
