package com.kodilla.patterns.challenges.foodDelivery;

import java.util.Random;

public class Repository implements OrderRepository {
    @Override
    public boolean addOrder(Product product) {
        if (product != null) {
            Random random = new Random();
            return random.nextBoolean();
        } else {
            return false;
        }
    }
}