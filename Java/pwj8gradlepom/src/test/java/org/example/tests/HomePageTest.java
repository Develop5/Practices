package org.example.tests;

import org.example.base.BaseTest;
import org.example.constants.AppConstants;
import org.junit.Assert;
import org.junit.Test;

public class HomePageTest extends BaseTest {

    /* Parametrized tests are not working
    @ParameterizedTest(name = "{index} - {0} is a palindrome")
    @ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE}) // six numbers
    void isOdd_ShouldReturnTrueForOddNumbers(int number) {
        Assert.assertTrue(true);
    }

    @ParameterizedTest
    @CsvSource({
            "apple,         1",
            "banana,        2",
            "'lemon, lime', 0xF1"
    })
    void testWithCsvSource(String fruit, int rank) {
        Assert.assertNotNull(fruit);
        assertNotEquals(0, rank);
    }

     */

    @Test
    public void homePageTitleTest() {
        String actualHomePageTitle = homePage.getHomePageTitle().substring(0,20);
        Assert.assertEquals(AppConstants.LOGIN_PAGE_TITLE.substring(0,20)
                , actualHomePageTitle);             // Substrint avoiding special characters
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
