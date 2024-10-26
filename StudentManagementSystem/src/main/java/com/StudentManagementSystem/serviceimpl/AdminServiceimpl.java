package com.StudentManagementSystem.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentManagementSystem.entity.Admin1;
import com.StudentManagementSystem.service.AdminService;

@Service
public class AdminServiceimpl implements AdminService {
	
	@Autowired 
	com.StudentManagementSystem.repository.AdminRepository adminRepository;

	@Override
	public void savelogin(Admin1 admin) {
		adminRepository.save(admin);
	}
	
//	@Override
//	public Admin1 saveAdmin1(Admin1 admin) {
//		return adminRepository.save(admin);
//	}

}
