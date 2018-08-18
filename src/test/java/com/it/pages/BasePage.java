package com.it.pages;

import com.it.driver.DriverFactory;
import com.it.driver.MyDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected static WebDriver driver=MyDriver.getDriver();

    public BasePage() {
        PageFactory.initElements(driver,this);
    }
}
