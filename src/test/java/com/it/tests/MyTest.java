package com.it.tests;

import com.it.pages.HomePage;
import com.it.pages.LoginPage;
import com.it.utils.UserFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {
    @Test
    public void test1() {

        UserFactory.getRandomUser(10).forEach(System.out::println);


       LoginPage loginPage= new LoginPage();
       loginPage.login("ittest2","337774a");
       HomePage homePage=new HomePage();
       String email=homePage.getLabelUserEmail();
       Assert.assertEquals(email,"ittest2@i.ua");

    }
}
