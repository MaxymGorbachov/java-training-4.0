package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainPage extends BasePage {

        @FindBy(css = "h2")
        private WebElement pageTitle;

        @FindBy(css = ".icon-2x")
        private WebElement logoutButton;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getTitle() {
        return pageTitle.getText();
    }

    public LoginPage clickLogout() {
        logoutButton.click();
        return new LoginPage(driver);
    }
}
