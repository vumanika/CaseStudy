<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Success</title>
</head>
<body>
	<div align="center">
		<h2>Welcome ${faculty.facultyName} Your Registration is successfully</h2>
		<table border="2" width="70%" cellpadding="2">  
		<tr><th>Id</th><th>Course Name</th><th>Duration</th><th>Faculty</th></tr>     
   		<tr>  
   		<td>${faculty.facultyID}</td>  
   		<td>${faculty.courseName}</td>  
   		<td>${faculty.duration}</td>  
   		<td>${faculty.facultyName}</td> 
   		</tr>  
   		  
   		</table>  
   		<br/>  
   		<a href="registration"><input type="submit" value="Add New Faculty" /></a>
   		<a href=""><input type="submit" value="Home" /></a>
   		<a href="viewPage"><input type="submit" value="Show all entries/Update" /></a>
		</div>
</body>
</html>