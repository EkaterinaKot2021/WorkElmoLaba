package net.splendid.elmosoft.pages;

import net.elmosoft.splendid.driver.annotation.FindBy;
import net.elmosoft.splendid.driver.element.BrowserElement;
import net.elmosoft.splendid.driver.page.Page;
import net.elmosoft.splendid.driver.page.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends Page {
    @FindBy(xpath = "//button[contains(text(), 'Open Menu')]")
    private BrowserElement rightGamburgerMenu;

    @FindBy(xpath = "//button[contains(text(), 'Add to cart')]")
    private List<BrowserElement> addToCartBtns;

    @FindBy(xpath = "//*[@class='shopping_cart_link']")
    private BrowserElement cartIcon;

    @FindBy(id = "logout_sidebar_link")
    private BrowserElement logoutBtn;

    @FindBy(xpath = "//a[@href='https://twitter.com/saucelabs']")
    private BrowserElement twitterLink;

    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    private BrowserElement cartBadgeIcon;

    @FindBy(name = "remove-sauce-labs-backpack")
    private BrowserElement removeBtn;

    @FindBy(xpath = "//div[contains(text(), 'Sauce Labs Backpack')]")
    private BrowserElement product;

    @FindBy(id = "//a[@href='https://saucelabs.com/']")
    private BrowserElement aboutBtn;

    @FindBy(xpath = "//*[@class='product_sort_container']")
    private BrowserElement sortBtn;

    @FindBy(xpath = "//*[@value='za']")
    private BrowserElement sortingZtoA;

    @FindBy(xpath = "//*[@value='az']")
    private BrowserElement sortingAtoZ;

    @FindBy(xpath = "//*[@class='inventory_item_name']")
    private List <BrowserElement> itemsSortedAtoZ;

    @FindBy(xpath = "")
    private List <BrowserElement> itemsSortedZtoA;



    public HomePage clickByRightGamburgerMenu() {
        rightGamburgerMenu.click();
        return PageFactory.initElements(driver, HomePage.class);
    }


    public HomePage clickByAddToCartBtn(int index) {
        addToCartBtns.get(index).click();
        return PageFactory.initElements(driver, HomePage.class);
    }

    public HomePage clickByCartIcon() {
        cartIcon.click();
        return PageFactory.initElements(driver, HomePage.class);
    }

    public HomePage clickByRemoveBtn() {
        removeBtn.click();
        return PageFactory.initElements(driver, HomePage.class);
    }

    public Boolean isHomePageOpened() {
        return rightGamburgerMenu.isExists();
    }

    public HomePage clickByLogoutBtn() {
        logoutBtn.click();
        return PageFactory.initElements(driver, HomePage.class);
    }

    public Boolean isProductChosen() {
        cartBadgeIcon.waitImplicitly(2);
        return cartBadgeIcon.isExists();
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


    public String getNumberCartBadgeIcon() {
        return cartBadgeIcon.getText();
    }

    public HomePage clickByProduct() {
        product.click();
        return PageFactory.initElements(driver, HomePage.class);
    }

    public String getNewTabCurrentUrl(int index) {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));
        return driver.getCurrentUrl();
    }

    public HomePage clickByAboutBtn() {
        aboutBtn.click();
        return PageFactory.initElements(driver, HomePage.class);
    }

    public Boolean getDefaultSorting() {
        return sortingAtoZ.isExists();
    }

    public HomePage clickBySortingBtn() {
        sortBtn.click();
        return PageFactory.initElements(driver, HomePage.class);
}

    public HomePage clickBySortingZtoA() {
        sortingZtoA.click();
        return PageFactory.initElements(driver, HomePage.class);
    }
}