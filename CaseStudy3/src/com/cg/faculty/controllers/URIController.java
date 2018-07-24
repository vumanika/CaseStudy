package com.cg.faculty.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.faculty.beans.Faculty;


@Controller
public class URIController {

	@RequestMapping("/")
	public String getHomePage() {
		return "indexPage";
	}
	
	@RequestMapping("/registration")
	public String getRegistrationPage() {
		return "registrationPage";
	}
	
	@ModelAttribute("faculty")
		public Faculty getFaculty() {
		return new Faculty();
	}
	
}