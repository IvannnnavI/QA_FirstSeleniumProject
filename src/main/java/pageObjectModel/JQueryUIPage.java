package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.File;

public class JQueryUIPage extends BasePage{

    public JQueryUIPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "ui-id-3")
    WebElement enabledMenu;

    @FindBy(id = "ui-id-4")
    WebElement downloadsMenu;

    @FindBy(id = "ui-id-5")
    WebElement pdfOption;
    @FindBy(id = "ui-id-6")
    WebElement csfOption;
    @FindBy(id = "ui-id-7")
    WebElement excelOption;

    public JQueryUIPage hoverOverEnabledMenu() {
        Actions actions = new Actions(driver);
        actions.moveToElement(enabledMenu).perform();
        pause(1000);
        return this;
    }

    public JQueryUIPage hoverOverDownloadsMenu() {
        Actions actions = new Actions(driver);
        actions.moveToElement(downloadsMenu).perform();
        pause(1000);
        return this;
    }

    public JQueryUIPage clickPdfOption() {
        click(pdfOption);
        return this;
    }
    public JQueryUIPage clickCSVOption() {
        click(pdfOption);
        return this;
    }
    public JQueryUIPage clickExcelOption() {
        click(pdfOption);
        return this;
    }

    public JQueryUIPage verifyPdfOptionClicked(String downloadPath) {
        File dir = new File(downloadPath);
        File[] dirContents = dir.listFiles();

        for (File file : dirContents) {
            if (file.getName().contains("menu.pdf")) {
                file.delete();
                return this;
            }
        }

        return this;
    }
    public JQueryUIPage verifyCSVOptionClicked(String downloadPath) {
        File dir = new File(downloadPath);
        File[] dirContents = dir.listFiles();

        for (File file : dirContents) {
            if (file.getName().contains("menu.csv")) {
                file.delete();
                return this;
            }
        }

        return this;
    }
    public JQueryUIPage verifyExcelOptionClicked(String downloadPath) {
        File dir = new File(downloadPath);
        File[] dirContents = dir.listFiles();

        for (File file : dirContents) {
            if (file.getName().contains("menu.xls")) {
                file.delete();
                return this;
            }
        }

        return this;
    }
}
