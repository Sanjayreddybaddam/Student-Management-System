package com.StudentManagementSystem.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentManagementSystem.entity.AdminSignup;
import com.StudentManagementSystem.repository.AdminSignupRepository;
import com.StudentManagementSystem.service.AdminSignupService;

@Service
public class AdminSignupServiceimpl implements AdminSignupService {
	
	@Autowired
	private AdminSignupRepository repo;
	
//	@Override
//	public List<AdminSignup> getAllAdmins() {
//		List<AdminSignup> list = adminsignupRepository.findAll();
//		return list ;
//	}
	
	@Override
	public void registerAdmin(AdminSignup adminsignup) {
		
		 repo.save(adminsignup);
	}

	

}
