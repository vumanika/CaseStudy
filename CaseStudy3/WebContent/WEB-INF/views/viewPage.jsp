<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Faculty List</title>
</head>
<body>
<h1>Faculty List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Course Name</th><th>Duration</th><th>Faculty</th></tr>  
   <c:forEach var="faculty" items="${list}">   
   <tr>  
   <td>${faculty.facultyID}</td>  
   <td>${faculty.courseName}</td>  
   <td>${faculty.duration}</td>  
   <td>${faculty.facultyName}</td>
   <td><a href="update/${faculty.facultyID}">Update</a></td>
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="registration"><input type="submit" value="Add New Faculty" /></a>
   <a href=""><input type="submit" value="Home" /></a>
</body>
</html>