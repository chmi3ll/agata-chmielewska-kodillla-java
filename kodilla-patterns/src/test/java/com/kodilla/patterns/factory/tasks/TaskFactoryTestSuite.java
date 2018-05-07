package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.getTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals(painting.getTaskName(), "malowanie u Kowalskich");
        Assert.assertEquals(painting.executeTask(), "cale mieszkanie uzywajac koloru zolty");
        Assert.assertTrue(painting.isTaskExecuted());
    }

    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.getTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals(shopping.getTaskName(), "zakupy w ikei");
        Assert.assertEquals(shopping.executeTask(), "do kupienia: fotel ilosc : 1.0");
        Assert.assertTrue(shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.getTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals(driving.getTaskName(), "podjechac do dziadka");
        Assert.assertEquals(driving.executeTask(), "przejazdzka do dziadek uzywajac moje auto");
        Assert.assertTrue(driving.isTaskExecuted());
    }
}
