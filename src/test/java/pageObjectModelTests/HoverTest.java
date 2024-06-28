package pageObjectModelTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjectModel.HomePage;
import pageObjectModel.HoverPage;

public class HoverTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getHoversPage();

    }
    @Test
    public void hoverTest(){
        new HoverPage(driver).selectInfoUser();

    }


}
