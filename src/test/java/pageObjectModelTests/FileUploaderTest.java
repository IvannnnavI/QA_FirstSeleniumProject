package pageObjectModelTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjectModel.FileUploaderPage;
import pageObjectModel.HomePage;

public class FileUploaderTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getFileUploaderPage();
    }

    @Test
    public void fileUploader(){
        new FileUploaderPage(driver).getUpload()
                .verifyUploadFile("File Uploaded!");
    }


}
