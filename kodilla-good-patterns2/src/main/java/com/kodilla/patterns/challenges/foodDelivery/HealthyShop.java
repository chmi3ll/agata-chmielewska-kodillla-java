package com.kodilla.patterns.challenges.foodDelivery;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop {

    private OrderRepository orderRepository;
    private OrderService orderService;
    private List<Product> productList = new ArrayList<>();

    public HealthyShop(OrderRepository orderRepository, OrderService orderService) {
        this.orderRepository = orderRepository;
        this.orderService = orderService;
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

        boolean isOrdered = orderService.order(product);
        if (isOrdered){
            orderRepository.addOrder(product);
            sendEmail(product);
        }
    }
}


