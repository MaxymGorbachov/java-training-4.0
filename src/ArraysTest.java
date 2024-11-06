import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArraysTest {

    /**
     * Test data for common array elements.
     *
     * @return test data array
     */
    @DataProvider(name = "ArrayUtil")
    public static Object[][] arrays() {
        return new Object[][]{
                {
                        new String[]{"Python", "JAVA", "PHP", "C#", "C++", "SQL"},
                        new String[]{"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"},
                        new String[]{"JAVA", "SQL"}
                },
                {
                        new String[]{"here", "is", "some", "text", ".", "text"},
                        new String[]{"some", "text", "above", "."},
                        new String[]{"some", "text", "."}
                },
                {
                        new String[]{"red", "blue", "green", "yellow"},
                        new String[]{"purple", "blue", "orange", "green","blue"},
                        new String[]{"blue", "green"}
                },
                {
                        new String[]{"a", "a", "b", "c", "d", "d"},
                        new String[]{"d", "b", "c", "e"},
                        new String[]{"b", "c", "d"}
                },
                {
                        new String[]{},
                        new String[]{"a", "b", "c"},
                        new String[]{}
                },
                {
                        new String[]{"a", "b", "c", "d"},
                        new String[]{"a", "b", "c", "d"},
                        new String[]{"a", "b", "c", "d"}
                }
        };
    }

    @Test(dataProvider = "ArrayUtil")
    public void testFindCommon(String[] array1, String[] array2, String[] expectedResult) {

        assertEquals(ArrayUtil.findCommon(array1, array2), expectedResult,
                "Common elements are not correct");
    }
}