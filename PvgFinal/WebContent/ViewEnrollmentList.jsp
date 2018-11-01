<%@page import="com.model.Company"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Enrollment</title>
</head>
<body>

<%
session = request.getSession(true);
Student student=(Student)session.getAttribute("student");

List<Company> companyList = (ArrayList<Company>)session.getAttribute("companiesEnrolledbystudent");

//Student student=(Student)session.getAttribute("student");
//List<Company> companyList = new EnrollmentServiceImpl().companiesEnrolledByStudentService(student.getSid());
%>

<div align="center">
<h1>Student's Details..</h1>
</div>
<div align="center">
	<table border = 1>
	<tr>
		<th>Student ID </th>
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
		<th>Companies Enrollment</th>
	</tr>
	
	<tr>
		<td> <%=student.getSid() %> </td>
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
	<td> <%=companyList.size() %>
	</tr>
		
<% for(Company company : companyList)
{
%>
	<tr>
		<td> </td>
		<td> </td>
		<td> </td>
		<td> </td>
		<td> </td>
		<td> </td>
		<td> </td>
		<td> </td>
		<td> </td>
		<td> </td>
		<td> </td>
		<td> </td>
		<td> <%=company.getCname() %>
	
	</tr>	
<% 	
}
%>
	
</table>

<br><br>


<form method="post" action="StudentHomePage.jsp">
			<input type="submit" name="Home" value="Home" /></form>

</body>
</html>