package pageObjectModelTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjectModel.DropDownPage;
import pageObjectModel.HomePage;

public class DropdownPageTest extends TestBase {


    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getDropdownList();

    }
    @Test
    public void selectOptionsTest() {
        new DropDownPage(driver).selectDropdown().verifySelectedDrop("Option 2");
    }


}
