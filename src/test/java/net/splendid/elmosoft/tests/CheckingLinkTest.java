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
@Feature("Login")
@Guice

public class CheckingLinkTest extends BaseSplendidTest {
    @Test
    public void verifyTwitterLink() {
        LoginPage login = new LoginPage();
        login.openPage().checkPage();
        login.doLogin("standard_user", "secret_sauce");

        HomePage home = new HomePage();
        home.clickByTwitterLink();
        String expectedTwitterUrl = "https://twitter.com/saucelabs";
        Assert.assertEquals(home.getNewTabCurrentUrl(1), expectedTwitterUrl, "Twitter is not opened" );



    }

    @Test
    public void verifyInfAboutSauceLabs() {
        LoginPage login = new LoginPage();
        login.openPage().checkPage();
        login.doLogin("standard_user", "secret_sauce");

        HomePage home = new HomePage();
        home.clickByRightGamburgerMenu();
        home.clickByAboutBtn();
        String expectedSauceLabsUrl = "https://saucelabs.com/";
        Assert.assertEquals(home.getNewTabCurrentUrl(1), expectedSauceLabsUrl, "Twitter is not opened" );



    }
}