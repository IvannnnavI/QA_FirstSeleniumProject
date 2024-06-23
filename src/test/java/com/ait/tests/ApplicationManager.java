package com.ait.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.time.Duration;

public class ApplicationManager {

    WebDriver webDriver;
    UserHelper user;
    AddItemHelper addItemHelper;

    Logger logger = LoggerFactory.getLogger(TestBase.class);

    @BeforeMethod
    public void startTest(Method method) {
        logger.info("Start test!" + method.getName());
    }

    public void init() {
        webDriver = new ChromeDriver();
        webDriver.get("https://demowebshop.tricentis.com/");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        user = new UserHelper(webDriver);
        addItemHelper = new AddItemHelper(webDriver);

    }

    public UserHelper getUser() {
        return user;
    }

    public AddItemHelper getAddItemHelper() {
        return addItemHelper;
    }

    @AfterMethod(enabled = true)
    public void stopTest() {
        logger.info("Stop Test!");
    }

    public void stop() {
        webDriver.quit();
    }



}
