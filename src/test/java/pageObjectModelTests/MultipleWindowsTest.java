package pageObjectModelTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjectModel.BasePage;
import pageObjectModel.HomePage;
import pageObjectModel.MultipleWindowPage;

public class MultipleWindowsTest extends TestBase {


    @BeforeMethod
    public void predication() {
        new HomePage(driver).getMultipleWindows();
    }


    @Test
    public void toMultipleWindowsNewTab() {
        new MultipleWindowPage(driver).switchToNewTabMW(1)
                .verifyNewTabWindows("New Window");
    }

}
