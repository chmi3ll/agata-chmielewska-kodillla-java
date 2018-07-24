package com.kodilla.patterns3.decorator.pizza;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaBasicPeperoniGetCost () {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaPeperoni(pizzaOrder);
        //When
        double pizzaCost = pizzaOrder.getCost();
        //Then
        assertEquals(19.5, pizzaCost, 0.01);
    }

    @Test
    public void testPizzaBasicZpieczarkamiGetCost () {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaZpieczarkami(pizzaOrder);
        //When
        double pizzaCost = pizzaOrder.getCost();
        //Then
        assertEquals(19, pizzaCost, 0.01);
    }

    @Test
    public void testPizzaBasicPeperoniZpieczarkamiGetCost () {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaPeperoni(pizzaOrder);
        pizzaOrder = new PizzaZpieczarkami(pizzaOrder);
        //When
        double pizzaCost = pizzaOrder.getCost();
        //Then
        assertEquals(23.5, pizzaCost, 0.01);
    }

    @Test
    public void testPizzaBasicPeperoniGetDescription () {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaPeperoni(pizzaOrder);
        //When
        String pizzaDescription = pizzaOrder.getDescription();
        //Then
        assertEquals("pizza z serem i sosem pomidorowym + salami", pizzaDescription);
    }

    @Test
    public void testPizzaBasicZpieczarkamiGetDescription () {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaZpieczarkami(pizzaOrder);
        //When
        String pizzaDescription = pizzaOrder.getDescription();
        //Then
        assertEquals("pizza z serem i sosem pomidorowym + pieczarki", pizzaDescription);
    }

    @Test
    public void testPizzaBasicPeperoniZpieczarkamiGetSescription () {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaPeperoni(pizzaOrder);
        pizzaOrder = new PizzaZpieczarkami(pizzaOrder);
        //When
        String pizzaDescription = pizzaOrder.getDescription();
        //Then
        assertEquals("pizza z serem i sosem pomidorowym + salami + pieczarki", pizzaDescription);

    }
}
