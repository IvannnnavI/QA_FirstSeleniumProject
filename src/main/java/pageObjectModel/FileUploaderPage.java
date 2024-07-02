package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class FileUploaderPage extends BasePage {
    public FileUploaderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "file-upload")
    WebElement chooseFile;
    @FindBy(xpath = "//input[@id='file-submit']")
    WebElement submitFile;


    public FileUploaderPage getUpload() {
        pause(1000);
        clickWithRectangle(chooseFile,5,3);

        pause(1000);


        Robot robot;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        // press Shift key
        robot.keyPress(KeyEvent.VK_SHIFT);
        pause(1000);
        //press d
        robot.keyPress(KeyEvent.VK_D);
        //release shift key
        robot.keyRelease(KeyEvent.VK_SHIFT);
        //press 1,.,t,x,t
        robot.keyPress(KeyEvent.VK_1);
        robot.keyPress(KeyEvent.VK_PERIOD);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_X);
        robot.keyPress(KeyEvent.VK_T);
        // press ENTER key
        robot.keyPress(KeyEvent.VK_ENTER);

        pause(1000);


        click(submitFile);


        return this;
    }

    @FindBy(xpath = "//h3[contains(text(),'File Uploaded!')]")
    WebElement fileUploadConfirm;

    public FileUploaderPage verifyUploadFile(String text) {
        Assert.assertTrue(shouldHaveText(fileUploadConfirm, text, 5));


        return this;
    }
}
