 package com.StudentManagementSystem.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentManagementSystem.entity.Student;

import com.StudentManagementSystem.service.StudentService;

@Service
public class ServiceImpl implements StudentService {
	
	@Autowired
	com.StudentManagementSystem.repository.StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudents(){
		
		 List<Student> list= studentRepository.findAll();
		 
		 return list;
	}
	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
	@Override
	public Student getById(int studentid) {
		
		return studentRepository.findById(studentid).get();
	}
	@Override
	public void deleteById(int studentid) {
		
		studentRepository.deleteById(studentid);
		
	}
	
	
}
