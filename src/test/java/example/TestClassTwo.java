package example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClassTwo {

    @Test
    @Parameters({"param1", "param2"})
    public void testMethodFromXml(String param1, String param2) {
        System.out.println("Test method from XML - Param1: " + param1 + ", Param2: " + param2);
    }

    @DataProvider(name = "dataProviderMethod")
    public Object[][] createData() {
        return new Object[][] {
                {"Data1", 1},
                {"Data2", 2}
        };
    }

    @Test(dataProvider = "dataProviderMethod")
    public void testMethodFromDataProvider(String data, int number) {
        System.out.println("Test method from DataProvider - Data: " + data + ", Number: " + number);
    }
}