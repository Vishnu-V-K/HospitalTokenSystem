package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.loginDto;
import com.example.demo.entity.DoctersDetails;
import com.example.demo.entity.RegistrationDetails;
import com.example.demo.repository.DocterRegistration;
import com.example.demo.repository.RegistrationRepo;
@Service
public class RegistrationServiceImp implements RegistrationService{
	
	@Autowired
	RegistrationRepo registrationRepo;
	@Autowired
	DocterRegistration docterRegistration;

	@Override
	public boolean saveCusData(RegistrationDetails registrationDetails) {
		boolean status = false;
		try {
			String mob = registrationDetails.getContactNo();
			status = registrationRepo.existsByContactNo (mob);
			if (status == false) {
				registrationRepo.save(registrationDetails);
				return status;
			}
			else{
				System.out.println("already registerd mobile number");
			}
		} catch (Exception e) {
			System.out.println(e);

		}
		return status;

	}

	@Override
	public boolean verifyUsername(loginDto loginDto) {
		RegistrationDetails	registrationDetails = registrationRepo.findByEmail(loginDto.getUsername());
		if (registrationDetails.getPassword().equals(loginDto.getPassword()) ) {
			return true;
		}
		return false;
		
	}

	@Override
	public void saveDocterDetails(DoctersDetails doctersDetails) {
		docterRegistration.save(doctersDetails);
	}

}
