package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'JavaScript Alerts')]")
    WebElement jsAlert;

    public AlertsPage getJSAlerts() {
        click(jsAlert);
        return new AlertsPage(driver);
    }
    @FindBy(xpath = "//a[contains(text(),'Nested Frames')]")
    WebElement nestedFrames;


    public NestedFramesPage getNestedFrames() {
        click(nestedFrames);
        return new NestedFramesPage(driver);
    }
    @FindBy(xpath = "//a[contains(text(),'Multiple Windows')]")
    WebElement multipleWindows;

    public MultipleWindowPage getMultipleWindows() {
        click(multipleWindows);
        return new MultipleWindowPage(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Hovers')]" )
    WebElement hoverPage;

    public HoverPage getHoversPage() {
        click(hoverPage);
        return new HoverPage(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Horizontal Slider')]")
    WebElement sliderPage;

    public SliderPage getSliderPage() {
        click(sliderPage);
        return new SliderPage(driver);

    }

    @FindBy(xpath = "//a[contains(text(),'Context Menu')]")
    WebElement contextMenu;


    public ContextMenuPage getContextMenuPage() {
        click(contextMenu);
        return new ContextMenuPage(driver);
    }
    @FindBy(xpath = "//a[contains(text(),'Dropdown')]")
    WebElement dropdown;

    public DropDownPage getDropdownList() {
        click(dropdown);
        return new DropDownPage(driver);

    }
    @FindBy(xpath = "//a[contains(text(),'Drag and Drop')]")
    WebElement dragAndDrop;

    public DrapAndDropPage getDragAndDropPage() {
        click(dragAndDrop);
        return new DrapAndDropPage(driver);

    }
    @FindBy(xpath = "//a[contains(text(),'JQuery UI Menus')]")
    WebElement jQueryUIMenus;

    public JQueryUIPage getJQueryUIPage() {
        click(jQueryUIMenus);
        return new JQueryUIPage(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'File Upload')]")
    WebElement fileUpload;

    public FileUploaderPage getFileUploaderPage() {
        click(fileUpload);
        return new FileUploaderPage(driver);
    }
    @FindBy(xpath = "//a[contains(text(),'Exit Intent')]")
    WebElement exitIntent;

    public ExitIntentPage getExitIntentPage() {
        click(exitIntent);
        return new ExitIntentPage(driver);
    }
    @FindBy(xpath = "//a[contains(text(),'Broken Images')]")
    WebElement brokenImages;

    public BrokenImagePage getBrokenImagePage() {
        click(brokenImages);
        return new BrokenImagePage(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Add/Remove Elements')]")
    WebElement addRemoveElements;

    public AddRemoveElementsPage getAddRemoveElements() {
        click(addRemoveElements);
        return new AddRemoveElementsPage(driver);
    }
}
