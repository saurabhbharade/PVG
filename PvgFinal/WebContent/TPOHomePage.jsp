<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TPO Assistant Page</title>
</head>
<body>
<div align = "center">
<h2>TPO Assistant</h2>
</div>
<div align = center>
<div style="display:inline-block; text-align:center;">
	
	<div align = "center" style="float:left">
	
		
<form method="post" action="AddCompany.jsp">
	<input type="submit" name="Add Company" value="Add Company" /> <br> <br></form> </div> <br><br><br>

	
	<div align = "center" style="float:left">
<form method="post" action="PlacedStudentsController">
	<input type="submit" name="List of Placed Students" value="List of Placed Students" /> <br> <br></form>	
	</div><br><br>
	
	
	
	<div align = "center" style="float:left">
<form method="post" action="UnplacedStudentsController">
	<input type="submit" name="List of Unplaced Students" value="List of Unplaced Students" /> <br> <br></form>	
	</div> <br><br><br>
	
	
	
	<div align = "center" style="float:right">
<form method="post" action="StudentsEligibleForDreamStatus">
	<input type="submit" name="List of Students eligible for Dream status company" value="List of Students eligible for Dream status company" /> <br> <br></form>	
	</div> <br><br><br>
	
	
	
	<form  action="ViewCriteriaController">  
	Enter Company id       : <input type="text" name="cid"   /><br><br>
	<input type="submit" name="View Criteria" value ="View Criteria" > <br><br><br></form>
	
	
	<form  action="StudentsEnrolledInACompany">   
	Enter Company id         : <input type="text" name="cid"   /><br><br>
	<input type="submit" name="View Enrolled Students" value ="View Enrolled Students" > <br><br><br> </form>
	
	
	<form  action="GetStudentFromOtherCollege">  
	Enter Company id       : <input type="text" name="cid"   /><br><br>
	<input type="submit" name="Get Student List from other college" value ="Get Student List from other college" > <br><br><br></form>
	
	<div style="float:left">
	<form method="post" action="CompaniesVisitedInAYear">
	Enter Year       : <input type="text" name="year"   /><br><br>
	<input type="submit" name="Companies Visited in a Year" value="Companies Visited in a Year" /> <br> <br><br><br></form>	
	</div><br><br><br><br>
	
	<div align = "center" style="float:left">
	<form method="post" action="Logout">
			<input type="submit" name="logout" value="Logout"  /></form> </div>
</div>
</body>
</html>