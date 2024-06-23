package com.ait.tests;

import com.ait.data.LoginData;
import com.ait.models.User;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddItemToCartTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getUser().isLoginButtonPresent()) {
            app.getUser().clickOnLogOutButton();
        }
        app.getUser().clickOnLogInButton();
        app.getUser().fillLoginForm(new User()
                .setEmail(LoginData.EMAIL)
                .setPassword(LoginData.PASSWORD));
        app.getUser().clickOnLOGINButton();


    }

    @Test
    public void addItemToCartTests() {
        app.getAddItemHelper().clickOnButtonAddToCart();
        app.getAddItemHelper().clickOnShoppingCart();
        Assert.assertTrue(app.getAddItemHelper().isLaptopPresent());


    }

    @AfterMethod
    public void postCondition() {
        app.getAddItemHelper().removeProduct();

    }

}
