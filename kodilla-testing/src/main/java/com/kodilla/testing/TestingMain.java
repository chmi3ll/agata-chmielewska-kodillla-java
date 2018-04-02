package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser", "");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator kalkulator = new Calculator();
        int dodawanie = kalkulator.add(120,4);
        int odejmowanie = kalkulator.substract(30, 45);

        if(dodawanie == 120+4){
            System.out.println("dodawanie OK");
        } else {
            System.out.println("dodawanie Error!");
        }

        if(odejmowanie == 30-45){
            System.out.println("odejmowanie OK");
        } else {
            System.out.println("odejmowanie Error!");
        }

    }
}
