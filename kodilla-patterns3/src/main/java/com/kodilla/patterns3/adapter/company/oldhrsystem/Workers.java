package com.kodilla.patterns3.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"123456", "John", "Smith"},
            {"123457", "Ivone", "Novak"},
                {"123458", "Jessie", "Pinkman"},
            {"123459", "Walter", "White"},
                {"123451", "Clara", "Lanson"}};

    private double[] salaries = {
            4500.00,
            3799.00,
            4350.00,
            9000.00,
            6200.00};

    public String getWorker(int n) {
        if(n > salaries.length) {
            return "";
        }
        return workers[n][0] + "' " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}

