package com.automation.aaa.stepDefinition;

import com.automation.aaa.pages.HomePage;
import io.cucumber.java.en.Given;

public class HomePageSD {
    @Given("User navigate to the Login page")
    public void user_navigate_to_the_login_page() throws InterruptedException {
        HomePage.click_humburger_menu();
        HomePage.click_signIn_link();
    }
    @Given("User navigate to the Online product page")
    public void user_navigate_to_the_online_product_page() throws InterruptedException {
        HomePage.click_humburger_menu();
        HomePage.click_onlineProducts_link();
    }
}
