package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.CompanyCriteriaDao;
import com.dao.CompanyCriteriaDaoImpl;
import com.dao.CompanyDao;
import com.dao.CompanyDaoImpl;
import com.dao.CompanyExistsException;
import com.model.Company;
import com.model.CompanyCriteria;
import com.service.CompanyCriteriaServiceImpl;
import com.service.CompanyServiceImpl;

/**
 * Servlet implementation class AddCompanyDetails
 */
@WebServlet("/AddCompanyDetails")
public class AddCompanyDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddCompanyDetails() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("addcompany");
		HttpSession session = request.getSession(true);
//		
		String cid1=request.getParameter("cid");
		int cid = Integer.parseInt(cid1);
		String cname=request.getParameter("cname");
		String salary1=request.getParameter("salary");
		float salary = Float.parseFloat(salary1);
		String designation=request.getParameter("designation");
		String location=request.getParameter("location");
		String ssc1=request.getParameter("ssc");
		float ssc = Float.parseFloat(ssc1);
		String hsc1=request.getParameter("hsc");
		float hsc =  Float.parseFloat(hsc1);
		String beaggregate1=request.getParameter("beaggregate");
		float beaggregate = Float.parseFloat(beaggregate1);
		
		String numrequired1=request.getParameter("numrequired");
		int numrequired = Integer.parseInt(numrequired1);
		String poolcampus1=request.getParameter("poolcampus");
		int poolcampus = Integer.parseInt(poolcampus1);
		String doc1=request.getParameter("date_of_campus");
		Date date_of_campus = Date.valueOf(doc1);
//		
		String backlog1=request.getParameter("backlog");
		int backlog = Integer.parseInt(backlog1);
		String yop1=request.getParameter("yop");
		int yop = Integer.parseInt(yop1);
		
		
		String branch[] = request.getParameterValues("id");
		int i;
//		System.out.println("Your languages are: ");
//		for(i=0;i<id.length; i++)
//		{
//			branch = id[i];
//			System.out.println(branch);
//		}
////		
		System.out.println("after conversion");
		if(new CompanyServiceImpl().checkCompanyService(cid))
		{
			Company company = new Company(cid, backlog, numrequired, poolcampus, cname, designation, location, salary, ssc, hsc, beaggregate, date_of_campus);
			for(i=0;i<branch.length;i++)
			{
				new CompanyCriteriaServiceImpl().addCompanyCriteriaService(company, yop, branch[i]);
			}
			
		}
		else
		{
			Company company = new Company(cid, backlog, numrequired, poolcampus, cname, designation, location, salary, ssc, hsc, beaggregate, date_of_campus);
			new CompanyServiceImpl().addCompanyService(company);
			for(i=0;i<branch.length;i++)
			{
				new CompanyCriteriaServiceImpl().addCompanyCriteriaService(company, yop, branch[i]);
			}
		}
//		CompanyCriteriaDao companyCriteriaDao = new CompanyCriteriaDaoImpl();
//		Company company = new Company(cid, backlog, numrequired, poolcampus, cname, designation, location, salary, ssc, hsc, beaggregate, date_of_campus);
//		new CompanyServiceImpl().addCompanyService(company);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("TPOHomePage.jsp");
		requestDispatcher.forward(request, response);
//		CompanyCriteria companyCriteria = new CompanyCriteria(, cid, yop, branch);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
