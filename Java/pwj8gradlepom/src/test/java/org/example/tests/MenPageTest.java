package org.example.tests;

import org.example.base.BaseTest;
import org.example.constants.AppConstants;
import org.junit.Assert;
import org.junit.Test;


public class MenPageTest extends BaseTest {

    @Test
    public void menPageNavigationTest(){
        menPage = homePage.navigateToMenPage();
        String actualMenPageTitle = menPage.getMenPageTitle();
        System.out.println("---> Men page title is : " + actualMenPageTitle);
        Assert.assertEquals(AppConstants.MEN_PAGE_TITLE.substring(0,20),
                actualMenPageTitle.substring(0,20));            // Substrint avoiding special characters
    }


    @Test
    public void isMenPage() {
        menPage = homePage.navigateToMenPage();
        //Assert.assertTrue(menPage.isLogoVisible());
        Assert.assertEquals(AppConstants.MEN_PAGE_URL, menPage.getMenPageURL());

    }
}
