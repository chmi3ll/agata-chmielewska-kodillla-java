package com.kodilla.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalTime;

public interface OrderService {
    boolean buy(User user, LocalDate date, LocalTime time, double cash);
}
