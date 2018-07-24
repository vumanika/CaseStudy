package com.cg.faculty.services;

import java.util.ArrayList;

import com.cg.faculty.beans.Faculty;
import com.cg.faculty.exceptions.FacultyDetailsNotFoundException;
import com.cg.faculty.exceptions.ServicesDownException;

public interface FacultyServices {

	Faculty acceptFacultyDetails(Faculty faculty) throws ServicesDownException;

	Faculty getFacultyDetails(int facultyId)throws FacultyDetailsNotFoundException , 
	ServicesDownException;

	ArrayList<Faculty> getAllFacultyDetails()throws ServicesDownException;

}