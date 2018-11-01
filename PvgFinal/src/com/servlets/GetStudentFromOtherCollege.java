package com.servlets;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mescoe.webservice.MescoeWebService;
import com.mescoe.webservice.MescoeWebServiceService;
import com.mescoe.webservice.Student;
import com.model.CompanyCriteria;
import com.service.CompanyCriteriaServiceImpl;
import com.service.StudentServiceImpl;

/**
 * Servlet implementation class GetStudentFromOtherCollege
 */
@WebServlet("/GetStudentFromOtherCollege")
public class GetStudentFromOtherCollege extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetStudentFromOtherCollege() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session=request.getSession(true);
		String tempcid=request.getParameter("cid");
		int cidforCompany=Integer.parseInt(tempcid);
		response.getWriter().append("Served at: ").append(request.getContextPath());
		List<CompanyCriteria> companyCriteriaList = new CompanyCriteriaServiceImpl().getCompanyCriteriaService(cidforCompany);
		response.getWriter().append("Served at: "+companyCriteriaList.size());
		int cid=companyCriteriaList.get(0).getCompany().getCid();
		String cname=companyCriteriaList.get(0).getCompany().getCname();
		float salary=companyCriteriaList.get(0).getCompany().getSalary();
		String designation=companyCriteriaList.get(0).getCompany().getDesignation();
		String location=companyCriteriaList.get(0).getCompany().getLocation();
		float ssc=companyCriteriaList.get(0).getCompany().getSsc();
		float hsc=companyCriteriaList.get(0).getCompany().getHsc();
		float beaggregate=companyCriteriaList.get(0).getCompany().getBeaggregate();
		int backlog=companyCriteriaList.get(0).getCompany().getBacklog();
		int numrequired=companyCriteriaList.get(0).getCompany().getNumrequired();
		int poolcampus=companyCriteriaList.get(0).getCompany().getPoolcampus();
		Date date_of_campus=companyCriteriaList.get(0).getCompany().getDate_of_campus();
		int critid=companyCriteriaList.get(0).getCritid();
		int yop=companyCriteriaList.get(0).getYop();
		int sizeofbranch=companyCriteriaList.size();
		List<String> branch=new ArrayList<String>();
		response.getWriter().append("Served at: "+sizeofbranch);
		for(int i=0;i<sizeofbranch;i++)
		{
			branch.add(companyCriteriaList.get(i).getBranch());
		}
		MescoeWebServiceService mescoe=new MescoeWebServiceService();
		MescoeWebService mescoeWebServicePort = mescoe.getMescoeWebServicePort();
		List<com.model.Student> unplacedStudentList = new StudentServiceImpl().getUnplacedStudent();

		List<Student> listOfStudentFromMescoe = mescoeWebServicePort.getListOfStudentFromMescoe(cid, cname, salary, designation, location, ssc, hsc, beaggregate, backlog, numrequired, poolcampus, critid, yop, branch);
		int sizeOfStudentFromMescoe = listOfStudentFromMescoe.size();
		response.getWriter().append("list size before adding : "+unplacedStudentList.size());

		for(int i=0;i<sizeOfStudentFromMescoe;i++)
		{
			int sid=listOfStudentFromMescoe.get(i).getSid();
			int backlogOfStudent=listOfStudentFromMescoe.get(i).getBacklog();
			int statusOfStudent=listOfStudentFromMescoe.get(i).getStatus();
			String passwordOfStudent=listOfStudentFromMescoe.get(i).getPassword();
			String sname=listOfStudentFromMescoe.get(i).getSname();
			String branchOfStudent=listOfStudentFromMescoe.get(i).getBranch();
			String instituteNameOfStudent=listOfStudentFromMescoe.get(i).getInstituteName();
			String email=listOfStudentFromMescoe.get(i).getEmail();
			long phone=listOfStudentFromMescoe.get(i).getPhone();
			int yopOfStudent=listOfStudentFromMescoe.get(i).getYop();
			float sscMarksOfStudent=listOfStudentFromMescoe.get(i).getSsc();
			float hscMarksOfStudent=listOfStudentFromMescoe.get(i).getHsc();
			float beaggregateOfStudent=listOfStudentFromMescoe.get(i).getBeaggregate();
			com.model.Student studentOfOtherCollege=new com.model.Student(sid, backlogOfStudent, statusOfStudent, passwordOfStudent, sname, branchOfStudent, instituteNameOfStudent, email, phone, yopOfStudent, sscMarksOfStudent, hscMarksOfStudent, beaggregateOfStudent);
			unplacedStudentList.add(studentOfOtherCollege);
			response.getWriter().append("list size after adding : "+unplacedStudentList.size());
			session.setAttribute("ListofStudents", unplacedStudentList);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("StudentList1.jsp");
			requestDispatcher.forward(request, response);

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
