package net.splendid.elmosoft.pages;

import net.elmosoft.splendid.driver.annotation.FindBy;
import net.elmosoft.splendid.driver.element.BrowserElement;
import net.elmosoft.splendid.driver.page.Page;

public class CheckoutCompletePage extends Page {

    @FindBy(xpath = "//*[contains(text(),'THANK YOU FOR YOUR ORDER')]")
    private BrowserElement infMessage;

    public Boolean isCheckoutCompletePageOpened() {
        return infMessage.isExists();
    }

    @Override
    public void checkPage() {

    }

    @Override
    public void waitForPageIsLoaded() {

    }

    public boolean isInfMessageExists() {
        return infMessage.isExists();
    }
}
