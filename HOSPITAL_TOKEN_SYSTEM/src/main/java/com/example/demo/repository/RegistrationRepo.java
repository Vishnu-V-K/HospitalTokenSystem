package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.RegistrationDetails;

public interface RegistrationRepo extends JpaRepository<RegistrationDetails, Long> {

	boolean	existsByContactNo(String mob);

	RegistrationDetails findByEmail(String username);

}