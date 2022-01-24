package net.splendid.elmosoft.tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import net.elmosoft.splendid.service.runner.SuiteListener;
import net.elmosoft.splendid.test.BaseSplendidTest;
import net.splendid.elmosoft.pages.*;
import org.testng.Assert;
import org.testng.annotations.Guice;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.uncommons.reportng.HTMLReporter;

@Listeners({ SuiteListener.class, HTMLReporter.class })
@Epic("Smoke Tests")
@Feature("Login")
@Guice

public class BuyingGoodsTest extends BaseSplendidTest {
    @Test
    public void verifyBuyingGoods() {
        LoginPage login = new LoginPage();
        login.openPage().checkPage();
        login.doLogin("standard_user", "secret_sauce");

        HomePage home = new HomePage();
        home.clickByAddToCartBtn(0);
        Boolean resultChoice = home.clickByCartIcon().isProductChosen();
        Assert.assertTrue(resultChoice, "Product is not chosen!");

        YourCartPage yourCart = new YourCartPage();
        yourCart.clickByCheckoutBtn();

        CheckoutYourInformationPage information = new CheckoutYourInformationPage();
        information.fillInformation("Kate", "Kot", "12345");
        information.clickByContinueBtn();

        CheckoutOverviewPage overview = new CheckoutOverviewPage();
        overview.checkPage();
        Boolean resultOverview = overview.isCheckoutOverviewPageOpened();
        Assert.assertFalse(overview.isShippingInformationExist(), "Overview is finished");
        overview.clickByFinishBtn();

        CheckoutCompletePage checkoutComplete = new CheckoutCompletePage();
        Boolean resultCheckoutComplete = checkoutComplete.isCheckoutCompletePageOpened();
        Assert.assertFalse(checkoutComplete.isInfMessageExists(), "The purchase is made");




    }
}