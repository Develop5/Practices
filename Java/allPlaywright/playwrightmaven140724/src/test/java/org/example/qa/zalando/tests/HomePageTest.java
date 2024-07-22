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
		logger.info("homePageTitleTest : " + pageActualTitle);
	}

	@Test
	public void navigateToMujerGroupTest() {
		logger.info("navigateToMujerGroupTest");
		homePage.clickGroup("Mujer");
	}
	@Test
	public void navigateToHombreGroupTest() {
		logger.info("navigateToHombreGroupTest");
		homePage.clickGroup("Hombre");
	}
	@Test
	public void navigateToNinnosGroupTest() {
		logger.info("navigateToNinnosGroupTest");
		homePage.clickGroup("Ninnos");
	}

	@Test
	public void hightlightHomeTitleTest(){
		homePage.hightlightTitle();
		takeScreenshotLocator();
		logger.info("hightlightHomeTitleTest and screenshot");

	}

	@Test
	public void highlightSearchBar(){
		homePage.highlightElement("Search Bar");
		takeScreenshotLocator();
		logger.info("highlightSearchBar and screenshot");
	}

	@Test
	public void enterTextSearchBarTest() {
		String url_first = homePage.getHomePageURL();
		homePage.enterTextInBar("Search Bar", "Bolsos");
		homePage.waitUntilLoad();
		String url_last = homePage.getHomePageURL();
		logger.info("First page ---------- " + url_first);
		logger.info("Last page ---------- " + url_last);
		assertTrue(url_last.contains(url_first));
		assertNotEquals(url_first, url_last);
		assertTrue(homePage.elementVisibility("Category"));
		takeScreenshot();
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
