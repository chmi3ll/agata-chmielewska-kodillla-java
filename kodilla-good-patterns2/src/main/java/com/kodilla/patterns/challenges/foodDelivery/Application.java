package com.kodilla.patterns.challenges.foodDelivery;

public class Application {

    public static void main(String[] args) {
        Repository repository = new Repository();
        Service service = new Service();

            Product someProduct = new Product("salad", 1);

            ExtraFoodShop extraFoodShop = new ExtraFoodShop(repository, service);
            GlutenFreeShop glutenFreeShop = new GlutenFreeShop(repository, service);
            HealthyShop healthyShop = new HealthyShop(repository, service);

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
