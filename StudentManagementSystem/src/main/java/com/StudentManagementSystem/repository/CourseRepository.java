package com.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StudentManagementSystem.entity.StudentCourse;

@Repository
public interface CourseRepository extends JpaRepository<StudentCourse, Integer>{
	
	

}
