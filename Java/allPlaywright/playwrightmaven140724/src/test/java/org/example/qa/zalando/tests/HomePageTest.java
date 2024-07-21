package org.example.qa.zalando.tests;

import org.example.qa.zalando.base.BaseTest;
import org.example.qa.zalando.constants.AppConstants;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomePageTest extends BaseTest {

	@Test
	public void homePageTitleTest() {
		String actualTitle = homePage.getHomePageTitle();
		assertEquals(AppConstants.HOME_PAGE_TITLE, actualTitle);
	}

	@Test
	public void homePageURLTest() {
		String actualURL = homePage.getHomePageURL();
		assertEquals(prop.getProperty("url"), actualURL);
	}

	@TestFactory
	public Object[][] getProductData() {
		return new Object[][] {
				{ "Mujer" },
				{ "Hombre" },
				{ "Niño" }
		};
	}



}
