package com.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.model.Student;
import com.service.EnrollmentService;
import com.service.EnrollmentServiceImpl;
import com.service.StudentService;
import com.service.StudentServiceImpl;

/**
 * Servlet implementation class StudentsEnrolledInACompany
 */
@WebServlet("/StudentsEnrolledInACompany")
public class StudentsEnrolledInACompany extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentsEnrolledInACompany() {
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
		String companyId = request.getParameter("cid");
		int cid=Integer.parseInt(companyId);
		
		EnrollmentService enrollmentService = new EnrollmentServiceImpl();
		
		List<Student> studentsEnrolledInACompany = enrollmentService.studentsEnrolledInACompanyService(cid);
		
		session.setAttribute("ListofStudents", studentsEnrolledInACompany);
		
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("StudentList1.jsp");
		 requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
