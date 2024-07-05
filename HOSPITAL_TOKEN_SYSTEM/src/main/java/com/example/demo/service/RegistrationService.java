package com.example.demo.service;

import com.example.demo.dto.loginDto;
import com.example.demo.entity.DoctersDetails;
import com.example.demo.entity.RegistrationDetails;

public interface RegistrationService {

		boolean saveCusData(RegistrationDetails registrationDetails);

		boolean verifyUsername(loginDto loginDto);

		void saveDocterDetails(DoctersDetails doctersDetails);


}
