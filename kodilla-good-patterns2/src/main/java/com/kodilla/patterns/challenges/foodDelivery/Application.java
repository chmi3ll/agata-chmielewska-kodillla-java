package com.kodilla.patterns.challenges.foodDelivery;

public class Application {

    public static void main(String[] args) {

            Product someProduct = new Product("salad", 1);

            ExtraFoodShop extraFoodShop = new ExtraFoodShop(new OrderRepository() {
                    @Override
                    public boolean addOrder(Product product) {
                            return true;
                    }
            }, new OrderService() {
                    @Override
                    public boolean order(Product product) {
                            return true;
                    }
            });
            GlutenFreeShop glutenFreeShop = new GlutenFreeShop(new OrderRepository() {
                    @Override
                    public boolean addOrder(Product product) {
                            return true;
                    }
            }, new OrderService() {
                    @Override
                    public boolean order(Product product) {
                            return true;
                    }
            });
            HealthyShop healthyShop = new HealthyShop(new OrderRepository() {
                    @Override
                    public boolean addOrder(Product product) {
                            return true;
                    }
            }, new OrderService() {
                    @Override
                    public boolean order(Product product) {
                            return true;
                    }
            });

            ProductChecker productChecker1 = new ProductChecker(extraFoodShop.getEfsProductList());
            boolean resultEFS = productChecker1.checkProduct(someProduct);

            ProductChecker productChecker2 = new ProductChecker(glutenFreeShop.getGfProductList());
            boolean resultGFS = productChecker2.checkProduct(someProduct);

            ProductChecker productChecker3 = new ProductChecker(healthyShop.getHsProductList());
            boolean resultHS = productChecker3.checkProduct(someProduct);

            if (resultEFS) {
                    extraFoodShop.process(someProduct);
            }
            if (resultGFS) {
                    glutenFreeShop.process(someProduct);
            }
            if (resultHS) {
                    healthyShop.process(someProduct);
            }
    }
}
