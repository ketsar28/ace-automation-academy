package com.automation.aaa.pages;

import com.automation.aaa.utility.BrowserDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage  extends BrowserDriver {
  public static String humburger_menu_xpath = "//*[@id=\"menuToggle\"]/input";
  public static String signIn_link_linkText = "Sign In Portal";
  public static String onlineProduct_link_linkText = "Online Products";

  public static void click_humburger_menu() throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
    Thread.sleep(2000);
    driver.findElement(By.xpath(humburger_menu_xpath)).click();
  }

  public static void click_signIn_link() throws InterruptedException {
    Thread.sleep(2000);
    driver.findElement(By.linkText(signIn_link_linkText)).click();
  }

  public static void click_onlineProducts_link() throws InterruptedException {
    Thread.sleep(2000);
    driver.findElement(By.linkText(onlineProduct_link_linkText)).click();
  }


}
