package org.qa.testproject.factory;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PlaywrightFactory {
    public static final Logger logger = LogManager.getLogger(PlaywrightFactory.class.getName());

    Properties prop;
    ExtentReports extentReports;

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

        tlPlaywright.set(Playwright.create());

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

        tlBrowserContext.set(getBrowser().newContext());

        tlBrowserContext.get().clearCookies();

        tlPage.set(getBrowserContext().newPage());

        getPage().navigate(prop.getProperty("url").trim());
        return getPage();

    }

    /**
     * this method is used to initialize the properties from config file
     */
    public Properties read_properties() {
        try {
            FileInputStream initialProperties = new FileInputStream("./src/test/resources/config/config.properties");
            prop = new Properties();
            prop.load(initialProperties);
        } catch (FileNotFoundException e) {
            logger.error("config.properties file not found");
        } catch (IOException e) {
            logger.error("IOException when reading config.properties file");
        }
        logger.info("Extent report properties : " + extentReports);
        return prop;
    }


    public static String getScreenshotPath() {
        String formattedPath = String.format("%s/screenshot/%d.png",
                System.getProperty("user.dir"),
                System.currentTimeMillis());
        return formattedPath;
    }

    public static String getScreenshotPath(String prefix) {
        String screenshotOutputPath = (String.format("%s/screenshot/%s%d.png",
                System.getProperty("user.dir"),
                prefix,
                System.currentTimeMillis()));
        return screenshotOutputPath;
    }

    public static String takeScreenshot() {
        // full page captured
        byte[] buffer = getPage()
                .screenshot(new Page.ScreenshotOptions().setPath(Paths.get(getScreenshotPath())).setFullPage(true));
        return Base64.getEncoder().encodeToString(buffer);

    }


    public static String takeScreenshot(String prefix) {
        // Not full page captured
        byte[] buffer = getPage().screenshot(new Page.ScreenshotOptions().setPath(Paths.get(getScreenshotPath(prefix))).setFullPage(false));
        return Base64.getEncoder().encodeToString(buffer);

    }


}
