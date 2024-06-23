package com.ait.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.time.Duration;

public class ApplicationManager {

    String browser;
    WebDriver webDriver;
    UserHelper user;
    AddItemHelper addItemHelper;

    Logger logger = LoggerFactory.getLogger(ApplicationManager.class);

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    @BeforeMethod
    public void startTest(Method method) {
        logger.info("Start test!" + method.getName());
    }

    public void init() {

        if (browser.equalsIgnoreCase("chrome")){
            webDriver=new ChromeDriver();
        }else if (browser.equalsIgnoreCase("firefox")){
            webDriver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            webDriver= new EdgeDriver();
        }

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
