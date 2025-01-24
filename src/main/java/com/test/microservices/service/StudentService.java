package com.test.microservices.service;

import java.util.Optional;

import com.test.microservices.model.Student;

public interface StudentService {

	Student saveStudent(Student student);

	Optional<Student> getStudentDetailsById(int id);

}
