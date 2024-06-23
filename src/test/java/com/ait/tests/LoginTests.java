package com.ait.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @Test
    public void loginPositiveTest() {
        app.getUser().clickOnLogInButton();
        app.getUser().fillLoginForm(new User()
                .setEmail("Schwarz@mail.com")
                .setPassword("I$llBeBack1"));
        app.getUser().clickOnLOGINButton();
        Assert.assertTrue(app.getUser().isButtonLogOutPresent());
    }


    @Test
    public void loginNegativeTestIncorrectEmail() {
        app.getUser().clickOnLogInButton();
        app.getUser().fillLoginForm(new User()
                .setPassword("I$llBeBack1"));
        app.getUser().clickOnLOGINButton();
        Assert.assertTrue(app.getUser().isMessageUnsuccessfulLoginPresent());
    }



}
