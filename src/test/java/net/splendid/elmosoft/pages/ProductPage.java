package net.splendid.elmosoft.pages;

import net.elmosoft.splendid.driver.annotation.FindBy;
import net.elmosoft.splendid.driver.element.BrowserElement;
import net.elmosoft.splendid.driver.page.Page;

public class ProductPage extends Page {
    @FindBy(xpath = "//*[@class='inventory_details_img']")
    private BrowserElement productImage;



    public Boolean isProductPageOpened() {
        return productImage.isExists();
    }



    @Override
    public void checkPage() {

    }

    @Override
    public void waitForPageIsLoaded() {

    }
}
