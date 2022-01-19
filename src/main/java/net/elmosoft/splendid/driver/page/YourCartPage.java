package net.elmosoft.splendid.driver.page;

import net.elmosoft.splendid.driver.annotation.FindBy;
import net.elmosoft.splendid.driver.element.BrowserElement;


public class YourCartPage extends Page{

    @FindBy(xpath = "//div[contains(text(), 'Sauce Labs Backpack')]")
    private BrowserElement product;

    @FindBy(id = "remove-sauce-labs-backpack")
    private BrowserElement removeBtn;

    @FindBy(xpath = "//div[@class='cart_item_label']")
    private BrowserElement cartItemLabel;

    @FindBy(id = "checkout")
    private BrowserElement checkoutBtn;


    public YourCartPage clickByRemove() {
        removeBtn.click();
        return PageFactory.initElements(driver, YourCartPage.class);
    }

    public Boolean isProductChosen() {
        return product.isExists();
    }

    public Boolean isCartItemLabelExist() {
        return cartItemLabel.isExists();
    }

    public YourCartPage clickByCheckoutBtn() {
        checkoutBtn.click();
        return PageFactory.initElements(driver, YourCartPage.class);
    }






    @Override
    public void checkPage() {

    }

    @Override
    public void waitForPageIsLoaded() {

    }
}
