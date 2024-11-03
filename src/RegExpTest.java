import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RegExpTest {

    /**
     * Test data.
     *
     * @return test data array
     */
    @DataProvider(name = "text")
    public static Object[][] text() {
        return new Object[][]{
                {"8.8.8.8", "8.8.8.8"},
                {"http://192.168.1.1/index.html", "192.168.1.1"},
                {"This text contains a valid IP address 254.254.254.254, find it!", "254.254.254.254"},
                {"IP could not have negative numbers like -1.-2.-3.-4", ""},
                {" Invalid IP: 300.300.300.300!", ""},
                {" Invalid IP: 256.256.256.256!", ""},
                {"invalid:256.256.256.256", ""},
                {"valid IP: 255.255.255.255!", "255.255.255.255"},
                {"invalid:255.255.255.255", "255.255.255.255"},
                {"10.10.1.1","10.10.1.1"},
                {"The 0.x.x.x is not a valid IP address. 0.0.0.0", ""},
                {"0.125.365.256",""}
        };
    }

    @Test(dataProvider = "text")
    public void testSumArray(String text, String expectedResult) {
        String actualResult = RegExp.getIpAddress(text);

        assertEquals(actualResult, expectedResult, "IP address is not correct");
    }
}