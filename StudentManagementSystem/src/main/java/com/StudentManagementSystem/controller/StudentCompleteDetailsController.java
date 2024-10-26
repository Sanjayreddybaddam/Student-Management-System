package com.StudentManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.StudentManagementSystem.entity.StudentCompleteDetails;
import com.StudentManagementSystem.service.StudentCompleteDetailsService;

@Controller
public class StudentCompleteDetailsController {
	
	@Autowired
	private StudentCompleteDetailsService service;
	
	@GetMapping("/studentdetails")
	public String getAllCompleteDetails(Model model) {
		
		model.addAttribute("studentdetails",service.getAllCompleteDetails());
		return "studentdetails";
	}
	
	@GetMapping("studentdetails/new")
	public String createStudentDetailsForm(Model model) {
		//System.out.println("hai");
		
		StudentCompleteDetails studentdetail = new StudentCompleteDetails();
		model.addAttribute("studentdetails", studentdetail);
		return "create-studentdetails";
	}
	
	@PostMapping("/studentdetails")
	public String saveStudentCompleteDetails(@ModelAttribute("studentdetails") StudentCompleteDetails studentDetail) {
		
		service.saveCompleteDetails(studentDetail);
		return "redirect:/studentdetails";
	}
	
	@GetMapping("/studentdetails/edit/{studentid}")
	public String editStudentCompleteDetailsForm(@PathVariable int studentid,org.springframework.ui.Model model) {
		
		model.addAttribute("studentdetail", service.getById(studentid));
		
		return "edit_studentdetails";
	}
	
	@PostMapping("/studentdetails/edit/{studentid}")
	public String updateStudentCompleteDetails(@PathVariable int studentid,@ModelAttribute("studentdetails") StudentCompleteDetails studentdetail) {
		
		StudentCompleteDetails existingstudentdetails = service.getById(studentid);
		
		existingstudentdetails.setStudentname(studentdetail.getStudentname());
		existingstudentdetails.setStudentemail(studentdetail.getStudentemail());
		existingstudentdetails.setCoursename(studentdetail.getCoursename());
		existingstudentdetails.setCoursecredits(studentdetail.getCoursecredits());
		
		service.saveCompleteDetails(existingstudentdetails);
		return "redirect:/studentdetails";
	}
	
	@GetMapping("studentdetails/{studentid}")
	public String deleteById(@PathVariable int studentid) {
		service.deleteById(studentid);
		return "redirect:/studentdetails";
	}
	
//	@GetMapping("/studentdetails1")
//	public String Page2(Model model) {
//		model.addAttribute("studentdetails", service.getByIdForPage2(studentid));
//		return "studentdetails1";
//	}
	

}
