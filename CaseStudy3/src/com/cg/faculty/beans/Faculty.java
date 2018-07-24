package com.cg.faculty.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Faculty {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int facultyID;
	private int duration;
	private String facultyName,courseName;
	
	public Faculty(int duration, String facultyName, String courseName) {
		super();
		this.duration = duration;
		this.facultyName = facultyName;
		this.courseName = courseName;
	}
	
	public Faculty(int facultyID, int duration, String facultyName, String courseName) {
		super();
		this.facultyID = facultyID;
		this.duration = duration;
		this.facultyName = facultyName;
		this.courseName = courseName;
	}
	
	public Faculty() {}

	public int getFacultyID() {
		return facultyID;
	}

	public void setFacultyID(int facultyID) {
		this.facultyID = facultyID;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((courseName == null) ? 0 : courseName.hashCode());
		result = prime * result + duration;
		result = prime * result + facultyID;
		result = prime * result + ((facultyName == null) ? 0 : facultyName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Faculty other = (Faculty) obj;
		if (courseName == null) {
			if (other.courseName != null)
				return false;
		} else if (!courseName.equals(other.courseName))
			return false;
		if (duration != other.duration)
			return false;
		if (facultyID != other.facultyID)
			return false;
		if (facultyName == null) {
			if (other.facultyName != null)
				return false;
		} else if (!facultyName.equals(other.facultyName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Faculty [facultyID=" + facultyID + ", duration=" + duration + ", facultyName=" + facultyName
				+ ", courseName=" + courseName + "]";
	}
}