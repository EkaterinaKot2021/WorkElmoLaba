package com.laba;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import net.elmosoft.splendid.driver.page.HomePage;
import net.elmosoft.splendid.driver.page.LoginPage;
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

public class LogoutTest extends BaseSplendidTest {
    @Test
    public void verifyLogOut() {
        LoginPage login = new LoginPage();
        login.openPage().checkPage();
        login.doLogin("standard_user", "secret_sauce");

        HomePage home = new HomePage();
        home.clickByRightGamburgerMenu();
        home.clickByLogoutBtn();
        Boolean resultLogout = login.isLoginPageOpened();

        Assert.assertTrue(resultLogout, "Login Page is opened!");

    }









}
