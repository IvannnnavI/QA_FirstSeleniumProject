package pageObjectModel;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.awt.*;

public class ExitIntentPage extends BasePage {
    public ExitIntentPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.modal")
    WebElement modal;

    public ExitIntentPage exitIntent() {
        Robot robot;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        Dimension dimension = driver.manage().window().getSize();
        int x = dimension.getWidth() / 2;
        int y = dimension.getHeight() / 2;
        robot.mouseMove(x, y);
        pause(1000);
        robot.mouseMove(x,-10);
        pause(1000);


        return this;
    }

    public ExitIntentPage verifyMove() {
        pause(5000);
        Assert.assertTrue(isElementVisible(modal));
        return this;
    }
}
