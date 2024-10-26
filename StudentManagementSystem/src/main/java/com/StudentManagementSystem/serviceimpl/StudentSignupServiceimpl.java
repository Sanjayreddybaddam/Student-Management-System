package com.StudentManagementSystem.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentManagementSystem.entity.StudentSignup;
import com.StudentManagementSystem.repository.StudentSignupRepository;
import com.StudentManagementSystem.service.StudentSignupService;

@Service
public class StudentSignupServiceimpl implements StudentSignupService{
	
	@Autowired
	private StudentSignupRepository repo;

	@Override
	public void registerStudent(StudentSignup studentsignup) {
		repo.save(studentsignup);
		
	}
	
	
	

}
