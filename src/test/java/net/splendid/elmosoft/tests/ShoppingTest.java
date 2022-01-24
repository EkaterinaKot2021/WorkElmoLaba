package net.splendid.elmosoft.tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import net.splendid.elmosoft.pages.HomePage;
import net.splendid.elmosoft.pages.LoginPage;
import net.splendid.elmosoft.pages.YourCartPage;
import net.elmosoft.splendid.service.runner.SuiteListener;
import net.elmosoft.splendid.test.BaseSplendidTest;
import org.testng.Assert;
import org.testng.annotations.Guice;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.uncommons.reportng.HTMLReporter;

@Listeners({ SuiteListener.class, HTMLReporter.class })
@Epic("Smoke Tests")
@Feature("Shoping")
@Guice

public class ShoppingTest extends BaseSplendidTest {
    @Test
    public void verifyAddingToCart() {
        LoginPage login = new LoginPage();
        login.openPage().checkPage();
        login.doLogin("standard_user", "secret_sauce");

        HomePage home = new HomePage();
        home.clickByAddToCartBtn(0);
        Boolean resultChoice = home.clickByCartIcon().isProductChosen();
        Assert.assertTrue(resultChoice, "Product is not choosen!");

        YourCartPage yourCart = new YourCartPage();
        yourCart.clickByRemove();
        Assert.assertFalse(yourCart.isCartItemLabelExist(), "Product is choosen!");
    }
}


