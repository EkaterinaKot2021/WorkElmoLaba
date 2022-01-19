package net.elmosoft.splendid.driver.page;

import net.elmosoft.splendid.driver.annotation.FindBy;
import net.elmosoft.splendid.driver.element.BrowserElement;

public class TwitterSauceLabsPage extends Page {


    @FindBy(xpath = "//*[contains(text(), 'Sauce Labs')]")
    private BrowserElement sauceLabsIcon;

    public Boolean isTwitterSaucePageOpened() {
        return sauceLabsIcon.isExists();
    }
    public TwitterSauceLabsPage openPage() {
        driver.get("https://twitter.com/saucelabs");
        return PageFactory.initElements(driver, TwitterSauceLabsPage.class);
    }


    @Override
    public void checkPage() {

    }

    @Override
    public void waitForPageIsLoaded() {

    }







}
