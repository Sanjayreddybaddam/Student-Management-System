package com.StudentManagementSystem.repository;

//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StudentManagementSystem.entity.Admin1;

@Repository
public interface AdminRepository extends JpaRepository<Admin1, Integer> {

//	Optional<Admin1> findByUsername(String username);
//	Optional<Admin1> findByPassword(String password);
	
}
