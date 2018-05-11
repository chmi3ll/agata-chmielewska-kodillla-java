package com.kodilla.patterns.challenges.foodDelivery;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop {
    private OrderRepository orderRepository;
    private OrderService orderService;
    private List<Product> productList = new ArrayList();

    public ExtraFoodShop(OrderRepository orderRepository, OrderService orderService) {
        this.orderRepository = orderRepository;
        this.orderService = orderService;
    }

    public List<Product> getEfsProductList() {
        productList.add(new Product("chicken", 15));
        productList.add(new Product("salad", 2));
        productList.add(new Product("potatoes", 1));
        return new ArrayList<Product>(productList);
    }

    public void process(Product product){

        boolean isOrdered = orderService.order(product);
        if (isOrdered){
            orderRepository.addOrder(product);
        }
    }
}

