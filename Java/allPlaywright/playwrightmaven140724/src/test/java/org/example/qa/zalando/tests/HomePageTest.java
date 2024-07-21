package org.example.qa.zalando.tests;

import org.example.qa.zalando.base.BaseTest;
import org.example.qa.zalando.constants.AppConstants;
import org.junit.jupiter.api.*;

import static org.example.qa.zalando.factory.PlaywrightFactory.logger;
import static org.example.qa.zalando.factory.PlaywrightFactory.takeScreenshot;
import static org.junit.jupiter.api.Assertions.assertEquals;


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
	public void navigateToMujerGroup() {
		logger.info("Navigating to Mujer page.");
		homePage.clickGroup("Mujer");
	}
	@Test
	public void navigateToHombreGroup() {
		logger.info("Navigating to Hombre page.");
		homePage.clickGroup("Hombre");
	}
	@Test
	public void navigateToNinnosGroup() {
		logger.info("Navigating to Ninnos page.");
		homePage.clickGroup("Ninnos");
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
