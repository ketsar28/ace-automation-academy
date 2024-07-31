package com.automation.aaa.pages;

import com.automation.aaa.utility.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.By;

public class OnlineProductPage extends BrowserDriver {
    public static String formal_shoes_dropdown_className = "formalshoedropdown";
    public static String webTable_element_xpath = "/html/body/div[3]/table";
    public static String webTable_firstValue_xpath = "/html/body/div[2]/table/tbody/tr[1]/td[1]";

    public static void click_formal_shoes_dropdown() {
        driver.findElement(By.className(formal_shoes_dropdown_className)).click();
    }

    public static String visibility_webTable_firstValue() {
        return driver.findElement(By.xpath(webTable_firstValue_xpath)).getText();
    }

}
