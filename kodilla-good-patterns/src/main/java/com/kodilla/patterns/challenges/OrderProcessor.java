package com.kodilla.patterns.challenges;

public class OrderProcessor {

    private MailService mailService;
    private OrderRepository orderRepository;
    private OrderService orderService;

    public OrderProcessor(MailService mailService, OrderRepository orderRepository, OrderService orderService) {
        this.mailService = mailService;
        this.orderRepository = orderRepository;
        this.orderService = orderService;
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
