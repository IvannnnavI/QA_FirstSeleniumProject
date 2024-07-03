package pageObjectModelTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjectModel.ExitIntentPage;
import pageObjectModel.HomePage;

public class ExitIntentTest extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getExitIntentPage();
    }

    @Test
    public void moveCursorOutOfTheViewPoint(){
        new ExitIntentPage(driver).exitIntent()
                .verifyMove();
    }
}
