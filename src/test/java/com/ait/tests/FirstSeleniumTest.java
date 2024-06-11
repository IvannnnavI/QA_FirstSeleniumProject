package com.ait.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    WebDriver driver;

    //before setUp
    @BeforeMethod
    public void setUp () {
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        //driver.navigate().to("https://www.google.com/"); // c историей.
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().refresh();

    }
    @Test
    public void openGoogle() {
        System.out.println("CooGLE opened!!");
    }
    @AfterMethod (enabled = false)  // enabled = false чтоб не закрывалось окно
    public void tearDown(){
        driver.quit(); // закрывает весь браузер
        //driver.close(); закрывает только вкладку.
    }
}
