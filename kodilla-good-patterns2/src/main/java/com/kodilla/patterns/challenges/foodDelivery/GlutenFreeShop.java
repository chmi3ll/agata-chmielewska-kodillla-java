package com.kodilla.patterns.challenges.foodDelivery;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop {
    private Repository repository;
    private Service service;
    private List<Product> productList = new ArrayList<>();

    public GlutenFreeShop(Repository repository, Service service) {
        this.repository = repository;
        this.service = service;
    }

    public String sendSms(Product product) {
        return "klient zamówil u ciebie " + product;
    }

    public List<Product> getGfProductList() {
        productList.add(new Product("cheese", 30));
        productList.add(new Product("sausage", 35));
        productList.add(new Product("ham", 40));
        return new ArrayList<Product>(productList);
    }

    public void process(Product product){

        boolean isOrdered = service.order(product);
        if (isOrdered){
            repository.addOrder(product);
            sendSms(product);
        }
    }
}

