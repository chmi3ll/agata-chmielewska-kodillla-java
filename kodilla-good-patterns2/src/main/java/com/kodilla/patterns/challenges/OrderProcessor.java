package com.kodilla.patterns.challenges;

public class OrderProcessor {

    private MailService mailService;
    private OrderService orderService;
    private OrderRepository orderRepository;


    public OrderProcessor(MailService mailService, OrderService orderService, OrderRepository orderRepository) {
        this.mailService = mailService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;

    }

    public OrderDTO process(final OrderRequest orderRequest){
        boolean isOrdered = orderService.buy(orderRequest.getUser(), orderRequest.getDate(), orderRequest.getTime(), orderRequest.getCash());
        if (isOrdered) {
            mailService.inform(orderRequest.getUser());
            orderRepository.addOrder(orderRequest.getUser(), orderRequest.getDate(), orderRequest.getTime(), orderRequest.getCash());
            return new OrderDTO(orderRequest.getUser(), true);
        } else {
            return new OrderDTO(orderRequest.getUser(), false);
        }
    }
}
