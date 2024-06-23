package com.ait.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseHelper {
    WebDriver webDriver;

    public BaseHelper(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void click(By locator) {
        webDriver.findElement(locator).click();
    }

    public void type(By locator, String text) {
        if (text != null) {
            click(locator);
            webDriver.findElement(locator).clear();
            webDriver.findElement(locator).sendKeys(text);
        }
    }

    public void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isElementPresent(By locator) {
        return !webDriver.findElements(locator).isEmpty();
    }
}
