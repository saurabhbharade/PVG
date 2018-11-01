<%@page import="com.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Home Page</title>
</head>
<body>

<%
session = request.getSession(true);
Student student = (Student)session.getAttribute("student");

%>

<div align="center">
<h1>Student's Details..</h1>
</div>
<div align="center">
	<table border = 1>
	<tr>
		<th>Student ID </th>
		<th>Password </th>
		<th>Name </th>
		<th>Branch </th>
		<th>SSC </th>
		<th>HSC </th>
		<th>Aggregate </th>
		<th>Year Of Passing </th>
		<th>Backlog </th>
		<th>Status</th>
		<th>Institute Name </th>
		<th>Phone Number </th>
		<th>Email </th>
	</tr>
	
	<tr>
		<td> <%=student.getSid() %> </td>
	<td> <%=student.getPassword() %> </td>
	<td>  <%=student.getSname() %> </td>
	<td><%=student.getBranch() %></td>
	<td> <%=student.getSsc() %> </td>
	<td> <%=student.getHsc() %> </td>
	<td ><%=student.getBeaggregate() %></td>
	<td ><%=student.getYop() %> </td>
	<td ><%=student.getBacklog() %> </td>
	<td ><%=student.getStatus() %> </td>
	<td ><%=student.getInstituteName() %> </td>
	<td ><%=student.getPhone() %> </td>
	<td ><%=student.getEmail() %> </td>	
	</tr>
		
</table>

<br><br>

<form method="post" action="UpdateStudent.jsp">
	<input type="submit" name="update" value="Update" /> <br> <br></form>
	
	<form method="post" action="ApplyEnrollment.jsp">
	<input type="submit" name="applyenrollment" value="Click Here For Enrollment" /> <br> <br></form>
	
	<form method="post" action="ViewEnrollmentStudent">
	<input type="submit" name="viewenrollment" value="View Enrollment" /> <br> <br></form>
	
	<form method="post" action="Logout">
			<input type="submit" name="logout" value="Logout" /></form>
	
</div>

</body>
</html>