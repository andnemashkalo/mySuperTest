package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

	@FindBy(xpath="//ul[@class='sn_menu']/li[1]")
	private WebElement labelUserEmail;


    public String getLabelUserEmail() {

        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(labelUserEmail));
        return labelUserEmail.getText();
    }
}
