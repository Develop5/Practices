package org.example.qa.testcases;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

public class DownloadFile {

    protected static Page page;
    Playwright playwright;

    @BeforeAll
    public void setUp() {
        playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
    }

    @Test
    public void download() throws InterruptedException {
        page.navigate("https://nodejs.org/en/download/");
        Download download = page.waitForDownload(() -> {
            page.locator("a#windows-downloadbutton").click();
        });
        //download.cancel();
        //System.out.println("Download failure message: " + download.failure());
        System.out.println("Download url: " + download.url());
        System.out.println("Download page title: " + download.page().title());
        System.out.println("Download path : " + download.path().toString());
        download.saveAs(Paths.get("Nodejs.msi"));
        System.out.println("Suggested file name: " + download.suggestedFilename());
    }

    @AfterAll
    public void tearDown() {
        page.context().browser().close();
    }
}
