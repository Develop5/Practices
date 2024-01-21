package org.example.tests;

import com.microsoft.playwright.Page;
import org.example.factory.PlaywrightFactory;
import org.example.pages.HomePage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HomePageTest {

    PlaywrightFactory playwrightFactory;
    Page page;
    HomePage homePage;

    @Before
    public  void setup() {
        playwrightFactory = new PlaywrightFactory();
        page = playwrightFactory.initBrowser("chromium");
        homePage = new HomePage(page);
    }

    @Test
    public void homePageTitleTest() {
        String actualHomePageTitle = homePage.getHomePageTitle().substring(0,20);
        String expectedHomePageTitle = "Ropa y zapatos de mujer | La mejor selección en Zalando".substring(0,20);
        Assert.assertEquals(expectedHomePageTitle, actualHomePageTitle);
    }

    @Test
    public void homePageURLTest() {
        String actualHomePageURL = homePage.getHomePageURL();
        Assert.assertEquals(actualHomePageURL, "https://www.zalando.es/mujer-home/");
    }

    @Test
    public void searchTest() {
        String searchFor = "Zapatos";
        String actualSearchHeader = homePage.doSearch(searchFor);
        Assert.assertEquals(actualSearchHeader, searchFor);
    }


    @After
    public  void tearDown() {
        page.context().browser().close();
    }
}
