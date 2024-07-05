package com.example.demo.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class RetireeDetails {
	 @JsonProperty("Name")
     private String name;
     @JsonProperty("FatherHusbandName")
     private String fatherHusbandName;
     @JsonProperty("Designation")
     private String designation;
     @JsonProperty("DOB")
     private String DOB;
     @JsonProperty("DOR")
     private String DOR;


}
