package com.StudentManagementSystem.serviceimpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.StudentManagementSystem.entity.StudentLogin;
import com.StudentManagementSystem.service.StudentLoginService;

@Service
public class StudentLoginServiceimpl implements StudentLoginService {

	@Autowired
	com.StudentManagementSystem.repository.StudentLoginRepository studentLoginRepository;
	
	@Override
	public void savelogin(StudentLogin studentlogin) {
		studentLoginRepository.save(studentlogin);
		
	}
}
