package com.StudentManagementSystem.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentManagementSystem.entity.StudentCompleteDetails;
import com.StudentManagementSystem.service.StudentCompleteDetailsService;

@Service
public class StudentCompleteDetailsServiceimpl implements StudentCompleteDetailsService {
	
	@Autowired
	com.StudentManagementSystem.repository.StudentCompleteDetailsRepository studentDetailsRepository;
	@Override
	public List<StudentCompleteDetails> getAllCompleteDetails(){ 
		List<StudentCompleteDetails> list = studentDetailsRepository.findAll();
		
		return list;
	}
	@Override
	public StudentCompleteDetails saveCompleteDetails(StudentCompleteDetails studentDetail) {
		
		return studentDetailsRepository.save(studentDetail)
				;
	}
	@Override
	public StudentCompleteDetails getById(int studentid) {
		
		return studentDetailsRepository.findById(studentid).get();
	}
	@Override
	public void deleteById(int studentid) {
		studentDetailsRepository.deleteById(studentid);
		
	}
	
//	@Override
//	public StudentCompleteDetails getByIdForPage1(int studentid) {
//
//		return studentDetailsRepository.findById(studentid).get();
//				
//	}
//	@Override
//	public StudentCompleteDetails getByIdForPage2(int studentid) {
//	
//		return studentDetailsRepository.findById(studentid).get();
//	}
	
	

}
