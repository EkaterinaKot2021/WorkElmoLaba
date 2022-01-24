package net.splendid.elmosoft.tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import net.elmosoft.splendid.service.runner.SuiteListener;
import net.elmosoft.splendid.test.BaseSplendidTest;
import net.splendid.elmosoft.pages.HomePage;
import net.splendid.elmosoft.pages.LoginPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Guice;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.uncommons.reportng.HTMLReporter;

import java.util.Collection;
import java.util.List;


@Listeners({ SuiteListener.class, HTMLReporter.class })
@Epic("Smoke Tests")
@Feature("Shoping")
@Guice

public class SortingProductsTest extends BaseSplendidTest {

    @Test
    public void sortingProducts() {
        LoginPage login = new LoginPage();
        login.openPage().checkPage();
        login.doLogin("standard_user", "secret_sauce");

        HomePage home = new HomePage();
        List<WebElement> itemsSortedAtoZ;
        home.clickBySortingBtn();
        home.clickBySortingZtoA();
        List <WebElement> itemsSortedZtoA = Collection.sort(itemsSortedZtoA);



        //Boolean resultSorting = home.sortingAtoZ .isExists();
       // Assert.assertTrue(resultSorting, "Default sorting is not performed");

       // home.clickBySortingBtn();
       // home.clickBySortingZtoA();
     //   Boolean resultSorting2 = home.sortingZtoA. isExists();
       // Assert.assertTrue(resultSorting2, "Z to A sorting is not performed");



    }
    }