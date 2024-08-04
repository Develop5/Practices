package org.qa.testproject.tests;

import org.qa.testproject.base.BaseTest;
import org.qa.testproject.constants.AppConstants;
import org.junit.jupiter.api.*;
import org.qa.testproject.factory.PlaywrightFactory;

import static org.junit.jupiter.api.Assertions.*;



@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class HomePageTest extends BaseTest {

	@Test
	@Order(1)
	public void checkHomePageURLTest() {
		navigatingToHomePage();
		String currentURL = homePage.getHomePageCurrentURL();
		assertEquals(prop.getProperty("url"), currentURL);
		PlaywrightFactory.logger.warn("homePageURLTest , current url: " + currentURL);
	}

	public void navigatingToHomePage(){
		String urlToNavigateTo = prop.getProperty("url");
		homePage.goToPage(urlToNavigateTo);
	}

	@Test
	@Order(2)
	public void homePageTitleTest(TestInfo testInfo) {
		String pageActualTitle = homePage.getHomePageTitle();
		Assertions.assertEquals(AppConstants.HOME_PAGE_TITLE, pageActualTitle);
		PlaywrightFactory.logger.info("Test -> " + getOnlyTestName(testInfo) + " -- Title : " + pageActualTitle);
	}

	@Test
	public void navigateToMujerGroupTest(TestInfo testInfo) {
		PlaywrightFactory.logger.info("Test -> " + getOnlyTestName(testInfo));
		homePage.clickGroupMujer();
	}

	@Test
	public void navigateToHombreGroupTest(TestInfo testInfo) {
		PlaywrightFactory.logger.info("Test -> " + getOnlyTestName(testInfo));
		homePage.clickGroupHombre();
	}


	@Test
	public void navigateToNinnosGroupTest(TestInfo testInfo) {
		PlaywrightFactory.logger.info("Test -> " + getOnlyTestName(testInfo));
		homePage.clickGroupNinnos();
	}

	@DisplayName("Here I print whatever I want: lookingForBolsosFromHome")
	@Test
	public void lookingForBolsosFromHome() {
		navigatingToHomePage();
		PlaywrightFactory.logger.info("lookingForBolsosFromHome. URL: " + homePage.getCurrentUrl());
        String textToEnter = "Bolsos";
		PlaywrightFactory.logger.info("Entering the text : " + textToEnter);
		PlaywrightFactory.logger.info("First URL: " + homePage.getHomePageCurrentURL());
		homePage.enterTextSearchBar(textToEnter);
		PlaywrightFactory.takeScreenshotLocator();
		PlaywrightFactory.logger.info("New URL: " + homePage.getHomePageCurrentURL());
		assertTrue(homePage.categoryVisible());
		assertTrue(homePage.categoryContainsText(textToEnter));
		PlaywrightFactory.takeScreenshot();
	}

	public void highlightSearchBar(){
		homePage.highlightElement("Search Bar");
		PlaywrightFactory.takeScreenshotLocator();
	}

	public void hightlightHomeTitle(){
		homePage.highlightElement("Title");
		PlaywrightFactory.takeScreenshotLocator();
	}

	public String getOnlyTestName(TestInfo testInfo){
		// Check if needed
		String removingUnusedArg = testInfo.getDisplayName().replace("TestInfo","");
		return removingUnusedArg;
	}

		/*
	@TestFactory
	// To be considered later.
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
