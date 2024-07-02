package pageObjectModelTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjectModel.HomePage;
import pageObjectModel.JQueryUIPage;

public class JQueryUITest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getJQueryUIPage();
    }

    @Test
    public void jQueryUIMenuTestPdf(){
        String downloadPath = "C:\\Users\\bahek\\Downloads";


        new JQueryUIPage(driver).hoverOverEnabledMenu()
                .hoverOverDownloadsMenu()
                .clickPdfOption()
                .verifyPdfOptionClicked(downloadPath);
    }
    @Test
    public void jQueryUIMenuTestCSV(){
        String downloadPath = "C:\\Users\\bahek\\Downloads";


        new JQueryUIPage(driver).hoverOverEnabledMenu()
                .hoverOverDownloadsMenu()
                .clickCSVOption()
                .verifyCSVOptionClicked(downloadPath);
    }
    @Test
    public void jQueryUIMenuTestExcel(){
        String downloadPath = "C:\\Users\\bahek\\Downloads";


        new JQueryUIPage(driver).hoverOverEnabledMenu()
                .hoverOverDownloadsMenu()
                .clickExcelOption()
                .verifyExcelOptionClicked(downloadPath);
    }

}
