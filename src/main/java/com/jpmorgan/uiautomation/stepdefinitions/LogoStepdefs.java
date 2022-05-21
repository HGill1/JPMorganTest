package com.jpmorgan.uiautomation.stepdefinitions;

import com.jpmorgan.uiautomation.pages.GoogleHomePage;
import com.jpmorgan.uiautomation.pages.JpMorganHomePage;
import com.jpmorgan.uiautomation.pages.ResultPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoStepdefs {
    WebDriver driver;

    @Before
    public void beforeScenario() {
        WebDriverManager.chromiumdriver().setup();
        ChromeDriverManager.chromedriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void afterScenario() {
        driver.quit();
    }

    @Given("I navigate to google URL")
    public void iNavigateToGoogleURL() {
        driver.get("https://www.google.com");
    }

    @When("I search for {string} on google website")
    public void iSearchForOnGoogleWebsite(String searchText) {
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        googleHomePage.searchText(searchText);
    }

    @And("I select the first result displayed")
    public void iSelectTheFirstResultDisplayed() {
        ResultPage resultPage = new ResultPage(driver);
        resultPage.selectSearch();
    }

    @Then("I can see the JP Morgan logo is displayed on the website")
    public void iCanSeeTheJPMorganLogoIsDisplayedOnTheWebsite() {
        JpMorganHomePage jpMorganHomePage = new JpMorganHomePage(driver);
        Assert.isTrue(jpMorganHomePage.getLogo(), "Logo is not visible");
    }
}
