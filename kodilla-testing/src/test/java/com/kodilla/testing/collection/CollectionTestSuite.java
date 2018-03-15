package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        list.clear();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        oddNumbersExterminator.exterminate(list)
        //When
        for(OddNumbersExterminator testEmptyList: numbers)
        System.out.println("Testing " testEmptyList);
        //Then
        Assert.assertEquals(null, testOddNumbersExterminatorEmptyList(););

    }

          //  testOddNumbersExterminatorNormalList
}
