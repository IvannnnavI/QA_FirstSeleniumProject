package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static java.awt.SystemColor.text;

public class AlertsPage extends BasePage {
    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(text(),'Click for JS Alert')]")
    WebElement jsAlertButton;
    @FindBy(id = "result")
    WebElement result;

    public AlertsPage getFirstAlert() {
        click(jsAlertButton);
        driver.switchTo().alert().accept();
        Assert.assertTrue(shouldHaveText(result, "You successfully clicked an alert", 3));

        return this;

    }

    @FindBy(xpath = "//button[contains(text(),'Click for JS Confirm')]")
    WebElement jsConfirmButton;

    @FindBy(id = "result")
    WebElement result1;

    @FindBy(id = "result")
    WebElement result2;

    public AlertsPage getConfirmAlertOk() {
        click(jsConfirmButton);
        driver.switchTo().alert().accept();
        Assert.assertTrue(shouldHaveText(result1, "You clicked: Ok", 3));
        return this;
    }

    public AlertsPage getConfirmAlertCancel() {
        click(jsConfirmButton);
        driver.switchTo().alert().dismiss();
        Assert.assertTrue(shouldHaveText(result2, "You clicked: Cancel", 3));
        return this;
    }
    @FindBy (xpath = "//button[contains(text(),'Click for JS Prompt')]")
    WebElement promtButton;

    public AlertsPage sendMessageToAlert(String message) {
        clickWithJS(promtButton,0,300);

        if (message != null) {
            driver.switchTo().alert().sendKeys(message);
            driver.switchTo().alert().accept();
        }
        return this;
    }

    @FindBy(xpath = "//p[@id='result']")
    WebElement promptResult;

    public AlertsPage verifyMessage(String message) {
        Assert.assertTrue(shouldHaveText(promptResult,message,5));


        return this;
    }
}



