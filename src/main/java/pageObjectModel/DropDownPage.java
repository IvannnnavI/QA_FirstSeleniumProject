package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDownPage extends BasePage{
    public DropDownPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "dropdown")
    WebElement dropdown;
    @FindBy(xpath = "//option[contains(text(),'Option 1')]")
    WebElement option1;
    @FindBy(xpath = "//option[contains(text(),'Option 2')]")
    WebElement option2;



    public DropDownPage selectDropdown() {
        Select select = new Select(dropdown);
        pause(1000);
        select.selectByVisibleText("Option 2");
        return this;
    }

    public DropDownPage verifySelectedDrop(String text) {
        Select select = new Select(dropdown);
        Assert.assertEquals(select.getFirstSelectedOption().getText(), text);
        return this;
    }


}
