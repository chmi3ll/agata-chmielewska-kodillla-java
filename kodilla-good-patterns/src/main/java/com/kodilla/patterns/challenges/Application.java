package com.kodilla.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalTime;

public class Application {

    public static void main(String[] args) {

        OrderProcessor orderProcessor = new OrderProcessor(
                new MailService() {
                    @Override
                    public void inform(User user) {
                        if (user != null) {
                            System.out.println("Cześć" + user);
                        } else{
                            System.out.println("Narazie");
                        }
                    }
                },
                new OrderService() {
                    @Override
                    public boolean buy(User user, LocalDate date, LocalTime time, double cash) {
                        return false ;
                    }
        },
                new OrderRepository() {
            @Override
            public boolean addOrder(User user, LocalDate date, LocalTime time, double cash) {
                return false;
            }
        });
        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retrieveRequest();
        orderProcessor.process(orderRequest);

    }
}
