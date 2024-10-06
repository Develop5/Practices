package qa.citroen.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import qa.citroen.factory.PlaywrightFactory;
import qa.citroen.utilities.AppUtil;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static qa.citroen.constants.AppConstants.HOME_PAGE_TITLE;
import static qa.citroen.factory.MainContext.page;
import static qa.citroen.utilities.AppUtil.*;


public class MainSteps {

	public static Logger loggerSteps = LogManager.getLogger(MainSteps.class.getName());

	String locC4XTitle = "//h1[@class='Heading-module_heading__2pnHW Shame_heading__AsKn2 font-bold font-heading-m']";
	public MainSteps() {
	}

	@Given("the user is in the page {string}")
	public void the_user_is_in_the_page(String theArgument) {
		System.out.println("Nothing here --------  " + theArgument);
	}

	@Given("user at homepage")
	public void user_at_homepage() {
		String baseUrl = PlaywrightFactory.read_properties().getProperty("url");
		assertEquals(page.url(), baseUrl);
	}

	@When("title of page is the initial one")
	public void title_of_page_is_the_initial_one() {
		AppUtil.highlightElement(page, locC4XTitle);
		assertEquals(page.locator(locC4XTitle).textContent(), HOME_PAGE_TITLE);

	}


	@Given("I do not want to use this feature")
	public void i_do_not_want_to_use_this_feature() {
		loggerSteps.info("------> nueva.feature");
	}

}