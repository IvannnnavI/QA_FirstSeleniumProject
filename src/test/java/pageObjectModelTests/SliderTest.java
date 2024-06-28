package pageObjectModelTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjectModel.HomePage;
import pageObjectModel.SliderPage;

public class SliderTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getSliderPage();

    }

    @Test
    public void testSliderFunctionality() {

        new SliderPage(driver).moveSliderToValue(3.5).verifySliderValue(3.5);
    }

    @Test
    public void testMoveSliderWithKeys() {
        new SliderPage(driver).moveSliderWithKeys(3.5).verifySliderValue(3.5);
    }


}
