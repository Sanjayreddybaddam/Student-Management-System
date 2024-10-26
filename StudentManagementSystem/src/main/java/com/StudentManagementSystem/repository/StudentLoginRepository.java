package com.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StudentManagementSystem.entity.StudentLogin;

@Repository
public interface StudentLoginRepository extends JpaRepository<StudentLogin, Integer> {

}
