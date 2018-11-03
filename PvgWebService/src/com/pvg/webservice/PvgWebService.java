package com.pvg.webservice;

import java.sql.Date;
import java.util.List;

import javax.jws.WebService;

import com.model.Company;
import com.model.CompanyCriteria;
import com.model.Student;
import com.service.CompanyCriteriaServiceImpl;
import com.service.CompanyServiceImpl;
import com.service.TpoAssistantServiceImpl;

@WebService(serviceName="PvgWebService")
public class PvgWebService {

	public List<Student> getListOfStudentFromPvg(int cid,String cname,float salary,String designation,String location,float ssc,float hsc,float beaggregate,int backlog,int numrequired,int poolcampus,int critid,int yop,List<String> branch)	
	{
		Date date=new Date(System.currentTimeMillis());
		Company company=new Company(cid, backlog, numrequired, poolcampus, cname, designation, location, salary, ssc, hsc, beaggregate, date);
		new CompanyServiceImpl().addCompanyService(company);
		for(int i=0;i<branch.size();i++)
		{
			new CompanyCriteriaServiceImpl().addCompanyCriteriaService(company, yop, branch.get(i));
		}
		List<CompanyCriteria> companyCriteriaList = new CompanyCriteriaServiceImpl().getCompanyCriteriaService(cid);
		return new TpoAssistantServiceImpl().getStudentEligibileForCompany(companyCriteriaList);
	}	
}
