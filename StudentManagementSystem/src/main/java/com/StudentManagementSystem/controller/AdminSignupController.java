package com.StudentManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.StudentManagementSystem.entity.AdminSignup;
import com.StudentManagementSystem.service.AdminSignupService;

import jakarta.servlet.http.HttpSession;




@Controller
public class AdminSignupController {
	
	@Autowired
	private AdminSignupService service;

	@GetMapping("Adminsignup")
	public String ShowSignupPage(Model model) {
		AdminSignup adminsignup = new AdminSignup();
				model.addAttribute("adminsignup", adminsignup);
		//model.addAttribute("Adminsignup", new AdminSignup());
		return "Adminsignup";
	}
	
	
	@PostMapping("/registerAdmin")
	public String registerAdmin(@ModelAttribute("adminsignup") AdminSignup adminsignup,HttpSession session) {
		
		System.out.println(adminsignup);
		//service.saveAdminSignup(adminsignup);
		
		if(adminsignup.getPassword().equals(adminsignup.getConfirmpassword())) {
			
			
				service.registerAdmin(adminsignup);
				session.setAttribute("msg", "Registration Successful, Please Login now");
				//String message = session.setAttribute("msg", "Registered Successfully");
				return "Adminsignup";
		}
				else {
					session.setAttribute("msg", "RegistrationFailed!!");
					return "redirect:/Adminsignup";
				}
		
		}

	}
	
	

