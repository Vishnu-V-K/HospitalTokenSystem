package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ResponseDto {
	@JsonProperty("TreasuryCode")
    private String treasuryCode;
    @JsonProperty("RetireeDetails")
    private RetireeDetails retireeDetails;
    @JsonProperty("ProvisionalPension")
    private ProvisionalPension provisionalPension;
    @JsonProperty("ProvisionalGratuity")
    private ProvisionalGratuity provisionalGratuity;

}
