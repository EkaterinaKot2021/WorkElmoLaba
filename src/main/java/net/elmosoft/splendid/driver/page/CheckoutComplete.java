package net.elmosoft.splendid.driver.page;

import net.elmosoft.splendid.driver.annotation.FindBy;
import net.elmosoft.splendid.driver.element.BrowserElement;

public class CheckoutComplete extends Page{

    @FindBy(xpath = "//a[@class='complete-header'>THANK YOU FOR YOUR ORDER']")
    private BrowserElement infMessage;

    public Boolean isCheckoutCompletePageOpened() {
        return infMessage.isExists();

   // public Boolean isInfMessageExists() {
     //   return infMessage.isExists();
     //   }


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
