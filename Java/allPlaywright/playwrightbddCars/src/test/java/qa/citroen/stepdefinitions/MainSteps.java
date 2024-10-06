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
		page.locator(locSolicitarOfertas).click();
	}

	@Then("a form is visible")
	public void a_form_is_visible() {
		assertTrue(page.locator(locFormAskForOffers).isVisible());
	}

	@Then("the user fills in Nombre with {string}")
	public void the_user_fills_in_Nombre_with(String name) {
		page.locator(locFormName).fill(name);
	}

	@Then("the user fills in Email with {string}")
	public void the_user_fills_in_email_with(String email) {
		page.locator(locFormEmail).fill(email);
	}
	@Then("the user fills in CódigoPostal with {string}")
	public void the_user_fills_in_código_postal_with(String zipCode) {
		page.locator(locFormZip).fill(zipCode);
	}
	@Then("the user fills in Teléfono with {string}")
	public void the_user_fills_in_teléfono_with(String phoneNumber) {
		page.locator(locFormPhone).fill(phoneNumber);
	}
	@Then("the user checks No Financiar")
	public void the_user_checks_no_financiar() {
		page.locator(locFormNoCredit).click();
	}
	@Then("the user checks Acepto")
	public void the_user_checks_acepto() {
		page.locator(locFormAccept).click();
	}

	@Then("the user wants to wait until check")
	public void the_user_wants_to_wait_until_check() throws InterruptedException {
		Thread.sleep(2000);
	}

}