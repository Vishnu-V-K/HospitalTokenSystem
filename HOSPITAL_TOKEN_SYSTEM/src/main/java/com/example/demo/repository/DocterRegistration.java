package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.DoctersDetails;

public interface DocterRegistration extends JpaRepository<DoctersDetails, Long> {

}
