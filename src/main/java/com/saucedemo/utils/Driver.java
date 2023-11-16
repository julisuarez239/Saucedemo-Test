package com.saucedemo.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
    private static ChromeDriver driver;

    public static Driver chrome() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--ignore-ssl-errors");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options );
        driver.manage().window().maximize();
        return new Driver();
    }

    public WebDriver onUrl(String url) {
        driver.get(url);
        return driver;
    }
}