package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
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
    private ManyToManyService manyToManyService;

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    CompanyDao companyDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(ManyToManyFacade.class);

    public List<Company> companyProcess(String partName) {
        boolean wasError = false;

        LOGGER.info("Getting companies from database, containing " + partName + " in name");
        if (partName == null) {
            LOGGER.error(ProcessingException.ERR_GETTING_COMPANY_ERROR);
            wasError = true;
        }
        try {
            LOGGER.info("Job done");
            List<Company> companyPartName = companyDao.retrieveCompaniesBy(partName);
            return companyPartName;
        } finally {
            if (wasError) {
                LOGGER.info("Something went wrong");
            }
        }
    }
}



//        boolean wasError = false;
//        List<Company> names = null;
//        try {
//            if (names == null) {
//                manyToManyService.saveCompany(company);
//                names = manyToManyService.retrieveCompaniesByPart("ter");
//                return names;
//                // LOGGER.info("company " + names + " exist");
//            } else {
//                throw new ProcessingException(ProcessingException.ERR_GETTING_COMPANY_ERROR);
//                //wasError = true;
//            }
//        } finally {
//            if (wasError) {
//                LOGGER.info("something went wrong");
//            }



//    public Employee employeeProcess() throws ProcessingException {
//
//        manyToManyProcessor.saveEmployee(employee);
//
//        manyToManyProcessor.retrieveEmployeesByPart("kow");
//    }

