package com.ait.fw;

import com.ait.models.Registration;
import com.ait.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper {
    public UserHelper(WebDriver webDriver) {
        super(webDriver);
    }

    public void pressOnRegisterButton() {
        click(By.xpath("//input[@id='register-button']"));
    }

    public void fillRegistrationForm(Registration registration) {
        // enter a first name
        type(By.xpath("//input[@id='FirstName']"), registration.getFirstName());
// enter last name
        type(By.xpath("//input[@id='LastName']"), registration.getLastName());
// enter email
        type(By.xpath("//input[@id='Email']"), registration.getEmail());
        // enter password
        type(By.xpath("//input[@id='Password']"), registration.getPassword());

// enter confirm password.
        type(By.xpath("//input[@id='ConfirmPassword']"), registration.getConfirmPassword());
    }

    public void clickOnRegisterButton() {
        click(By.cssSelector("[href='/register']"));
    }

    public boolean isErrorPresent() {
        return isElementPresent(By.xpath("//li[contains(text(),'The specified email already exists')]"));
    }

    public void clickOnLOGINButton() {
        click(By.xpath("//input[@class='button-1 login-button' and @type='submit' and @value='Log in']"));

    }

    public void fillLoginForm(User user) {
        type(By.xpath("//input[@id='Email']"), user.getEmail());
        type(By.xpath("//input[@id='Password']"), user.getPassword());
    }

    public void clickOnLogInButton() {
        click(By.xpath("//a[contains(text(),'Log in')]"));
    }

    public boolean isButtonLogOutPresent() {
        return isElementPresent(By.xpath("//a[contains(text(),'Log out')]"));
    }

    public boolean isMessageUnsuccessfulLoginPresent() {
        return isElementPresent(By.xpath("//span[contains(text(),'Login was unsuccessful. Please correct the errors ')]"));
    }

    public boolean isMessageAboutSuccessfulRegistrationPresent() {
        return isElementPresent(By.xpath("//div[contains(text(),'Your registration completed')]"));
    }

    public boolean isRegisterButtonPresent() {
        return isElementPresent(By.cssSelector("[href='/register']"));
    }

    public void clickOnLogOutButton() {
        click(By.xpath("//a[contains(text(),'Log out')]"));
    }

    public boolean isLoginButtonPresent() {
        return isElementPresent(By.xpath("//a[contains(text(),'Log in')]"));
    }
}
