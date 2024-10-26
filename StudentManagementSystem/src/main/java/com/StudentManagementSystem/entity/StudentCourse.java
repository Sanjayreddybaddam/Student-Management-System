package com.StudentManagementSystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="courses")
public class StudentCourse {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int courseid;
	@Column
	private String coursename;
	@Column
	private int credits;
	
	
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public StudentCourse(int courseid, String coursename, int credits) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.credits = credits;
	}
	public StudentCourse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
