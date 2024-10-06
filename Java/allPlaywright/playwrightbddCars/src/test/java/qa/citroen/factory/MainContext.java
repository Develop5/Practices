package qa.citroen.factory;

import com.microsoft.playwright.*;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import qa.citroen.factory.PlaywrightFactory;

import java.util.Properties;

public class MainContext {
    public static Logger loggerContext = LogManager.getLogger(MainContext.class.getName());

    public static Playwright playwright;
    public static Browser browser;
    public static BrowserContext context;
    public static Page page;


    @BeforeAll
    public static void BeforeAll(){
        loggerContext.info("-------->  Before All --------");
        PlaywrightFactory pf = new PlaywrightFactory();
        Properties prop = pf.read_properties();
        page = pf.initBrowser(prop);

        playwright = Playwright.create();
        BrowserType browserType = playwright.chromium();
        browser = browserType.launch(new BrowserType.LaunchOptions()
                .setHeadless(false)
                .setSlowMo(100));
        context = browser.newContext();


    }


    @AfterAll
    public static void AfterAll(){
        //sleep for 5 seconds for viewing result (headed mode)
        try {
            loggerContext.info("-------->  After All --------");
            Thread.sleep(2000);
        } catch(InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }


}
