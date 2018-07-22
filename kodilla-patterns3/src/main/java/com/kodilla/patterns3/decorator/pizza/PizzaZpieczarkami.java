package com.kodilla.patterns3.decorator.pizza;

public class PizzaZpieczarkami extends AbstractPizzaOrderDecorator {
    public PizzaZpieczarkami(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getCost() {
        return pizzaOrder.getCost() + 4;
    }

    @Override
    public String getDescription() {
        return pizzaOrder.getDescription() + " + pieczarki";

    }
}
