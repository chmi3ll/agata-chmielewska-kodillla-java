package com.kodilla.patterns.challenges.foodDelivery;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop {
    private Repository repository;
    private Service service;
    private List<Product> productList = new ArrayList();

    public ExtraFoodShop(Repository repository, Service service) {
        this.repository = repository;
        this.service = service;
    }

    public List<Product> getEfsProductList() {
        productList.add(new Product("chicken", 15));
        productList.add(new Product("salad", 2));
        productList.add(new Product("potatoes", 1));
        return new ArrayList<Product>(productList);
    }

    public void process(Product product){

        boolean isOrdered = service.order(product);
        if (isOrdered){
            repository.addOrder(product);
        }
    }
}

