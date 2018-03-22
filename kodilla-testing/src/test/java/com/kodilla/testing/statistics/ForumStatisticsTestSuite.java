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
    public void testCalculateAdvStatisticsZeroPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> logins = new ArrayList<String>();
                logins.add("TomekG");
                logins.add("Gabryska");
                logins.add("Boo");
                logins.add("Kuba");

        int posty = 0;
        int komentarze = 3;
        when(statisticsMock.userNames()).thenReturn(logins);
        when(statisticsMock.postCount()).thenReturn(posty);
        when(statisticsMock.commentsCount()).thenReturn(komentarze);
        CalculateAdvStatistics calculate = new CalculateAdvStatistics(statisticsMock);
        calculate.calculateAdvStatistics(statisticsMock);

        double result = calculate.getUserPostAverage();
        Assert.assertEquals(0, result, 0);
        double result2 = calculate.getUserCommentAverage();
        Assert.assertEquals(0.75, result2, 0);
        double result3 = calculate.getPostCommentAverage();
        Assert.assertEquals(0, result3, 0);
        }

    @Test
    public void testCalculateAdvStatisticsTousendPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> logins = new ArrayList<String>();
        logins.add("TomekG");
        logins.add("Gabryska");
        logins.add("Boo");
        logins.add("Kuba");

        int posty = 1000;
        int komentarze = 3;
        when(statisticsMock.userNames()).thenReturn(logins);
        when(statisticsMock.postCount()).thenReturn(posty);
        when(statisticsMock.commentsCount()).thenReturn(komentarze);
        CalculateAdvStatistics calculate = new CalculateAdvStatistics(statisticsMock);
        calculate.calculateAdvStatistics(statisticsMock);

        double result = calculate.getUserPostAverage();
        Assert.assertEquals(250, result, 0);
        double result2 = calculate.getUserCommentAverage();
        Assert.assertEquals(0.75, result2, 0);
        double result3 = calculate.getPostCommentAverage();
        Assert.assertEquals(0.003, result3, 0);
    }

    @Test
    public void testCalculateAdvStatisticsNoComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> logins = new ArrayList<String>();
        logins.add("TomekG");
        logins.add("Gabryska");
        logins.add("Boo");
        logins.add("Kuba");

        int posty = 1000;
        int komentarze = 0;
        when(statisticsMock.userNames()).thenReturn(logins);
        when(statisticsMock.postCount()).thenReturn(posty);
        when(statisticsMock.commentsCount()).thenReturn(komentarze);
        CalculateAdvStatistics calculate = new CalculateAdvStatistics(statisticsMock);
        calculate.calculateAdvStatistics(statisticsMock);

        double result = calculate.getUserPostAverage();
        Assert.assertEquals(250, result, 0);
        double result2 = calculate.getUserCommentAverage();
        Assert.assertEquals(0, result2, 0);
        double result3 = calculate.getPostCommentAverage();
        Assert.assertEquals(0, result3, 0);
    }

    @Test
    public void testCalculateAdvStatisticsMorePosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> logins = new ArrayList<String>();
        logins.add("TomekG");
        logins.add("Gabryska");
        logins.add("Boo");
        logins.add("Kuba");

        int posty = 1000;
        int komentarze = 800;
        when(statisticsMock.userNames()).thenReturn(logins);
        when(statisticsMock.postCount()).thenReturn(posty);
        when(statisticsMock.commentsCount()).thenReturn(komentarze);
        CalculateAdvStatistics calculate = new CalculateAdvStatistics(statisticsMock);
        calculate.calculateAdvStatistics(statisticsMock);

        double result = calculate.getUserPostAverage();
        Assert.assertEquals(250, result, 0);
        double result2 = calculate.getUserCommentAverage();
        Assert.assertEquals(200, result2, 0);
        double result3 = calculate.getPostCommentAverage();
        Assert.assertEquals(0.8, result3, 0);
    }
    @Test
    public void testCalculateAdvStatisticsMoreComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> logins = new ArrayList<String>();
        logins.add("TomekG");
        logins.add("Gabryska");
        logins.add("Boo");
        logins.add("Kuba");

        int posty = 1000;
        int komentarze = 8000;
        when(statisticsMock.userNames()).thenReturn(logins);
        when(statisticsMock.postCount()).thenReturn(posty);
        when(statisticsMock.commentsCount()).thenReturn(komentarze);
        CalculateAdvStatistics calculate = new CalculateAdvStatistics(statisticsMock);
        calculate.calculateAdvStatistics(statisticsMock);

        double result = calculate.getUserPostAverage();
        Assert.assertEquals(250, result, 0);
        double result2 = calculate.getUserCommentAverage();
        Assert.assertEquals(2000, result2, 0);
        double result3 = calculate.getPostCommentAverage();
        Assert.assertEquals(8, result3, 0);
    }

    @Test
    public void testCalculateAdvStatisticsNoUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> logins = new ArrayList<String>();

        int posty = 1000;
        int komentarze = 3;
        when(statisticsMock.userNames()).thenReturn(logins);
        when(statisticsMock.postCount()).thenReturn(posty);
        when(statisticsMock.commentsCount()).thenReturn(komentarze);
        CalculateAdvStatistics calculate = new CalculateAdvStatistics(statisticsMock);
        calculate.calculateAdvStatistics(statisticsMock);

        //When
        //       int result = calculate.getNumberOfUsers();
        //       Assert.assertEquals(4, result);

        double result = calculate.getUserPostAverage();
        Assert.assertEquals(0, result, 0);
        double result2 = calculate.getUserCommentAverage();
        Assert.assertEquals(0, result2, 0);
        double result3 = calculate.getPostCommentAverage();
        Assert.assertEquals(0.003, result3, 0);
    }

    @Test
    public void testCalculateAdvStatisticsHundresUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> logins = new ArrayList<String>();
        for (int i=0; i<100; i++){
            logins.add("urzyszkodnik" + i);
        }

        int posty = 1000;
        int komentarze = 3;
        when(statisticsMock.userNames()).thenReturn(logins);
        when(statisticsMock.postCount()).thenReturn(posty);
        when(statisticsMock.commentsCount()).thenReturn(komentarze);
        CalculateAdvStatistics calculate = new CalculateAdvStatistics(statisticsMock);
        calculate.calculateAdvStatistics(statisticsMock);

        double result = calculate.getUserPostAverage();
        Assert.assertEquals(10, result, 0);
        double result2 = calculate.getUserCommentAverage();
        Assert.assertEquals(0.03, result2, 0);
        double result3 = calculate.getPostCommentAverage();
        Assert.assertEquals(0.003, result3, 0);
    }
}
