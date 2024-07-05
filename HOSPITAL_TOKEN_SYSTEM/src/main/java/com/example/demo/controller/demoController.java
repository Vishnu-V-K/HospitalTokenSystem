package com.example.demo.controller;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ProvisionalGratuity;
import com.example.demo.dto.ProvisionalPension;
import com.example.demo.dto.RequestDto;
import com.example.demo.dto.ResponseDto;
import com.example.demo.dto.RetireeDetails;

@RestController
@RequestMapping(value = "dop")
public class demoController {
	
	@PostMapping(value = "sanction")
	public ResponseEntity<ResponseDto> response(@RequestBody RequestDto requestDto){
		RetireeDetails retireeDetails = new RetireeDetails();
		ProvisionalGratuity provisionalGratuity = new ProvisionalGratuity();
		ProvisionalPension provisionalPension = new ProvisionalPension();
		ResponseDto responseDto	= new ResponseDto();
		
		retireeDetails.setName("abhi");
		retireeDetails.setDesignation("bw");
		retireeDetails.setDOB("22-02-1978");
		retireeDetails.setDOR("06-06-2022");
		retireeDetails.setFatherHusbandName("dad");
		
		provisionalGratuity.setSanctionNumber("DG/PG/243/2024/3838-70");
		provisionalGratuity.setSanctionDate("03-08-2022");
		provisionalGratuity.setSanctionAmount(2000000.00);
		
		
		provisionalPension.setSanctionNumber("DG/PG/243/2024/3838-96");
		provisionalPension.setSanctionDate("03-08-2022");
		provisionalPension.setStartDate("03-08-2022");
		provisionalPension.setSanctionAmount(30000.00);
		
		responseDto.setTreasuryCode("BKK");
		responseDto.setProvisionalGratuity(provisionalGratuity);
		responseDto.setProvisionalPension(provisionalPension);
		responseDto.setRetireeDetails(retireeDetails);
		
		return ResponseEntity.ok(responseDto);
		
	}

}
