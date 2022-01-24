package net.splendid.elmosoft.pages;

import net.elmosoft.splendid.driver.annotation.FindBy;
import net.elmosoft.splendid.driver.element.BrowserElement;
import net.elmosoft.splendid.driver.page.Page;
import net.elmosoft.splendid.driver.page.PageFactory;

public class CheckoutOverviewPage extends Page {

    @FindBy(xpath = "//div[contains(text(),'Shipping Information')]")
    private BrowserElement shippingInformation;

    @FindBy(id = "finish")
    private BrowserElement finishBtn;


    public Boolean isCheckoutOverviewPageOpened() {
        return shippingInformation.isExists();
    }

    public Boolean isShippingInformationExist() {
        return shippingInformation.isExists();


    }
    public CheckoutOverviewPage clickByFinishBtn (){
        finishBtn.click();
        return PageFactory.initElements(driver,CheckoutOverviewPage.class);
    }

    @Override
    public void checkPage() {

    }

    @Override
    public void waitForPageIsLoaded() {

    }
}