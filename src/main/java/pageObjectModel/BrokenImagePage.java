package pageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BrokenImagePage extends BasePage{
    public BrokenImagePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "img")
    List<WebElement> images;



    public BrokenImagePage checkBrokenImages() {
        System.out.println("Total images on the Web Page: " + images.size());
        for (int i = 0; i < images.size(); i++) {
            WebElement image = images.get(i);
            String imageURL = image.getAttribute("src");
            verifyLinks(imageURL);

            // check images with JS executor
            try {
                boolean imageDisplay = (Boolean) ((JavascriptExecutor) driver)
                        .executeScript(("return (typeof arguments[0].naturalWidth != undefined && arguments[0].naturalWidth>0);"), image);


                if (imageDisplay) {
                    System.out.println("Display - OK!");
                    System.out.println("=============================================");
                } else {
                    System.out.println("Display - Broken");
                    System.out.println("===============================================");
                }
            } catch (Exception e) {
                System.out.println("Error Occurred!");;
            }
        }


        return this;
    }
}
