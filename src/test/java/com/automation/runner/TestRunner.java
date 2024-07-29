package com.automation.runner;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/automation/features",
        glue = {"stepDefinition", "utility"},
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"})
public class TestRunner {
}
