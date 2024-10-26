package com.StudentManagementSystem.service;

import java.util.List;

import com.StudentManagementSystem.entity.Student;

public interface StudentService {

	public List<Student> getAllStudents();
	
	public Student saveStudent(Student student);
	
	public Student getById(int studentid);
	
	public void deleteById(int studentid); 
}
