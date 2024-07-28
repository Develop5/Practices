package qa.zalando.stepdefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.Thread;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.Properties;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.AfterAll;
import com.microsoft.playwright.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import qa.zalando.factory.PlaywrightFactory;
import qa.zalando.tests.HomePage;

import static qa.zalando.factory.PlaywrightFactory.*;

public class TestContext {
    protected static Playwright playwright;
    protected static Browser browser;
    protected BrowserContext context;
    protected Page page;

    Properties prop;

    private static ThreadLocal<Browser> tlBrowser = new ThreadLocal<>();
    private static ThreadLocal<BrowserContext> tlBrowserContext = new ThreadLocal<>();
    private static ThreadLocal<Page> tlPage = new ThreadLocal<>();
    private static ThreadLocal<Playwright> tlPlaywright = new ThreadLocal<>();
    public static Playwright getPlaywright() {
        return tlPlaywright.get();
    }



    public static Browser getBrowser() {
        return tlBrowser.get();
    }

    public static BrowserContext getBrowserContext() {
        return tlBrowserContext.get();
    }

    public static Page getPage() {
        return tlPage.get();
    }


    public Page initBrowser(Properties prop) {

        String browserName = prop.getProperty("browser").trim();
        logger.info("browser name is : " + browserName);

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
                        getPlaywright().chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false)));
                break;
            case "edge":
                tlBrowser.set(
                        getPlaywright().chromium().launch(new BrowserType.LaunchOptions().setChannel("msedge").setHeadless(false)));
                break;

            default:
                logger.error("please pass the right browser name......");
                break;
        }

        tlBrowserContext.set(getBrowser().newContext());

        tlBrowserContext.get().clearCookies();

        tlPage.set(getBrowserContext().newPage());

        getPage().navigate(prop.getProperty("url").trim());
        return getPage();

    }



    public Properties read_properties() {
        try {
            FileInputStream initialProperties = new FileInputStream("./src/test/resources/config/config.properties");
            prop = new Properties();
            prop.load(initialProperties);
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, unable to find file");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Unable to open input file");
            e.printStackTrace();
        }
        logger.info("Properties : " + prop);
        return prop;
    }



    public static String takeScreenshot(String prefix) {
        String path = System
                .getProperty("user.dir")
                + "/screenshot/"
                + prefix
                + System.currentTimeMillis()
                + ".png";
        byte[] buffer = getPage().screenshot(new Page.ScreenshotOptions().setPath(Paths.get(path)).setFullPage(false));
        String base64Path = Base64.getEncoder().encodeToString(buffer);
        return base64Path;

    }


    public static String takeScreenshotLocator() {
        String path = System
                .getProperty("user.dir")
                + "/screenshot/"
                + "locator"
                + System.currentTimeMillis()
                + ".png";
        byte[] buffer = getPage().screenshot(new Page.ScreenshotOptions().setPath(Paths.get(path)).setFullPage(false));
        String base64Path = Base64.getEncoder().encodeToString(buffer);
        return base64Path;

    }



    @BeforeAll
    public static void BeforeAll(){
        playwright = Playwright.create();


        //browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
        //        .setHeadless(false)
        //        .setSlowMo(100));

    // Introducing

        PlaywrightFactory pf;
        Page page;
        Properties prop;
        HomePage homePage;


        pf = new PlaywrightFactory();
        prop = pf.read_properties();
        page = pf.initBrowser(prop);
        homePage = new HomePage(page);



    }

    /*
    public Browser getBrowser(){
        return browser;
    }

     */

    /*
    public Page newPage(){
        context = browser.newContext();
        return context.newPage();
    }

     */

    @AfterAll
    public static void AfterAll(){
        //sleep for 5 seconds for viewing result (headed mode)
        try {
            Thread.sleep(5000);
        } catch(InterruptedException ex) {
            System.out.println(ex.getMessage());
        }

        // All this needs to be replaced by:
        //public static void tearDown() {
        //    page.context().browser().close();
        //}
    }



}


