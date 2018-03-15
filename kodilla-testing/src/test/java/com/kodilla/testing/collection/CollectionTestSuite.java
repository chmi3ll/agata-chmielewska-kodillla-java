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
        finalList.clear();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        oddNumbersExterminator.exterminate(finalList);
        //When
        for(Integer testEmptyList: finalList) {
            System.out.println("Testing " + testEmptyList);

            //Then
            Assert.assertNull(testEmptyList);
        }
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        ArrayList<Integer> finalList = new ArrayList<Integer>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        oddNumbersExterminator.exterminate(finalList);
        //When
//        for (Integer testExtList : oddNumbersExterminator.exterminate(finalList)) {
//            System.out.println("Testing " + testExtList);
//        }
        ArrayList<Integer> testList = new ArrayList<Integer>();
        testList.add(6);
        testList.add(4);
        //Then
        Assert.assertEquals(oddNumbersExterminator.exterminate(finalList), testList);

    }
}
