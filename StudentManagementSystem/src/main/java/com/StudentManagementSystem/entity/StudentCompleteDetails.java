package com.StudentManagementSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentdetails")
public class StudentCompleteDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentid;
	private String studentname;
	private String studentemail;
	private String coursename;
	private int coursecredits;
	
	
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentemail() {
		return studentemail;
	}
	public void setStudentemail(String studentemail) {
		this.studentemail = studentemail;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getCoursecredits() {
		return coursecredits;
	}
	public void setCoursecredits(int coursecredits) {
		this.coursecredits = coursecredits;
	}
	public StudentCompleteDetails(int studentid, String studentname, String studentemail, String coursename,
			int coursecredits) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentemail = studentemail;
		this.coursename = coursename;
		this.coursecredits = coursecredits;
	}
	public StudentCompleteDetails() {
		super();
		
	}
	
	
	
}
