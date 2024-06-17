package com.ait.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{


    @Test
    public void loginPositiveTest() {
        // click  on Log in
        click(By.xpath("//a[contains(text(),'Log in')]"));

        //enter email
        type(By.xpath("//input[@id='Email']"),"Schwarz@mail.com");

        // enter password
        type(By.xpath("//input[@id='Password']"),"I$llBeBack1");

        // click on LOG IN button
        click(By.xpath("//input[@class='button-1 login-button' and @type='submit' and @value='Log in']"));

        // assert Log Out button is present
        Assert.assertTrue(isElementPresent(By.xpath("//a[contains(text(),'Log out')]")));

//        //assert email is present
//        Assert.assertTrue(isElementPresent(By.xpath("//a[contains(text(),'Schwarz@mail.com')]")));














    }

}
