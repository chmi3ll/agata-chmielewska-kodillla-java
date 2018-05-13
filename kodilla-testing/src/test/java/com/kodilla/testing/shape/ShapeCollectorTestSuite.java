import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;
import org.junit.*;


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
        ShapeCollector figury = new ShapeCollector();
        Square kwadrat = new Square("square", 56);
        //When
        figury.addFigure(kwadrat);

        //Then
        Assert.assertEquals(1, figury.getSize());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector figury = new ShapeCollector();
        Square kwadrat = new Square("square", 56);
        figury.addFigure(kwadrat);
        //When
        figury.removeFigure(kwadrat);

        //Then
        Assert.assertEquals(0, figury.getSize());
    }

    @Test
    public void testgetFigure() {
        //Given
        ShapeCollector figury = new ShapeCollector();
        Square kwadrat = new Square("square", 56);
        figury.addFigure(kwadrat);
        //When
        figury.getFigure(0);
        //Then
        Assert.assertEquals(kwadrat, figury.getFigure(0));
    }

    @Test
    public void testShowFigures(){
        ShapeCollector figury = new ShapeCollector();
        Square kwadrat = new Square("square", 56);
        Circle kolo = new Circle("circle", 10);
        Triangle trojkat = new Triangle("triangle", 38);
        //When
        figury.addFigure(kwadrat);
        figury.addFigure(kolo);
        figury.addFigure(trojkat);
        String pokaz = figury.showFigures();

        //Then
        String listaFigur = "squarecircletriangle";
        Assert.assertEquals(listaFigur, pokaz);

    }
}
