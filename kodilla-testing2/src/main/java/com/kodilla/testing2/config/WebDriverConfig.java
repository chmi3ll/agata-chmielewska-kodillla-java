package com.kodilla.testing2.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConfig {
    public final static String FIREFOX = "FIREFOX_DRIVER";
    public final static String CHROME = "CHROME DRIVER";
    public static WebDriver getDriver(final String driver) {
        System.setProperty("webdriver.gecko.driver" , "/Users/Agata/Documents/Development/Selenium_drivers/Firefox/geckodriver");
        System.setProperty("webdriver.chrome.driver", "/Users/Agata/Documents/Development/Selenium_drivers/Chrome/chromedriver");

        if(driver.equals(FIREFOX)) {
            return new FirefoxDriver();
        } else if(driver.equals(CHROME)) {
            return new ChromeDriver();
        } else {
            return null;
        }
    }
}
