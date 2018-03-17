import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Square;
import org.junit.*;
import org.junit.Test;

import java.util.ArrayList;


// import java.util.ArrayList;


public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector figury = new ShapeCollector("square", 56);
        Square kwadrat = new Square();
        //When
        figury.addFigure(kwadrat);

        //Then
        Assert.assertEquals(56, kwadrat.getField());
//        Assert.assertEquals("square", kwadrat.getShapeName());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector figury = new ShapeCollector("square", 56);
        Square kwadrat = new Square();
        //When
        boolean result = figury.removeFigure(kwadrat);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testgetFigure() {
        //Given
        ShapeCollector figury = new ShapeCollector("square", 56);
        Square kwadrat = new Square();
        //When
        figury.getFigure(1);
        //Then
        Assert.assertEquals(kwadrat, figury.getFigure(0));
    }
}


