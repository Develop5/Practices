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
	public void homePageTitleTest() {
		takeScreenshot();
		String pageActualTitle = homePage.getHomePageTitle();
		assertEquals(AppConstants.HOME_PAGE_TITLE, pageActualTitle);
		logger.info(getClass().getName() + " -- Title : " + pageActualTitle);
	}

	@Test
	public void navigateToMujerGroupTest() {
		logger.info(getClass().getName());
		homePage.clickGroup("Mujer");
	}
	@Test
	public void navigateToHombreGroupTest() {
		logger.info(getClass().getName());
		homePage.clickGroup("Hombre");
	}
	@Test
	public void navigateToNinnosGroupTest() {
		logger.info(getClass().getName());
		homePage.clickGroup("Ninnos");
	}


	@Test
	public void enterTextSearchBarTest() {
		String url_first = homePage.getHomePageURL();
		homePage.enterTextInBar("Search Bar", "Bolsos");

		homePage.waitUntilLoad();
		String url_last = homePage.getHomePageURL();
		logger.info(getClass().getName() + " -- First page: " + url_first + "  Last page: " + url_last);
		//assertTrue(url_last.contains(url_first));
		assertNotEquals(url_first, url_last);
		assertTrue(homePage.elementVisibility("Category"));
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



}
