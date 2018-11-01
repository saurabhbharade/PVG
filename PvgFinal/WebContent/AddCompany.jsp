<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align = "center">
<h1>Add a Company</h1>
</div>
<div align = "center">
<form action="AddCompanyDetails" method="post">
			<table style="with: 50%">
				<tr>
					<td>Enter Company ID</td>
					<td><input type="text" name="cid" /></td>
				</tr>
				<tr>
					<td>Enter Company Name</td>
					<td><input type="text" name="cname" /></td>
				</tr>
				<tr>
					<td>Enter Company Salary</td>
					<td><input type="text" name="salary" /></td>
				</tr>
					<tr>
					<td>Enter Company Designation</td>
					<td><input type="text" name="designation" /></td>
				</tr>
				<tr>
					<td>Enter Company Location</td>
					<td><input type="text" name="location" /></td>
				</tr>
				<tr>
					<td>Enter SSC Percentage</td>
					<td><input type="text" name="ssc" /></td>
				</tr>
				
				<tr>
					<td>Enter HSC Percentage</td>
					<td><input type="text" name="hsc" /></td>
				</tr>
				
				<tr>
					<td>Enter BE Aggregate</td>
					<td><input type="text" name="beaggregate" /></td>
				</tr>
				<tr>
					<td>Enter Required Number</td>
					<td><input type="text" name="numrequired" /></td>
				</tr>
				<tr>
					<td>Pool Campus</td>
					<td><input type="text" name="poolcampus" /></td>
				</tr>
				<tr>
					<td>BackLog</td>
					<td><input type="text" name="backlog" /></td>
				</tr>
				<tr>
					<td>Enter Date of Campus</td>
					<td><input type="date" name="date_of_campus" /></td>
				</tr>
				<tr>
					<td>Year of Passing</td>
					<td><input type="text" name="yop" /></td>
				</tr>
				<tr>
					<td>Branch</td>
					<td><input type="checkbox" name="id" value = "Computer" />Computer</td>
					<td><input type="checkbox" name="id" value = "EnTC" />EnTC</td>
					<td><input type="checkbox" name="id" value = "Mechanial" />Mechanical</td>
					<td><input type="checkbox" name="id" value = "Civil" />Civil</td>
				</tr>
				
				</table>
			<input type="submit" value="Submit" />
			<br>
			
			</form>
			
			
			<br>
			<form method="post" action="TPOHomePage.jsp">
			<input type="submit" name="Home" value="Home" /></form>
</div>

</body>
</html>