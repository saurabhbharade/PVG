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
 * Servlet implementation class LoginChecker
 */
@WebServlet("/LoginChecker")
public class LoginChecker extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginChecker() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String sid_in_string = request.getParameter("sid");
		String pwd = request.getParameter("password");
		
		try{
		
			if(sid_in_string.equals(new String("admin"))&&pwd.equals("admin"))
			{
				HttpSession session = request.getSession(true);
				
				//Student student = new StudentDaoImpl().getStudent(sidInt);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("TPOHomePage.jsp");
				requestDispatcher.forward(request, response);	
			}
			else 
			{
				int temp_sid=0;
				try
				{
				temp_sid=Integer.parseInt(sid_in_string);
				}
				catch(NumberFormatException e)
				{
					e.printStackTrace();
					
				}
				Student student=new StudentDaoImpl().getStudent(temp_sid);
				
				if(temp_sid==student.getSid()&&pwd.equals(student.getPassword()))
				{
					HttpSession session = request.getSession(true);
					session.setAttribute("student", student);

					//Student student = new StudentDaoImpl().getStudent(sidInt);
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("StudentHomePage.jsp");
					requestDispatcher.forward(request, response);
					
				}
				else
				{
					response.getWriter().append("Wrong user id and password");
					if(request.getSession (false) != null)
					{
						request.getSession().invalidate();
					}
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("HomePage.jsp");
					requestDispatcher.forward(request, response);
				}
			}
//			
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
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
