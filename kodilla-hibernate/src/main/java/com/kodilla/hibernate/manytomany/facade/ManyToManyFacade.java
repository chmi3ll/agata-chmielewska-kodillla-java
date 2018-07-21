package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManyToManyFacade {

    @Autowired
    private ManyToManyService manyToManyService;

    @Autowired
    private Employee employee;

    @Autowired
    private Company company;

    private static final Logger LOGGER = LoggerFactory.getLogger(ManyToManyFacade.class);

    public List<Company> companyProcess() throws ProcessingException {
        boolean wasError = false;
        List<Company> names = null;
        try {
            if (names == null) {
                manyToManyService.saveCompany(company);
                names = manyToManyService.retrieveCompaniesByPart("ter");
                return names;
                // LOGGER.info("company " + names + " exist");
            } else {
                throw new ProcessingException(ProcessingException.ERR_GETTING_COMPANY_ERROR);
                //wasError = true;
            }
        } finally {
            if (wasError) {
                LOGGER.info("something went wrong");
            }
        }
    }
}

//    public Employee employeeProcess() throws ProcessingException {
//
//        manyToManyProcessor.saveEmployee(employee);
//
//        manyToManyProcessor.retrieveEmployeesByPart("kow");
//    }

