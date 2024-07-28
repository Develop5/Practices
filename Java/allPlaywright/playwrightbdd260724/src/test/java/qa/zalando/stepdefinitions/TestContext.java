package qa.zalando.stepdefinitions;

import java.lang.Thread;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.AfterAll;
import com.microsoft.playwright.*;
public class TestContext {
    protected static Playwright playwright;
    protected static Browser browser;
    protected BrowserContext context;
    protected Page page;

    @BeforeAll
    public static void BeforeAll(){
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                .setHeadless(false)
                .setSlowMo(100));
    }

    /*


        switch (browserName.toLowerCase()) {
            case "chromium":
                tlBrowser.set(getPlaywright().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)));
                break;
            case "firefox":
                tlBrowser.set(getPlaywright().firefox().launch(new BrowserType.LaunchOptions().setHeadless(false)));
                break;
            case "safari":
                tlBrowser.set(getPlaywright().webkit().launch(new BrowserType.LaunchOptions().setHeadless(false)));
                break;
            case "chrome":
                tlBrowser.set(
                        getPlaywright().chromium().launch(new LaunchOptions().setChannel("chrome").setHeadless(false)));
                break;
            case "edge":
                tlBrowser.set(
                        getPlaywright().chromium().launch(new LaunchOptions().setChannel("msedge").setHeadless(false)));
                break;

            default:
                logger.error("please pass the right browser name......");
                break;
        }




     */








    public Browser getBrowser(){
        return browser;
    }

    public Page newPage(){
        context = browser.newContext();
        return context.newPage();
    }

    @AfterAll
    public static void AfterAll(){
        //sleep for 5 seconds for viewing result (headed mode)
        try {
            Thread.sleep(5000);
        } catch(InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
