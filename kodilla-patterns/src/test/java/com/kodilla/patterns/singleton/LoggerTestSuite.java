package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        for (int i=0; i<10; i++) {
            Logger.getInstance().log("czynność " + i);
        }
        String result = Logger.getInstance().getLastLog();

        Assert.assertEquals("czynność 9", result);
    }
}
