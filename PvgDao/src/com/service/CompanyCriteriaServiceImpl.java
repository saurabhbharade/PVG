package com.service;

import java.util.List;

import com.dao.CompanyCriteriaDao;
import com.dao.CompanyCriteriaDaoImpl;
import com.dao.EnrollmentDaoImpl;
import com.model.Company;
import com.model.CompanyCriteria;
import com.model.Enrollment;

public class CompanyCriteriaServiceImpl implements CompanyCriteriaService{
CompanyCriteriaDao companyCriteriaDao=new CompanyCriteriaDaoImpl();
	@Override
	public List<CompanyCriteria> getCompanyCriteriaService(int cid) {
		return companyCriteriaDao.getCompanyCriteria(cid);
	}
	@Override
	public void addCompanyCriteriaService(Company company,int yop,String branch) {
		
		List<CompanyCriteria> allCompanyCriteriaList = companyCriteriaDao.getAllCompanyCriteria();
		int size=allCompanyCriteriaList.size()-1;
		int lastcritid=allCompanyCriteriaList.get(size).getCritid();
		lastcritid=lastcritid+1;
		CompanyCriteria companyCriteria=new CompanyCriteria(lastcritid, company, yop, branch);
		companyCriteriaDao.addCompanyCriteria(companyCriteria);
	}
	
}
