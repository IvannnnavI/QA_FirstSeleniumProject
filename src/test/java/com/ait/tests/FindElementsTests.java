package com.ait.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementsTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();

        driver.get("https://ilcarro.web.app");
        // maximize browser to window size
        driver.manage().window().maximize();
        // wait for all elements on the site to load before start testing
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @AfterMethod (enabled=false)
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void findElementsByTaName(){


        // find element by tag
        // создать переменную ALT+Enter
        WebElement element = driver.findElement(By.tagName("h1"));
        System.out.println(element.getText());

        WebElement a = driver.findElement(By.tagName("a"));
        System.out.println(a.getText());


        //find elements by tag

        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());



    }
    @Test
    public void findElementByLocator(){
        //by id
        driver.findElement(By.id("city"));

        // byclassname

        WebElement telephone = driver.findElement(By.className("telephone"));
        System.out.println(telephone.getText());

        //link text
        WebElement letTheCarWork = driver.findElement(By.linkText("Let the car work"));
        System.out.println(letTheCarWork.getText());

        //partial link text
        WebElement work = driver.findElement(By.partialLinkText("work"));
        System.out.println(work.getText());
    }

    @Test
    public void findElementByCssSelector() {
        //tag name -> tag
        //driver.findElement(By.tagName("h1"));
        driver.findElement(By.cssSelector("h1"));

        //id -> #id
        // driver.findElement(By.id("city"));
        driver.findElement(By.cssSelector("#city"));

        //class -> .class
        //driver.findElement(By.className("telephone"));
        driver.findElement(By.cssSelector(".telephone"));

        // [attr=''value]
        WebElement cssSelector = driver.findElement(By.cssSelector("[ng-reflect-name='city']"));
        System.out.println(cssSelector.getAttribute("type"));

    }

}
