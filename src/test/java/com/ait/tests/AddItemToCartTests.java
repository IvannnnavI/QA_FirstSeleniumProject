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
        click(By.xpath("//body/div[4]/div[1]/div[4]/div[3]/div[1]/div[1]/div[3]/div[3]/div[1]/div[2]/div[3]/div[2]/input[1]"));

        //click on Shopping cart
        click(By.xpath("//span[contains(text(),'Shopping cart')]"));

        // assert Log Out button is present
        Assert.assertTrue(isElementPresent(By.xpath("//a[.='14.1-inch Laptop']")));
        pause(500);

    }
    @AfterMethod
    public void postCondition(){
        click(By.xpath("//tbody/tr[1]/td[1]/input[1]"));
        click(By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]"));


    }

}
