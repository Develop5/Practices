package qa.zalando.stepdefinitions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import io.cucumber.java.en.Given;


public class HomePageDefinitions  {

    private Browser browser;
    private BrowserContext context;
    private Page page;

    public HomePageDefinitions(TestContext testContext){
        System.out.println("\n---------> LBP No context prepared");
        //this.browser = testContext.getBrowser();
        //this.page = testContext.newPage();

    }

    @Given("the user is in the pageeeee {string}")
    public void the_user_is_in_the_home_page(String targetPage) {
        System.out.println("--------> Nothing to do");
        /*
        page.navigate(targetPage);
        page.waitForLoadState();
        System.out.println("URL: " + page.url());
        //page.locator("//*[name()=\'path\' and contains(@d,\'M53.947 5.\')]").highlight();
        System.out.println("I am here : " + targetPage);

         */
    }


}
