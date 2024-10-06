package qa.citroen.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import qa.citroen.factory.PlaywrightFactory;
import qa.citroen.utilities.AppUtil;

import static org.junit.jupiter.api.Assertions.*;
import static qa.citroen.constants.AppConstants.HOME_PAGE_TITLE;
import static qa.citroen.factory.MainContext.*;
import static qa.citroen.pages.C4XHomePage.*;
import static qa.citroen.utilities.AppUtil.*;


public class MainSteps{

	public static Logger loggerSteps = LogManager.getLogger(MainSteps.class.getName());


	public MainSteps() {
	}

	@Given("the user is in the page {string}")
	public void the_user_is_in_the_page(String theArgument) {
		System.out.println("Nothing here --------  " + theArgument);
	}

	@Given("the user is at homepage")
	public void the_user_is_at_homepage() {
		String baseUrl = PlaywrightFactory.read_properties().getProperty("url");
		assertEquals(page.url(), baseUrl);
	}

	@When("title of page is the initial one")
	public void title_of_page_is_the_initial_one() {
		highlightElement(page, locC4XTitle);
		assertEquals(page.locator(locC4XTitle).textContent(), HOME_PAGE_TITLE);

	}


	@Given("I do not want to use this feature")
	public void i_do_not_want_to_use_this_feature() {
		loggerSteps.info("------> nueva.feature");
	}


	@When("the user clicks {string} button")
	public void the_user_clicks_button(String buttonName) {
		page.locator(locAcceotCookies).click();
		clickButton(page, locSolicitarOfertas);
	}


	@Then("a form is visible")
	public void a_form_is_visible() {
		assertTrue(AppUtil.isElementVisible(page, locFormAskForOffers));
	}
}