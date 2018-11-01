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

import com.dao.CompanyDaoImpl;
import com.model.Company;

/**
 * Servlet implementation class ListOfCompanies
 */
@WebServlet("/ListOfCompanies")
public class ListOfCompanies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListOfCompanies() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession(true);
		String companyid=request.getParameter("cid");
		int temp_cid=0;
		try
		{
		temp_cid=Integer.parseInt(companyid);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		

		Company company=new CompanyDaoImpl().getCompany(temp_cid);
		
		System.out.println(company);
		session.setAttribute("company", company);
		
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("ListofCompany.jsp");
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
