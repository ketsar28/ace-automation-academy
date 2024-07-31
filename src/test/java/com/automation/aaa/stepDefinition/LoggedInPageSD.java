package com.automation.aaa.stepDefinition;

import io.cucumber.java.en.Then;

import static com.automation.aaa.pages.LoggedInPage.*;

public class LoggedInPageSD {
    @Then("User should be able to view the Product category page")
    public void user_should_be_able_to_view_the_product_category_page() {
        visibility_productCategory_formalShoes();
        visibility_productCategory_sportsShoes();
        visibility_productCategory_sneakersShoes();
    }
}
