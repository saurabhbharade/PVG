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

import com.model.Company;
import com.model.Student;
import com.service.EnrollmentService;
import com.service.EnrollmentServiceImpl;

/**
 * Servlet implementation class ViewEnrollmentStudent
 */
@WebServlet("/ViewEnrollmentStudent")
public class ViewEnrollmentStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewEnrollmentStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HttpSession session = request.getSession(true);
//		String studentId = request.getParameter("sid");
//		
//		int sid = Integer.parseInt(studentId);
		Object studentObject=session.getAttribute("student");
		Student student=(Student)studentObject;
		
		EnrollmentService enrollmentService = new EnrollmentServiceImpl();
		List<Company> companiesEnrolledbystudent = enrollmentService.companiesEnrolledByStudentService(student.getSid());
		
		session.setAttribute("companiesEnrolledbystudent", companiesEnrolledbystudent);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("ViewEnrollmentList.jsp");
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
