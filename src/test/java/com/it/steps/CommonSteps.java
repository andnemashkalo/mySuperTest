package com.it.steps;

import com.it.common.Constants;
import com.it.pages.BasePage;

public class CommonSteps extends BasePage {
    public void open(){
        driver.get(Constants.BASE_URL);
    }
    public void close(){driver.quit();}

}
