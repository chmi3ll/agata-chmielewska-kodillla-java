package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(3, 1);
        } catch (Exception e){
            System.out.println("something wrong");
        }
        finally {
            System.out.println("no cóż..");
        }
    }
}
