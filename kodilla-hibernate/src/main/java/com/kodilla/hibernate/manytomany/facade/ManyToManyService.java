package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManyToManyService {
    private String part;

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    CompanyDao companyDao;

    @Autowired
    Company company;

    @Autowired
    Employee employee;

    public void saveEmployee(Employee employee) {
        employeeDao.save(employee);
    }

    public void saveCompany(Company company) {
        companyDao.save(company);
    }
//    public void savaData(Employee employee, Company company) {
//        employee.saveEmployee(employee);
//        company.saveCompanies(company);
//    }

    public List<Employee> retrieveEmployeesByPart(String part) {
        return employeeDao.retrieveEmployeesBy(part, part);
    }

    public List<Company> retrieveCompaniesByPart(String part) {
        return companyDao.retrieveCompaniesBy(part);
    }

    //int johnSmithId = johnSmith.getId();
}
