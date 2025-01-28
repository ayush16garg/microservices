package com.test.microservices.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
		return studentService.saveStudent(student);
	}
	
	@GetMapping("/studentbyId/{id}")
	public Optional<Student> getStudentDetailsById(@PathVariable("id") int id) {
		System.out.println("Student id = "+id);
		return studentService.getStudentDetailsById(id);
	}
	
	@GetMapping("fetchStudentDetails")
	public List<Student> fetchAllStudent(){
		return studentService.fetchAllStudent();
	}
	
	@PutMapping("updateStudentDetails")
	public Student updateStudentDetails(@RequestBody Student student) {
		return studentService.updateStudentDetails(student);
	}
}
