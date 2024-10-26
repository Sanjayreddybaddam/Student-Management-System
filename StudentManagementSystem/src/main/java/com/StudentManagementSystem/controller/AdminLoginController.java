package com.StudentManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;

//import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.StudentManagementSystem.entity.Admin1;
import com.StudentManagementSystem.service.AdminService;

import jakarta.servlet.http.HttpSession;

@Controller
public class AdminLoginController {

	@Autowired
	private AdminService service;

	@GetMapping("/login")
	public String showLoginPage(Model model) {
		// Add an empty User object to the model to bind the form data
		Admin1 admin = new Admin1();
		model.addAttribute("admin", admin);
		return "login"; // Returns login.html view
	}

//	@PostMapping("/login")
//	public String loginAdmin(@ModelAttribute("admin1") Admin1 admin) {
//
//		
//        service.savelogin(admin);
//        return "students";
//	}

	@PostMapping("/login")
	public String loginAdmin(@ModelAttribute("admin1") Admin1 admin, HttpSession session) {
		if ("sanjayreddy".equals(admin.getUsername()) && "sanjay123".equals(admin.getPassword())) {
			service.savelogin(admin);
			session.setAttribute("msg", "Login Successful");
			return "students";
		} else {
			session.setAttribute("msg", "Invalid Credentials");
			
			return "redirect:/login";
		}
		
		
	}
}
