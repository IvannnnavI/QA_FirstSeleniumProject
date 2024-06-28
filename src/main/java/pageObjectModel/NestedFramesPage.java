package pageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class NestedFramesPage extends BasePage {
    public NestedFramesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "iframe")
    List<WebElement> iframes;

    public NestedFramesPage getListOfFrames() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Integer numberOfIframes = Integer.parseInt(js.executeScript("return window.length").toString());
        System.out.println("Number of iframes on the page  are " + numberOfIframes);
        return this;

    }

    public NestedFramesPage switchToIframeToIndex(int i) {
        driver.switchTo().frame(i);
        return this;
    }
    @FindBy(css = "body")
    WebElement bottom;

    public NestedFramesPage verifyIframeText(String text) {
        Assert.assertTrue(shouldHaveText(bottom,text,5));
        return this;
    }

    @FindBy(xpath = "//*[@name='frame-bottom']")
    WebElement bottom1;

    public NestedFramesPage switchToIframeByElement() {
        driver.switchTo().frame(bottom1);
        return this;
    }

    @FindBy(xpath = "//frameset[1]/frame[2]")
    WebElement frameMiddle;



    public NestedFramesPage switchToMiddleNestedIframe() {
        driver.switchTo().frame(0);
        driver.switchTo().frame(frameMiddle);
        return this;
    }


    @FindBy(xpath = "//frameset[1]/frame[3]")
    WebElement right;

    public NestedFramesPage switchToRightNestedIframe() {
        driver.switchTo().frame(0);
        driver.switchTo().frame(right);
        return this;
    }
    @FindBy(xpath = "//frameset[1]/frame[1]")
    WebElement left;

    public NestedFramesPage switchToNestedLeftIframe() {
        driver.switchTo().frame(0);
        driver.switchTo().frame(left);
        return this;
    }
    @FindBy(css = "body")
    WebElement message;
    public NestedFramesPage verifyNestedIframe(String text) {
        Assert.assertTrue(shouldHaveText(message,text,5));
        return this;
    }
}
