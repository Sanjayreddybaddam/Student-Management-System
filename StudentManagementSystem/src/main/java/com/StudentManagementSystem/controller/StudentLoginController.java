package com.StudentManagementSystem.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.StudentManagementSystem.entity.StudentCompleteDetails;
import com.StudentManagementSystem.entity.StudentLogin;
import com.StudentManagementSystem.service.StudentLoginService;

import jakarta.servlet.http.HttpSession;

@Controller
public class StudentLoginController {
	
	@Autowired
	private StudentLoginService service;
	
	@GetMapping("/StudentLogin")
	public String ShowLoginPage(Model model) {
		StudentLogin studentlogin = new StudentLogin();
		model.addAttribute("studentlogin", studentlogin);
		return"StudentLogin";
	}
	@PostMapping("/StudentLogin")
	public String studentlogin(@ModelAttribute("studentlogin1") StudentLogin studentlogin,HttpSession session) {
		if ("sanjayreddy".equals(studentlogin.getUsername()) && "sanjay123".equals(studentlogin.getPassword())) {
			service.savelogin(studentlogin);
			session.setAttribute("msg", "Login Successful");
			return "studentdetails1";
		} 
		else {
			session.setAttribute("msg", "Invalid Credentials");
			
			return "redirect:/StudentLogin";
		}
		
	}
	
//	public String getStudentDetails(@RequestParam("studentemail") String studentemail,Model model) {
//		Optional<StudentCompleteDetails> studentoptional = 
//	}
	
	

}
