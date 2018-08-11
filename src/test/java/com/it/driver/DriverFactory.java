package com.it.driver;

import com.it.common.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    public static WebDriver getDriver() {
        String property = System.getProperty("driver");
        WebDriver driver;
        if ("chrome".equals(property)) {
            driver=new ChromeDriver();
        } else {
            driver=new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.get(Constants.BASE_URL);
        return driver;
    }
}
