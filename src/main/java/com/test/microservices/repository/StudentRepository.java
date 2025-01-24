package com.test.microservices.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.microservices.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
