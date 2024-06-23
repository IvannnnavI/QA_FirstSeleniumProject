package com.ait.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddItemToCartTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        app.getUser().clickOnLogInButton();
        app.getUser().fillLoginForm(new User()
                .setEmail("Schwarz@mail.com")
                .setPassword("I$llBeBack1"));
        app.getUser().clickOnLOGINButton();


    }
    @Test
    public void addItemToCartTests(){
        app.getAddItemHelper().clickOnButtonAddToCart();
        app.getAddItemHelper().clickOnShoppingCart();
        Assert.assertTrue(app.getAddItemHelper().isLaptopPresent());


    }

    @AfterMethod
    public void postCondition(){
        app.getAddItemHelper().removeProduct();

    }

}
