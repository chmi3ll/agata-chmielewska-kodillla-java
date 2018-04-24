package com.kodilla.patterns.challenges.foodDelivery;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    private List<Product> products = new ArrayList<>();
    private String name;

    public ProductList(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public String getName() { return name; }

}
