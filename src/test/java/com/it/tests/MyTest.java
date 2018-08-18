package com.it.tests;

import com.it.utils.UserFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.it.tests.BaseTest.app;
import static com.it.tests.BaseTest.validUser;

public class MyTest {
    @Test
    public void test1() {

        UserFactory.getRandomUser(10).forEach(System.out::println);

        app.login.login(validUser.getLogin(),validUser.getPassword());
        Assert.assertEquals(app.home.getLabelUserEmail(),validUser.getEmail());

    }
}
