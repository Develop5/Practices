package org.example.qa.zalando.tests;

import org.example.qa.zalando.base.BaseTest;
import org.example.qa.zalando.constants.AppConstants;
import org.junit.jupiter.api.*;

import java.util.Arrays;

import static org.example.qa.zalando.factory.PlaywrightFactory.*;
import static org.junit.jupiter.api.Assertions.*;



@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class HomePageTest extends BaseTest {

	@Test
	@Order(1)
	public void homePageURLTest() {
		logger.warn("Entering homePageURLTest.");
		String actualURL = homePage.getHomePageURL();
		assertEquals(prop.getProperty("url"), actualURL);
		logger.warn("homePageURLTest : " + actualURL);
	}

	@Test
	@Order(2)
	public void homePageTitleTest(TestInfo testInfo) {
		String pageActualTitle = homePage.getHomePageTitle();
		assertEquals(AppConstants.HOME_PAGE_TITLE, pageActualTitle);
		logger.info("Test -> " + getOnlyTestName(testInfo) + " -- Title : " + pageActualTitle);
	}

	@Test
	public void navigateToMujerGroupTest(TestInfo testInfo) {
		logger.info("Test -> " + getOnlyTestName(testInfo));
		homePage.clickGroupMujer();
	}

	@Test
	public void navigateToHombreGroupTest(TestInfo testInfo) {
		logger.info("Test -> " + getOnlyTestName(testInfo));
		homePage.clickGroupHombre();
	}

	@Test
	public void getLocatorValues(){
		String[][] listAllLocators = homePage.getAllLocators();
		logger.info("Results : \n" + Arrays.deepToString(listAllLocators)
				.replace("], ", "\n")
				.replace("[[", "\n")
				.replace("]]", "\n"));
		logger.info("Total amount of locators = " + listAllLocators.length);
		assertTrue(listAllLocators.length == 8);			// Must be kept up to date, as long as more locators are identified in the page

	}

	@Test
	public void navigateToNinnosGroupTest(TestInfo testInfo) {
		logger.info("Test -> " + getOnlyTestName(testInfo));
		homePage.clickGroupNinnos();
	}

	@DisplayName("Here I print whatever I want: enterTextSearchBarTest")
	@Test
	public void enterTextSearchBarTest() {
		String textToEnter = "Bolsos";
		homePage.enterTextInBar("Search Bar", textToEnter);
		logger.info("URL actual: " + homePage.getHomePageURL());
		homePage.highlightElement("Category");
		assertTrue(homePage.elementVisibility("Category"));
		assertTrue(homePage.containText("Category", textToEnter));
		takeScreenshot();
	}


	public void highlightSearchBar(){
		homePage.highlightElement("Search Bar");
		takeScreenshotLocator();
	}

	public void hightlightHomeTitle(){
		homePage.highlightElement("Title");
		takeScreenshotLocator();
	}


	public String getOnlyTestName(TestInfo testInfo){
		String removingUnusedArg = testInfo.getDisplayName().replace("TestInfo","");
		return removingUnusedArg;
	}



		/*
	@TestFactory
	public Object[][] getProductData() {
		logger.error("This is not a tests, just Dynamic test preparation");

		return new Object[][] {
				{ "Mujer" },
				{ "Hombre" },
				{ "Niño" }
		};
	}
	*/

}
