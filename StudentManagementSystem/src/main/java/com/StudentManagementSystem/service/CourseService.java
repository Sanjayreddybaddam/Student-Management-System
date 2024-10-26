package com.StudentManagementSystem.service;

import java.util.List;

import com.StudentManagementSystem.entity.StudentCourse;

public interface CourseService {
	
	public List<StudentCourse> getAllcourses();
	
	public StudentCourse saveStudentCourse(StudentCourse studentcourse);
	
	public StudentCourse getById(int courseid);
	
	public void deleteById(int courseid);

	

}
