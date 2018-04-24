package com.kodilla.patterns.challenges.foodDelivery;

public class Delivery {
    String name;
    ProductList productList;

    public Delivery(String name, ProductList productList) {
        this.name = name;
        this.productList = productList;
    }

    public String getName() {
        return name;
    }
}
