package org.example.pages;

import com.microsoft.playwright.Page;

public class HomePage {

    Page page;

    // 1. String locators, as we are in Playwright
    private String search = "header-search-input";
    private String searchPageHeader = "//span[@class='sDq_FX qQ75Zg FxZV-M HlZ_Tf CzGCn5']";

    // 2. Page constructor


    public HomePage(Page page) {
        this.page = page;
    }

    // 3. Page actions/methods

    public String getHomePageURL(){
        return page.url();
    }

    public String doSearch(String productName) {
        page.fill(search, productName);
        page.click(search);
        return page.textContent(searchPageHeader)
    }
}
