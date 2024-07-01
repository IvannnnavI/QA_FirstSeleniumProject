package pageObjectModelTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjectModel.ContextMenuPage;
import pageObjectModel.HomePage;

public class ContextMenuTest extends TestBase{

    @BeforeMethod
    public void precondition() {

        new HomePage(driver).getContextMenuPage();
    }

    @Test
    public void contextMenuTest(){
        new ContextMenuPage(driver).getContext()
                .verifyRightClick("You selected a context menu");
    }
}
