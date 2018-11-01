package com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.StudentDaoImpl;
import com.model.Student;

/**
 * Servlet implementation class UpdateStudentController
 */
@WebServlet("/UpdateStudentController")
public class UpdateStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateStudentController() {
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
		Object studentObject=session.getAttribute("student");
		Student old_student=(Student)studentObject;
		String password = request.getParameter("password");
		String sname = request.getParameter("sname");
		String branch = request.getParameter("branch");
		String ssc1 = request.getParameter("ssc");
		float ssc = Float.parseFloat(ssc1);
		String hsc1 = request.getParameter("hsc");
		float hsc = Float.parseFloat(hsc1);
		String aggregate1 = request.getParameter("beaggregate");
		float beaggregate = Float.parseFloat(aggregate1);
		String yop1 = request.getParameter("yop");
		int yop = Integer.parseInt(yop1);
		String backlog1 = request.getParameter("backlog");
		int backlog  = Integer.parseInt(backlog1);
		String status1 = request.getParameter("status");
		int status = Integer.parseInt(status1);
		String instituteName = request.getParameter("instituteName");
		String phone1 = request.getParameter("phone");
		long phone = Long.parseLong(phone1);
		String email = request.getParameter("email");
		System.out.println("Servlet Updated");
		
		Student new_student = new Student(old_student.getSid(), backlog, status, password, sname, branch, instituteName, email, phone, yop, ssc, hsc, beaggregate);
		//Student new_student = new Student(old_student.getSid(), password, sname, branch, ssc, hsc, aggregate, yop, backlog, status, instituteName, phone, email);
		new StudentDaoImpl().updateStudent(new_student);
		session.setAttribute("student", new_student);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("StudentHomePage.jsp");
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
