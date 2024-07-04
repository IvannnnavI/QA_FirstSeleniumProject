package pageObjectModelTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjectModel.AddRemoveElementsPage;
import pageObjectModel.HomePage;

public class AddRemoveElements extends TestBase{


    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getAddRemoveElements();
    }

    @Test
    public void addElementTest(){
        new AddRemoveElementsPage(driver)
                .addElement()
                .verifyAdd("Delete");
    }
    @Test
    public void removeElementTest(){
        new AddRemoveElementsPage(driver)
                .addElement()
                .removeElement()
                .verifyRemove();
    }
}
