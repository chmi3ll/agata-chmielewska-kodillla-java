package com.kodilla.patterns3.decorator.pizza;

public class BasicPizzaOrder implements PizzaOrder {

    @Override
    public double getCost() {
        return 15;
    }

    @Override
    public String getDescription() {
        return "pizza z serem i sosem pomidorowym";
    }
}
