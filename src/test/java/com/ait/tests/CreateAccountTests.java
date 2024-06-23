package com.ait.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {


    @Test(enabled = false)
    public void createAccountPositiveTest() {

        app.getUser().clickOnRegisterButton();
        app.getUser().fillRegistrationForm(new Registration()
                .setFirstName("Arnold")
                .setLastName("Schwarz")
                .setEmail("Schwarz@mail.com")
                .setPassword("I$llBeBack1")
                .setConfirmPassword("I$llBeBack1"));
        app.getUser().pressOnRegisterButton();
        Assert.assertTrue(app.getUser().isMessageAboutSuccessfulRegistrationPresent());

    }

    @Test
    public void createExistedAccountNegativeTestRepeatRegister() {
        app.getUser().clickOnRegisterButton();
        app.getUser().fillRegistrationForm(new Registration()
                .setFirstName("Arnold")
                .setLastName("Schwarz")
                .setEmail("Schwarz@mail.com")
                .setPassword("I$llBeBack1")
                .setConfirmPassword("I$llBeBack1"));
        app.getUser().pressOnRegisterButton();
        Assert.assertTrue(app.getUser().isErrorPresent());

    }

}

