package com.service;

import java.util.List;

import com.model.Company;
import com.model.CompanyCriteria;

/**
 * Interface class that has the following methods
 * @author Administrator
 *
 */
public interface CompanyCriteriaService {

	/**
	 * Function declaration for getCompanyCriteriaService that returns a list of 
	 * with the details of company criteria based on company Id, cid passed as a parameter.
	 * @param cid
	 * @return
	 */
	public List<CompanyCriteria> getCompanyCriteriaService(int cid);

	/**
	 * Function declaration for addCompanyCriteriaService that adds the details into 
	 * the table CompanyCriteria of the database mescoe.
	 * @param company
	 * @param yop
	 * @param branch
	 */
	public void addCompanyCriteriaService(Company company,int yop,String branch);
	
	/**
	 * Function declaration for getAllCompanyCriteria to get a list of all rows in
	 * CompanyCriteria table
	 */
	public List<CompanyCriteria> getAllCompanyCriteria();
	
	public List<CompanyCriteria> getCompanyByYear(int year);
	
}
