package com.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StudentManagementSystem.entity.StudentSignup;
@Repository
public interface StudentSignupRepository extends JpaRepository<StudentSignup, Integer> {

}
