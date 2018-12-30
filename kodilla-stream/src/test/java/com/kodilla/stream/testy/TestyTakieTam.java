package com.kodilla.stream.testy;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestyTakieTam {

    @Test
    public void testCountEmptyStringUsingJava8() {
        //given
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        //when
        long count = Main.getCountEmptyStringUsingJava8(strings);
        //then
        Assert.assertEquals(2, count);
    }

    @Test
    public void testCountLength3UsingJava8() {
        //given
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        //when
        long count = Main.getCountLength3UsingJava8(strings);
        //then
        Assert.assertEquals(3, count);
    }

    @Test
    public void testDeleteEmptyStringsUsingJava8() {
        //given
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> expected = Arrays.asList("abc", "bc", "efg", "abcd", "jkl");
        //when
        List<String> result = Main.deleteEmptyStringsUsingJava8(strings);
        //then
        Assert.assertEquals(5, result.size());
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testMergedStringUsingJava8() {
        //given
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        String expected = "abc,bc,efg,abcd,jkl";
        //when
        String result = Main.getMergedStringUsingJava8(strings, ",");
        //then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testSquaresJava8() {
        //given
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> expected = Arrays.asList(9, 4, 49, 25);
        //when
        List<Integer> result = Main.getSquaresJava8(numbers);
        //then
        Assert.assertEquals(4, result.size());
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testMaxJava8() {
        //given
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        Integer expected = 7;
        //when
        Integer result = Main.getMaxJava8(numbers);
        //then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testMinJava8() {
        //given
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        Integer expected = 2;
        //when
        Integer result = Main.getMinJava8(numbers);
        //then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testSumJava8() {
        //given
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        Integer expected = 25;
        //when
        Integer result = Main.getSumJava8(numbers);
        //then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testAverageJava8() {
        //given
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        Integer expected = 3;
        //when
        Integer result = Main.getAverageJava8(numbers);
        //then
        Assert.assertEquals(expected, result);
    }
    @Test
    public void testCountEmptyStringUsingJava7() {
        //given
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        //when
        long count = Main.getCountEmptyStringUsingJava7(strings);
        //then
        Assert.assertEquals(2, count);
    }

    @Test
    public void testCountLength3UsingJava7() {
        //given
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        //when
        long count = Main.getCountLength3UsingJava7(strings);
        //then
        Assert.assertEquals(3, count);
    }

    @Test
    public void testDeleteEmptyStringsUsingJava7() {
        //given
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> expected = Arrays.asList("abc", "bc", "efg", "abcd", "jkl");
        //when
        List<String> result = Main.deleteEmptyStringsUsingJava7(strings);
        //then
        Assert.assertEquals(5, result.size());
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testMergedStringUsingJava7() {
        //given
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        String expected = "abc,bc,efg,abcd,jkl";
        //when
        String result = Main.getMergedStringUsingJava7(strings, ",");
        //then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testSquares() {
        //given
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> expected = Arrays.asList(9, 4, 49, 25);
        //when
        List<Integer> result = Main.getSquares(numbers);
        //then
        Assert.assertEquals(4, result.size());
        Assert.assertEquals(expected, result);
    }
@Ignore
    @Test
    public void testMax() {
        //given
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        Integer expected = 7;
        //when
        Integer result = Main.getMax(numbers);
        //then
        Assert.assertEquals(expected, result);
    }
    @Ignore
    @Test
    public void testMin() {
        //given
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        Integer expected = 2;
        //when
        Integer result = Main.getMin(numbers);
        //then
        Assert.assertEquals(expected, result);
    }
    @Ignore
    @Test
    public void testSum() {
        //given
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        Integer expected = 25;
        //when
        Integer result = Main.getSum(numbers);
        //then
        Assert.assertEquals(expected, result);
    }
    @Ignore
    @Test
    public void testAverage() {
        //given
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        Integer expected = 3;
        //when
        Integer result = Main.getAverage(numbers);
        //then
        Assert.assertEquals(expected, result);
    }

}
