package com.automation.aaa.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/automation/aaa/features",
        glue = {"com.automation.aaa.utility", "com.automation.aaa.stepDefinition"},
        plugin = {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm" }
)
public class TestRunner {
}
