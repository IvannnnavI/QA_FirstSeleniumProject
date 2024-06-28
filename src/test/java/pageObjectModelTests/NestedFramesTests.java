package pageObjectModelTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjectModel.HomePage;
import pageObjectModel.NestedFramesPage;

public class NestedFramesTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getNestedFrames();
    }

    @Test
    public void framesTest(){
        new NestedFramesPage(driver).getListOfFrames();
    }
    @Test
    public void switchToIframeByIndexTest(){
        new NestedFramesPage(driver).switchToIframeToIndex(1)
                .verifyIframeText("BOTTOM");
    }

    @Test
    public void switchToIframeByElementTest(){
        new NestedFramesPage(driver).switchToIframeByElement()
                .verifyIframeText("BOTTOM");
    }

    @Test
    public void switchToNestedMiddleIframeTest(){
        new NestedFramesPage(driver).switchToMiddleNestedIframe()
                .verifyNestedIframe("MIDDLE");
    }
    @Test
    public void switchToNestedRightIframeTest(){
        new NestedFramesPage(driver).switchToRightNestedIframe()
                .verifyNestedIframe("RIGHT");
    }
    @Test
    public void switchToNestedLeftIframeTest(){
        new NestedFramesPage(driver).switchToNestedLeftIframe()
                .verifyNestedIframe("LEFT");
    }
}
