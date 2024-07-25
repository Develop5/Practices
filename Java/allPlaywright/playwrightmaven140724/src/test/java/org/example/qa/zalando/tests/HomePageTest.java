package org.example.qa.zalando.tests;

import org.example.qa.zalando.base.BaseTest;
import org.example.qa.zalando.constants.AppConstants;
import org.junit.jupiter.api.*;

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
		homePage.clickGroup("Mujer");
	}

	@Test
	public void navigateToHombreGroupTest(TestInfo testInfo) {
		logger.info("Test -> " + getOnlyTestName(testInfo));
		homePage.clickGroup("Hombre");
	}


	@Test
	public void navigateToNinnosGroupTest(TestInfo testInfo) {
		logger.info("Test -> " + getOnlyTestName(testInfo));
		homePage.clickGroup("Ninnos");
	}

	@DisplayName("Here I print what I want: enterTextSearchBarTest")
	@Test
	public void enterTextSearchBarTest() {
		String textToEnter = "Bolsos";
		String url_first = homePage.getHomePageURL();
		homePage.enterTextInBar("Search Bar", textToEnter);
		String url_last = homePage.getHomePageURL();
		logger.info(" -- First page: " + url_first + "  Last page: " + url_last);
		assertNotEquals(url_first, url_last);
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

	public String getOnlyTestName(TestInfo testInfo){
		String removingUnusedArg = testInfo.getDisplayName().replace("TestInfo","");
		return removingUnusedArg;
	}

}
