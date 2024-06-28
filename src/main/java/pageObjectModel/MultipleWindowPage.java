package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class MultipleWindowPage extends BasePage {
    public MultipleWindowPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[contains(text(),'Click Here')]")
    WebElement clickHereButton;

    public MultipleWindowPage switchToNewTabMW(int i) {
        click(clickHereButton);

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(i));
        return this;
    }

//    public AlertsFrameWindowsPage verifyNewTabTitle(String title) {
//        Assert.assertTrue(shouldHaveText(sampleHeading,title,5));
//        return this;
//    }

    @FindBy(xpath = "//h3[contains(text(),'New Window')]")
    WebElement textNewWindow;

    public MultipleWindowPage verifyNewTabWindows(String text) {
        Assert.assertTrue(shouldHaveText(textNewWindow,text,5));
        return this;

    }
}
