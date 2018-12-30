package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser", "");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
//
//        Calculator kalkulator = new Calculator();
//        int dodawanie = kalkulator.add(120,4);
//        int odejmowanie = kalkulator.substract(30, 45);
//
//        if(dodawanie == 120+4){
//            System.out.println("dodawanie OK");
//        } else {
//            System.out.println("dodawanie Error!");
//        }
//
//        if(odejmowanie == 30-45){
//            System.out.println("odejmowanie OK");
//        } else {
//            System.out.println("odejmowanie Error!");
//        }
//
//    }


//        BigDecimal one = BigDecimal.ONE;
//        BigDecimal ten = BigDecimal.TEN;
//        BigDecimal six = BigDecimal.valueOf(6);
//
//        one.add(six).multiply(ten);
//
//        System.out.println(one);





    }
}


//abstract class Parent<T extends Parent> {
//    abstract List<T> getList();
//}
//
//class Child extends Parent<Parent>  {
//    @Override
//    List<Child> getList() {
//        return new LinkedList<>();
//    }
//}