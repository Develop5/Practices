package org.example;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        try (Playwright playwright = Playwright.create()) {

            // Headless
            //Browser browser = playwright.chromium().launch();

            // Headed
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

            Page page = browser.newPage();
            page.navigate("http://playwright.dev");
            System.out.println(page.title());
        }
    }


}
