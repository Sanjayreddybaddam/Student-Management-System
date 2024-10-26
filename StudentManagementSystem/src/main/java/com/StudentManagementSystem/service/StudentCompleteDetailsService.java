package com.StudentManagementSystem.service;



import java.util.List;

import com.StudentManagementSystem.entity.StudentCompleteDetails;

public interface StudentCompleteDetailsService {
	
	public List<StudentCompleteDetails> getAllCompleteDetails();
	
//	public StudentCompleteDetails getByIdForPage1(int studentid);
//	
//	public StudentCompleteDetails getByIdForPage2(int studentid);
	
	public StudentCompleteDetails saveCompleteDetails(StudentCompleteDetails studentDetail);

	public StudentCompleteDetails getById(int studentid);
	
	public void deleteById(int studentid);
}
