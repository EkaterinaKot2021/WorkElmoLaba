package net.elmosoft.splendid.driver.page;

import net.elmosoft.splendid.driver.annotation.FindBy;
import net.elmosoft.splendid.driver.element.BrowserElement;

import java.util.List;

public class HomePage extends Page{
    @FindBy(xpath = "//button[contains(text(), 'Open Menu')]")
    private BrowserElement rightGamburgerMenu;

    @FindBy(xpath = "//button[contains(text(), 'Add to cart')]")
    private List<BrowserElement> addToCartBtns;

    @FindBy(xpath = "//a[@class='shopping_cart_link']/span[@class='shopping_cart_badge']")
    private BrowserElement cartIcon;

    @FindBy(id="logout_sidebar_link" )
    private BrowserElement logoutBtn;

    @FindBy(xpath = "//a[@href='https://twitter.com/saucelabs']")
    private BrowserElement twitterLink;




    public HomePage clickByRightGamburgerMenu() {
        rightGamburgerMenu.click();
        return PageFactory.initElements(driver, HomePage.class);
    }


    public HomePage clickByAddToCartBtn(int index) {
        addToCartBtns.get(index).click();
        return PageFactory.initElements(driver, HomePage.class);
    }

    public YourCartPage clickByCartIcon() {
        cartIcon.click();
        return PageFactory.initElements(driver, YourCartPage.class);
    }


    public Boolean isHomePageOpened() {
        return rightGamburgerMenu.isExists();
    }

    public HomePage clickByLogoutBtn (){
        logoutBtn.click();
        return PageFactory.initElements(driver, HomePage.class);
    }
    public HomePage clickByTwitterLink() {
        twitterLink.click();
        return PageFactory.initElements(driver, HomePage.class);
    }




    @Override
    public void checkPage() {
        waitForPageIsLoaded();
        rightGamburgerMenu.waitForElementDisplayed(TEN_SECONDS_WAIT);

    }

    @Override
    public void waitForPageIsLoaded() {

    }
}

