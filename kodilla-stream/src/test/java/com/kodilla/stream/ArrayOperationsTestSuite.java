package com.kodilla.stream;

import com.kodilla.stream.array.ArrayOperations;
import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite{
    @Test
    public void testGetAverage(){
      //Given

        int[] numbersy = new int[12];
        numbersy[0]=1;
        numbersy[1]=2;
        numbersy[2]=3;
        numbersy[3]=4;
        numbersy[4]=5;
        numbersy[5]=6;
        numbersy[6]=7;
        numbersy[7]=8;
        numbersy[8]=50;
        numbersy[9]=85;
        numbersy[10]=13;
        numbersy[11]=0;

        //When
        double average = ArrayOperations.getAverage(numbersy);
       //Then

        Assert.assertEquals( 15.33, average, 0.004);
    }
}
