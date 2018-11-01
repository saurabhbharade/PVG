<%@page import="com.model.CompanyCriteria"%>
<%@page import="com.model.Company"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Company Criteria</title>
</head>
<body>

<table border = 1 align = "left">
<tr>
	<th>Company ID</th>
	<th>Company Name</th>
	<th>Salary</th>
	<th>Designation</th>
	<th>Location</th>
	<th>SSC Marks</th>
	<th>HSC Marks</th>
	<th>B.E aggregate</th>
	<th>Backlogs</th>
	<th>Num_Students</th>
	<th>Pool Campus</th>
	<th>Date of campus</th>
	<th>Y.O.P</th>
	<th>Branch</th>
</tr>

<%
List<CompanyCriteria> ListofCompanyCriteria=(ArrayList<CompanyCriteria>)session.getAttribute("CompanyCriteriaList");
for(CompanyCriteria compCriOb : ListofCompanyCriteria)
{
%>
<tr>
	<td><%=compCriOb.getCompany().getCid() %></td>
	<td><%=compCriOb.getCompany().getCname() %></td>
	<td><%=compCriOb.getCompany().getSalary() %></td>
	<td><%=compCriOb.getCompany().getDesignation() %></td>
	<td><%=compCriOb.getCompany().getLocation() %></td>
	<td><%=compCriOb.getCompany().getSsc() %></td>
	<td><%=compCriOb.getCompany().getHsc() %></td>
	<td><%=compCriOb.getCompany().getBeaggregate() %></td>
	<td><%=compCriOb.getCompany().getBacklog() %></td>
	<td><%=compCriOb.getCompany().getNumrequired() %></td>
	<td><%=compCriOb.getCompany().getPoolcampus() %></td>
	<td><%=compCriOb.getCompany().getDate_of_campus() %></td>
	<td><%=compCriOb.getYop() %></td>
	<td><%=compCriOb.getBranch() %></td>
</tr>


<% 
}
%>

</table>
<br><br><br><br><br><br><br><br><br>
<form method="post" action="TPOHomePage.jsp" align="center">
			<input align = "center" type="submit" name="Home" value="Home" /></form>
</body>
</html>