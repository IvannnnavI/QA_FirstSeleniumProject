package com.ait.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddItemToCartTests extends TestBase {

    @BeforeMethod
    public void logInOnTheSite() {
        click(By.xpath("//a[contains(text(),'Log in')]"));

        //enter email
        type(By.xpath("//input[@id='Email']"), "Schwarz@mail.com");

        // enter password
        type(By.xpath("//input[@id='Password']"), "I$llBeBack1");

        // click on LOG IN button
        click(By.xpath("//input[@class='button-1 login-button' and @type='submit' and @value='Log in']"));
    }
    @Test
    public void addItemToCartTests(){
        //click on button "add to cart"
        click(By.cssSelector("div.master-wrapper-page:nth-child(4) div.master-wrapper-content div.master-wrapper-main:nth-child(5) div.center-3 div.page.home-page div.page-body div.product-grid.home-page-product-grid:nth-child(4) div.item-box:nth-child(3) div.product-item div.details div.add-info div.buttons > input.button-2.product-box-add-to-cart-button"));

        //click on Shopping cart
        click(By.xpath("//span[contains(text(),'Shopping cart')]"));

        // assert Log Out button is present
        Assert.assertTrue(isElementPresent(By.xpath("//a[contains(text(),'14.1-inch Laptop')]")));
        pause(500);

    }
    @AfterMethod
    public void postCondition(){
        click(By.xpath("//input[@name='removefromcart' and @value='4383797']"));
        click(By.xpath("//input[@value='Update shopping cart'][1]"));


    }

}
