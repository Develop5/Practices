package org.example;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import java.nio.file.Paths;

public class ScreenshotWebkit {
    // Screenshot in headless mode
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            // Headless
            Browser browser = playwright.webkit().launch();
            Page page = browser.newPage();
            page.navigate("https://playwright.dev/");
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("example2.png")));
        }
    }


}
