package com.jpmorgan.uiautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage {
    WebDriver webDriver;
    By byXpathConsent = By.xpath("//*[text()='I agree']");
    By byTagSearchInput = By.tagName("input");

    public GoogleHomePage(WebDriver driver) {
        this.webDriver = driver;
    }

    public void searchText(String text) {
        webDriver.findElement(byXpathConsent).click();
        WebElement searchBox = webDriver.findElement(byTagSearchInput);
        searchBox.sendKeys(text);
        searchBox.submit();
    }
}
