package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(schema = "xyz_hospital", catalog = "xyz_hospital", name = "registration_details")
@Data
public class RegistrationDetails {
	@Id
	@Column(name = "id")
	long id;
	@Column(name = "first_name")
	String firstName;
	@Column(name = "last_name")
	String lastName;
	@Column(name = "mail_id")
	String email;
	@Column(name = "password")
	String password;
	@Column(name = "contact_number")
	String contactNo;
	
}


