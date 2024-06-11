package com.ait.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HwOpenSite {

    WebDriver webDriver;


    @BeforeMethod
    public void setUp() {
        webDriver = new ChromeDriver();
        webDriver.get("https://demowebshop.tricentis.com/");
    }

    @Test
    public void openSite() {
        System.out.println(" 'Demo Web Shop' is open! ");
    }

    @AfterMethod
    public void tearDown(){
        webDriver.quit();
    }
}
