package com.scrolltest.tests;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.WaitUntilState;


public class BaseTestClass {

    Playwright playwright;
    BrowserType browserType;
    Browser browser;
    BrowserContext context;
    protected Page page;

    private String USER_AGENT = "{userAgent: 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:109.0) Gecko/20100101 Firefox/109.0',}";

    public void launchPlaywright(String browserName, String headless) {
        playwright = Playwright.create();
        if (browserName.equalsIgnoreCase("chrome") || browserName.equalsIgnoreCase("msedge")
                || browserName.equalsIgnoreCase("chromium")) {
            browserType = playwright.chromium().connect();
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
        page.waitForSelector("[data-qa='cemaxumuwu']");
    }

    public void closePlaywright() {
        page.close();
        browser.close();
        playwright.close();
    }

}
