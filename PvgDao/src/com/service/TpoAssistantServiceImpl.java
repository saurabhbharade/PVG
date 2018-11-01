package com.service;

import java.util.ArrayList;
import java.util.List;

import com.dao.CompanyDaoImpl;
import com.model.Company;
import com.model.CompanyCriteria;
import com.model.Student;

public class TpoAssistantServiceImpl implements TpoAssistantService{

	@Override
	public boolean checkEligibilityOfStudentForCompany(int sid,int cid) {
		Student student=new StudentServiceImpl().getStudentService(sid);
		Company company=new CompanyDaoImpl().getCompany(cid);
		if(student.getSsc()<company.getSsc())
			return false;
		if(student.getHsc()<company.getHsc())
			return false;
		if(student.getBeaggregate()<company.getBeaggregate())
			return false;
		if(student.getBacklog()>company.getBacklog())
			return false;
		if(student.getHsc()<company.getHsc())
			return false;
		int flag=0;
		List<CompanyCriteria> companyCriteriaList = new CompanyCriteriaServiceImpl().getCompanyCriteriaService(company.getCid());
		
		for(CompanyCriteria companyCriteria:companyCriteriaList)
		{
			flag=0;
			if(companyCriteria.getBranch().equalsIgnoreCase(student.getBranch()))
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
			return false;
		
		if(company.getSalary()>5)
		{
			return checkEligibilityOfStudentForDreamStatus(sid);
		}
		float max=0;
		List<Company> companiesEnrolledByStudentList = new EnrollmentServiceImpl().companiesEnrolledByStudentService(student.getSid());
		
		for(Company tempcompany:companiesEnrolledByStudentList)
		{
			if(tempcompany.getSalary()>max)
				max=tempcompany.getSalary();
		}
		if(max>company.getSalary())
			return false;
		return true;
	}

	@Override
	public boolean checkEligibilityOfStudentForDreamStatus(int sid) {
		Student student=new StudentServiceImpl().getStudentService(sid);
		
		if(student.getStatus()==0)
			return true;
		float max=0;
		List<Company> companiesEnrolledByStudentList = new EnrollmentServiceImpl().companiesEnrolledByStudentService(student.getSid());
		for(Company tempcompany:companiesEnrolledByStudentList)
		{
			if(tempcompany.getSalary()>max)
				max=tempcompany.getSalary();
		}
		if(max>5)
			return false;
		return true;
	}

	@Override
	public List<Student> getStudentEligibleForDreamStatus() {
		List<Student>studentEligibleForDreamStatusList=new ArrayList<Student>();
		List<Student> allStudentList = new StudentServiceImpl().getAllStudentService();
		int allStudentListSize = allStudentList.size();
		for(int i=0;i<allStudentListSize;i++)
		{
		
			if(checkEligibilityOfStudentForDreamStatus(allStudentList.get(i).getSid()))
			{
				studentEligibleForDreamStatusList.add(allStudentList.get(i));
			}
		}
		return studentEligibleForDreamStatusList;
	}

//	@Override
//	public List<Student> getStudentEligibiliyForCompany(List<CompanyCriteria> companyCriteria) {
//		List<Student> allStudentList = new StudentServiceImpl().getAllStudentService();
//		for(int i=0;i<allStudentList.size();i++)
//		{
//			if(checkEligibilityOfStudentForCompany(allStudentList.get(i).getSid(), ))
//		}
//		return null;
//	}

	@Override
	public boolean checkStudentEligibiliyForCompanyWithCriteria(int sid,List<CompanyCriteria> companyCriteriaList)
	{
		Student student=new StudentServiceImpl().getStudentService(sid);
		Company company=companyCriteriaList.get(0).getCompany();
		if(student.getSsc()<company.getSsc())
			return false;
		if(student.getHsc()<company.getHsc())
			return false;
		if(student.getBeaggregate()<company.getBeaggregate())
			return false;
		if(student.getBacklog()>company.getBacklog())
			return false;
		if(student.getHsc()<company.getHsc())
			return false;
		int flag=0;
	//	List<CompanyCriteria> companyCriteriaList = new CompanyCriteriaServiceImpl().getCompanyCriteriaService(company.getCid());
		for(CompanyCriteria companyCriteria:companyCriteriaList)
		{
			flag=0;
			if(companyCriteria.getYop()==student.getYop())
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
			return false;
		
		for(CompanyCriteria companyCriteria:companyCriteriaList)
		{
			flag=0;
			if(companyCriteria.getBranch().equalsIgnoreCase(student.getBranch()))
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
			return false;
		
		if(company.getSalary()>5)
		{
			return checkEligibilityOfStudentForDreamStatus(sid);
		}
		float max=0;
		List<Company> companiesEnrolledByStudentList = new EnrollmentServiceImpl().companiesEnrolledByStudentService(student.getSid());
		
		for(Company tempcompany:companiesEnrolledByStudentList)
		{
			if(tempcompany.getSalary()>max)
				max=tempcompany.getSalary();
		}
		if(max>company.getSalary())
			return false;
		return true;

	
	}

	@Override
	public List<Student> getStudentEligibileForCompany(List<CompanyCriteria> companyCriteriaList) {
		// TODO Auto-generated method stub
		List<Student> allStudentList = new StudentServiceImpl().getAllStudentService();
			List<Student> studentEligible=new ArrayList<Student>();
			int sizeOfStudentList=allStudentList.size();
			for(int i=0;i<sizeOfStudentList;i++)
			{
				if(checkStudentEligibiliyForCompanyWithCriteria(allStudentList.get(i).getSid(), companyCriteriaList))
				{
					studentEligible.add(allStudentList.get(i));
				}
			}
			return studentEligible;
	}

}
