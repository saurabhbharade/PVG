package com.service;

import java.util.ArrayList;
import java.util.List;

import com.dao.CompanyCriteriaDao;
import com.dao.CompanyCriteriaDaoImpl;
import com.dao.EnrollmentDaoImpl;
import com.model.Company;
import com.model.CompanyCriteria;
import com.model.Enrollment;

public class CompanyCriteriaServiceImpl implements CompanyCriteriaService{
	CompanyCriteriaDao companyCriteriaDao=new CompanyCriteriaDaoImpl();
	
	/**
	 * Function definition of getCompanyCriteriaService that returns a list of 
	 * with the details of company criteria based on company Id, cid passed as a parameter.
	 */
	@Override
	public List<CompanyCriteria> getCompanyCriteriaService(int cid) {
		return companyCriteriaDao.getCompanyCriteria(cid);
	}
	
	/**
	 * Function definition of addCompanyCriteriaService that adds the details into 
	 * the table CompanyCriteria of the database mescoe.
	 */
	@Override
	public void addCompanyCriteriaService(Company company,int yop,String branch) {

		List<CompanyCriteria> allCompanyCriteriaList = companyCriteriaDao.getAllCompanyCriteria();
		int size=allCompanyCriteriaList.size()-1;
		int lastcritid=allCompanyCriteriaList.get(size).getCritid();
		lastcritid=lastcritid+1;
		CompanyCriteria companyCriteria=new CompanyCriteria(lastcritid, company, yop, branch);
		companyCriteriaDao.addCompanyCriteria(companyCriteria);
	}
	
	/**
	 * Function definition of getAllCompanyCriteria
	 */
	@Override
	public List<CompanyCriteria> getAllCompanyCriteria() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CompanyCriteria> getCompanyByYear(int year) {
		// TODO Auto-generated method stub
		
		List<CompanyCriteria> companyCriteriaByYearList=new ArrayList<CompanyCriteria>();
		List<Company> allCompanyList = new CompanyServiceImpl().getAllCompanyService();
		int sizeOfAllCompany = allCompanyList.size();
		for(int i=0;i<sizeOfAllCompany;i++)
		{
			
			int yearOfCampus = allCompanyList.get(i).getDate_of_campus().getYear();
			yearOfCampus=yearOfCampus+1900; // by default 1900 will be subtracted
			if(yearOfCampus==year)
			{
				List<CompanyCriteria> companyCriteriaList = new CompanyCriteriaServiceImpl().getCompanyCriteriaService(allCompanyList.get(i).getCid());
				
				companyCriteriaByYearList.add(companyCriteriaList.get(0));
			}
		}
		return companyCriteriaByYearList;

	}
}

