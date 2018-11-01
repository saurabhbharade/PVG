<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.model.Company"%>
<%@page import="com.model.CompanyCriteria"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Displaying List of Companies</title>
</head>
<body>

	<table border = 1>
 	<tr>
 	<th>Company ID</th>
 	<th>Company Name</th>
 	<th>Salary</th>
 	<th>Designation</th>
 	<th>Location</th>
 	<th>SSC</th>
 	<th>HSC</th>
 	<th>BE Aggregate</th>
 	<th>Backlog</th>
 	<th>Number Required</th>
 	<th>Pool Campus</th>
 	
 	
 	
 	</tr>
<%
session=request.getSession(true);
Company company = (Company)session.getAttribute("company");	

%>

<tr>
	<td><%=company.getCid() %></td>
	<td><%=company.getCname() %></td>
	<td><%=company.getSalary() %></td>
	<td><%=company.getDesignation() %></td>
	<td><%=company.getLocation() %></td>
	<td><%=company.getSsc() %></td>
	<td><%=company.getHsc()%> </td>
	<td><%=company.getBeaggregate() %></td>
	<td><%=company.getBacklog() %></td>
	<td><%=company.getNumrequired() %></td>
	<td><%=company.getPoolcampus() %>
</tr>





</body>
</html>