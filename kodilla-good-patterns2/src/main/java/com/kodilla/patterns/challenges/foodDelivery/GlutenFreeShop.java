package com.kodilla.patterns.challenges.foodDelivery;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop {
    private OrderRepository orderRepository;
    private OrderService orderService;
    private List<Product> productList = new ArrayList<>();

    public GlutenFreeShop(OrderRepository orderRepository, OrderService orderService) {
        this.orderRepository = orderRepository;
        this.orderService = orderService;
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

        boolean isOrdered = orderService.order(product);
        if (isOrdered){
            orderRepository.addOrder(product);
            sendSms(product);
        }
    }
}

