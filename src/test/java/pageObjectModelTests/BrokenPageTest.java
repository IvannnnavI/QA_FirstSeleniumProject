package pageObjectModelTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjectModel.BrokenImagePage;
import pageObjectModel.HomePage;

public class BrokenPageTest extends TestBase {
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getBrokenImagePage();
    }

    @Test
    public void checkBrokenImages(){
        new BrokenImagePage(driver).checkBrokenImages();
    }
}
