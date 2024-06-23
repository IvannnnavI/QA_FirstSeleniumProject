package com.ait.tests;

import com.ait.data.RegisterData;
import com.ait.models.Registration;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition(){
        if (!app.getUser().isRegisterButtonPresent()){
            app.getUser().clickOnLogOutButton();
        }
    }


    @Test(enabled = false)
    public void createAccountPositiveTest() {

        app.getUser().clickOnRegisterButton();
        app.getUser().fillRegistrationForm(new Registration()
                .setFirstName(RegisterData.FIRSTNAME)
                .setLastName(RegisterData.LASTNAME)
                .setEmail(RegisterData.EMAIL)
                .setPassword(RegisterData.PASSWORD)
                .setConfirmPassword(RegisterData.CONFIRMPASSWORD));
        app.getUser().pressOnRegisterButton();
        Assert.assertTrue(app.getUser().isMessageAboutSuccessfulRegistrationPresent());

    }

    @Test
    public void createExistedAccountNegativeTestRepeatRegister() {
        app.getUser().clickOnRegisterButton();
        app.getUser().fillRegistrationForm(new Registration()
                .setFirstName(RegisterData.FIRSTNAME)
                .setLastName(RegisterData.LASTNAME)
                .setEmail(RegisterData.EMAIL)
                .setPassword(RegisterData.PASSWORD)
                .setConfirmPassword(RegisterData.CONFIRMPASSWORD));
        app.getUser().pressOnRegisterButton();
        Assert.assertTrue(app.getUser().isErrorPresent());

    }
}

