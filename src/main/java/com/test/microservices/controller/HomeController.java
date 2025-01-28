package com.test.microservices.controller;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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

	Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/student")
	public Student saveStudentDetails(@RequestBody Student student) {
		logger.info("Save Student Details:");
		logger.info("Student details = "+student.toString());
		return studentService.saveStudent(student);
	}
	
	@GetMapping("/studentbyId/{id}")
	public Optional<Student> getStudentDetailsById(@PathVariable("id") int id) {
		logger.info("Fetch Student details by Id = "+id);
		return studentService.getStudentDetailsById(id);
	}
	
	@GetMapping("fetchStudentDetails")
	public List<Student> fetchAllStudent(){
		logger.info("Fetch All Student Details:");
		return studentService.fetchAllStudent();
	}
	
	@PutMapping("updateStudentDetails")
	public Student updateStudentDetails(@RequestBody Student student) {
		logger.info("Update Student Details:");
		return studentService.updateStudentDetails(student);
	}
	
	@DeleteMapping("deleteStudent/{id}")
	public void deleteStudentDetails(@PathVariable("id") int id) {
		logger.info("Delete Student Details:");
		if (Objects.nonNull(id)) {
			studentService.deleteStudentDetails(id);
		} else {
			System.out.println("Id should not be null");
		}
	}
}
