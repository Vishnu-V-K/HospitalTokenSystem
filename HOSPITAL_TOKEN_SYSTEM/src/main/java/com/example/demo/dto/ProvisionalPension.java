package com.example.demo.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
@Data
public class ProvisionalPension {
	
	@JsonProperty("SanctionAmount")
    private double sanctionAmount;
    @JsonProperty("SanctionNumber")
    private String sanctionNumber;
    @JsonProperty("SanctionDate")
    private String sanctionDate;
    @JsonProperty("StartDate")
    private String startDate;

}
