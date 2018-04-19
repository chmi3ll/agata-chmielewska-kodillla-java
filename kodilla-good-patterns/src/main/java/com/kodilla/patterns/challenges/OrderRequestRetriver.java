package com.kodilla.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalTime;

public class OrderRequestRetriver {

    public OrderRequest retrieveRequest() {
        User user = new User("Janusz", "Nowak", "JanuszBiznesu", "janusz@gmail.com");
        LocalDate date = LocalDate.of(2018, 03, 21);
        LocalTime time = LocalTime.of(22, 35);
        double cash = 45.99;

        return new OrderRequest(user, date, time, cash);
    }
}
