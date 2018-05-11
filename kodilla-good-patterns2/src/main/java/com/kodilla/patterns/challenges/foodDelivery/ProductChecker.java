package com.kodilla.patterns.challenges.foodDelivery;

import java.util.ArrayList;
import java.util.List;

public class ProductChecker {
    private List<Product> productList = new ArrayList();

    public ProductChecker(List<Product> productList) {
        this.productList = productList;
    }

    public Product getProduct() {
        Product theProduct = null;
        for (int i = 0; i < productList.size(); i++) {
            theProduct = productList.get(i);
        }
        return theProduct;
    }

    public boolean checkProduct(Product someProduct) {
        if ((productList.size()) != 0) {
            if (getProduct().getProductName().equals(someProduct.getProductName()) && getProduct().getQuantity() == (someProduct.getQuantity())) {
                return true;
            }
        }
        return true;
    }
}
