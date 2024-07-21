package org.example.qa.zalando.tests;

import org.example.qa.zalando.base.BaseTest;
import org.example.qa.zalando.constants.AppConstants;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import static org.example.qa.zalando.factory.PlaywrightFactory.logger;
import static org.example.qa.zalando.factory.PlaywrightFactory.takeScreenshot;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomePageTest extends BaseTest {

	@Test
	public void homePageTitleTest() {
		logger.info("Entering homePageTitleTest.");
		takeScreenshot();
		String actualTitle = homePage.getHomePageTitle();
		assertEquals(AppConstants.HOME_PAGE_TITLE, actualTitle);
	}

	@Test
	public void homePageURLTest() {
		logger.warn("Entering homePageURLTest.");
		String actualURL = homePage.getHomePageURL();
		assertEquals(prop.getProperty("url"), actualURL);
	}

	@TestFactory
	public Object[][] getProductData() {
		logger.error("This is not a tests, just Dynamic test preparation");

		return new Object[][] {
				{ "Mujer" },
				{ "Hombre" },
				{ "Niño" }
		};
	}



}
