package org.example.qa.base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTests {

    private Browser browser;
    protected SearchPage searchPage;



    //protected static Page page;
    //protected static HomePage hp;
    //protected SearchPage search;
    //static PlaywrightFactory play;

    final String  appURL = "http://automationpractice.com/index.php";
    final String  browserType = "chrome";


    @BeforeAll
    //@ParameterizedTest
    //@CsvSource({"appURL, http://automationpractice.com/index.php", "browserType, chrome"}) // Passing strings
    public void setUp(String appURL, String browserType) {

        System.out.println("\nappURL = " + appURL);
        System.out.println("\nbrowserType = " + browserType);

        //Open a browser (supports Chromium (Chrome, Edge), Firefox, and Webkit (Safari))
        browser = Playwright
                .create()
                .chromium()
                .launch(new BrowserType.LaunchOptions().setHeadless(false));

        //A single browser tab
        Page page = browser.newPage();
        page.navigate("https://automationbookstore.dev/");
        searchPage = new SearchPage(page);
        
        
        
        

        /*
        play = new PlaywrightFactory();
        page = play.getPage(appURL, browserType);
        hp = new HomePage(page);
        */

    }

    @AfterAll
    public void tearDown() {
        
        System.out.println("\nappURL = " + appURL);
        System.out.println("\nbrowserType = " + browserType);


        browser.close();


        //page.context().browser().close();
    }
}
