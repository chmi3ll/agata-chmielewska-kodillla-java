package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("pelnoziarnista")
                .burgers(2)
                .sauce("czosnkowy")
                .ingredient("salata")
                .ingredient("bekon")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(2, howManyIngredients);
    }
}
