package com.kodilla.patterns3.adapter.company.newhrsystem;

import java.math.BigDecimal;

public class Podklasa extends Employee {
    int age;

    public Podklasa(String peselId, String firstname, String lastname, BigDecimal baseSalary, int age) {

        super(peselId, firstname, lastname, baseSalary);
        this.age = age;
    }

    public Podklasa(String peselId, String firstname, String lastname) {
        this(peselId, firstname, lastname, new BigDecimal("123"), 13);
    }

    public Podklasa(String firstname, String lastname) {
        this("1234", firstname, lastname, new BigDecimal("123"), 13);
    }

    public static void main(String[] args) {
        Podklasa podklasa = new Podklasa("12", "abc", "def", new BigDecimal("123"), 12);
    }
}
