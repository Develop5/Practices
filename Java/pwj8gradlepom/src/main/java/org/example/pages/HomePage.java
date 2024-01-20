package org.example.pages;

import com.microsoft.playwright.Page;

public class HomePage {

    private final Page page;

    // 1. String locators, as we are in Playwright
    private final String search = "//input[@id='header-search-input']";
    //private final String searchIcon = "._3F46w7.oosgvo.sDq_FX._2kjxJ6.FxZV-M.bsVOrE.mo6ZnF.dUMFv9.K82if3.LyRfpJ.HlZ_Tf.NN8L-8._3laWWw.Vn-7c-";

    private final String searchIcon = "//input[contains('Busca aq')]";
    private final String searchPageHeader = "//span[@class='sDq_FX _2kjxJ6 dgII7d HlZ_Tf'][normalize-space()='Zapatos']";

    // 2. Page constructor


    public HomePage(Page page) {
        this.page = page;
    }

    // 3. Page actions/methods

    public String getHomePageURL() {
        return page.url();
    }

    public String getHomePageTitle() {
        return page.title();
    }


    public String doSearch(String productName) {
        page.fill(search, productName);
        page.locator(search).highlight();
        page.locator(search).press("Enter");
        String searchHeader = page.textContent(searchPageHeader);
        return searchHeader;
    }
}
