package com.kodilla.hibernate.manytomany.facade;

public class ProcessingException extends Exception {

    public static String ERR_GETTING_EMPLOYEE_ERROR = "Getting company from db error";
    public static String ERR_GETTING_COMPANY_ERROR = "Getting company from db error";

    public ProcessingException(String message) {
        super(message);
    }
}
