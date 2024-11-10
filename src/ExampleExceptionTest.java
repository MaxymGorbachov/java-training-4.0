import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class ExampleExceptionTest {

    /**
     * Test data for positive test.
     *
     * @return test data array
     */
    @DataProvider(name = "data")
    public static Object[][] data() {
        return new Object[][]{
                {2, 2, 4},
                {2, 3, 6},
                {7, 6, 42},
                {8, 10, 80},
                {0,0,0}
        };
    }

    /**
     * Test data for exception test.
     *
     * @return test data array
     */
    @DataProvider(name = "negativeData")
    public static Object[][] negativeData() {
        return new Object[][]{
                {-2, 2},
                {2, -2},
                {0, -3},
                {-7, -15}
        };
    }

    @Test(dataProvider = "data")
    public void testRectangleArea(int a, int b, int expectedArea) {
        assertEquals(ExampleException.rectangleArea(a, b), expectedArea, "Area calculation is incorrect.");
    }


    @Test(dataProvider = "negativeData")
    public void testRectangleAreaNegative(int a, int b) {
        assertThrows(IllegalArgumentException.class, () -> {
            ExampleException.rectangleArea(a, b);
        });
    }
}
