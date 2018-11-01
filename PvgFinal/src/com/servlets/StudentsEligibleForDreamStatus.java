package com.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Student;
import com.service.StudentService;
import com.service.StudentServiceImpl;
import com.service.TpoAssistantService;
import com.service.TpoAssistantServiceImpl;

/**
 * Servlet implementation class StudentsEligibleForDreamStatus
 */
@WebServlet("/StudentsEligibleForDreamStatus")
public class StudentsEligibleForDreamStatus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentsEligibleForDreamStatus() {
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

		TpoAssistantService tpoAssistantOb = new TpoAssistantServiceImpl();
		
		List<Student> studentEligibleForDreamStatus = tpoAssistantOb.getStudentEligibleForDreamStatus();
		
		session.setAttribute("ListofStudents", studentEligibleForDreamStatus);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("StudentList1.jsp");
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
