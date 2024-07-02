package pageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class BasePage {
    WebDriver driver;
    JavascriptExecutor js;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.js = (JavascriptExecutor) driver;
    }

    public void click(WebElement element) {
        element.click();
    }

    public void clickWithJS(WebElement element, int x, int y) {
        js.executeScript("window.scrollBy(arguments[0], arguments[1]);", x, y);
        click(element);
    }

    public void typeWithJS(WebElement element, String text, int x, int y) {
        if (text != null) {
            clickWithJS(element, x, y);
            element.clear();
            element.sendKeys(text);
        }
    }

    public void type(WebElement element, String text) {
        if (text != null) {
            click(element);
            element.clear();
            element.sendKeys(text);
        }
    }

    public boolean shouldHaveText(WebElement element, String text, int time) {
        return new WebDriverWait(driver, Duration.ofSeconds(time))
                .until(ExpectedConditions.textToBePresentInElement(element, text));
    }
    public void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean isElementVisible(WebElement el) {
        try {
            el.isDisplayed();
            return true;
        }catch (NoSuchElementException ex) {
            ex.getMessage();
            return false;
        }

    }
    public void moveWithJs(WebElement element, int x, int y) {
        js.executeScript("window.scrollBy(" + x + " , " + y +")");

    }
    public void clickWithRectangle(WebElement element, int x,int y){

        Rectangle rectangle = element.getRect();

        int offSetX = rectangle.getWidth()/x;
        int offSetY = rectangle.getHeight()/y;

        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        actions.moveByOffset(-offSetX,-offSetY).click().perform();

    }
}

