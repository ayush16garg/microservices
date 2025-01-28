package com.test.microservices.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.microservices.model.Student;
import com.test.microservices.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public Optional<Student> getStudentDetailsById(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id);
	}

	@Override
	public List<Student> fetchAllStudent() {
		// TODO Auto-generated method stub
		return (List<Student>) studentRepository.findAll();
	}
	
}
