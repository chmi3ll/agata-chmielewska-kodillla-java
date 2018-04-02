package com.kodilla.testing.zadania;

import org.junit.Assert;
import org.junit.Test;

public class TestDoLiczbPierwszych {
    @Test
    public void czyLiczbaPierwsza(){
        LiczbyPierwsze liczbaPierwsze = new LiczbyPierwsze();
         boolean result = liczbaPierwsze.liczbyPierwsze(15);
        Assert.assertFalse(result);

    }
    @Test
    public void czyNieLiczbaPierwsza() {
        LiczbyPierwsze liczbaPierwsze = new LiczbyPierwsze();
        boolean result = liczbaPierwsze.liczbyPierwsze(17);
        Assert.assertTrue(result);
    }
}
