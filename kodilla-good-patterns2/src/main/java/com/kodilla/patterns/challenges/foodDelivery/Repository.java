package com.kodilla.patterns.challenges.foodDelivery;

import java.util.Random;

public class Repository implements OrderService {
    @Override
    public boolean order(Product product) {
        if (product != null) {
            Random random = new Random();
            return random.nextBoolean();
        } else {
            return false;
        }
    }
}