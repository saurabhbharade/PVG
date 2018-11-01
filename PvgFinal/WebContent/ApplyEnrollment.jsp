<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enrollment</title>
</head>
<body>

<div align = "center"><h1>Enrollment</h1> </div>

<div align = "center">
<form action="CompanyEnrollmentbyStudent" method="post">
			<table style="with: 50%">
				<tr>
					<td>Enrollment Id</td>
					<td><input type="text" name="eid" /></td>
				</tr>
				
				<tr>
					<td>Company Id</td>
					<td><input type="text" name="cid" /></td>
				</tr>
				
				
				</table><br>
				
				
			<input type="submit" value="Submit" />
			</form><br>
			<form method="post" action="StudentHomePage.jsp">
			<input type="submit" name="Home" value="Home" /></form>
			
</div>

</body>
</html>