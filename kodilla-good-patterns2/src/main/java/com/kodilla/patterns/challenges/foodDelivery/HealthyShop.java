package com.kodilla.patterns.challenges.foodDelivery;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop {

    private Repository repository;
    private Service service;
    private List<Product> productList = new ArrayList<>();

    public HealthyShop(Repository repository, Service service) {
        this.repository = repository;
        this.service = service;
    }

    public String sendEmail(Product product) {
        return "zamówiono " + product;
    }

    public List<Product> getHsProductList() {
        productList.add(new Product("fish", 60));
        productList.add(new Product("juice", 3));
        productList.add(new Product("carrot", 15));
        return new ArrayList<Product>(productList);
    }

    public void process(Product product){

        boolean isOrdered = service.order(product);
        if (isOrdered){
            repository.addOrder(product);
            sendEmail(product);
        }
    }
}


