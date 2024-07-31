package com.automation.aaa.stepDefinition;

import static com.automation.aaa.pages.OnlineProductPage.*;

import com.automation.aaa.pages.OnlineProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

public class OnlineProductPageSD {

    @When("User clicks on Formal Shoes drop down")
    public void user_clicks_on_formal_shoes_drop_down() {
        click_formal_shoes_dropdown();
    }
    @Then("User should be able to view the Products")
    public void user_should_be_able_to_view_the_products() {
        visibility_webTable_firstValue();
        assertEquals("   Classic Cheltenham", visibility_webTable_firstValue());

    }
}
