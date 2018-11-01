package com.service;

import java.util.List;

import com.model.CompanyCriteria;
import com.model.Student;

public interface TpoAssistantService {
	public boolean checkEligibilityOfStudentForCompany(int sid,int cid);
	public boolean checkEligibilityOfStudentForDreamStatus(int sid);
	public List<Student>getStudentEligibleForDreamStatus();
	
	

	public boolean checkStudentEligibiliyForCompanyWithCriteria(int sid,List<CompanyCriteria> companyCriteriaList);
	
	
	public List<Student> getStudentEligibileForCompany(List<CompanyCriteria> companyCriteriaList);
}
