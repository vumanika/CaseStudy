package com.cg.faculty.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.faculty.beans.Faculty;

public interface FacultyDAOServices extends JpaRepository<Faculty, Integer>{}