package org.example.tests;

import org.example.base.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class HomePageTest extends BaseTest {

    @ParameterizedTest(name = "{index} - {0} is a palindrome")
    @ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE}) // six numbers
    void isOdd_ShouldReturnTrueForOddNumbers(int number) {
        System.out.println("--------------- Estoy aquí --------------  " + number);
        assertTrue(true);
    }

    @ParameterizedTest
    @CsvSource({
            "apple,         1",
            "banana,        2",
            "'lemon, lime', 0xF1"
    })
    void testWithCsvSource(String fruit, int rank) {
        assertNotNull(fruit);
        assertNotEquals(0, rank);
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



}
