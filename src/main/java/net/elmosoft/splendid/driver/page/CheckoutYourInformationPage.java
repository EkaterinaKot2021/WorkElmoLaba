package net.elmosoft.splendid.driver.page;

import net.elmosoft.splendid.driver.annotation.FindBy;
import net.elmosoft.splendid.driver.element.BrowserElement;


public class CheckoutYourInformationPage extends Page {

    @FindBy(id = "first-name")
    private BrowserElement firstNameField;

    @FindBy(id = "last-name")
    private BrowserElement lastNameField;

    @FindBy(id = "postal-code")
    private BrowserElement postalCodeField;

    @FindBy(id = "continue")
    private BrowserElement continueBtn;


    public CheckoutYourInformationPage fillInformation(String firstName, String lastName, String postalCode) {
        firstNameField.type(firstName);
        lastNameField.type(lastName);
        postalCodeField.type(postalCode);
        continueBtn.click();
        return PageFactory.initElements(driver, CheckoutYourInformationPage.class);

   // public CheckoutYourInformationPage clickByContinueBtn() {
  //      continueBtn.click();
   //     return PageFactory.initElements(driver, CheckoutYourInformationPage.class);
   //         }
        }



    @Override
    public void checkPage() {

    }

    @Override
    public void waitForPageIsLoaded() {

    }

    public void clickByContinueBtn() {
    }
}
