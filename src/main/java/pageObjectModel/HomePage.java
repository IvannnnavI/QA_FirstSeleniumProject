package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//a[contains(text(),'JavaScript Alerts')]")
    WebElement jsAlert;



    public AlertsPage getJSAlerts() {
        click(jsAlert);
        return new AlertsPage(driver);
    }
}
