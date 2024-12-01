package example;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestClassOne {

    @BeforeMethod(groups = {"group1", "group2"})
    public void setup() {
        System.out.println("Setup method executed for group1 and group2");
    }

    @AfterMethod(groups = {"group1"})
    public void teardownGroup1() {
        System.out.println("Teardown method executed for group1");
    }

    @AfterMethod(groups = {"group2"})
    public void teardownGroup2() {
        System.out.println("Teardown method executed for group2");
    }

    @Test(groups = "group1")
    public void testMethodGroup1() {
        System.out.println("Test method executed for group1");
    }

    @Test(groups = "group2")
    public void testMethodGroup2() {
        System.out.println("Test method executed for group2");
    }
}