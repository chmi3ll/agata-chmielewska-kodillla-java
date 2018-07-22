package com.kodilla.patterns3.decorator.pizza;

public class PizzaPeperoni extends AbstractPizzaOrderDecorator {
    public PizzaPeperoni(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getCost() {
        return pizzaOrder.getCost() + 4.5;
    }

    @Override
    public String getDescription() {
        return pizzaOrder.getDescription() + " + salami";
    }
}
