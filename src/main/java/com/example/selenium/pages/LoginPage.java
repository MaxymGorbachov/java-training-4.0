package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BasePage {

        @FindBy(id = "username")
        private WebElement usernameField;

        @FindBy(id = "password")
        private WebElement passwordField;

        @FindBy(css = ".fa")
        private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public LoginPage setUsername(String username) {
        usernameField.sendKeys(username);
        return this;
    }

    public LoginPage setPassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public MainPage clickLogin() {
        loginButton.click();
        return new MainPage(driver);
    }
}
