package qa.citroen.stepdefinitions;

import java.util.*;

import io.cucumber.java.en.*;
import com.microsoft.playwright.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import qa.citroen.utilities.AppUtil;
import qa.citroen.factory.MainContext;


public class MainSteps {

	private Browser browser;
	private BrowserContext context;
	private Page page;
	private Map<String, String> dataState = new HashMap<>();

	String url = "https://www.coches.com/coches-nuevos/Citroen-C4+X/";


	// New locators
	String locC4XTitle = ".Heading-module_heading__2pnHW.Shame_heading__SZfn8.font-bold.font-heading-m";



	public MainSteps(MainContext testContext, Page page) {
		this.browser = testContext.getBrowser();
		this.page = testContext.newPage();
		System.out.println("LBP -----> browser: " + this.browser);
		System.out.println("LBP -----> page: " + this.page);
	}

	public MainSteps() {
	}



	@Given("the user is in the page {string}")
	public void the_user_is_in_the_page(String theArgument) {
		System.out.println("Nothing here --------  " + theArgument);
	}

	@Given("user at homepage")
	public void user_at_homepage() {
		//throw new io.cucumber.java.PendingException();
		System.out.println(" User at homepage feature");
	}

	@When("title of page is {string}")
	public void title_of_page_is(String pageTitle) {
		assertEquals(locC4XTitle, pageTitle);

	}


	@Given("I do not want to use this feature")
	public void i_do_not_want_to_use_this_feature() {
		System.out.println("LBP ------> nueva.feature");
	}

}