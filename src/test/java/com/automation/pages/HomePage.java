package com.automation.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
  public static WebDriver driver;
  public static String humberger_menu_xpath = "//*[@id=\"menuToggle\"]/input";

  public static String signIn_link_linkText = "Sign In Portal";

  public static void click_humberger_menu() throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
    Thread.sleep(2000);
    driver.findElement(By.xpath(humberger_menu_xpath)).click();
  }

  public static void click_signIn_link() throws InterruptedException {
    Thread.sleep(2000);
    driver.findElement(By.linkText(signIn_link_linkText)).click();
  }

}
