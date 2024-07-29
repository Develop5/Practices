package qa.zalando.stepdefinitions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import io.cucumber.java.en.Given;
import qa.zalando.base.BaseTest;


public class HomePageDefinitions  {
// maybe extends BaseTest

    private Browser browser;
    private BrowserContext context;
    private Page page;



    @Given("the user is in the page {string}")
    public void the_user_is_in_the_home_page(String message) {
        System.out.println("I am here : " + message);
    }


}
