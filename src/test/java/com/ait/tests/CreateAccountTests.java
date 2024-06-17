package com.ait.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {



    @Test
    public void createAccountPositiveTest() {
// click on the register button
        click(By.cssSelector("[href='/register']"));

// enter a first name
        type(By.xpath("//input[@id='FirstName']"),"Arnold");
// enter last name
        type(By.xpath("//input[@id='LastName']"),"Schwarz");
// enter email
        type(By.xpath("//input[@id='Email']"),"Schwarz@mail.com");
// enter password
        type(By.xpath("//input[@id='Password']"),"I$llBeBack1");

// enter confirm password.
        type(By.xpath("//input[@id='ConfirmPassword']"),"I$llBeBack1");
// press the register button
        click(By.xpath("//input[@id='register-button']"));
        // Assert  message about successful registration is present
        Assert.assertTrue(isElementPresent(By.xpath("//div[contains(text(),'Your registration completed')]")));

    }

}
