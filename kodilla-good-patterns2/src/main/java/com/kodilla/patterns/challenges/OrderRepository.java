package com.kodilla.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalTime;

public interface OrderRepository {
    boolean addOrder(User user, LocalDate date, LocalTime time, double cash);
}
