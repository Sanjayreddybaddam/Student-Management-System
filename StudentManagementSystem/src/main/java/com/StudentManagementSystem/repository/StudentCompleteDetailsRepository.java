package com.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StudentManagementSystem.entity.StudentCompleteDetails;

@Repository
public interface StudentCompleteDetailsRepository extends JpaRepository<StudentCompleteDetails, Integer>{

}
