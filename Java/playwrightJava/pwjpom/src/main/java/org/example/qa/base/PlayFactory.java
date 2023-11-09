package org.example.qa.base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PlayFactory {
    Playwright playwright;
    protected Page page;
    Browser browser;
    BrowserContext browserContext;

    /*
    @Parameters({"appURL", "browserType"})
    public Page getPage(String appURL, String browserType) {
    }
    */
    @ParameterizedTest
    @CsvSource({"appURL", "browserType"}) // Passing strings
    public Page getPage(String appURL, String browserType) {
    }


}
