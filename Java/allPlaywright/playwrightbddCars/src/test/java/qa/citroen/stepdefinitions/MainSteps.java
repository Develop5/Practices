package qa.citroen.stepdefinitions;


import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import qa.citroen.factory.PlaywrightFactory;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;
import static qa.citroen.constants.AppConstants.HOME_PAGE_TITLE;
import static qa.citroen.factory.MainContext.*;
import static qa.citroen.pages.DaciaHomePage.*;
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


		// First time in page
		page.locator(locSolicitarOfertas).highlight();
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
		page.evaluate("document.body.style.zoom=0.7");
		// Ellaborate this locator
		page.locator("label").nth(5).dispatchEvent("click");
	}

	@Then("the user checks Acepto")
	public void the_user_checks_acepto() {
		//page.locator(locFormAccept).highlight();
		// Ellaborate this locator
		page.getByLabel("Acepto el aviso de protección de datos").click();
	}

	@Then("the user wants to wait until check")
	public void the_user_wants_to_wait_until_check() throws InterruptedException {
		//Thread.sleep(1000);
		page.pause();
	}

	@Then("the user reloads the page and clicks above")
	public void the_user_reloads_the_page_and_clicks_above() {
		page.reload();
		page.evaluate("document.body.style.zoom=0.7");

		// next time in page
		page.locator(".PrimaryButton-module_text__RjBV0").nth(0).highlight();
		page.locator(".PrimaryButton-module_text__RjBV0").nth(0).click();

	}


	@Then("the user just reloads the page")
	public void the_user_reloads_the_page() {
		page.reload();
		page.evaluate("document.body.style.zoom=0.7");
	}


	@Given("the first time cookies are accepted")
	public void the_first_time_cookies_are_accepted() {
			page.locator(locAcceptCookies).dispatchEvent("click");
	}

}