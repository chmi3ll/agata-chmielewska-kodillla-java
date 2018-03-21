package com.kodilla.testing.statistics;

import com.kodilla.testing.forum.statistics.CalculateAdvStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    @Test
    public void testCalculateAdvStatisticsWithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> logins = new ArrayList<String>();
                logins.add("TomekG");
                logins.add("Gabryska");
                logins.add("Boo");
                logins.add("Kuba");
        when(statisticsMock.userNames()).thenReturn(logins);

        CalculateAdvStatistics calculate = new CalculateAdvStatistics(statisticsMock);

        //When
        int result = calculate.getNumberOfUsers();
        Assert.assertEquals(4, result);

        }
}
