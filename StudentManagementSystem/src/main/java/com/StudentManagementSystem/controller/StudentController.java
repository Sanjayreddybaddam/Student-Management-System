package com.StudentManagementSystem.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.StudentManagementSystem.entity.Student;
import com.StudentManagementSystem.service.StudentService;



@org.springframework.stereotype.Controller
public class StudentController {
	
	@Autowired
	private StudentService service;
	
//	@GetMapping("/home")
//	public String home() {
//		return "home";//view page html file -> home.html
//	}
	
	@GetMapping("/students")
	public String getAllStudents(org.springframework.ui.Model model) {
		
		model.addAttribute("students",service.getAllStudents());
		return "students";
	}
	
	@GetMapping("students/new")
	public String createStudentForm(org.springframework.ui.Model model) {
		
		Student student = new Student();//to hold the student object
		model.addAttribute("student",student);
		return "create-student";	
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		
		service.saveStudent(student);
		
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{studentid}")
	public String editStudentForm(@PathVariable int studentid, org.springframework.ui.Model model) {
		
		model.addAttribute("student",service.getById(studentid));
		
		return "edit_student";
	}
	
	@PostMapping("/students/edit/{studentid}")
	public String updateStudent(@PathVariable int studentid,@ModelAttribute("student") Student student){
		
		Student existingStudent = service.getById(studentid);
		
		existingStudent.setFirstname(student.getFirstname());
		existingStudent.setLastname(student.getLastname());
		existingStudent.setEmail(student.getEmail());
		
		service.saveStudent(existingStudent);
		
		return "redirect:/students";
		
		
	}
	@GetMapping("students/{studentid}")
	public String deleteById(@PathVariable int studentid) {
		
		service.deleteById(studentid);
		return "redirect:/students";
	}
	
	

}
