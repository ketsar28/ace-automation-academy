package com.automation.aaa.pages;

import com.automation.aaa.utility.BrowserDriver;
import org.openqa.selenium.By;

public class LoginPage extends BrowserDriver {

    public static String login_button_xpath = "//*[@id=\"second_form\"]/input";
    public static String username_text_id = "usr";
    public static String password_text_id = "pwd";
    public static String registration_button_id = "NewRegistration";


    public static void sendKeys_username() {
        driver.findElement(By.id(username_text_id)).sendKeys("ketsar");
    }

    public static void sendKeys_password() {
        driver.findElement(By.id(password_text_id)).sendKeys("passsword");
    }

    public static void click_login_button() {
        driver.findElement(By.xpath(login_button_xpath)).click();
    }

    public static void click_registration_button() {
        driver.findElement(By.id(registration_button_id)).click();
    }

}
