package com.cg.faculty.services;

import java.util.ArrayList;
import java.util.Iterator;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.faculty.beans.Faculty;
import com.cg.faculty.daoservices.FacultyDAOServices;
import com.cg.faculty.exceptions.FacultyDetailsNotFoundException;
import com.cg.faculty.exceptions.ServicesDownException;

@Component(value="facultyServices")
public class FacultyServicesImpl implements FacultyServices{

	@Autowired
	private FacultyDAOServices daoServices;

	@Transactional
	@Override
	public Faculty acceptFacultyDetails(Faculty faculty) throws ServicesDownException {
	/*	ArrayList<Faculty> alist = (ArrayList<Faculty>)daoServices.findAll();
		Iterator<Faculty> iter = alist.iterator();
		while(iter.hasNext()) {
			Faculty f = iter.next();
			if(f.getFacultyID()==faculty.getFacultyID()) {
				daoServices.delete(f);
			}
		}*/
		return daoServices.save(faculty);
	}

	@Override
	public Faculty getFacultyDetails(int facultyId)
			throws FacultyDetailsNotFoundException, ServicesDownException {
		Faculty faculty = daoServices.findOne(facultyId);
		if(faculty==null)throw new FacultyDetailsNotFoundException("Faculty Details with Id "+facultyId+" not found" );
		return faculty;
	}

	@Override
	public ArrayList<Faculty> getAllFacultyDetails() throws ServicesDownException {
		return (ArrayList<Faculty>) daoServices.findAll();
	}


}