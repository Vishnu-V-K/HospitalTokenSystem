package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.dto.loginDto;
import com.example.demo.entity.RegistrationDetails;
import com.example.demo.entity.DoctersDetails;
import com.example.demo.service.RegistrationService;
@RequestMapping("register")
@Controller
public class RegistrationController {
	
	@Autowired
	RegistrationService registrationService;

	@RequestMapping("save") 
	public ModelAndView Registration(RegistrationDetails registrationDetails, RedirectAttributes redirectAttributes ) {
		boolean status=registrationService.saveCusData(registrationDetails);
		String message = String.valueOf(status);
		redirectAttributes.addAttribute(message ,"message");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/login");
		return modelAndView;
		}
	@RequestMapping("login") 
	public ModelAndView Login(loginDto loginDto ) {
		boolean status = registrationService.verifyUsername(loginDto);
		ModelAndView modelAndView = new ModelAndView();
		if (status == true) {
			modelAndView.setViewName("/afterlogin");
			return modelAndView;
		}
		modelAndView.addObject("FailedMessage", "Invalid user name or password");
		modelAndView.setViewName("/login");
		return modelAndView;
		}
	@RequestMapping("docterDetails")
	public ModelAndView DoctersDetails(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/doctersDetails");
		return modelAndView;
	
	}
	@RequestMapping("addNewDocter")
	public ModelAndView AddDocterDetails() {
		ModelAndView modelAndView = new ModelAndView();
		DoctersDetails doctersDetails = new DoctersDetails();
		modelAndView.addObject("doctersDetails", doctersDetails);
		modelAndView.setViewName("/addDocterDetails");
		return modelAndView;
		
	}
	@RequestMapping("save/docterDetails")
	public ModelAndView SaveDocterDetails(DoctersDetails doctersDetails) {
		registrationService.saveDocterDetails(doctersDetails);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/doctersDetails");
		return modelAndView;
	}
}
