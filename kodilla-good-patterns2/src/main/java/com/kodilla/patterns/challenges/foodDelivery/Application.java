package com.kodilla.patterns.challenges.foodDelivery;

public class Application {
    public static void main(String[] args) {


            DeliveryProcessor deliveryProcessor = new DeliveryProcessor(new OrderRepository() {
                    @Override
                    public boolean addOrder(Delivery delivery) {
                            return false;
                    }
            }, new OrderService() {
                    @Override
                    public boolean order(Delivery delivery) {
                            return false;
                    }
            }, new MessageSender() {
                    @Override
                    public void sendMessage(Delivery delivery) {
                      System.out.println("drogi dostawco, masz nowe zamówienie");
                    }
            });

            DeliveryOrder deliveryOrder = new DeliveryOrder();
            deliveryProcessor.process(deliveryOrder.retrieveDelivery());

    }
}
