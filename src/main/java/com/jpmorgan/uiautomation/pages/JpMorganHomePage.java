package com.jpmorgan.uiautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JpMorganHomePage {
    WebDriver webDriver;
    By byClassNameDesktopLogo = By.className("logo-desktop-only");
    By byClassNameLogo = By.className("first-logo");

    public JpMorganHomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public boolean getLogo() {
        return webDriver.findElement(byClassNameDesktopLogo).findElement(byClassNameLogo).isDisplayed();
    }

}
