package com.automation.aaa.pages;

import com.automation.aaa.utility.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoggedInPage extends BrowserDriver {
    //*[@id="ShoeType"]//*[text()="Formal Shoes"]
    public static String formal_shoes_xpath = "//*[text()=\"Formal Shoes\"]";
    public static String sports_shoes_xpath = "//*[text()=\"Sports\"]";
    public static String sneakers_shoes_xpath = "//*[text()=\"Sneakers\"]";

    public static void visibility_productCategory_formalShoes() {
        String actual_productcategory_fs = driver.findElement(By.xpath(formal_shoes_xpath)).getText();
        Assert.assertEquals("Formal Shoes", actual_productcategory_fs);
    }
    public static void visibility_productCategory_sportsShoes() {
        String actual_productcategory_ss = driver.findElement(By.xpath(sports_shoes_xpath)).getText();
        Assert.assertEquals("Sports", actual_productcategory_ss);
    }
    public static void visibility_productCategory_sneakersShoes() {
        String actual_productcategory_s = driver.findElement(By.xpath(sneakers_shoes_xpath)).getText();
        Assert.assertEquals("Sneakers", actual_productcategory_s);
    }
}
