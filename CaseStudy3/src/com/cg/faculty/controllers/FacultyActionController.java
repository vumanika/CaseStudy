package com.cg.faculty.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.faculty.beans.Faculty;
import com.cg.faculty.exceptions.FacultyDetailsNotFoundException;
import com.cg.faculty.exceptions.ServicesDownException;
import com.cg.faculty.services.FacultyServices;

@Controller
public class FacultyActionController {

	
	@Autowired(required=true)
	private FacultyServices facultyServices;
	
	@RequestMapping(value="/registerFaculty",method=RequestMethod.POST)
	public ModelAndView registerFaculty(@ModelAttribute("faculty") Faculty faculty) {
		try {
			faculty =facultyServices.acceptFacultyDetails(faculty);
			ModelAndView modelAndView = new ModelAndView("registrationSuccessPage", "faculty", faculty);
			return modelAndView;
		} catch (ServicesDownException e) {
			e.printStackTrace();
		}
		return new ModelAndView("errorPage");
	}
	
	@RequestMapping(value="/viewPage",method=RequestMethod.GET)  
    public ModelAndView viewfaculty() throws ServicesDownException { 
        List<Faculty> list=facultyServices.getAllFacultyDetails();
        ModelAndView modelAndView = new ModelAndView("viewPage","list",list);
		return modelAndView;  
    } 
	
	@RequestMapping(value="/update/{id}",method=RequestMethod.GET)  
    public ModelAndView edit(@PathVariable int id){  
		try {
			Faculty faculty = facultyServices.getFacultyDetails(id);
			return new ModelAndView("update","command",faculty);
		} catch (FacultyDetailsNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServicesDownException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        return new ModelAndView("errorPage");
    } 
	@RequestMapping(value="/editsave",method = RequestMethod.POST)  
    public ModelAndView editsave(@ModelAttribute("faculty") Faculty faculty){  
        try {
			faculty=facultyServices.acceptFacultyDetails(faculty);
		} catch (ServicesDownException e) {
			e.printStackTrace();
		}  
        return new ModelAndView("redirect:/viewPage");  
    }
	
}
