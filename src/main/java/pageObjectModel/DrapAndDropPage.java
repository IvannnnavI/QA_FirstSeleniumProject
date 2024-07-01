package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DrapAndDropPage extends BasePage{
    public DrapAndDropPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "column-a")
    WebElement boxADrap;
    @FindBy(id = "column-b")
    WebElement boxBDrop;


    public DrapAndDropPage actionDragMe() {
        new Actions(driver).dragAndDrop(boxADrap,boxBDrop).perform();



        return this;
    }

    public DrapAndDropPage verifyMove(String text) {
        Assert.assertTrue(shouldHaveText(boxBDrop, text, 5));

        return this;
    }
}
