package com.example.selenium.steps;

import com.example.selenium.pages.LoginPage;
import com.example.selenium.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class UserSteps {
    private WebDriver driver;

    public UserSteps(WebDriver driver) {
        this.driver = driver;
    }

    public UserSteps login(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername(username)
                .setPassword(password);

        MainPage mainPage = loginPage.clickLogin();

        Assert.assertEquals(mainPage.getTitle(), "Secure Area", "Login failed: Title does not match.");

        return this;
    }

    public UserSteps logout() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickLogout();
        return this;
    }
}