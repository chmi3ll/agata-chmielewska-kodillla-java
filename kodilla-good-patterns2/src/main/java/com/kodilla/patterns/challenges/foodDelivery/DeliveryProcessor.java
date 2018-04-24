package com.kodilla.patterns.challenges.foodDelivery;

public class DeliveryProcessor {
    private OrderRepository orderRepository;
    private OrderService orderService;
    private MessageSender messageSender;

    public DeliveryProcessor(OrderRepository orderRepository, OrderService orderService, MessageSender messageSender) {
        this.orderRepository = orderRepository;
        this.orderService = orderService;
        this.messageSender = messageSender;
    }

    public void process(Delivery delivery){

    boolean isOrdered = orderService.order(delivery);
        if (delivery.getName() == "ExtraFoodShop"){
            if (isOrdered){
            orderRepository.addOrder(delivery);
                System.out.println("zamówienie wysłane");
            }
        }
        if (delivery.getName() == "HealthyShop"){
            if (isOrdered){
            orderRepository.addOrder(delivery);
            messageSender.sendMessage(delivery);
            System.out.println("zamówienie wysłane");
            }
        }
        if (delivery.getName() == "GlutenFreeShop"){
            if (isOrdered){
                messageSender.sendMessage(delivery);
                System.out.println("zamówienie wysłane");
            }
        }
    }
}
