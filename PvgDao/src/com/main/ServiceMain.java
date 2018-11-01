package com.main;

import java.util.List;

import com.model.Company;
import com.model.CompanyCriteria;
import com.model.Student;
import com.service.CompanyCriteriaServiceImpl;
import com.service.CompanyServiceImpl;
import com.service.EnrollmentServiceImpl;
import com.service.StudentServiceImpl;

public class ServiceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(new CompanyServiceImpl().checkCompanyService(8));
//		Student student = new StudentServiceImpl().getStudentService(104);
//		Company company = new CompanyServiceImpl().getCompanyService(4);
//		
//		boolean addEnrollmentService = new EnrollmentServiceImpl().addEnrollmentService(student, company);
//		System.out.println(addEnrollmentService);

		List<CompanyCriteria> companyCriteriaList = new CompanyCriteriaServiceImpl().getCompanyCriteriaService(2202);
		System.out.println(companyCriteriaList.size());
//		

	}

}
