package qa.citroen.factory;


import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.Properties;


public class PlaywrightFactory {
    public static Logger logger = LogManager.getLogger(PlaywrightFactory.class.getName());

    Playwright playwright;
    Browser browser;
    BrowserContext browserContext;
    Page page;
    static Properties prop;

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
        logger.info("--------> PlaywrighFactory page: " + tlPage.get());
        return tlPage.get();
    }

    public Page initBrowser(Properties prop) {

        String browserName = prop.getProperty("browser").trim();
        logger.info("browser name is : " + browserName);

        Boolean headlessMode = Boolean.parseBoolean(prop.getProperty("headless").trim());
        logger.info("headless Mode is : " + headlessMode);

        tlPlaywright.set(Playwright.create());

        switch (browserName.toLowerCase()) {
            case "chromium":
                tlBrowser.set(getPlaywright().chromium().launch(new LaunchOptions().setHeadless(headlessMode)));
                break;
            case "firefox":
                tlBrowser.set(getPlaywright().firefox().launch(new LaunchOptions().setHeadless(headlessMode)));
                break;
            case "safari":
                tlBrowser.set(getPlaywright().webkit().launch(new LaunchOptions().setHeadless(headlessMode)));
                break;
            case "chrome":
                tlBrowser.set(
                        getPlaywright().chromium().launch(new LaunchOptions().setChannel("chrome").setHeadless(headlessMode)));
                break;
            case "edge":
                tlBrowser.set(
                        getPlaywright().chromium().launch(new LaunchOptions().setChannel("msedge").setHeadless(headlessMode)));
                break;

            default:
                logger.error("please pass the right browser name......");
                break;
        }

        tlBrowserContext.set(getBrowser().newContext());

        tlBrowserContext.get().clearCookies();

        tlPage.set(getBrowserContext().newPage());

        getPage().navigate(prop.getProperty("url").trim());
        //return page;
        return getPage();

    }

    /**
     * this method is used to initialize the properties from config file
     */
    public static Properties read_properties() {
        logger.info("Reading properties ...");

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

    public static String takeScreenshot() {
        String path = System
                .getProperty("user.dir")
                + "/screenshot/"
                + System.currentTimeMillis()
                + ".png";
        //getPage().screenshot(new Page.ScreenshotOptions().setPath(Paths.get(path)).setFullPage(true));
        byte[] buffer = getPage().screenshot(new Page.ScreenshotOptions().setPath(Paths.get(path)).setFullPage(true));
        String base64Path = Base64.getEncoder().encodeToString(buffer);
        return base64Path;

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


}
