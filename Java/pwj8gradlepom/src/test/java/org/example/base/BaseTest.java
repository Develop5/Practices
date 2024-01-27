package org.example.base;

import com.microsoft.playwright.Page;
import org.example.factory.PlaywrightFactory;
import org.example.pages.HomePage;
import org.example.pages.MenPage;
import org.junit.After;
import org.junit.Before;

import java.util.Properties;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    PlaywrightFactory playwrightFactory;
    Page page;
    protected Properties propertiesBase;

    protected static HomePage homePage;
    protected static MenPage menPage;


    @Before
    public void setup() {
        playwrightFactory = new PlaywrightFactory();
        propertiesBase = playwrightFactory.init_prop();
        page = playwrightFactory.initBrowser(propertiesBase);
        homePage = new HomePage(page);
        menPage = new MenPage(page);
    }


    @After
    public void tearDown() {
        page.context().browser().close();
    }

}
