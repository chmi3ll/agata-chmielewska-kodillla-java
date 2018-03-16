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
        ArrayList<Integer> finalList = new ArrayList<Integer>();
        //When
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> testEmptyList = oddNumbersExterminator.exterminate(finalList);
        //Then
        Assert.assertTrue(testEmptyList.size()==0);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> finalList = new ArrayList<Integer>();
        finalList.add(1);
        finalList.add(3);
        finalList.add(4);
        finalList.add(10);
        finalList.add(14);
        finalList.add(15);
        //When
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList <Integer> result = oddNumbersExterminator.exterminate(finalList);

        ArrayList<Integer> testList = new ArrayList<Integer>();
        testList.add(4);
        testList.add(10);
        testList.add(14);
        //Then
        Assert.assertEquals(result, testList);

    }
}
