package qa.citroen.factory;

import com.microsoft.playwright.*;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class MainContext {

    public static Playwright playwright;
    public static Browser browser;
    public static BrowserContext context;
    public Page page;


    @AfterAll
    public static void AfterAll(){
        //sleep for 5 seconds for viewing result (headed mode)
        try {
            System.out.println("---------> After TEST ---------");
            Thread.sleep(5000);
        } catch(InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @BeforeAll
    public static void BeforeAll(){
        System.out.println("--------->  Before All -----------------");
        playwright = Playwright.create();
        BrowserType browserType = playwright.chromium();
        browser = browserType.launch(new BrowserType.LaunchOptions()
                .setHeadless(false)
                .setSlowMo(100));
        context = browser.newContext();
    }

    public Browser getBrowser(){
        System.out.println("LBP ------> " + browser);
        return browser;
    }


    public Page newPage(){
        context = browser.newContext();
        return context.newPage();
    }



}
