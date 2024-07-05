package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(schema = "xyz_hospital", catalog = "xyz_hospital", name = "docters_details")
@Entity
public class DoctersDetails {
	@Id
	@Column(name = "id")
	long id;
	@Column(name = "first_name")
	String firstName;
	@Column(name = "last_name")
	String lastName;
	@Column(name = "department")
	String department;
	@Column(name = "contact_number")
	String phoneNumber;

}
