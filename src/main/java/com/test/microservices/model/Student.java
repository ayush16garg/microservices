package com.test.microservices.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	@Id
	private int studentid;
	private String student_name;
	private int student_age;
	private String student_address;
	
	public Student() {
		
	}
	
	public Student(int studentid, String student_name, int student_age, String student_address) {
		super();
		this.studentid = studentid;
		this.student_name = student_name;
		this.student_age = student_age;
		this.student_address = student_address;
	}



	public int getStudentid() {
		return studentid;
	}



	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}



	public String getStudent_name() {
		return student_name;
	}



	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}



	public int getStudent_age() {
		return student_age;
	}



	public void setStudent_age(int student_age) {
		this.student_age = student_age;
	}



	public String getStudent_address() {
		return student_address;
	}



	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}



	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", student_name=" + student_name + ", student_age=" + student_age
				+ ", student_address=" + student_address + "]";
	}
	
	
}
