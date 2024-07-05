package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dto.loginDto;

@Controller
public class starterController {
	
	@RequestMapping(value = "/Starterpage", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView StarterPage() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("/starterPage");
		
		return modelAndView;
		
	}
	@RequestMapping(value = "/login", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView login() {
 		ModelAndView modelAndView=new ModelAndView();
		loginDto loginDto = new loginDto();
		modelAndView.addObject("loginDto", loginDto);
			modelAndView.setViewName("/login");
			return modelAndView;
	}
		
		@RequestMapping(value = "/register", method = { RequestMethod.GET, RequestMethod.POST })
		public ModelAndView register() {
			ModelAndView modelAndView=new ModelAndView();
			modelAndView.setViewName("/register");
			
			return modelAndView;
		}
		

}
