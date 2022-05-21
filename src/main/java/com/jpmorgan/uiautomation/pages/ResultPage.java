package com.jpmorgan.uiautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultPage {
    WebDriver webDriver;
    By byTagNameResult = By.tagName("h3");

    public ResultPage(WebDriver driver) {
        this.webDriver = driver;
    }

    public void selectSearch() {
        webDriver.findElement(By.tagName("h3")).click();
    }
}
