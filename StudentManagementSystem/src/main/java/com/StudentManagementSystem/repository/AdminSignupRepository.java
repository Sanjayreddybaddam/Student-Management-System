package com.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StudentManagementSystem.entity.AdminSignup;

@Repository 
public interface AdminSignupRepository extends JpaRepository<AdminSignup, Integer> {

}
