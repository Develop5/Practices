package org.example.factory;

import com.microsoft.playwright.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PlaywrightFactory {
    Playwright playwright;
    Browser browser;
    BrowserContext browserContext;
    Page page;
    Properties properties;

    public Page initBrowser(Properties properties) {

        String browserName = properties.getProperty("browser").trim();
        System.out.println("The browser is: " + browserName);
        playwright = Playwright.create();

        switch (browserName.toLowerCase()) {
            case "chromium":
                browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
                break;
            case "safari":
                browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
                break;
            case "firefox":
                browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
                break;
            case "chrome":
            case "edge":
                browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + browserName.toLowerCase());
        }

        browserContext = browser.newContext();
        page = browserContext.newPage();
        page.navigate(properties.getProperty("url").trim());
        return page;


    }

    public Properties init_prop() {
        try {
            FileInputStream initializePropertiesFile = new FileInputStream("./src/test/resources/config.properties");
            properties = new Properties();
            properties.load(initializePropertiesFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties;


    }
}
