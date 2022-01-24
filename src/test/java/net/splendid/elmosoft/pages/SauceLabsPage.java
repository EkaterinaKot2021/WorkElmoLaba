package net.splendid.elmosoft.pages;

import net.elmosoft.splendid.driver.annotation.FindBy;
import net.elmosoft.splendid.driver.element.BrowserElement;
import net.elmosoft.splendid.driver.page.Page;
import net.elmosoft.splendid.driver.page.PageFactory;

public class SauceLabsPage extends Page {


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
