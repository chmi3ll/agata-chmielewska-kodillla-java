package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        Logger logger = new Logger();
        for (int i=0; i<10; i++) {
            logger.getInstance().log("czynność " + i);
        }
        String result = logger.getInstance().getLastLog();

        Assert.assertEquals("czynność 9", result);
    }
}
