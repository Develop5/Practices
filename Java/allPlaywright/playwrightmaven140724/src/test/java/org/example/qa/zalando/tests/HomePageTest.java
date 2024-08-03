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
	public void checkHomePageURLTest() {
		navigatingToHomePage();
		String currentURL = homePage.getHomePageCurrentURL();
		assertEquals(prop.getProperty("url"), currentURL);
		logger.warn("homePageURLTest , current url: " + currentURL);
	}

	public void navigatingToHomePage(){
		String urlToNavigateTo = prop.getProperty("url");
		homePage.goToPage(urlToNavigateTo);
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
	public void navigateToNinnosGroupTest(TestInfo testInfo) {
		logger.info("Test -> " + getOnlyTestName(testInfo));
		homePage.clickGroupNinnos();
	}

	@DisplayName("Here I print whatever I want: lookingForBolsosFromHome")
	@Test
	public void lookingForBolsosFromHome() {
		navigatingToHomePage();
		logger.info("lookingForBolsosFromHome. URL: " + homePage.getCurrentUrl());
        String textToEnter = "Bolsos";
		logger.info("Entering the text : " + textToEnter);
		logger.info("First URL: " + homePage.getHomePageCurrentURL());
		homePage.enterTextSearchBar(textToEnter);
		takeScreenshotLocator();
		logger.info("New URL: " + homePage.getHomePageCurrentURL());
		assertTrue(homePage.categoryVisible());
		assertTrue(homePage.categoryContainsText(textToEnter));
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
