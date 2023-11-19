package com.scrolltest.herokutests;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.WaitUntilState;
import org.apache.commons.io.IOUtils;


public class BaseTestClass2 {

    Playwright playwright;
    BrowserType browserType;
    Browser browser;
    BrowserContext context;
    protected Page page;

    // This User Agent was added by me to the other project. Maybe not needed
    //private String USER_AGENT = "{userAgent: 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:109.0) Gecko/20100101 Firefox/109.0',}";

    public void launchPlaywright(String browserName, String headless) {

        System.out.println("*******************************");
        System.out.println("Browser name : " + browserName);
        System.out.println("Browser name : " + headless);
        System.out.println("*******************************");

        playwright = Playwright.create();
        if (browserName.equalsIgnoreCase("chrome") || browserName.equalsIgnoreCase("msedge")
                || browserName.equalsIgnoreCase("chromium")) {
            browserType = playwright.chromium();
        } else if (browserName.equalsIgnoreCase("webkit")) {
            browserType = playwright.webkit();
        }
        if (headless.equalsIgnoreCase("true")) {
            browser = browserType.launch(new BrowserType.LaunchOptions().setChannel(browserName).setHeadless(true));
        } else {
            browser = browserType.launch(new BrowserType.LaunchOptions().setChannel(browserName).setHeadless(false));
        }
        context = browser.newContext(new Browser.NewContextOptions().setViewportSize(1400, 700));

        context.close();
        page = browser.newPage();
        System.out.println("**** Project Browser Name and Version is : " + browserName + " : " + browser.version());
    }

    public void launchApplication(String url) {
        page.navigate(url, new Page.NavigateOptions().setWaitUntil(WaitUntilState.NETWORKIDLE));

        // Here I need to specify selector to wait for. Better in a configuration?
        //page.waitForSelector("[data-qa='cemaxumuwu']");
        page.waitForSelector("h1.heading");
    }

    public void closePlaywright() {
        page.close();
        browser.close();
        playwright.close();
    }

}
