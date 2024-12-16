package com.example.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageView {
    AppiumDriver driver;


    @FindBy(id = "text_field_id")
    private WebElement textField;

    public PageView(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String getTextField() {
        return textField.getText();
    }

    public PageView setTextField(String text) {
        textField.clear();
        textField.sendKeys(text);
        return this;
    }
}
