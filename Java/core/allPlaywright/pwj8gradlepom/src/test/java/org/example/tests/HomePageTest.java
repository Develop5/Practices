package org.example.tests;

import org.example.base.BaseTest;
import org.example.constants.AppConstants;
import org.junit.Assert;
import org.junit.Test;


public class HomePageTest extends BaseTest {

    @Test
    public void homePageTitleTest() {
        String actualHomePageTitle = homePage.getHomePageTitle().substring(0,20);
        Assert.assertEquals(AppConstants.LOGIN_PAGE_TITLE.substring(0,20)
                , actualHomePageTitle);             // Substring avoiding special characters
    }


    @Test
    public void homePageURLTest() {
        String actualHomePageURL = homePage.getHomePageURL();
        Assert.assertEquals(actualHomePageURL, propertiesBase.getProperty("url"));
    }

    @Test
    public void searchTest() {
        String searchFor = "Zapatos";
        String actualSearchHeader = homePage.doSearch(searchFor);
        Assert.assertEquals(actualSearchHeader, searchFor);
    }

}
