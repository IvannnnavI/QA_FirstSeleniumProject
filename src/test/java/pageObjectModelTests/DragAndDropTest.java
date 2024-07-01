package pageObjectModelTests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjectModel.DrapAndDropPage;
import pageObjectModel.HomePage;

public class DragAndDropTest extends TestBase{

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getDragAndDropPage();
    }

    @Test
    public void dragAndDropTest(){
        new DrapAndDropPage(driver).actionDragMe()
                .verifyMove("A");
    }



}
