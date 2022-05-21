package com.jpmorgan.uiautomation.stepdefinitions;

import static org.junit.Assert.*;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "json:target/reports/cucumber-json-reports/json-report.json",
                "html:target/reports/cucumber-html-reports/html-report.html"
        },
        glue = {"com.jpmorgan.uiautomation.stepdefinitions"},
        features = {"src/main"}
)
public class RunTest {

}