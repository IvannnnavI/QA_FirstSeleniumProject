package pageObjectModel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class AddRemoveElementsPage extends BasePage {
    public AddRemoveElementsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "button")
    WebElement button;

    public AddRemoveElementsPage addElement() {
        moveWithJs(button, 0, 200);

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.ENTER).perform();
        return this;
    }

    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    List<WebElement> elements;


    public AddRemoveElementsPage verifyAdd(String text) {
        Assert.assertTrue(shouldHaveText(elements.get(0), text, 5));

        return this;
    }

    public AddRemoveElementsPage removeElement() {
        pause(5000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.ENTER).perform();
        return this;
    }

    public AddRemoveElementsPage verifyRemove() {
        Assert.assertTrue(elements.isEmpty());
        return this;
    }
}
