<%@page import="com.model.Student"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student List</title>
</head>
<body>

<table border = 1 align = "left">
<tr>
	<th>Student ID</th>
	<th>Password</th>
	<th>Student Name</th>
	<th>Branch</th>
	<th>SSC marks</th>
	<th>HSC marks</th>
	<th>B.E aggregate</th>
	<th>Y.O.P</th>
	<th>Backlogs</th>
	<th>Status</th>
	<th>Institute Name</th>
	<th>Phone Number</th>
	<th>Email ID</th>
</tr>

<%
List<Student>ListofStudents=(ArrayList<Student>)session.getAttribute("ListofStudents");
for(Student studentOb : ListofStudents)
{
%>

<tr>
	<td><%=studentOb.getSid() %></td>
	<td><%=studentOb.getPassword() %></td>
	<td><%=studentOb.getSname() %></td>
	<td><%=studentOb.getBranch() %></td>
	<td><%=studentOb.getSsc() %></td>
	<td><%=studentOb.getHsc() %></td>
	<td><%=studentOb.getBeaggregate() %></td>
	<td><%=studentOb.getYop() %></td>
	<td><%=studentOb.getBacklog() %></td>
	<td><%=studentOb.getStatus() %></td>
	<td><%=studentOb.getInstituteName() %></td>
	<td><%=studentOb.getPhone() %></td>
	<td><%=studentOb.getEmail() %></td>
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