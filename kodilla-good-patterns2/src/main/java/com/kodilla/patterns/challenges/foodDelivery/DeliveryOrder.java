package com.kodilla.patterns.challenges.foodDelivery;

public class DeliveryOrder {

    Product product1 = new Product("chicken", 3, 15);
    Product product2 = new Product("salad", 10, 2);
    Product product3 = new Product("potatoes", 40, 2);

    Product product4 = new Product("cheese", 15, 30);
    Product product5 = new Product("sausage", 10, 35);
    Product product6 = new Product("ham", 15, 40);

    Product product7 = new Product("fish", 20, 60);
    Product product8 = new Product("juice", 100, 3);
    Product product9 = new Product("carrot", 45, 1.5);

    public Delivery retrieveDelivery() {
        ProductList extraFoodShop = new ProductList("ExtraFoodShop");
        extraFoodShop.addProduct(new Product("chicken", 3, 15));
        extraFoodShop.addProduct(product2);
        extraFoodShop.addProduct(product3);

        ProductList healthyShop = new ProductList("HealthyShop");
        healthyShop.addProduct(product4);
        healthyShop.addProduct(product5);
        healthyShop.addProduct(product6);

        ProductList glutenFreeShop = new ProductList("GlutenFreeShop");
        glutenFreeShop.addProduct(product7);
        glutenFreeShop.addProduct(product8);
        glutenFreeShop.addProduct(product9);

        Delivery delivery1 = new Delivery("ExtraFood", extraFoodShop);
        Delivery delivery2 = new Delivery("Healthy", healthyShop);
        Delivery delivery3 = new Delivery("GlutenFree", glutenFreeShop);

    return delivery1;
    }
}
