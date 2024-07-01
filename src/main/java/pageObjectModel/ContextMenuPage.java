package pageObjectModel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ContextMenuPage extends BasePage{
    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "hot-spot")
    WebElement hotSpot;


    public ContextMenuPage getContext() {
        new Actions(driver).contextClick(hotSpot).perform();
        return this;
    }

    public ContextMenuPage verifyRightClick(String text) {
        Alert alert = driver.switchTo().alert();
        String arertText = alert.getText();
        Assert.assertEquals(arertText,text,"Alert text is incorrect");
        alert.accept();
        return this;
    }
}
