package net.splendid.elmosoft.tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import net.splendid.elmosoft.pages.HomePage;
import net.splendid.elmosoft.pages.LoginPage;
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

public class RemovingOrderTest extends BaseSplendidTest {
    @Test
    public void removingOrder() {
        LoginPage login = new LoginPage();
        login.openPage().checkPage();
        login.doLogin("standard_user", "secret_sauce");

        HomePage home = new HomePage();
        home.clickByAddToCartBtn(0);
        String resultNumber = home.getNumberCartBadgeIcon();
        String expectedNumber = "1";
        Assert.assertEquals(resultNumber,expectedNumber, "Product is chosen");

        home.clickByRemoveBtn();
        Boolean result = home.isProductChosen();
        Assert.assertFalse(result, "Product is chosen");



    }
}