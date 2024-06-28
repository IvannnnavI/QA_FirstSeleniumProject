package pageObjectModelTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjectModel.AlertsPage;
import pageObjectModel.HomePage;

public class JsAlertTest extends TestBase{


    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getJSAlerts();

    }

    @Test
    public void jsAlertOk() {
        new AlertsPage(driver).getFirstAlert();
    }
    @Test
    public void jsAlertConfirm() {
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.getConfirmAlertOk();
        alertsPage.getConfirmAlertCancel();
    }

    @Test
    public void sendMessageToAlertTest(){


        new AlertsPage(driver).sendMessageToAlert("Hello World!!")
                .verifyMessage("Hello World!!");
    }
}
