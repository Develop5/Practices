package org.example.qa.pages;

import com.microsoft.playwright.Page;
import org.example.qa.base.PlaywrightFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BaseTest {
    protected Page page;
    protected HomePage hp;
    protected SearchPage search;
    PlaywrightFactory play;

    @BeforeAll
    @ParameterizedTest
    @CsvSource({"appURL", "browserType"}) // Passing strings
    public void setUp(String appURL, String browserType) {
        play = new PlaywrightFactory();
        page = play.getPage(appURL, browserType);
        hp = new HomePage(page);
    }

    @AfterAll
    public void tearDown() {
        page.context().browser().close();
    }
}
