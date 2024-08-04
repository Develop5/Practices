package org.qa.testproject.base;

import java.util.Properties;

import com.microsoft.playwright.Page;
import org.qa.testproject.factory.PlaywrightFactory;
import org.qa.testproject.pages.HomePage;
import org.qa.testproject.pages.LoginPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;


public class BaseTest {

	static PlaywrightFactory pf;
	static Page page;
	protected static Properties prop;

	protected static HomePage homePage;
	protected LoginPage loginPage;


	@BeforeAll
	public static void setup() {

		pf = new PlaywrightFactory();
		prop = pf.read_properties();

		page = pf.initBrowser(prop);
		homePage = new HomePage(page);

	}

	@AfterAll
	public static void tearDown() {
		page.context().browser().close();
	}

}
