package com.automation.stepDefinition;

import io.cucumber.java.en.Given;

import static com.automation.pages.HomePage.*;

public class HomePageSD {
    @Given("User navigate to the Login page")
    public void user_navigate_to_the_login_page() throws InterruptedException {
        click_humberger_menu();
        click_signIn_link();
    }
}
