package com.StudentManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.StudentManagementSystem.entity.StudentSignup;
import com.StudentManagementSystem.service.StudentSignupService;

import jakarta.servlet.http.HttpSession;

@Controller
public class StudentSignupController {
	
	@Autowired
	private StudentSignupService service;
	
	@GetMapping("Studentsignup")
	public String ShowSignupPage(Model model) {
		StudentSignup studentsignup = new StudentSignup();
		model.addAttribute("studentsignup", studentsignup);
		
		return "Studentsignup";
	}
	
	@PostMapping("/registerStudent")
	public String registerStudent(@ModelAttribute("studentsignup") StudentSignup studentsignup,HttpSession session) {
		
		if(studentsignup.getPassword().equals(studentsignup.getConfirmpassword())) {
			service.registerStudent(studentsignup);
			session.setAttribute("msg", "Registration Successful");
			return "Studentsignup";
		}
		else {
			return "redirect:/Studentsignup";
		}
	}
	

}
