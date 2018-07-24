<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update</title>
</head>
<body>
<div align="center">
		<h2>Update Faculty Details Here</h2>
		<table>
		
			<form:form action="../editsave" method="POST">
			
				<tr>  
        		<td></td>    
         		<td><form:hidden path="facultyID" /></td>  
         		</tr> 
				<tr>
					<td>Faculty Name:</td>
					<td><form:input path="facultyName" size="30" /></td>
					<td><form:errors path="facultyName" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Course Name:</td>
					<td><form:input path="courseName" size="30" /></td>
					<td><form:errors path="courseName" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Duration:</td>
					<td><form:input path="duration" size="30" /></td>
					<td><form:errors path="duration" cssClass="error" /></td>
				</tr>
				
				<tr>
					<td><input type="submit" value="Update" /></td>
				</tr>
			</form:form>
		</table>
	</div>
</body>
</html>