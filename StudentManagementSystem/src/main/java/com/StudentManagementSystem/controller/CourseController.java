package com.StudentManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.StudentManagementSystem.entity.StudentCourse;
import com.StudentManagementSystem.service.CourseService;

@Controller
public class CourseController {
	
	@Autowired
	private CourseService service;
	
	@GetMapping("/courses")
	public String getAllCourses(org.springframework.ui.Model model) {
		
		model.addAttribute("courses", service.getAllcourses());
		return "courses";
	}
	
	@GetMapping("courses/new")
	public String createStudentCourseForm(org.springframework.ui.Model model) {
		
		StudentCourse studentcourse = new StudentCourse();
		model.addAttribute("studentcourse", studentcourse);
		return "create-studentcourse";
				
	}
	
	@PostMapping("/courses")
	public String saveStudentCourse(@ModelAttribute("studentcourse") StudentCourse studentcourse) {
		
		service.saveStudentCourse(studentcourse);
		
		return "redirect:/courses";
	}
	
	@GetMapping("/courses/edit/{courseid}")
	public String editStudentCourseForm(@PathVariable int courseid,org.springframework.ui.Model model) {
		
		model.addAttribute("studentcourse", service.getById(courseid));
		
		return "edit_studentcourse";
	}
	
	@PostMapping("/courses/edit/{courseid}")
	public String updateStudentCourse(@PathVariable int courseid,@ModelAttribute("studentcourse") StudentCourse studentcourse) {
		
		StudentCourse existingstudentcourse = service.getById(courseid);
		
		existingstudentcourse.setCoursename(studentcourse.getCoursename());
		existingstudentcourse.setCredits(studentcourse.getCredits());
		
		service.saveStudentCourse(existingstudentcourse);
		return "redirect:/courses";
	}
	
	@GetMapping("courses/{courseid}")
	public String deleteById(@PathVariable int courseid) {
		service.deleteById(courseid);
		return "redirect:/courses";
	}

}
