package example;

import org.testng.annotations.Test;

public class TestClassThree {

    @Test(priority = 3)
    public void testMethodOne() {
        System.out.println("Test method with priority 3");
    }

    @Test(priority = 2)
    public void testMethodTwo() {
        System.out.println("Test method with priority 2");
    }

    @Test(priority = 1)
    public void testMethodThree() {
        System.out.println("Test method with priority 1");
    }
}
