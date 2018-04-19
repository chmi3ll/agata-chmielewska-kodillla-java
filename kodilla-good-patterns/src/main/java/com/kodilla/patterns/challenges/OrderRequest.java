package com.kodilla.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalTime;

public class OrderRequest {

    private User user;
    private LocalDate date;
    private LocalTime time;
    private double cash;

    public OrderRequest(User user, LocalDate date, LocalTime time, double cash) {
        this.user = user;
        this.date = date;
        this.time = time;
        this.cash = cash;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public double getCash() {
        return cash;
    }
}
