package com.example.selenium;

import com.example.selenium.pages.LoginPage;
import com.example.selenium.pages.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PlainLoginTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriverManager.chromedriver().clearResolutionCache().setup();
        driver = new ChromeDriver();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void loginTest() {
        driver.get("https://the-internet.herokuapp.com/login");
        driver.manage().window().setSize(new Dimension(840, 1027));

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("tomsmith")
                .setPassword("SuperSecretPassword!")
                .clickLogin();

        MainPage mainPage = new MainPage(driver);
        assertEquals(mainPage.getTitle(), "Secure Area", "Login failed");

        mainPage.clickLogout();
    }
}
