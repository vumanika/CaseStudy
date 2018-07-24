<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<style>
.error {
	color: red;
	font-weight: bold;
}
</style>
</head>
<body>
	<div align="center">
		<h2>Enroll Faculty Details Here</h2>
		<table>
		
			<form:form action="registerFaculty" method="post"  modelAttribute="faculty">
			
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
					<td><input type="submit" value="Submit" /></td>
				</tr>
			</form:form>
		</table>
	</div>
</body>
</html>