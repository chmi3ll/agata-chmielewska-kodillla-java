package com.kodilla.patterns.challenges.foodDelivery;

public class Product {
    private String product;
    private int quantity;

    public Product(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public String getProductName() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product='" + product + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
