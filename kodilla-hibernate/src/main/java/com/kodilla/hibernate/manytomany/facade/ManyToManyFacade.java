package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManyToManyFacade {

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    CompanyDao companyDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(ManyToManyFacade.class);

    public List<Company> companyProcess(String partName) throws ProcessingException {

        LOGGER.info("Getting companies from database, containing " + partName + " in name");
        if (partName == null) {
            LOGGER.error(ProcessingException.ERR_GETTING_COMPANY_ERROR);
        }
            LOGGER.info("Job done");
            List<Company> companyPartName = companyDao.retrieveCompaniesBy(partName);
            if (companyPartName.isEmpty()) {
                throw new ProcessingException(ProcessingException.ERR_GETTING_COMPANY_ERROR);
            }
            return companyPartName;
    }

    public List<Employee> employeeProcess(String partName) throws ProcessingException {

        LOGGER.info("Getting employees from database, containing " + partName + " in name/lastname");
        if (partName == null) {
            LOGGER.error(ProcessingException.ERR_GETTING_EMPLOYEE_ERROR);
        }
        LOGGER.info("Job done");
        List<Employee> employeePartName = employeeDao.retrieveEmployeesBy(partName, partName);
        if (employeePartName.isEmpty()) {
            throw new ProcessingException(ProcessingException.ERR_GETTING_EMPLOYEE_ERROR);
        }
        return employeePartName;
    }
}



