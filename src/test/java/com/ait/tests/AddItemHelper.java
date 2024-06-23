package com.ait.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddItemHelper extends BaseHelper{
    public AddItemHelper(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isLaptopPresent() {
        return isElementPresent(By.xpath("//tbody/tr[1]/td[3]/a[1]"));
    }

    public void clickOnShoppingCart() {
        click(By.xpath("//span[contains(text(),'Shopping cart')]"));

    }

    public void clickOnButtonAddToCart() {
        pause(2000);

        click(By.cssSelector(".product-item[data-productid='31'] .product-box-add-to-cart-button"));
        pause(10000);

    }

    public void removeProduct() {
        click(By.name("removefromcart"));
        click(By.name("updatecart"));
    }
}
