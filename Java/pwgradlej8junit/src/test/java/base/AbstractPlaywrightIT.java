package base;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.LoginPO;

public class AbstractPlaywrightIT {
    // This is the base class

    private static Playwright playwright;
    private static Browser browser;
    private static Page page;

    @BeforeAll
    protected static void setUpClass() {
        playwright = Playwright.create();
        BrowserType browserType = playwright.chromium();
        browser = browserType.launch(
                new BrowserType.LaunchOptions().setHeadless(false));


        BrowserContext context = browser.newContext(
                new Browser.NewContextOptions().setViewportSize(800, 600));      // Lourdes -> Omit this
        page = context.newPage();
        page.navigate("https://www.zalando.es/mujer-home/");

    }

    @AfterAll
    static void tearDownClass() throws Exception {

        page.context().close();

        playwright.close();
    }


    //@BeforeEach
    //public void setUp() {
    //    BrowserContext context = browser.newContext(
    //            new Browser.NewContextOptions().setViewportSize(800, 600));      // Lourdes -> Omit this
    //    page = context.newPage();
    //    page.navigate("https://www.zalando.es/mujer-home/");
    //}

    //@AfterEach
    //void tearDown() {
    //    page.context().close();
    //}

    protected Page getPage() {
        return page;
    }

    protected LoginPO getLoginPage() {              // Gets an instance of the main page
        return new LoginPO(getPage());
    }

    //protected pages.BookViewPO getLoginPage() {              // Gets an instance of the main page
    //    return new pages.BookViewPO(getPage());
    //}


}
