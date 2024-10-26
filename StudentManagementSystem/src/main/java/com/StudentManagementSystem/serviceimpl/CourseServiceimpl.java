package com.StudentManagementSystem.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentManagementSystem.entity.StudentCourse;
import com.StudentManagementSystem.service.CourseService;

@Service
public class CourseServiceimpl implements CourseService {
	
	@Autowired
	com.StudentManagementSystem.repository.CourseRepository courseRepository;
	
	@Override
	public List<StudentCourse> getAllcourses(){
		List<StudentCourse> list = courseRepository.findAll();
		
		return list;
	}
	
	@Override
	public StudentCourse saveStudentCourse(StudentCourse studentcourse) {
		return courseRepository.save(studentcourse);
	}
	
	@Override
	public StudentCourse getById(int courseid) {
		
		return courseRepository.findById(courseid).get();
				
	}
	@Override
	public void deleteById(int courseid) {
		
		courseRepository.deleteById(courseid);
	}

}
