package com.automation.aaa.stepDefinition;

import com.automation.aaa.pages.RegistrationPage;
import io.cucumber.java.en.Then;

public class RegistrationPageSD {
    @Then("User should be able to view the Registration page")
    public void user_should_be_able_to_view_the_registration_page() {
        RegistrationPage.visibility_user_registration_page();
    }
}
