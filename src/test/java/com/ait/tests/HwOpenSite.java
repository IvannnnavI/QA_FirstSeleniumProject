package com.ait.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

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

    @AfterMethod(enabled=false)
    public void tearDown(){
        webDriver.quit();
    }

    // Homework 2
    @Test
    public void findElementByCssSelectorHW(){
        //tag name -> tag

        WebElement webElementh3 = webDriver.findElement(By.cssSelector("h3"));
        System.out.println(webElementh3.getText());

        List<WebElement> aelements = webDriver.findElements(By.cssSelector("a"));
        System.out.println(aelements.size());


        //id -> #id

        webDriver.findElement(By.cssSelector("#small-searchterms"));

        webDriver.findElement(By.cssSelector("#bar-notification"));

        webDriver.findElement(By.cssSelector("#topcartlink"));


        //class -> .class

        webDriver.findElement(By.cssSelector(".cart-label"));

        webDriver.findElement(By.cssSelector(".mini-shopping-cart"));

        webDriver.findElement(By.cssSelector(".language-selector"));


        // [attr=''value]
        WebElement atrwebElement = webDriver.findElement(By.cssSelector("[name='q']"));
        System.out.println(atrwebElement.getAttribute("value"));

        WebElement atrwebElement1 = webDriver.findElement(By.cssSelector("[class='search-box-text ui-autocomplete-input']"));
        System.out.println(atrwebElement1.getAttribute("value"));


    }


}
