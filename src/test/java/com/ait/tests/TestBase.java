package com.ait.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
    WebDriver webDriver;

    @BeforeMethod
    public void setUp(){
        webDriver = new ChromeDriver();
        webDriver.get("https://demowebshop.tricentis.com/");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    public void click(By locator) {
        webDriver.findElement(locator).click();
    }
    public void type(By locator, String text) {
        click(locator);
        webDriver.findElement(locator).clear();
        webDriver.findElement(locator).sendKeys(text);
    }

    @AfterMethod(enabled = false)
    public void tearDown(){
        webDriver.quit();
    }
    public boolean isElementPresent(By locator){
        return webDriver.findElements(locator).size()>0;
    }
}
