package com.test.microservices.service;

import java.util.List;
import java.util.Objects;
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

	@Override
	public Student updateStudentDetails(Student student) {
		// TODO Auto-generated method stub
		Student studentexist = studentRepository.findById(student.getStudentid()).get();
		if (Objects.nonNull(student.getStudent_name()) && !"".equalsIgnoreCase(student.getStudent_name())) {
			studentexist.setStudent_name(student.getStudent_name());
		}
		if (Objects.nonNull(student.getStudent_address()) && !"".equalsIgnoreCase(student.getStudent_address())) {
			studentexist.setStudent_address(student.getStudent_address());
		}
		if(Objects.nonNull(student.getStudent_age())) {
			studentexist.setStudent_age(student.getStudent_age());
		}
		return studentRepository.save(studentexist);
	}

	@Override
	public void deleteStudentDetails(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}
	
}
