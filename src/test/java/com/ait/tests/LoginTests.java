package com.ait.tests;

import com.ait.data.LoginData;
import com.ait.models.User;
import com.ait.utils.DataProviders;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition(){
        if (!app.getUser().isLoginButtonPresent()){
            app.getUser().clickOnLogOutButton();
        }
    }

    @Test(priority = 1)
    public void loginPositiveTest() {
        app.getUser().clickOnLogInButton();
        app.getUser().fillLoginForm(new User()
                .setEmail(LoginData.EMAIL)
                .setPassword(LoginData.PASSWORD));
        app.getUser().clickOnLOGINButton();
        Assert.assertTrue(app.getUser().isButtonLogOutPresent());
    }


    @Test(priority = 2)
    public void loginNegativeTestIncorrectEmail() {
        app.getUser().clickOnLogInButton();
        app.getUser().fillLoginForm(new User()
                .setPassword(LoginData.PASSWORD));
        app.getUser().clickOnLOGINButton();
        Assert.assertTrue(app.getUser().isMessageUnsuccessfulLoginPresent());
    }

    @Test(dataProvider = "LoginUser", dataProviderClass = DataProviders.class)
    public void loginUserFromCsv(User user) {
        app.getUser().clickOnLogInButton();
        app.getUser().fillLoginForm(user);
        app.getUser().clickOnLOGINButton();
        Assert.assertTrue(app.getUser().isButtonLogOutPresent());
        app.getUser().clickOnLogOutButton();
    }



}
