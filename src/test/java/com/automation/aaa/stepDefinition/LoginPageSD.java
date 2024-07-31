package com.automation.aaa.stepDefinition;

import com.automation.aaa.pages.LoginPage;
import io.cucumber.java.en.When;

public class LoginPageSD {
    @When("User successfully enters the log in details")
    public void user_successfully_enters_the_log_in_details() throws InterruptedException {
        LoginPage.sendKeys_username();
        LoginPage.sendKeys_password();
        LoginPage.click_login_button();
    }

    @When("User clicks on new Registration button")
    public void user_clicks_on_new_registration_button() throws InterruptedException {
        LoginPage.click_registration_button();
    }

}
