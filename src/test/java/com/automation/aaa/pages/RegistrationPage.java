package com.automation.aaa.pages;

import com.automation.aaa.utility.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.By;

public class RegistrationPage extends BrowserDriver {
    public static String registration_title_xpath = "/html/body/center/h1";

    public static void visibility_user_registration_page() {
        String actual_registration_title = driver.findElement(By.xpath(registration_title_xpath)).getText();
        Assert.assertEquals("User Registration Page", actual_registration_title);
    }
}
