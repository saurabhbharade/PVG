package com.service;

import java.util.List;

import com.model.Company;

public interface CompanyService {
public void addCompanyService(Company company);
public List<Company>getAllCompanyService();
public Company getCompanyService(int cid);
public List<Company> getCompanyByYear(int year);
public boolean checkCompanyService(int cid);
}
