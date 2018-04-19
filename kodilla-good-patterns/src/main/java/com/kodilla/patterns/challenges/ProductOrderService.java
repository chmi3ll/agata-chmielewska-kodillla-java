package com.kodilla.patterns.challenges;

public class ProductOrderService {

    private MailService mailService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(MailService mailService, OrderService orderService, OrderRepository orderRepository) {
    }

    public OrderDTO process(final OrderRequest orderRequest) {
        return null;
    }
}
